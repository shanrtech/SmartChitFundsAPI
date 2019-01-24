package com.tsr.chit.service;

import java.util.List;

import com.tsr.chit.model.Menu;

public interface MenuService {

	List<Menu> findByRoleId(Long roleId);

}
