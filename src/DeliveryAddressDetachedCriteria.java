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

public class DeliveryAddressDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public DeliveryAddressDetachedCriteria() {
		super(DeliveryAddress.class, DeliveryAddressCriteria.class);
		deliveryAddressID = new IntegerExpression("deliveryAddressID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		phoneNumber = new StringExpression("phoneNumber", this.getDetachedCriteria());
		streetWithNumber = new StringExpression("streetWithNumber", this.getDetachedCriteria());
		city = new StringExpression("city", this.getDetachedCriteria());
		country = new StringExpression("country", this.getDetachedCriteria());
		zipCode = new StringExpression("zipCode", this.getDetachedCriteria());
		customerCustomerId = new IntegerExpression("customerCustomer.customerID", this.getDetachedCriteria());
		customerCustomer = new AssociationExpression("customerCustomer", this.getDetachedCriteria());
		orders = new CollectionExpression("ORM_orders", this.getDetachedCriteria());
	}
	
	public DeliveryAddressDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, DeliveryAddressCriteria.class);
		deliveryAddressID = new IntegerExpression("deliveryAddressID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		phoneNumber = new StringExpression("phoneNumber", this.getDetachedCriteria());
		streetWithNumber = new StringExpression("streetWithNumber", this.getDetachedCriteria());
		city = new StringExpression("city", this.getDetachedCriteria());
		country = new StringExpression("country", this.getDetachedCriteria());
		zipCode = new StringExpression("zipCode", this.getDetachedCriteria());
		customerCustomerId = new IntegerExpression("customerCustomer.customerID", this.getDetachedCriteria());
		customerCustomer = new AssociationExpression("customerCustomer", this.getDetachedCriteria());
		orders = new CollectionExpression("ORM_orders", this.getDetachedCriteria());
	}
	
	public CustomerDetachedCriteria createCustomerCustomerCriteria() {
		return new CustomerDetachedCriteria(createCriteria("customerCustomer"));
	}
	
	public OrdersDetachedCriteria createOrdersCriteria() {
		return new OrdersDetachedCriteria(createCriteria("ORM_orders"));
	}
	
	public DeliveryAddress uniqueDeliveryAddress(PersistentSession session) {
		return (DeliveryAddress) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public DeliveryAddress[] listDeliveryAddress(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (DeliveryAddress[]) list.toArray(new DeliveryAddress[list.size()]);
	}
}

