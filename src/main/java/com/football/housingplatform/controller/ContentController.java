package com.football.housingplatform.controller;

import com.football.housingplatform.dao.domain.Content;
import com.football.housingplatform.dao.domain.User;
import com.football.housingplatform.service.ContentService;
import com.football.housingplatform.service.InfoService;
import com.football.housingplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/reply")
public class ContentController {

    @Autowired
    private ContentService contentService;
    @Autowired
    private UserService userService;
    @Autowired
    private InfoService infoService;

    @RequestMapping("/index")
    public  String index(){
        return "reply";
    }

    @RequestMapping("/message/{id}")
    public ModelAndView message(@PathVariable("id") int Infoid)
    {
        ModelAndView mav = new ModelAndView();
        List<Content> contentList = contentService.showAll(Infoid);
        mav.addObject("HousingInfo",infoService.findById(Infoid));

        for(Content i :contentList)
        {
            int UserId = contentService.findUserId(i.getId());
            i.setUserName(userService.getInfobyId(UserId).getName());
        }
        mav.addObject("contentList", contentList);
        mav.addObject("infoId", Infoid);
        mav.setViewName("reply");
        return mav;
    }

    @RequestMapping("/add/{Infoid}")
    public String addContent(Content c,@PathVariable("Infoid") int Infoid)
    {
        System.out.println(c);
        contentService.addContent(c,Infoid);
        return "redirect:/reply/message/"+Infoid;
    }

    @RequestMapping(value = "/vote/{replyId}")
    public String vote(@PathVariable("replyId") int replyId){
        contentService.updateVote(replyId);
        int infoId = infoService.findIdByReplyId(replyId);
        return "redirect:/reply/message/"+infoId;
    }

    @RequestMapping(value = "/deleteContent/{replyId}")
    public String deleteContent(@PathVariable("replyId") int replyId){
        int infoId = infoService.findIdByReplyId(replyId);
        contentService.deleteContent(replyId);
        return "redirect:/reply/message/"+infoId;
    }



}
