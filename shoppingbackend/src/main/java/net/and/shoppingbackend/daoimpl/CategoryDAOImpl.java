package net.and.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.and.shoppingbackend.dao.CategoryDAO;
import net.and.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		//adding first
		category.setId(1);
		category.setName("Television");
		category.setDescription("Description for a TV");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//add second
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Description for a Mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		//add third
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Description for a Laptop");
		category.setImageURL("CAT_3.png");
				
		categories.add(category);
	}
	
	
	@Override
	public java.util.List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		// enhanced for
		for(Category category: categories) {
			
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
