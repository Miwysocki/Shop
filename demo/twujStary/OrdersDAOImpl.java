import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class OrdersDAOImpl implements OrdersDAO {
	public Orders loadOrdersByORMID(int orderID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadOrdersByORMID(session, orderID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders getOrdersByORMID(int orderID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getOrdersByORMID(session, orderID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders loadOrdersByORMID(int orderID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadOrdersByORMID(session, orderID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders getOrdersByORMID(int orderID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getOrdersByORMID(session, orderID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders loadOrdersByORMID(PersistentSession session, int orderID) throws PersistentException {
		try {
			return (Orders) session.load(Orders.class, new Integer(orderID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders getOrdersByORMID(PersistentSession session, int orderID) throws PersistentException {
		try {
			return (Orders) session.get(Orders.class, new Integer(orderID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders loadOrdersByORMID(PersistentSession session, int orderID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Orders) session.load(Orders.class, new Integer(orderID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders getOrdersByORMID(PersistentSession session, int orderID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Orders) session.get(Orders.class, new Integer(orderID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryOrders(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryOrders(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryOrders(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryOrders(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders[] listOrdersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listOrdersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders[] listOrdersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listOrdersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryOrders(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Orders as Orders");
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
	
	public List queryOrders(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Orders as Orders");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Orders", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders[] listOrdersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOrders(session, condition, orderBy);
			return (Orders[]) list.toArray(new Orders[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders[] listOrdersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOrders(session, condition, orderBy, lockMode);
			return (Orders[]) list.toArray(new Orders[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders loadOrdersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadOrdersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders loadOrdersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadOrdersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders loadOrdersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Orders[] orderses = listOrdersByQuery(session, condition, orderBy);
		if (orderses != null && orderses.length > 0)
			return orderses[0];
		else
			return null;
	}
	
	public Orders loadOrdersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Orders[] orderses = listOrdersByQuery(session, condition, orderBy, lockMode);
		if (orderses != null && orderses.length > 0)
			return orderses[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateOrdersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateOrdersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateOrdersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateOrdersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateOrdersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Orders as Orders");
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
	
	public java.util.Iterator iterateOrdersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Orders as Orders");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Orders", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders createOrders() {
		return new Orders();
	}
	
	public boolean save(Orders orders) throws PersistentException {
		try {
			ShopPersistentManager.instance().saveObject(orders);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(Orders orders) throws PersistentException {
		try {
			ShopPersistentManager.instance().deleteObject(orders);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(Orders orders)throws PersistentException {
		try {
			if (orders.getDeliverAddress() != null) {
				orders.getDeliverAddress().orders.remove(orders);
			}
			
			if (orders.getOrderEntry() != null) {
				orders.getOrderEntry().setOrder(null);
			}
			
			return delete(orders);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(Orders orders, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (orders.getDeliverAddress() != null) {
				orders.getDeliverAddress().orders.remove(orders);
			}
			
			if (orders.getOrderEntry() != null) {
				orders.getOrderEntry().setOrder(null);
			}
			
			try {
				session.delete(orders);
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
	
	public boolean refresh(Orders orders) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().refresh(orders);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(Orders orders) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().evict(orders);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Orders loadOrdersByCriteria(OrdersCriteria ordersCriteria) {
		Orders[] orderses = listOrdersByCriteria(ordersCriteria);
		if(orderses == null || orderses.length == 0) {
			return null;
		}
		return orderses[0];
	}
	
	public Orders[] listOrdersByCriteria(OrdersCriteria ordersCriteria) {
		return ordersCriteria.listOrders();
	}
}
