/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Sangeeta
 */
public class Message1 extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("showMessageView");
        
        mv.addObject("message","Hello World Spring MVC");
        return mv;
    }

}