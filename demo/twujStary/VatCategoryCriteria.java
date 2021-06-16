import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class VatCategoryCriteria extends AbstractORMCriteria {
	public final IntegerExpression vatCategoryID;
	public final StringExpression name;
	public final IntegerExpression percentValue;
	public final IntegerExpression productId;
	public final AssociationExpression product;
	
	public VatCategoryCriteria(Criteria criteria) {
		super(criteria);
		vatCategoryID = new IntegerExpression("vatCategoryID", this);
		name = new StringExpression("name", this);
		percentValue = new IntegerExpression("percentValue", this);
		productId = new IntegerExpression("product.vatCategoryID", this);
		product = new AssociationExpression("product", this);
	}
	
	public VatCategoryCriteria(PersistentSession session) {
		this(session.createCriteria(VatCategory.class));
	}
	
	public VatCategoryCriteria() throws PersistentException {
		this(ShopPersistentManager.instance().getSession());
	}
	
	public ProductCriteria createProductCriteria() {
		return new ProductCriteria(createCriteria("product"));
	}
	
	public VatCategory uniqueVatCategory() {
		return (VatCategory) super.uniqueResult();
	}
	
	public VatCategory[] listVatCategory() {
		java.util.List list = super.list();
		return (VatCategory[]) list.toArray(new VatCategory[list.size()]);
	}
}

