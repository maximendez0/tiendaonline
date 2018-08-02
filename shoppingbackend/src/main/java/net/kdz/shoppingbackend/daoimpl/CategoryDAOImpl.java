package net.kdz.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kdz.shoppingbackend.dao.CategoryDAO;
import net.kdz.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories=new ArrayList<>();
	
	static {
		Category category= new Category();
		//agrego primer categoria
		category.setId(1);
		category.setName("celular");
		category.setDescription("descripcion celulr");
		category.setImageURL("CAT_1.png");		
		categories.add(category);
		
		category= new Category();
		//agrego segunda categoria
		category.setId(2);
		category.setName("televisor");
		category.setDescription("descripcion televisor");
		category.setImageURL("CAT_2.png");		
		categories.add(category);
		
		category= new Category();
		//agrego tercer categoria
		category.setId(3);
		category.setName("notebook");
		category.setDescription("descripcion notebook");
		category.setImageURL("CAT_3.png");		
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enchanced for loop
		
		for(Category category:categories) {
			if(category.getId()==id) return category;
		}
		 return null;
	}

}
