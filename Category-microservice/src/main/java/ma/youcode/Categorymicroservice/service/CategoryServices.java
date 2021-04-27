package ma.youcode.Categorymicroservice.service;

import java.util.List;

import ma.youcode.Categorymicroservice.model.CategoryEntity;


public interface CategoryServices {
    public List<CategoryEntity> listAll();
    public void save(CategoryEntity category);
    public CategoryEntity getById(long id);
    public void delete(long id);
	public void update(CategoryEntity category, Long categoryId);
}
