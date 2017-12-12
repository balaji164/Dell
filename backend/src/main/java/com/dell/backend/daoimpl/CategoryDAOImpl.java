package com.dell.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dell.backend.dao.CategoryDAO;
import com.dell.backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO 
{
private static List<Category>categories=new ArrayList<>();
static
{
	Category category=new Category();
	///adding first category
	category.setId(1);
	category.setName("DELL BOOK");
	category.setDescription("INSPIRED BY U" );
	category.setImageURL("CAT_1.png");
	categories.add(category);
	
	//second category
	category=new Category();
	///adding first category
	category.setId(2);
	category.setName("MAC");
	category.setDescription("INSPIRED BY U" );
	category.setImageURL("CAT_2.png");
	categories.add(category);
	
	//third category
		category=new Category();
		///adding first category
		category.setId(3);
		category.setName("MAC BOOK");
		category.setDescription("INSPIRED BY U" );
		category.setImageURL("CAT_3.png");
		categories.add(category);
	
	}
	public List<Category> list() 
	{
		// TODO Auto-generated method stub
		return categories;
	}
	
	
	@Override
	
	public Category get(int id) 
	{
	
		
		//enhanced for loop
		for(Category category:categories){
			if(category.getId() ==id)return category;
		}
		return null;
	}

}
