package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api")
public class UserController {
	
	@RequestMapping("/showForm")
	public String showpage()
	{
		return "login-form";
	}
	
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String processForm(@RequestParam("txtuserName")String user, Model theModel)
	{
		user = "Hi" + user.toUpperCase();
		theModel.addAttribute("user", user);
		return "user-confirmation";
	}

}
