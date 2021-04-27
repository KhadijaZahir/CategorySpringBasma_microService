package ma.youcode.Categorymicroservice.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "category")
public class CategoryEntity implements Serializable {

//Using generated security password: cd70d15d-a42c-47b7-a05e-18769a3f5eca
	// Using generated security password: e1cc040f-1dbf-4292-9b61-2ad15a1d24be

	/**
	 * 
	 */
	private static final long serialVersionUID = 4108666288557173738L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;

//	@NotNull
	@Column(nullable = false, length = 250)
//	@Size(max = 250)
	private String name;

	// Constructor

	public CategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoryEntity(String name) {
		super();
		this.name = name;

	}

	// Getters and Setters

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}