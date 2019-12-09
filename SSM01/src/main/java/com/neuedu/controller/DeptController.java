package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.Dept;
import com.neuedu.service.DeptService;

import net.sf.ehcache.search.parser.MValue;

@Controller
public class DeptController {
	@Autowired
	private DeptService service;
	@RequestMapping("add.do")
	public ModelAndView add(Dept dept) throws Exception{
		ModelAndView maAndView=new ModelAndView();
		int i=service.addDept(dept);
		if(i>0){
			maAndView.setViewName("succes.jsp");
		}else {
			maAndView.setViewName("add.jsp");
		}
		return maAndView;
	}
}
