package com.tsr.chit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsr.chit.model.Menu;
import com.tsr.chit.service.MenuService;

@RestController
@RequestMapping(value = "/menu")
public class MenuController {

	@Autowired
	MenuService menuService;

	@RequestMapping(value = "/list/{roleId}")
	public List<Menu> findByRoleId(@PathVariable Long roleId) {
		return menuService.findByRoleId(roleId);
	}
}
