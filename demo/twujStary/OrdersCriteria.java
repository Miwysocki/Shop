import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class OrdersCriteria extends AbstractORMCriteria {
	public final IntegerExpression orderID;
	public final IntegerExpression completionStage;
	public final DateExpression dateOrdered;
	public final IntegerExpression customerID;
	public final IntegerExpression deliverAddressId;
	public final AssociationExpression deliverAddress;
	public final IntegerExpression deliveryOptionID;
	public final IntegerExpression orderEntryId;
	public final AssociationExpression orderEntry;
	
	public OrdersCriteria(Criteria criteria) {
		super(criteria);
		orderID = new IntegerExpression("orderID", this);
		completionStage = new IntegerExpression("completionStage", this);
		dateOrdered = new DateExpression("dateOrdered", this);
		customerID = new IntegerExpression("customerID", this);
		deliverAddressId = new IntegerExpression("deliverAddress.deliveryAddressID", this);
		deliverAddress = new AssociationExpression("deliverAddress", this);
		deliveryOptionID = new IntegerExpression("deliveryOptionID", this);
		orderEntryId = new IntegerExpression("orderEntry.orderID", this);
		orderEntry = new AssociationExpression("orderEntry", this);
	}
	
	public OrdersCriteria(PersistentSession session) {
		this(session.createCriteria(Orders.class));
	}
	
	public OrdersCriteria() throws PersistentException {
		this(ShopPersistentManager.instance().getSession());
	}
	
	public DeliveryAddressCriteria createDeliverAddressCriteria() {
		return new DeliveryAddressCriteria(createCriteria("deliverAddress"));
	}
	
	public OrderEntryCriteria createOrderEntryCriteria() {
		return new OrderEntryCriteria(createCriteria("orderEntry"));
	}
	
	public Orders uniqueOrders() {
		return (Orders) super.uniqueResult();
	}
	
	public Orders[] listOrders() {
		java.util.List list = super.list();
		return (Orders[]) list.toArray(new Orders[list.size()]);
	}
}

