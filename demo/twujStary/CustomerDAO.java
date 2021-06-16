import org.orm.*;
import org.hibernate.LockMode;

public interface CustomerDAO {
	public Customer loadCustomerByORMID(int customerID) throws PersistentException;
	public Customer getCustomerByORMID(int customerID) throws PersistentException;
	public Customer loadCustomerByORMID(int customerID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Customer getCustomerByORMID(int customerID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Customer loadCustomerByORMID(PersistentSession session, int customerID) throws PersistentException;
	public Customer getCustomerByORMID(PersistentSession session, int customerID) throws PersistentException;
	public Customer loadCustomerByORMID(PersistentSession session, int customerID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Customer getCustomerByORMID(PersistentSession session, int customerID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Customer[] listCustomerByQuery(String condition, String orderBy) throws PersistentException;
	public Customer[] listCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryCustomer(String condition, String orderBy) throws PersistentException;
	public java.util.List queryCustomer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateCustomerByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Customer[] listCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Customer[] listCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryCustomer(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryCustomer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Customer loadCustomerByQuery(String condition, String orderBy) throws PersistentException;
	public Customer loadCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Customer loadCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Customer loadCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Customer createCustomer();
	public boolean save(Customer customer) throws PersistentException;
	public boolean delete(Customer customer) throws PersistentException;
	public boolean deleteAndDissociate(Customer customer) throws PersistentException;
	public boolean deleteAndDissociate(Customer customer, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(Customer customer) throws PersistentException;
	public boolean evict(Customer customer) throws PersistentException;
	public Customer loadCustomerByCriteria(CustomerCriteria customerCriteria);
	public Customer[] listCustomerByCriteria(CustomerCriteria customerCriteria);
}
