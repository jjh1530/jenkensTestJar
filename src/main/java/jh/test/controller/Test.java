package jh.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

	@RequestMapping("/")
	@ResponseBody
	public String injdex() {
		return"git Token Test";
	}
}
