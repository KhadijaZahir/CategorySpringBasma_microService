package ma.youcode.Categorymicroservice.Controllers;


import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.youcode.Categorymicroservice.model.CategoryEntity;
import ma.youcode.Categorymicroservice.service.CategoryServicesImpl;


@RestController
//@RequestMapping("/category") // localhost:8084/category
public class CategoryController {

	@Autowired
	private CategoryServicesImpl categoryServices;


//	@GetMapping(value = "/allCategory")
//	public List<CategoryEntity> listcategory() {
//
//		List<CategoryEntity> category = categoryServices.listAll();
//		if (category.isEmpty())
//			throw new CategoryNotFoundException("Aucun category n'est disponible à la vente");
//
//		return category;
//
//	}

	// Récuperer un category par son id**************************************************************
	// La méthode recuperer category , qui permet de récupérer un category par son
	// id.
//Une exception  categoryNotFoundException , qui renvoie le code 404 si le ou les category ne sont pas trouvés.
//    @GetMapping( value = "/category/{id}")
//    public Optional<CategoryEntity> recupererCategory(@PathVariable int id) {
//
//        Optional<CategoryEntity> category = categoryServices.findById(id);
//
//        if(!category.isPresent())  throw new CategoryNotFoundException("Le category correspondant à l'id " + id + " n'existe pas");
//
//        return category;
//    }

	// get all category**************************************************************
//    	@GetMapping("/allcategory")
//    	private List<CategoryEntity> getAllCategory() {
//    		return categoryServices.listAll();
//    	}

	// Récupérer un category par son Id**************************************************************
	@GetMapping(value = "/category/{categoryId}")
	public CategoryEntity showCategory(@PathVariable Long categoryId) {
		return categoryServices.getById(categoryId);
	}

	// delete category **************************************************************
	@DeleteMapping(value = "/deleteCategory/{categoryId}")
	public void deleteCategory(@PathVariable Long categoryId) {

		categoryServices.delete(categoryId);
	}
	// delete category **************************************************************
//	@DeleteMapping("/category/{id}")
//	public void delete(@PathVariable Long categoryId) {
//		categoryServices.delete(categoryId);
//	}

	// updates category**************************************************************
//	@PutMapping(value = "/updatesCategory")
//	public void updatesCategory(@RequestBody CategoryEntity category) {
//
//		categoryServices.save(category);
//	}
	// updates category**************************************************************

	@PutMapping("/category/{id}")
	public ResponseEntity<?> update(@RequestBody CategoryEntity category, @PathVariable Long categoryId) {
		try {
			CategoryEntity existCategory = categoryServices.getById(categoryId);
			categoryServices.save(category);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// add category**************************************************************
	@PostMapping("/category")
	private Long saveCategory(@RequestBody CategoryEntity category) {
		categoryServices.save(category);
		return category.getCategoryId();
	}

//	@PostMapping("/category")
//	public void add(@RequestBody CategoryEntity category) {
//		categoryServices.save(category);
//	}

//	@GetMapping(value = "/categories")
//	public String getCategory() {
//		System.out.println("get get get");
//		return "get category";
//	}
//    @PostMapping("/category")
//    public String addCategory () {
//    	return "add category";
//    }
}