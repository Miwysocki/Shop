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

public class OrdersDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression orderID;
	public final IntegerExpression completionStage;
	public final DateExpression dateOrdered;
	public final IntegerExpression customerID;
	public final IntegerExpression deliverAddressId;
	public final AssociationExpression deliverAddress;
	public final IntegerExpression deliveryOptionID;
	public final IntegerExpression orderEntryId;
	public final AssociationExpression orderEntry;
	
	public OrdersDetachedCriteria() {
		super(Orders.class, OrdersCriteria.class);
		orderID = new IntegerExpression("orderID", this.getDetachedCriteria());
		completionStage = new IntegerExpression("completionStage", this.getDetachedCriteria());
		dateOrdered = new DateExpression("dateOrdered", this.getDetachedCriteria());
		customerID = new IntegerExpression("customerID", this.getDetachedCriteria());
		deliverAddressId = new IntegerExpression("deliverAddress.deliveryAddressID", this.getDetachedCriteria());
		deliverAddress = new AssociationExpression("deliverAddress", this.getDetachedCriteria());
		deliveryOptionID = new IntegerExpression("deliveryOptionID", this.getDetachedCriteria());
		orderEntryId = new IntegerExpression("orderEntry.orderID", this.getDetachedCriteria());
		orderEntry = new AssociationExpression("orderEntry", this.getDetachedCriteria());
	}
	
	public OrdersDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, OrdersCriteria.class);
		orderID = new IntegerExpression("orderID", this.getDetachedCriteria());
		completionStage = new IntegerExpression("completionStage", this.getDetachedCriteria());
		dateOrdered = new DateExpression("dateOrdered", this.getDetachedCriteria());
		customerID = new IntegerExpression("customerID", this.getDetachedCriteria());
		deliverAddressId = new IntegerExpression("deliverAddress.deliveryAddressID", this.getDetachedCriteria());
		deliverAddress = new AssociationExpression("deliverAddress", this.getDetachedCriteria());
		deliveryOptionID = new IntegerExpression("deliveryOptionID", this.getDetachedCriteria());
		orderEntryId = new IntegerExpression("orderEntry.orderID", this.getDetachedCriteria());
		orderEntry = new AssociationExpression("orderEntry", this.getDetachedCriteria());
	}
	
	public DeliveryAddressDetachedCriteria createDeliverAddressCriteria() {
		return new DeliveryAddressDetachedCriteria(createCriteria("deliverAddress"));
	}
	
	public OrderEntryDetachedCriteria createOrderEntryCriteria() {
		return new OrderEntryDetachedCriteria(createCriteria("orderEntry"));
	}
	
	public Orders uniqueOrders(PersistentSession session) {
		return (Orders) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Orders[] listOrders(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Orders[]) list.toArray(new Orders[list.size()]);
	}
}

