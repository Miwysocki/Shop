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
@Table(name="DeliveryAddress", indexes={ @Index(columnList="DeliveryAddressID") })
public class DeliveryAddress implements Serializable {
	public DeliveryAddress() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_DELIVERYADDRESS_ORDERS) {
			return ORM_orders;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="DeliveryAddressID", nullable=false, unique=true, length=10)	
	@Id	
	@GeneratedValue(generator="DELIVERYADDRESS_DELIVERYADDRESSID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DELIVERYADDRESS_DELIVERYADDRESSID_GENERATOR", strategy="native")	
	private int deliveryAddressID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="PhoneNumber", nullable=true, length=255)	
	private String phoneNumber;
	
	@Column(name="StreetWithNumber", nullable=true, length=255)	
	private String streetWithNumber;
	
	@Column(name="City", nullable=true, length=255)	
	private String city;
	
	@Column(name="Country", nullable=true, length=255)	
	private String country;
	
	@Column(name="ZipCode", nullable=true, length=255)	
	private String zipCode;
	
	@OneToOne(optional=false, targetEntity=Customer.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CustomerCustomerID", referencedColumnName="CustomerID", nullable=false) }, foreignKey=@ForeignKey(name="FKDeliveryAd344943"))	
	private Customer customerCustomer;
	
	@OneToMany(mappedBy="deliverAddress", targetEntity=Orders.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_orders = new java.util.HashSet();
	
	private void setDeliveryAddressID(int value) {
		this.deliveryAddressID = value;
	}
	
	public int getDeliveryAddressID() {
		return deliveryAddressID;
	}
	
	public int getORMID() {
		return getDeliveryAddressID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setStreetWithNumber(String value) {
		this.streetWithNumber = value;
	}
	
	public String getStreetWithNumber() {
		return streetWithNumber;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCountry(String value) {
		this.country = value;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setZipCode(String value) {
		this.zipCode = value;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setCustomerCustomer(Customer value) {
		if (this.customerCustomer != value) {
			Customer lcustomerCustomer = this.customerCustomer;
			this.customerCustomer = value;
			if (value != null) {
				customerCustomer.setDeliveryAddress(this);
			}
			if (lcustomerCustomer != null && lcustomerCustomer.getDeliveryAddress() == this) {
				lcustomerCustomer.setDeliveryAddress(null);
			}
		}
	}
	
	public Customer getCustomerCustomer() {
		return customerCustomer;
	}
	
	private void setORM_Orders(java.util.Set value) {
		this.ORM_orders = value;
	}
	
	private java.util.Set getORM_Orders() {
		return ORM_orders;
	}
	
	@Transient	
	public final OrdersSetCollection orders = new OrdersSetCollection(this, _ormAdapter, ORMConstants.KEY_DELIVERYADDRESS_ORDERS, ORMConstants.KEY_ORDERS_DELIVERADDRESS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getDeliveryAddressID());
	}
	
}
