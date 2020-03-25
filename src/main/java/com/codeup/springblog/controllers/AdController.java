package com.codeup.springblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.Max;

@Controller
public class AdController {

    private AdRepo adDao;
    private UserRepo userDao;

    @Autowired
    private MailService emailService;

    public AdController (AdRepo adDao, UserRepo userDao) {
        this.adDao = adDao;
        this.userDao = userDao;
    }

    @GetMapping("/ads")
    @ResponseBody
    public List<Ad> getAllAds () {
        return adDao.findAll();
    }

    @GetMapping("/ads/create")
    @ResponseBody
    public String saveAd() {
        Ad newAd = new Ad();
        newAd.setTitle("New Ad");
        newAd.setDescription("This is a newly saved ad!");
        newAd.setUser(userDao.getOne(1L));
        adDao.save(newAd);
        String emailSubject = "This is the email subject";
        String emailBody = "Email Body Test";
        emailService.prepareAndSend(newAd, emailSubject, emailBody);
        return "Saving ad";
    }

    @GetMapping("/ads/update")
    @ResponseBody
    public String updateAd () {
        Ad ad = adDao.getOne(1L);
        ad.setTitle("Updated Title!");
        adDao.save(ad);
        return "Updating ad";
    }

    @GetMapping("/ads/search")
    @ResponseBody
    public String searchAd(Model model) {
        Ad ad = adDao.findByTitle("scalable");
        model.addAttribute("ad", ad);
        return "ads/search";
    }
}
