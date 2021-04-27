package ma.youcode.Categorymicroservice.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.youcode.Categorymicroservice.model.CategoryEntity;
import ma.youcode.Categorymicroservice.repository.CategoryRepository;


@Service
@Transactional
public class CategoryServicesImpl implements CategoryServices{

	 @Autowired
    private CategoryRepository repo;
     
    public List<CategoryEntity> listAll() { 
        return repo.findAll();
    }
     
    public void save(CategoryEntity category) {
        repo.save(category);
    }
     
    public CategoryEntity getById(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
	public void update(CategoryEntity category, Long categoryId)   
	{  
		repo.save(category);  
	} 
	
	
}