package com.tsr.chit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@RequestMapping(value = "/hello")
	public String getUser() {
		return "rama";
	}
}
