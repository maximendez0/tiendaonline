package net.kdz.shoppingbackend.dao;

import java.util.List;

import net.kdz.shoppingbackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);
}
