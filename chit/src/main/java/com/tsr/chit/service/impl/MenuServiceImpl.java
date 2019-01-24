package com.tsr.chit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsr.chit.model.Menu;
import com.tsr.chit.repository.MenuRepository;
import com.tsr.chit.service.MenuService;

@Service("menuService")
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	MenuRepository menuRepository;

	@Override
	public List<Menu> findByRoleId(Long roleId) {
		return menuRepository.findByRoleId(roleId);
	}

}
