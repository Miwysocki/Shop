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

public class CustomerCriteria extends AbstractORMCriteria {
	public final IntegerExpression customerID;
	public final StringExpression name;
	public final IntegerExpression password;
	public final IntegerExpression nickname;
	public final IntegerExpression discount;
	public final IntegerExpression deliveryAddressId;
	public final AssociationExpression deliveryAddress;
	
	public CustomerCriteria(Criteria criteria) {
		super(criteria);
		customerID = new IntegerExpression("customerID", this);
		name = new StringExpression("name", this);
		password = new IntegerExpression("password", this);
		nickname = new IntegerExpression("nickname", this);
		discount = new IntegerExpression("discount", this);
		deliveryAddressId = new IntegerExpression("deliveryAddress.customerID", this);
		deliveryAddress = new AssociationExpression("deliveryAddress", this);
	}
	
	public CustomerCriteria(PersistentSession session) {
		this(session.createCriteria(Customer.class));
	}
	
	public CustomerCriteria() throws PersistentException {
		this(ShopPersistentManager.instance().getSession());
	}
	
	public DeliveryAddressCriteria createDeliveryAddressCriteria() {
		return new DeliveryAddressCriteria(createCriteria("deliveryAddress"));
	}
	
	public Customer uniqueCustomer() {
		return (Customer) super.uniqueResult();
	}
	
	public Customer[] listCustomer() {
		java.util.List list = super.list();
		return (Customer[]) list.toArray(new Customer[list.size()]);
	}
}

