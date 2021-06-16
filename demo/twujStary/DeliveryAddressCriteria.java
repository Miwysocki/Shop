import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class DeliveryAddressCriteria extends AbstractORMCriteria {
	public final IntegerExpression deliveryAddressID;
	public final StringExpression name;
	public final StringExpression email;
	public final StringExpression phoneNumber;
	public final StringExpression streetWithNumber;
	public final StringExpression city;
	public final StringExpression country;
	public final StringExpression zipCode;
	public final IntegerExpression customerCustomerId;
	public final AssociationExpression customerCustomer;
	public final CollectionExpression orders;
	
	public DeliveryAddressCriteria(Criteria criteria) {
		super(criteria);
		deliveryAddressID = new IntegerExpression("deliveryAddressID", this);
		name = new StringExpression("name", this);
		email = new StringExpression("email", this);
		phoneNumber = new StringExpression("phoneNumber", this);
		streetWithNumber = new StringExpression("streetWithNumber", this);
		city = new StringExpression("city", this);
		country = new StringExpression("country", this);
		zipCode = new StringExpression("zipCode", this);
		customerCustomerId = new IntegerExpression("customerCustomer.customerID", this);
		customerCustomer = new AssociationExpression("customerCustomer", this);
		orders = new CollectionExpression("ORM_orders", this);
	}
	
	public DeliveryAddressCriteria(PersistentSession session) {
		this(session.createCriteria(DeliveryAddress.class));
	}
	
	public DeliveryAddressCriteria() throws PersistentException {
		this(ShopPersistentManager.instance().getSession());
	}
	
	public CustomerCriteria createCustomerCustomerCriteria() {
		return new CustomerCriteria(createCriteria("customerCustomer"));
	}
	
	public OrdersCriteria createOrdersCriteria() {
		return new OrdersCriteria(createCriteria("ORM_orders"));
	}
	
	public DeliveryAddress uniqueDeliveryAddress() {
		return (DeliveryAddress) super.uniqueResult();
	}
	
	public DeliveryAddress[] listDeliveryAddress() {
		java.util.List list = super.list();
		return (DeliveryAddress[]) list.toArray(new DeliveryAddress[list.size()]);
	}
}

