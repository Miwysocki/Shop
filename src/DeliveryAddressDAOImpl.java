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
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class DeliveryAddressDAOImpl implements DeliveryAddressDAO {
	public DeliveryAddress loadDeliveryAddressByORMID(int deliveryAddressID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadDeliveryAddressByORMID(session, deliveryAddressID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress getDeliveryAddressByORMID(int deliveryAddressID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getDeliveryAddressByORMID(session, deliveryAddressID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress loadDeliveryAddressByORMID(int deliveryAddressID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadDeliveryAddressByORMID(session, deliveryAddressID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress getDeliveryAddressByORMID(int deliveryAddressID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getDeliveryAddressByORMID(session, deliveryAddressID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress loadDeliveryAddressByORMID(PersistentSession session, int deliveryAddressID) throws PersistentException {
		try {
			return (DeliveryAddress) session.load(DeliveryAddress.class, new Integer(deliveryAddressID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress getDeliveryAddressByORMID(PersistentSession session, int deliveryAddressID) throws PersistentException {
		try {
			return (DeliveryAddress) session.get(DeliveryAddress.class, new Integer(deliveryAddressID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress loadDeliveryAddressByORMID(PersistentSession session, int deliveryAddressID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DeliveryAddress) session.load(DeliveryAddress.class, new Integer(deliveryAddressID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress getDeliveryAddressByORMID(PersistentSession session, int deliveryAddressID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DeliveryAddress) session.get(DeliveryAddress.class, new Integer(deliveryAddressID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryDeliveryAddress(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryDeliveryAddress(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryDeliveryAddress(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryDeliveryAddress(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress[] listDeliveryAddressByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listDeliveryAddressByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress[] listDeliveryAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listDeliveryAddressByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryDeliveryAddress(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From DeliveryAddress as DeliveryAddress");
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
	
	public List queryDeliveryAddress(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From DeliveryAddress as DeliveryAddress");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DeliveryAddress", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress[] listDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDeliveryAddress(session, condition, orderBy);
			return (DeliveryAddress[]) list.toArray(new DeliveryAddress[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress[] listDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDeliveryAddress(session, condition, orderBy, lockMode);
			return (DeliveryAddress[]) list.toArray(new DeliveryAddress[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress loadDeliveryAddressByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadDeliveryAddressByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress loadDeliveryAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadDeliveryAddressByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress loadDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		DeliveryAddress[] deliveryAddresses = listDeliveryAddressByQuery(session, condition, orderBy);
		if (deliveryAddresses != null && deliveryAddresses.length > 0)
			return deliveryAddresses[0];
		else
			return null;
	}
	
	public DeliveryAddress loadDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		DeliveryAddress[] deliveryAddresses = listDeliveryAddressByQuery(session, condition, orderBy, lockMode);
		if (deliveryAddresses != null && deliveryAddresses.length > 0)
			return deliveryAddresses[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateDeliveryAddressByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateDeliveryAddressByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateDeliveryAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateDeliveryAddressByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From DeliveryAddress as DeliveryAddress");
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
	
	public java.util.Iterator iterateDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From DeliveryAddress as DeliveryAddress");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DeliveryAddress", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress createDeliveryAddress() {
		return new DeliveryAddress();
	}
	
	public boolean save(DeliveryAddress deliveryAddress) throws PersistentException {
		try {
			ShopPersistentManager.instance().saveObject(deliveryAddress);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(DeliveryAddress deliveryAddress) throws PersistentException {
		try {
			ShopPersistentManager.instance().deleteObject(deliveryAddress);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(DeliveryAddress deliveryAddress)throws PersistentException {
		try {
			if (deliveryAddress.getCustomerCustomer() != null) {
				deliveryAddress.getCustomerCustomer().setDeliveryAddress(null);
			}
			
			Orders[] lOrderss = deliveryAddress.orders.toArray();
			for(int i = 0; i < lOrderss.length; i++) {
				lOrderss[i].setDeliverAddress(null);
			}
			return delete(deliveryAddress);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(DeliveryAddress deliveryAddress, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (deliveryAddress.getCustomerCustomer() != null) {
				deliveryAddress.getCustomerCustomer().setDeliveryAddress(null);
			}
			
			Orders[] lOrderss = deliveryAddress.orders.toArray();
			for(int i = 0; i < lOrderss.length; i++) {
				lOrderss[i].setDeliverAddress(null);
			}
			try {
				session.delete(deliveryAddress);
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
	
	public boolean refresh(DeliveryAddress deliveryAddress) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().refresh(deliveryAddress);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(DeliveryAddress deliveryAddress) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().evict(deliveryAddress);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DeliveryAddress loadDeliveryAddressByCriteria(DeliveryAddressCriteria deliveryAddressCriteria) {
		DeliveryAddress[] deliveryAddresses = listDeliveryAddressByCriteria(deliveryAddressCriteria);
		if(deliveryAddresses == null || deliveryAddresses.length == 0) {
			return null;
		}
		return deliveryAddresses[0];
	}
	
	public DeliveryAddress[] listDeliveryAddressByCriteria(DeliveryAddressCriteria deliveryAddressCriteria) {
		return deliveryAddressCriteria.listDeliveryAddress();
	}
}
