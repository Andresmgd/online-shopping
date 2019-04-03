package net.and.shoppingbackend.dao;

import java.util.List;

import net.and.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
