import org.orm.*;
import org.hibernate.LockMode;

public interface ManufacturerDAO {
	public Manufacturer loadManufacturerByORMID(int manufacturerID) throws PersistentException;
	public Manufacturer getManufacturerByORMID(int manufacturerID) throws PersistentException;
	public Manufacturer loadManufacturerByORMID(int manufacturerID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Manufacturer getManufacturerByORMID(int manufacturerID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Manufacturer loadManufacturerByORMID(PersistentSession session, int manufacturerID) throws PersistentException;
	public Manufacturer getManufacturerByORMID(PersistentSession session, int manufacturerID) throws PersistentException;
	public Manufacturer loadManufacturerByORMID(PersistentSession session, int manufacturerID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Manufacturer getManufacturerByORMID(PersistentSession session, int manufacturerID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Manufacturer[] listManufacturerByQuery(String condition, String orderBy) throws PersistentException;
	public Manufacturer[] listManufacturerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryManufacturer(String condition, String orderBy) throws PersistentException;
	public java.util.List queryManufacturer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateManufacturerByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateManufacturerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Manufacturer[] listManufacturerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Manufacturer[] listManufacturerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryManufacturer(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryManufacturer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateManufacturerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateManufacturerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Manufacturer loadManufacturerByQuery(String condition, String orderBy) throws PersistentException;
	public Manufacturer loadManufacturerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Manufacturer loadManufacturerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Manufacturer loadManufacturerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Manufacturer createManufacturer();
	public boolean save(Manufacturer manufacturer) throws PersistentException;
	public boolean delete(Manufacturer manufacturer) throws PersistentException;
	public boolean deleteAndDissociate(Manufacturer manufacturer) throws PersistentException;
	public boolean deleteAndDissociate(Manufacturer manufacturer, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(Manufacturer manufacturer) throws PersistentException;
	public boolean evict(Manufacturer manufacturer) throws PersistentException;
	public Manufacturer loadManufacturerByCriteria(ManufacturerCriteria manufacturerCriteria);
	public Manufacturer[] listManufacturerByCriteria(ManufacturerCriteria manufacturerCriteria);
}
