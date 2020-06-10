package com.cy.pj.activity.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cy.pj.activity.pojo.Activity;
import com.cy.pj.activity.service.ActivityService;

@Controller
@RequestMapping("activity")
public class ActivityController {
	@Autowired
	private ActivityService activityService;
	//@RequestMapping("doSaveActivity")
	@PostMapping("doSaveActivity")
	public String doSaveActivity(Activity activity) {
		activityService.saveActivity(activity);

		return "redirect:doFindActivitys";
		
	}
	@RequestMapping("doDeleteById")
	public String doDeleteById(Long id,Model model) {
		activityService.deleteById(id);
		//return "redirect:doFindActivitys";
		List<Activity> list=activityService.findActivitys();
		model.addAttribute("list", list);
		return "activity";
	}
	
	//@RequestMapping(value="doFindActivitys",method=RequestMethod.GET)
	@GetMapping("doFindActivitys")
	public String doFindActivitys(Model model) {
		List<Activity> list=activityService.findActivitys();
		System.out.println("list="+list);
		model.addAttribute("list", list);
		//模拟耗时操作
		try{Thread.sleep(5000);}catch(Exception e) {}
		return "activity";
	}
	
}
