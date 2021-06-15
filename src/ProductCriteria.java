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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProductCriteria extends AbstractORMCriteria {
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
	
	public ProductCriteria(Criteria criteria) {
		super(criteria);
		productID = new IntegerExpression("productID", this);
		name = new StringExpression("name", this);
		description = new StringExpression("description", this);
		priceNetto = new BigDecimalExpression("priceNetto", this);
		amountInStock = new IntegerExpression("amountInStock", this);
		vatCategoryID = new IntegerExpression("vatCategoryID", this);
		manufacturerID = new IntegerExpression("manufacturerID", this);
		categoryID = new IntegerExpression("categoryID", this);
		employeeID = new IntegerExpression("employeeID", this);
		orderEntryOrderEntryId = new IntegerExpression("orderEntryOrderEntry.orderEntryID", this);
		orderEntryOrderEntry = new AssociationExpression("orderEntryOrderEntry", this);
		employeeEmployeeId = new IntegerExpression("employeeEmployee.employeeID", this);
		employeeEmployee = new AssociationExpression("employeeEmployee", this);
		manufacturerManufacturerId = new IntegerExpression("manufacturerManufacturer.manufacturerID", this);
		manufacturerManufacturer = new AssociationExpression("manufacturerManufacturer", this);
		vatCategoryVatCategoryId = new IntegerExpression("vatCategoryVatCategory.vatCategoryID", this);
		vatCategoryVatCategory = new AssociationExpression("vatCategoryVatCategory", this);
	}
	
	public ProductCriteria(PersistentSession session) {
		this(session.createCriteria(Product.class));
	}
	
	public ProductCriteria() throws PersistentException {
		this(ShopPersistentManager.instance().getSession());
	}
	
	public OrderEntryCriteria createOrderEntryOrderEntryCriteria() {
		return new OrderEntryCriteria(createCriteria("orderEntryOrderEntry"));
	}
	
	public EmployeeCriteria createEmployeeEmployeeCriteria() {
		return new EmployeeCriteria(createCriteria("employeeEmployee"));
	}
	
	public ManufacturerCriteria createManufacturerManufacturerCriteria() {
		return new ManufacturerCriteria(createCriteria("manufacturerManufacturer"));
	}
	
	public VatCategoryCriteria createVatCategoryVatCategoryCriteria() {
		return new VatCategoryCriteria(createCriteria("vatCategoryVatCategory"));
	}
	
	public Product uniqueProduct() {
		return (Product) super.uniqueResult();
	}
	
	public Product[] listProduct() {
		java.util.List list = super.list();
		return (Product[]) list.toArray(new Product[list.size()]);
	}
}

