import org.orm.*;
import org.hibernate.LockMode;

public interface OrdersDAO {
	public Orders loadOrdersByORMID(int orderID) throws PersistentException;
	public Orders getOrdersByORMID(int orderID) throws PersistentException;
	public Orders loadOrdersByORMID(int orderID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Orders getOrdersByORMID(int orderID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Orders loadOrdersByORMID(PersistentSession session, int orderID) throws PersistentException;
	public Orders getOrdersByORMID(PersistentSession session, int orderID) throws PersistentException;
	public Orders loadOrdersByORMID(PersistentSession session, int orderID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Orders getOrdersByORMID(PersistentSession session, int orderID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Orders[] listOrdersByQuery(String condition, String orderBy) throws PersistentException;
	public Orders[] listOrdersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryOrders(String condition, String orderBy) throws PersistentException;
	public java.util.List queryOrders(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateOrdersByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateOrdersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Orders[] listOrdersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Orders[] listOrdersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryOrders(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryOrders(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateOrdersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateOrdersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Orders loadOrdersByQuery(String condition, String orderBy) throws PersistentException;
	public Orders loadOrdersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Orders loadOrdersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Orders loadOrdersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Orders createOrders();
	public boolean save(Orders orders) throws PersistentException;
	public boolean delete(Orders orders) throws PersistentException;
	public boolean deleteAndDissociate(Orders orders) throws PersistentException;
	public boolean deleteAndDissociate(Orders orders, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(Orders orders) throws PersistentException;
	public boolean evict(Orders orders) throws PersistentException;
	public Orders loadOrdersByCriteria(OrdersCriteria ordersCriteria);
	public Orders[] listOrdersByCriteria(OrdersCriteria ordersCriteria);
}
