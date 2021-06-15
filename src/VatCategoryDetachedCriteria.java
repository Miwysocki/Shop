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

public class VatCategoryDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression vatCategoryID;
	public final StringExpression name;
	public final IntegerExpression percentValue;
	public final IntegerExpression productId;
	public final AssociationExpression product;
	
	public VatCategoryDetachedCriteria() {
		super(VatCategory.class, VatCategoryCriteria.class);
		vatCategoryID = new IntegerExpression("vatCategoryID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		percentValue = new IntegerExpression("percentValue", this.getDetachedCriteria());
		productId = new IntegerExpression("product.vatCategoryID", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
	}
	
	public VatCategoryDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, VatCategoryCriteria.class);
		vatCategoryID = new IntegerExpression("vatCategoryID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		percentValue = new IntegerExpression("percentValue", this.getDetachedCriteria());
		productId = new IntegerExpression("product.vatCategoryID", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria createProductCriteria() {
		return new ProductDetachedCriteria(createCriteria("product"));
	}
	
	public VatCategory uniqueVatCategory(PersistentSession session) {
		return (VatCategory) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public VatCategory[] listVatCategory(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (VatCategory[]) list.toArray(new VatCategory[list.size()]);
	}
}

