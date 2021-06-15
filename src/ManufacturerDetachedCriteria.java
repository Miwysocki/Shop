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

public class ManufacturerDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression manufacturerID;
	public final StringExpression name;
	public final StringExpression description;
	public final IntegerExpression productId;
	public final AssociationExpression product;
	
	public ManufacturerDetachedCriteria() {
		super(Manufacturer.class, ManufacturerCriteria.class);
		manufacturerID = new IntegerExpression("manufacturerID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		productId = new IntegerExpression("product.manufacturerID", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
	}
	
	public ManufacturerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ManufacturerCriteria.class);
		manufacturerID = new IntegerExpression("manufacturerID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		productId = new IntegerExpression("product.manufacturerID", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria createProductCriteria() {
		return new ProductDetachedCriteria(createCriteria("product"));
	}
	
	public Manufacturer uniqueManufacturer(PersistentSession session) {
		return (Manufacturer) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Manufacturer[] listManufacturer(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Manufacturer[]) list.toArray(new Manufacturer[list.size()]);
	}
}

