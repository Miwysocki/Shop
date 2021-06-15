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

public class OrderEntryDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression orderEntryID;
	public final IntegerExpression orderId;
	public final AssociationExpression order;
	public final IntegerExpression productID;
	public final IntegerExpression amount;
	public final IntegerExpression discountPercent;
	public final FloatExpression finalPrice;
	public final CollectionExpression product;
	
	public OrderEntryDetachedCriteria() {
		super(OrderEntry.class, OrderEntryCriteria.class);
		orderEntryID = new IntegerExpression("orderEntryID", this.getDetachedCriteria());
		orderId = new IntegerExpression("order.orderID", this.getDetachedCriteria());
		order = new AssociationExpression("order", this.getDetachedCriteria());
		productID = new IntegerExpression("productID", this.getDetachedCriteria());
		amount = new IntegerExpression("amount", this.getDetachedCriteria());
		discountPercent = new IntegerExpression("discountPercent", this.getDetachedCriteria());
		finalPrice = new FloatExpression("finalPrice", this.getDetachedCriteria());
		product = new CollectionExpression("ORM_product", this.getDetachedCriteria());
	}
	
	public OrderEntryDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, OrderEntryCriteria.class);
		orderEntryID = new IntegerExpression("orderEntryID", this.getDetachedCriteria());
		orderId = new IntegerExpression("order.orderID", this.getDetachedCriteria());
		order = new AssociationExpression("order", this.getDetachedCriteria());
		productID = new IntegerExpression("productID", this.getDetachedCriteria());
		amount = new IntegerExpression("amount", this.getDetachedCriteria());
		discountPercent = new IntegerExpression("discountPercent", this.getDetachedCriteria());
		finalPrice = new FloatExpression("finalPrice", this.getDetachedCriteria());
		product = new CollectionExpression("ORM_product", this.getDetachedCriteria());
	}
	
	public OrdersDetachedCriteria createOrderCriteria() {
		return new OrdersDetachedCriteria(createCriteria("order"));
	}
	
	public ProductDetachedCriteria createProductCriteria() {
		return new ProductDetachedCriteria(createCriteria("ORM_product"));
	}
	
	public OrderEntry uniqueOrderEntry(PersistentSession session) {
		return (OrderEntry) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public OrderEntry[] listOrderEntry(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (OrderEntry[]) list.toArray(new OrderEntry[list.size()]);
	}
}

