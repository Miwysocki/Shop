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
import org.hibernate.LockMode;

public interface OrderEntryDAO {
	public OrderEntry loadOrderEntryByORMID(int orderEntryID) throws PersistentException;
	public OrderEntry getOrderEntryByORMID(int orderEntryID) throws PersistentException;
	public OrderEntry loadOrderEntryByORMID(int orderEntryID, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrderEntry getOrderEntryByORMID(int orderEntryID, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrderEntry loadOrderEntryByORMID(PersistentSession session, int orderEntryID) throws PersistentException;
	public OrderEntry getOrderEntryByORMID(PersistentSession session, int orderEntryID) throws PersistentException;
	public OrderEntry loadOrderEntryByORMID(PersistentSession session, int orderEntryID, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrderEntry getOrderEntryByORMID(PersistentSession session, int orderEntryID, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrderEntry[] listOrderEntryByQuery(String condition, String orderBy) throws PersistentException;
	public OrderEntry[] listOrderEntryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryOrderEntry(String condition, String orderBy) throws PersistentException;
	public java.util.List queryOrderEntry(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateOrderEntryByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateOrderEntryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrderEntry[] listOrderEntryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public OrderEntry[] listOrderEntryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryOrderEntry(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryOrderEntry(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateOrderEntryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateOrderEntryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrderEntry loadOrderEntryByQuery(String condition, String orderBy) throws PersistentException;
	public OrderEntry loadOrderEntryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrderEntry loadOrderEntryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public OrderEntry loadOrderEntryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrderEntry createOrderEntry();
	public boolean save(OrderEntry orderEntry) throws PersistentException;
	public boolean delete(OrderEntry orderEntry) throws PersistentException;
	public boolean deleteAndDissociate(OrderEntry orderEntry) throws PersistentException;
	public boolean deleteAndDissociate(OrderEntry orderEntry, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(OrderEntry orderEntry) throws PersistentException;
	public boolean evict(OrderEntry orderEntry) throws PersistentException;
	public OrderEntry loadOrderEntryByCriteria(OrderEntryCriteria orderEntryCriteria);
	public OrderEntry[] listOrderEntryByCriteria(OrderEntryCriteria orderEntryCriteria);
}
