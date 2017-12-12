package com.dell.backend.dao;

import java.util.List;

import com.dell.backend.dto.Category;

public interface CategoryDAO {
	
	Category get(int id);
	List<Category> list();
}
