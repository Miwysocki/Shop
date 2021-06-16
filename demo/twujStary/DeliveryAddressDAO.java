import org.orm.*;
import org.hibernate.LockMode;

public interface DeliveryAddressDAO {
	public DeliveryAddress loadDeliveryAddressByORMID(int deliveryAddressID) throws PersistentException;
	public DeliveryAddress getDeliveryAddressByORMID(int deliveryAddressID) throws PersistentException;
	public DeliveryAddress loadDeliveryAddressByORMID(int deliveryAddressID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DeliveryAddress getDeliveryAddressByORMID(int deliveryAddressID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DeliveryAddress loadDeliveryAddressByORMID(PersistentSession session, int deliveryAddressID) throws PersistentException;
	public DeliveryAddress getDeliveryAddressByORMID(PersistentSession session, int deliveryAddressID) throws PersistentException;
	public DeliveryAddress loadDeliveryAddressByORMID(PersistentSession session, int deliveryAddressID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DeliveryAddress getDeliveryAddressByORMID(PersistentSession session, int deliveryAddressID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DeliveryAddress[] listDeliveryAddressByQuery(String condition, String orderBy) throws PersistentException;
	public DeliveryAddress[] listDeliveryAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDeliveryAddress(String condition, String orderBy) throws PersistentException;
	public java.util.List queryDeliveryAddress(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDeliveryAddressByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDeliveryAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DeliveryAddress[] listDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public DeliveryAddress[] listDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDeliveryAddress(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryDeliveryAddress(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DeliveryAddress loadDeliveryAddressByQuery(String condition, String orderBy) throws PersistentException;
	public DeliveryAddress loadDeliveryAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DeliveryAddress loadDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public DeliveryAddress loadDeliveryAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DeliveryAddress createDeliveryAddress();
	public boolean save(DeliveryAddress deliveryAddress) throws PersistentException;
	public boolean delete(DeliveryAddress deliveryAddress) throws PersistentException;
	public boolean deleteAndDissociate(DeliveryAddress deliveryAddress) throws PersistentException;
	public boolean deleteAndDissociate(DeliveryAddress deliveryAddress, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(DeliveryAddress deliveryAddress) throws PersistentException;
	public boolean evict(DeliveryAddress deliveryAddress) throws PersistentException;
	public DeliveryAddress loadDeliveryAddressByCriteria(DeliveryAddressCriteria deliveryAddressCriteria);
	public DeliveryAddress[] listDeliveryAddressByCriteria(DeliveryAddressCriteria deliveryAddressCriteria);
}
