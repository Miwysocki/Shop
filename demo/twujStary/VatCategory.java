import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="VatCategory", indexes={ @Index(columnList="VatCategoryID") })
public class VatCategory implements Serializable {
	public VatCategory() {
	}
	
	@Column(name="VatCategoryID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="VATCATEGORY_VATCATEGORYID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VATCATEGORY_VATCATEGORYID_GENERATOR", strategy="native")	
	private int vatCategoryID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="PercentValue", nullable=true, length=10)	
	private Integer percentValue;
	
	@OneToOne(mappedBy="vatCategoryVatCategory", targetEntity=Product.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private Product product;
	
	private void setVatCategoryID(int value) {
		this.vatCategoryID = value;
	}
	
	public int getVatCategoryID() {
		return vatCategoryID;
	}
	
	public int getORMID() {
		return getVatCategoryID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPercentValue(int value) {
		setPercentValue(new Integer(value));
	}
	
	public void setPercentValue(Integer value) {
		this.percentValue = value;
	}
	
	public Integer getPercentValue() {
		return percentValue;
	}
	
	public void setProduct(Product value) {
		if (this.product != value) {
			Product lproduct = this.product;
			this.product = value;
			if (value != null) {
				product.setVatCategoryVatCategory(this);
			}
			if (lproduct != null && lproduct.getVatCategoryVatCategory() == this) {
				lproduct.setVatCategoryVatCategory(null);
			}
		}
	}
	
	public Product getProduct() {
		return product;
	}
	
	public String toString() {
		return String.valueOf(getVatCategoryID());
	}
	
}
