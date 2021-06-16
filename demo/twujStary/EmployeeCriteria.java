import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EmployeeCriteria extends AbstractORMCriteria {
	public final IntegerExpression employeeID;
	public final StringExpression name;
	public final StringExpression position;
	public final IntegerExpression productId;
	public final AssociationExpression product;
	
	public EmployeeCriteria(Criteria criteria) {
		super(criteria);
		employeeID = new IntegerExpression("employeeID", this);
		name = new StringExpression("name", this);
		position = new StringExpression("position", this);
		productId = new IntegerExpression("product.employeeID", this);
		product = new AssociationExpression("product", this);
	}
	
	public EmployeeCriteria(PersistentSession session) {
		this(session.createCriteria(Employee.class));
	}
	
	public EmployeeCriteria() throws PersistentException {
		this(ShopPersistentManager.instance().getSession());
	}
	
	public ProductCriteria createProductCriteria() {
		return new ProductCriteria(createCriteria("product"));
	}
	
	public Employee uniqueEmployee() {
		return (Employee) super.uniqueResult();
	}
	
	public Employee[] listEmployee() {
		java.util.List list = super.list();
		return (Employee[]) list.toArray(new Employee[list.size()]);
	}
}

