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

public class ManufacturerCriteria extends AbstractORMCriteria {
	public final IntegerExpression manufacturerID;
	public final StringExpression name;
	public final StringExpression description;
	public final IntegerExpression productId;
	public final AssociationExpression product;
	
	public ManufacturerCriteria(Criteria criteria) {
		super(criteria);
		manufacturerID = new IntegerExpression("manufacturerID", this);
		name = new StringExpression("name", this);
		description = new StringExpression("description", this);
		productId = new IntegerExpression("product.manufacturerID", this);
		product = new AssociationExpression("product", this);
	}
	
	public ManufacturerCriteria(PersistentSession session) {
		this(session.createCriteria(Manufacturer.class));
	}
	
	public ManufacturerCriteria() throws PersistentException {
		this(ShopPersistentManager.instance().getSession());
	}
	
	public ProductCriteria createProductCriteria() {
		return new ProductCriteria(createCriteria("product"));
	}
	
	public Manufacturer uniqueManufacturer() {
		return (Manufacturer) super.uniqueResult();
	}
	
	public Manufacturer[] listManufacturer() {
		java.util.List list = super.list();
		return (Manufacturer[]) list.toArray(new Manufacturer[list.size()]);
	}
}

