import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Customer", indexes={ @Index(columnList="CustomerID") })
public class Customer implements Serializable {
	public Customer() {
	}
	
	@Column(name="CustomerID", nullable=false, unique=true, length=10)	
	@Id	
	@GeneratedValue(generator="CUSTOMER_CUSTOMERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CUSTOMER_CUSTOMERID_GENERATOR", strategy="native")	
	private int customerID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Password", nullable=true, length=10)	
	private Integer password;
	
	@Column(name="Nickname", nullable=true, length=10)	
	private Integer nickname;
	
	@Column(name="Discount", nullable=true, length=10)	
	private Integer discount;
	
	@OneToOne(mappedBy="customerCustomer", targetEntity=DeliveryAddress.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private DeliveryAddress deliveryAddress;
	
	private void setCustomerID(int value) {
		this.customerID = value;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public int getORMID() {
		return getCustomerID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPassword(int value) {
		setPassword(new Integer(value));
	}
	
	public void setPassword(Integer value) {
		this.password = value;
	}
	
	public Integer getPassword() {
		return password;
	}
	
	public void setNickname(int value) {
		setNickname(new Integer(value));
	}
	
	public void setNickname(Integer value) {
		this.nickname = value;
	}
	
	public Integer getNickname() {
		return nickname;
	}
	
	public void setDiscount(int value) {
		setDiscount(new Integer(value));
	}
	
	public void setDiscount(Integer value) {
		this.discount = value;
	}
	
	public Integer getDiscount() {
		return discount;
	}
	
	public void setDeliveryAddress(DeliveryAddress value) {
		if (this.deliveryAddress != value) {
			DeliveryAddress ldeliveryAddress = this.deliveryAddress;
			this.deliveryAddress = value;
			if (value != null) {
				deliveryAddress.setCustomerCustomer(this);
			}
			if (ldeliveryAddress != null && ldeliveryAddress.getCustomerCustomer() == this) {
				ldeliveryAddress.setCustomerCustomer(null);
			}
		}
	}
	
	public DeliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}
	
	public String toString() {
		return String.valueOf(getCustomerID());
	}
	
}
