import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CustomerDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression customerID;
	public final StringExpression name;
	public final IntegerExpression password;
	public final IntegerExpression nickname;
	public final IntegerExpression discount;
	public final IntegerExpression deliveryAddressId;
	public final AssociationExpression deliveryAddress;
	
	public CustomerDetachedCriteria() {
		super(Customer.class, CustomerCriteria.class);
		customerID = new IntegerExpression("customerID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		password = new IntegerExpression("password", this.getDetachedCriteria());
		nickname = new IntegerExpression("nickname", this.getDetachedCriteria());
		discount = new IntegerExpression("discount", this.getDetachedCriteria());
		deliveryAddressId = new IntegerExpression("deliveryAddress.customerID", this.getDetachedCriteria());
		deliveryAddress = new AssociationExpression("deliveryAddress", this.getDetachedCriteria());
	}
	
	public CustomerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CustomerCriteria.class);
		customerID = new IntegerExpression("customerID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		password = new IntegerExpression("password", this.getDetachedCriteria());
		nickname = new IntegerExpression("nickname", this.getDetachedCriteria());
		discount = new IntegerExpression("discount", this.getDetachedCriteria());
		deliveryAddressId = new IntegerExpression("deliveryAddress.customerID", this.getDetachedCriteria());
		deliveryAddress = new AssociationExpression("deliveryAddress", this.getDetachedCriteria());
	}
	
	public DeliveryAddressDetachedCriteria createDeliveryAddressCriteria() {
		return new DeliveryAddressDetachedCriteria(createCriteria("deliveryAddress"));
	}
	
	public Customer uniqueCustomer(PersistentSession session) {
		return (Customer) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Customer[] listCustomer(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Customer[]) list.toArray(new Customer[list.size()]);
	}
}

