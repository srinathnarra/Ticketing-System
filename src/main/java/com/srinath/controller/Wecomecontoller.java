package com.srinath.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Wecomecontoller {

		@RequestMapping("/welcome")
		public String Welcome(HttpServletRequest request) {
			request.setAttribute("mode", "MODE_HOME");
			return "welcomepage";
		}
}
