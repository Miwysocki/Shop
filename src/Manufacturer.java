/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Manufacturer", indexes={ @Index(columnList="ManufacturerID") })
public class Manufacturer implements Serializable {
	public Manufacturer() {
	}
	
	@Column(name="ManufacturerID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MANUFACTURER_MANUFACTURERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MANUFACTURER_MANUFACTURERID_GENERATOR", strategy="native")	
	private int manufacturerID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Description", nullable=true, length=255)	
	private String description;
	
	@OneToOne(mappedBy="manufacturerManufacturer", targetEntity=Product.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private Product product;
	
	private void setManufacturerID(int value) {
		this.manufacturerID = value;
	}
	
	public int getManufacturerID() {
		return manufacturerID;
	}
	
	public int getORMID() {
		return getManufacturerID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setProduct(Product value) {
		if (this.product != value) {
			Product lproduct = this.product;
			this.product = value;
			if (value != null) {
				product.setManufacturerManufacturer(this);
			}
			if (lproduct != null && lproduct.getManufacturerManufacturer() == this) {
				lproduct.setManufacturerManufacturer(null);
			}
		}
	}
	
	public Product getProduct() {
		return product;
	}
	
	public String toString() {
		return String.valueOf(getManufacturerID());
	}
	
}
