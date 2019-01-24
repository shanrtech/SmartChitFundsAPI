package com.tsr.chit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tsr.chit.model.Menu;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Long> {

	List<Menu> findByRoleId(Long roleId);
}
