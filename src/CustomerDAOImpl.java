import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
	public Customer loadCustomerByORMID(int customerID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadCustomerByORMID(session, customerID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer getCustomerByORMID(int customerID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getCustomerByORMID(session, customerID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer loadCustomerByORMID(int customerID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadCustomerByORMID(session, customerID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer getCustomerByORMID(int customerID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getCustomerByORMID(session, customerID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer loadCustomerByORMID(PersistentSession session, int customerID) throws PersistentException {
		try {
			return (Customer) session.load(Customer.class, new Integer(customerID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer getCustomerByORMID(PersistentSession session, int customerID) throws PersistentException {
		try {
			return (Customer) session.get(Customer.class, new Integer(customerID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer loadCustomerByORMID(PersistentSession session, int customerID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Customer) session.load(Customer.class, new Integer(customerID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer getCustomerByORMID(PersistentSession session, int customerID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Customer) session.get(Customer.class, new Integer(customerID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryCustomer(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryCustomer(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryCustomer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryCustomer(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer[] listCustomerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listCustomerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer[] listCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listCustomerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryCustomer(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Customer as Customer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryCustomer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Customer as Customer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Customer", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer[] listCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCustomer(session, condition, orderBy);
			return (Customer[]) list.toArray(new Customer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer[] listCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCustomer(session, condition, orderBy, lockMode);
			return (Customer[]) list.toArray(new Customer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer loadCustomerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadCustomerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer loadCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadCustomerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer loadCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Customer[] customers = listCustomerByQuery(session, condition, orderBy);
		if (customers != null && customers.length > 0)
			return customers[0];
		else
			return null;
	}
	
	public Customer loadCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Customer[] customers = listCustomerByQuery(session, condition, orderBy, lockMode);
		if (customers != null && customers.length > 0)
			return customers[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateCustomerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateCustomerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateCustomerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Customer as Customer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Customer as Customer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Customer", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer createCustomer() {
		return new Customer();
	}
	
	public boolean save(Customer customer) throws PersistentException {
		try {
			ShopPersistentManager.instance().saveObject(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(Customer customer) throws PersistentException {
		try {
			ShopPersistentManager.instance().deleteObject(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(Customer customer)throws PersistentException {
		try {
			if (customer.getDeliveryAddress() != null) {
				customer.getDeliveryAddress().setCustomerCustomer(null);
			}
			
			return delete(customer);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(Customer customer, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (customer.getDeliveryAddress() != null) {
				customer.getDeliveryAddress().setCustomerCustomer(null);
			}
			
			try {
				session.delete(customer);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(Customer customer) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().refresh(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(Customer customer) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().evict(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Customer loadCustomerByCriteria(CustomerCriteria customerCriteria) {
		Customer[] customers = listCustomerByCriteria(customerCriteria);
		if(customers == null || customers.length == 0) {
			return null;
		}
		return customers[0];
	}
	
	public Customer[] listCustomerByCriteria(CustomerCriteria customerCriteria) {
		return customerCriteria.listCustomer();
	}
}
