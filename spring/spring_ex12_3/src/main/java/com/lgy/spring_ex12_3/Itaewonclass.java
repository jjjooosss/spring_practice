package com.lgy.spring_ex12_3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Itaewonclass {
	@RequestMapping("/actor")
	public String view(Model model) {
		model.addAttribute("name","박새로이");
		return "/actor";
	}
	@RequestMapping("/actress")
	public String view2(Model model) {
		model.addAttribute("name","조이서");
		return "/actress";
	}
}
