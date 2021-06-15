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

public class OrderEntryCriteria extends AbstractORMCriteria {
	public final IntegerExpression orderEntryID;
	public final IntegerExpression orderId;
	public final AssociationExpression order;
	public final IntegerExpression productID;
	public final IntegerExpression amount;
	public final IntegerExpression discountPercent;
	public final FloatExpression finalPrice;
	public final CollectionExpression product;
	
	public OrderEntryCriteria(Criteria criteria) {
		super(criteria);
		orderEntryID = new IntegerExpression("orderEntryID", this);
		orderId = new IntegerExpression("order.orderID", this);
		order = new AssociationExpression("order", this);
		productID = new IntegerExpression("productID", this);
		amount = new IntegerExpression("amount", this);
		discountPercent = new IntegerExpression("discountPercent", this);
		finalPrice = new FloatExpression("finalPrice", this);
		product = new CollectionExpression("ORM_product", this);
	}
	
	public OrderEntryCriteria(PersistentSession session) {
		this(session.createCriteria(OrderEntry.class));
	}
	
	public OrderEntryCriteria() throws PersistentException {
		this(ShopPersistentManager.instance().getSession());
	}
	
	public OrdersCriteria createOrderCriteria() {
		return new OrdersCriteria(createCriteria("order"));
	}
	
	public ProductCriteria createProductCriteria() {
		return new ProductCriteria(createCriteria("ORM_product"));
	}
	
	public OrderEntry uniqueOrderEntry() {
		return (OrderEntry) super.uniqueResult();
	}
	
	public OrderEntry[] listOrderEntry() {
		java.util.List list = super.list();
		return (OrderEntry[]) list.toArray(new OrderEntry[list.size()]);
	}
}

