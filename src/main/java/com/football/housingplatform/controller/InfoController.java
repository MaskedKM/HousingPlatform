package com.football.housingplatform.controller;


import com.football.housingplatform.dao.domain.HousingInfo;
import com.football.housingplatform.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Service;
import java.util.List;

@Controller
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/addInfo")
    public String addInfo(){
        return "addInfo";
    }

    @RequestMapping("/list")
    public ModelAndView infoList(){
        ModelAndView modelAndView = new ModelAndView();
        List<HousingInfo> infoServiceList = infoService.getList();
        modelAndView.addObject("infoServiceList", infoServiceList);
        modelAndView.setViewName("InfoList");
        return modelAndView;
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public String infoAdd(HousingInfo HI){
        infoService.addInfo(HI);
        return "redirect:/info/list";
    }

    @RequestMapping("/del/{InfoId}")
    public String delete(@PathVariable("InfoId") int InfoId){
        infoService.deleteInfoById(InfoId);
        return "redirect:/info/list";
    }

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public ModelAndView searchBySite(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        String site = request.getParameter("site");
        List<HousingInfo> infoServiceList = infoService.findBySite(site);
        modelAndView.addObject("infoServiceList", infoServiceList);
        modelAndView.setViewName("InfoList");
        return modelAndView;
    }



}
