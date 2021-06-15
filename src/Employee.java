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
@Table(name="Employee", indexes={ @Index(columnList="EmployeeID") })
public class Employee implements Serializable {
	public Employee() {
	}
	
	@Column(name="EmployeeID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="EMPLOYEE_EMPLOYEEID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EMPLOYEE_EMPLOYEEID_GENERATOR", strategy="native")	
	private int employeeID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Position", nullable=true, length=255)	
	private String position;
	
	@OneToOne(mappedBy="employeeEmployee", targetEntity=Product.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private Product product;
	
	private void setEmployeeID(int value) {
		this.employeeID = value;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public int getORMID() {
		return getEmployeeID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPosition(String value) {
		this.position = value;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setProduct(Product value) {
		if (this.product != value) {
			Product lproduct = this.product;
			this.product = value;
			if (value != null) {
				product.setEmployeeEmployee(this);
			}
			if (lproduct != null && lproduct.getEmployeeEmployee() == this) {
				lproduct.setEmployeeEmployee(null);
			}
		}
	}
	
	public Product getProduct() {
		return product;
	}
	
	public String toString() {
		return String.valueOf(getEmployeeID());
	}
	
}
