import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class OrderEntryDAOImpl implements OrderEntryDAO {
	public OrderEntry loadOrderEntryByORMID(int orderEntryID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadOrderEntryByORMID(session, orderEntryID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry getOrderEntryByORMID(int orderEntryID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getOrderEntryByORMID(session, orderEntryID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry loadOrderEntryByORMID(int orderEntryID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadOrderEntryByORMID(session, orderEntryID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry getOrderEntryByORMID(int orderEntryID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getOrderEntryByORMID(session, orderEntryID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry loadOrderEntryByORMID(PersistentSession session, int orderEntryID) throws PersistentException {
		try {
			return (OrderEntry) session.load(OrderEntry.class, new Integer(orderEntryID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry getOrderEntryByORMID(PersistentSession session, int orderEntryID) throws PersistentException {
		try {
			return (OrderEntry) session.get(OrderEntry.class, new Integer(orderEntryID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry loadOrderEntryByORMID(PersistentSession session, int orderEntryID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (OrderEntry) session.load(OrderEntry.class, new Integer(orderEntryID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry getOrderEntryByORMID(PersistentSession session, int orderEntryID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (OrderEntry) session.get(OrderEntry.class, new Integer(orderEntryID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryOrderEntry(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryOrderEntry(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryOrderEntry(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryOrderEntry(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry[] listOrderEntryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listOrderEntryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry[] listOrderEntryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listOrderEntryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryOrderEntry(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderEntry as OrderEntry");
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
	
	public List queryOrderEntry(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderEntry as OrderEntry");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("OrderEntry", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry[] listOrderEntryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOrderEntry(session, condition, orderBy);
			return (OrderEntry[]) list.toArray(new OrderEntry[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry[] listOrderEntryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOrderEntry(session, condition, orderBy, lockMode);
			return (OrderEntry[]) list.toArray(new OrderEntry[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry loadOrderEntryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadOrderEntryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry loadOrderEntryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadOrderEntryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry loadOrderEntryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		OrderEntry[] orderEntrys = listOrderEntryByQuery(session, condition, orderBy);
		if (orderEntrys != null && orderEntrys.length > 0)
			return orderEntrys[0];
		else
			return null;
	}
	
	public OrderEntry loadOrderEntryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		OrderEntry[] orderEntrys = listOrderEntryByQuery(session, condition, orderBy, lockMode);
		if (orderEntrys != null && orderEntrys.length > 0)
			return orderEntrys[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateOrderEntryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateOrderEntryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateOrderEntryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateOrderEntryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateOrderEntryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderEntry as OrderEntry");
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
	
	public java.util.Iterator iterateOrderEntryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderEntry as OrderEntry");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("OrderEntry", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry createOrderEntry() {
		return new OrderEntry();
	}
	
	public boolean save(OrderEntry orderEntry) throws PersistentException {
		try {
			ShopPersistentManager.instance().saveObject(orderEntry);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(OrderEntry orderEntry) throws PersistentException {
		try {
			ShopPersistentManager.instance().deleteObject(orderEntry);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(OrderEntry orderEntry)throws PersistentException {
		try {
			if (orderEntry.getOrder() != null) {
				orderEntry.getOrder().setOrderEntry(null);
			}
			
			Product[] lProducts = orderEntry.product.toArray();
			for(int i = 0; i < lProducts.length; i++) {
				lProducts[i].setOrderEntryOrderEntry(null);
			}
			return delete(orderEntry);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(OrderEntry orderEntry, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (orderEntry.getOrder() != null) {
				orderEntry.getOrder().setOrderEntry(null);
			}
			
			Product[] lProducts = orderEntry.product.toArray();
			for(int i = 0; i < lProducts.length; i++) {
				lProducts[i].setOrderEntryOrderEntry(null);
			}
			try {
				session.delete(orderEntry);
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
	
	public boolean refresh(OrderEntry orderEntry) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().refresh(orderEntry);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(OrderEntry orderEntry) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().evict(orderEntry);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrderEntry loadOrderEntryByCriteria(OrderEntryCriteria orderEntryCriteria) {
		OrderEntry[] orderEntrys = listOrderEntryByCriteria(orderEntryCriteria);
		if(orderEntrys == null || orderEntrys.length == 0) {
			return null;
		}
		return orderEntrys[0];
	}
	
	public OrderEntry[] listOrderEntryByCriteria(OrderEntryCriteria orderEntryCriteria) {
		return orderEntryCriteria.listOrderEntry();
	}
}
