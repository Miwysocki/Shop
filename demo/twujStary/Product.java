import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Product", indexes={ @Index(columnList="ProductID") })
public class Product implements Serializable {
	public Product() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PRODUCT_ORDERENTRYORDERENTRY) {
			this.orderEntryOrderEntry = (OrderEntry) owner;
		}
		
		else if (key == ORMConstants.KEY_PRODUCT_EMPLOYEEEMPLOYEE) {
			this.employeeEmployee = (Employee) owner;
		}
		
		else if (key == ORMConstants.KEY_PRODUCT_MANUFACTURERMANUFACTURER) {
			this.manufacturerManufacturer = (Manufacturer) owner;
		}
		
		else if (key == ORMConstants.KEY_PRODUCT_VATCATEGORYVATCATEGORY) {
			this.vatCategoryVatCategory = (VatCategory) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ProductID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="PRODUCT_PRODUCTID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PRODUCT_PRODUCTID_GENERATOR", strategy="native")	
	private int productID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Description", nullable=true, length=255)	
	private String description;
	
	@Column(name="PriceNetto", nullable=true, precision=2, scale=0)	
	private java.math.BigDecimal priceNetto;
	
	@Column(name="AmountInStock", nullable=true, length=10)	
	private Integer amountInStock;
	
	@Column(name="VatCategoryID", nullable=true, length=10)	
	private Integer vatCategoryID;
	
	@Column(name="ManufacturerID", nullable=true, length=10)	
	private Integer manufacturerID;
	
	@Column(name="CategoryID", nullable=true, length=10)	
	private Integer categoryID;
	
	@Column(name="EmployeeID", nullable=true, length=10)	
	private Integer employeeID;
	
	@ManyToOne(targetEntity=OrderEntry.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="OrderEntryOrderEntryID", referencedColumnName="OrderEntryID", nullable=false) }, foreignKey=@ForeignKey(name="FKProduct63250"))	
	private OrderEntry orderEntryOrderEntry;
	
	@OneToOne(optional=false, targetEntity=Employee.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EmployeeEmployeeID", referencedColumnName="EmployeeID", nullable=false) }, foreignKey=@ForeignKey(name="FKProduct205640"))	
	private Employee employeeEmployee;
	
	@OneToOne(optional=false, targetEntity=Manufacturer.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ManufacturerManufacturerID", referencedColumnName="ManufacturerID", nullable=false) }, foreignKey=@ForeignKey(name="FKProduct878738"))	
	private Manufacturer manufacturerManufacturer;
	
	@OneToOne(optional=false, targetEntity=VatCategory.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="VatCategoryVatCategoryID", referencedColumnName="VatCategoryID", nullable=false) }, foreignKey=@ForeignKey(name="FKProduct85416"))	
	private VatCategory vatCategoryVatCategory;
	
	private void setProductID(int value) {
		this.productID = value;
	}
	
	public int getProductID() {
		return productID;
	}
	
	public int getORMID() {
		return getProductID();
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
	
	public void setPriceNetto(java.math.BigDecimal value) {
		this.priceNetto = value;
	}
	
	public java.math.BigDecimal getPriceNetto() {
		return priceNetto;
	}
	
	public void setAmountInStock(int value) {
		setAmountInStock(new Integer(value));
	}
	
	public void setAmountInStock(Integer value) {
		this.amountInStock = value;
	}
	
	public Integer getAmountInStock() {
		return amountInStock;
	}
	
	public void setVatCategoryID(int value) {
		setVatCategoryID(new Integer(value));
	}
	
	public void setVatCategoryID(Integer value) {
		this.vatCategoryID = value;
	}
	
	public Integer getVatCategoryID() {
		return vatCategoryID;
	}
	
	public void setManufacturerID(int value) {
		setManufacturerID(new Integer(value));
	}
	
	public void setManufacturerID(Integer value) {
		this.manufacturerID = value;
	}
	
	public Integer getManufacturerID() {
		return manufacturerID;
	}
	
	public void setCategoryID(int value) {
		setCategoryID(new Integer(value));
	}
	
	public void setCategoryID(Integer value) {
		this.categoryID = value;
	}
	
	public Integer getCategoryID() {
		return categoryID;
	}
	
	public void setEmployeeID(int value) {
		setEmployeeID(new Integer(value));
	}
	
	public void setEmployeeID(Integer value) {
		this.employeeID = value;
	}
	
	public Integer getEmployeeID() {
		return employeeID;
	}
	
	public void setOrderEntryOrderEntry(OrderEntry value) {
		if (orderEntryOrderEntry != null) {
			orderEntryOrderEntry.product.remove(this);
		}
		if (value != null) {
			value.product.add(this);
		}
	}
	
	public OrderEntry getOrderEntryOrderEntry() {
		return orderEntryOrderEntry;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_OrderEntryOrderEntry(OrderEntry value) {
		this.orderEntryOrderEntry = value;
	}
	
	private OrderEntry getORM_OrderEntryOrderEntry() {
		return orderEntryOrderEntry;
	}
	
	public void setEmployeeEmployee(Employee value) {
		if (this.employeeEmployee != value) {
			Employee lemployeeEmployee = this.employeeEmployee;
			this.employeeEmployee = value;
			if (value != null) {
				employeeEmployee.setProduct(this);
			}
			if (lemployeeEmployee != null && lemployeeEmployee.getProduct() == this) {
				lemployeeEmployee.setProduct(null);
			}
		}
	}
	
	public Employee getEmployeeEmployee() {
		return employeeEmployee;
	}
	
	public void setManufacturerManufacturer(Manufacturer value) {
		if (this.manufacturerManufacturer != value) {
			Manufacturer lmanufacturerManufacturer = this.manufacturerManufacturer;
			this.manufacturerManufacturer = value;
			if (value != null) {
				manufacturerManufacturer.setProduct(this);
			}
			if (lmanufacturerManufacturer != null && lmanufacturerManufacturer.getProduct() == this) {
				lmanufacturerManufacturer.setProduct(null);
			}
		}
	}
	
	public Manufacturer getManufacturerManufacturer() {
		return manufacturerManufacturer;
	}
	
	public void setVatCategoryVatCategory(VatCategory value) {
		if (this.vatCategoryVatCategory != value) {
			VatCategory lvatCategoryVatCategory = this.vatCategoryVatCategory;
			this.vatCategoryVatCategory = value;
			if (value != null) {
				vatCategoryVatCategory.setProduct(this);
			}
			if (lvatCategoryVatCategory != null && lvatCategoryVatCategory.getProduct() == this) {
				lvatCategoryVatCategory.setProduct(null);
			}
		}
	}
	
	public VatCategory getVatCategoryVatCategory() {
		return vatCategoryVatCategory;
	}
	
	public String toString() {
		return String.valueOf(getProductID());
	}
	
}
