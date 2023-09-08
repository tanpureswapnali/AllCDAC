package org.fi.mvcuserapp.dao;

import org.fi.mvcuserapp.beans.Category;

public interface CategoryDAO {
	
	//public String addCategory(int categoryId,String categoryName,String categoryDescription,String categoryImageUrl);

	public boolean addCategory(Category objCat);
	
	
	

}
