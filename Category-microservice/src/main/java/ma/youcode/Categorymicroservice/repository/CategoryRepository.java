package ma.youcode.Categorymicroservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.youcode.Categorymicroservice.model.CategoryEntity;

//CrudRepository :  mainly provides CRUD functions.
//JpaRepository : provides some JPA-related methods such as flushing the persistence context and deleting records in a batch
//PagingAndSortingRepository :provides methods to do pagination and sorting records.
//JpaRepository :CrudRepository and PagingAndSortingRepository
//this interface extends the CrudRepository interface from Spring Data JPA. At runtime, 
//Spring will generate implementation class that provides all CRUD operations.

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{
	
	
}
