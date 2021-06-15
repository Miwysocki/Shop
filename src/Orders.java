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
import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Orders", indexes={ @Index(columnList="OrderID") })
public class Orders implements Serializable {
	public Orders() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ORDERS_DELIVERADDRESS) {
			this.deliverAddress = (DeliveryAddress) owner;
		}
		
		else if (key == ORMConstants.KEY_ORDERS_ORDERENTRY) {
			this.orderEntry = (OrderEntry) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="OrderID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORDERS_ORDERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORDERS_ORDERID_GENERATOR", strategy="native")	
	private int orderID;
	
	@Column(name="CompletionStage", nullable=true, length=10)	
	private Integer completionStage;
	
	@Column(name="DateOrdered", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date dateOrdered;
	
	@Column(name="CustomerID", nullable=true, length=10)	
	private Integer customerID;
	
	@ManyToOne(targetEntity=DeliveryAddress.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="DeliverAddressID", referencedColumnName="DeliveryAddressID", nullable=false) }, foreignKey=@ForeignKey(name="FKOrders213262"))	
	private DeliveryAddress deliverAddress;
	
	@Column(name="DeliveryOptionID", nullable=true, length=10)	
	private Integer deliveryOptionID;
	
	@OneToOne(mappedBy="order", targetEntity=OrderEntry.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private OrderEntry orderEntry;
	
	private void setOrderID(int value) {
		this.orderID = value;
	}
	
	public int getOrderID() {
		return orderID;
	}
	
	public int getORMID() {
		return getOrderID();
	}
	
	public void setCompletionStage(int value) {
		setCompletionStage(new Integer(value));
	}
	
	public void setCompletionStage(Integer value) {
		this.completionStage = value;
	}
	
	public Integer getCompletionStage() {
		return completionStage;
	}
	
	public void setDateOrdered(java.util.Date value) {
		this.dateOrdered = value;
	}
	
	public java.util.Date getDateOrdered() {
		return dateOrdered;
	}
	
	public void setCustomerID(int value) {
		setCustomerID(new Integer(value));
	}
	
	public void setCustomerID(Integer value) {
		this.customerID = value;
	}
	
	public Integer getCustomerID() {
		return customerID;
	}
	
	public void setDeliveryOptionID(int value) {
		setDeliveryOptionID(new Integer(value));
	}
	
	public void setDeliveryOptionID(Integer value) {
		this.deliveryOptionID = value;
	}
	
	public Integer getDeliveryOptionID() {
		return deliveryOptionID;
	}
	
	public void setDeliverAddress(DeliveryAddress value) {
		if (deliverAddress != null) {
			deliverAddress.orders.remove(this);
		}
		if (value != null) {
			value.orders.add(this);
		}
	}
	
	public DeliveryAddress getDeliverAddress() {
		return deliverAddress;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_DeliverAddress(DeliveryAddress value) {
		this.deliverAddress = value;
	}
	
	private DeliveryAddress getORM_DeliverAddress() {
		return deliverAddress;
	}
	
	public void setOrderEntry(OrderEntry value) {
		if (this.orderEntry != value) {
			OrderEntry lorderEntry = this.orderEntry;
			this.orderEntry = value;
			if (value != null) {
				orderEntry.setOrder(this);
			}
			if (lorderEntry != null && lorderEntry.getOrder() == this) {
				lorderEntry.setOrder(null);
			}
		}
	}
	
	public OrderEntry getOrderEntry() {
		return orderEntry;
	}
	
	public String toString() {
		return String.valueOf(getOrderID());
	}
	
}
