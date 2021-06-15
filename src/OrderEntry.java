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
@Table(name="OrderEntry", indexes={ @Index(columnList="OrderEntryID") })
public class OrderEntry implements Serializable {
	public OrderEntry() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ORDERENTRY_PRODUCT) {
			return ORM_product;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="OrderEntryID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORDERENTRY_ORDERENTRYID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORDERENTRY_ORDERENTRYID_GENERATOR", strategy="native")	
	private int orderEntryID;
	
	@OneToOne(optional=false, targetEntity=Orders.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="OrderID", referencedColumnName="OrderID", nullable=false) }, foreignKey=@ForeignKey(name="FKOrderEntry879214"))	
	private Orders order;
	
	@Column(name="ProductID", nullable=true, length=10)	
	private Integer productID;
	
	@Column(name="Amount", nullable=true, length=10)	
	private Integer amount;
	
	@Column(name="DiscountPercent", nullable=true, length=10)	
	private Integer discountPercent;
	
	@Column(name="FinalPrice", nullable=true, length=10)	
	private Float finalPrice;
	
	@OneToMany(mappedBy="orderEntryOrderEntry", targetEntity=Product.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_product = new java.util.HashSet();
	
	private void setOrderEntryID(int value) {
		this.orderEntryID = value;
	}
	
	public int getOrderEntryID() {
		return orderEntryID;
	}
	
	public int getORMID() {
		return getOrderEntryID();
	}
	
	public void setProductID(int value) {
		setProductID(new Integer(value));
	}
	
	public void setProductID(Integer value) {
		this.productID = value;
	}
	
	public Integer getProductID() {
		return productID;
	}
	
	public void setAmount(int value) {
		setAmount(new Integer(value));
	}
	
	public void setAmount(Integer value) {
		this.amount = value;
	}
	
	public Integer getAmount() {
		return amount;
	}
	
	public void setDiscountPercent(int value) {
		setDiscountPercent(new Integer(value));
	}
	
	public void setDiscountPercent(Integer value) {
		this.discountPercent = value;
	}
	
	public Integer getDiscountPercent() {
		return discountPercent;
	}
	
	public void setFinalPrice(float value) {
		setFinalPrice(new Float(value));
	}
	
	public void setFinalPrice(Float value) {
		this.finalPrice = value;
	}
	
	public Float getFinalPrice() {
		return finalPrice;
	}
	
	public void setOrder(Orders value) {
		if (this.order != value) {
			Orders lorder = this.order;
			this.order = value;
			if (value != null) {
				order.setOrderEntry(this);
			}
			if (lorder != null && lorder.getOrderEntry() == this) {
				lorder.setOrderEntry(null);
			}
		}
	}
	
	public Orders getOrder() {
		return order;
	}
	
	private void setORM_Product(java.util.Set value) {
		this.ORM_product = value;
	}
	
	private java.util.Set getORM_Product() {
		return ORM_product;
	}
	
	@Transient	
	public final ProductSetCollection product = new ProductSetCollection(this, _ormAdapter, ORMConstants.KEY_ORDERENTRY_PRODUCT, ORMConstants.KEY_PRODUCT_ORDERENTRYORDERENTRY, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getOrderEntryID());
	}
	
}
