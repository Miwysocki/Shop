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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProductDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression productID;
	public final StringExpression name;
	public final StringExpression description;
	public final BigDecimalExpression priceNetto;
	public final IntegerExpression amountInStock;
	public final IntegerExpression vatCategoryID;
	public final IntegerExpression manufacturerID;
	public final IntegerExpression categoryID;
	public final IntegerExpression employeeID;
	public final IntegerExpression orderEntryOrderEntryId;
	public final AssociationExpression orderEntryOrderEntry;
	public final IntegerExpression employeeEmployeeId;
	public final AssociationExpression employeeEmployee;
	public final IntegerExpression manufacturerManufacturerId;
	public final AssociationExpression manufacturerManufacturer;
	public final IntegerExpression vatCategoryVatCategoryId;
	public final AssociationExpression vatCategoryVatCategory;
	
	public ProductDetachedCriteria() {
		super(Product.class, ProductCriteria.class);
		productID = new IntegerExpression("productID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		priceNetto = new BigDecimalExpression("priceNetto", this.getDetachedCriteria());
		amountInStock = new IntegerExpression("amountInStock", this.getDetachedCriteria());
		vatCategoryID = new IntegerExpression("vatCategoryID", this.getDetachedCriteria());
		manufacturerID = new IntegerExpression("manufacturerID", this.getDetachedCriteria());
		categoryID = new IntegerExpression("categoryID", this.getDetachedCriteria());
		employeeID = new IntegerExpression("employeeID", this.getDetachedCriteria());
		orderEntryOrderEntryId = new IntegerExpression("orderEntryOrderEntry.orderEntryID", this.getDetachedCriteria());
		orderEntryOrderEntry = new AssociationExpression("orderEntryOrderEntry", this.getDetachedCriteria());
		employeeEmployeeId = new IntegerExpression("employeeEmployee.employeeID", this.getDetachedCriteria());
		employeeEmployee = new AssociationExpression("employeeEmployee", this.getDetachedCriteria());
		manufacturerManufacturerId = new IntegerExpression("manufacturerManufacturer.manufacturerID", this.getDetachedCriteria());
		manufacturerManufacturer = new AssociationExpression("manufacturerManufacturer", this.getDetachedCriteria());
		vatCategoryVatCategoryId = new IntegerExpression("vatCategoryVatCategory.vatCategoryID", this.getDetachedCriteria());
		vatCategoryVatCategory = new AssociationExpression("vatCategoryVatCategory", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ProductCriteria.class);
		productID = new IntegerExpression("productID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		priceNetto = new BigDecimalExpression("priceNetto", this.getDetachedCriteria());
		amountInStock = new IntegerExpression("amountInStock", this.getDetachedCriteria());
		vatCategoryID = new IntegerExpression("vatCategoryID", this.getDetachedCriteria());
		manufacturerID = new IntegerExpression("manufacturerID", this.getDetachedCriteria());
		categoryID = new IntegerExpression("categoryID", this.getDetachedCriteria());
		employeeID = new IntegerExpression("employeeID", this.getDetachedCriteria());
		orderEntryOrderEntryId = new IntegerExpression("orderEntryOrderEntry.orderEntryID", this.getDetachedCriteria());
		orderEntryOrderEntry = new AssociationExpression("orderEntryOrderEntry", this.getDetachedCriteria());
		employeeEmployeeId = new IntegerExpression("employeeEmployee.employeeID", this.getDetachedCriteria());
		employeeEmployee = new AssociationExpression("employeeEmployee", this.getDetachedCriteria());
		manufacturerManufacturerId = new IntegerExpression("manufacturerManufacturer.manufacturerID", this.getDetachedCriteria());
		manufacturerManufacturer = new AssociationExpression("manufacturerManufacturer", this.getDetachedCriteria());
		vatCategoryVatCategoryId = new IntegerExpression("vatCategoryVatCategory.vatCategoryID", this.getDetachedCriteria());
		vatCategoryVatCategory = new AssociationExpression("vatCategoryVatCategory", this.getDetachedCriteria());
	}
	
	public OrderEntryDetachedCriteria createOrderEntryOrderEntryCriteria() {
		return new OrderEntryDetachedCriteria(createCriteria("orderEntryOrderEntry"));
	}
	
	public EmployeeDetachedCriteria createEmployeeEmployeeCriteria() {
		return new EmployeeDetachedCriteria(createCriteria("employeeEmployee"));
	}
	
	public ManufacturerDetachedCriteria createManufacturerManufacturerCriteria() {
		return new ManufacturerDetachedCriteria(createCriteria("manufacturerManufacturer"));
	}
	
	public VatCategoryDetachedCriteria createVatCategoryVatCategoryCriteria() {
		return new VatCategoryDetachedCriteria(createCriteria("vatCategoryVatCategory"));
	}
	
	public Product uniqueProduct(PersistentSession session) {
		return (Product) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Product[] listProduct(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Product[]) list.toArray(new Product[list.size()]);
	}
}

