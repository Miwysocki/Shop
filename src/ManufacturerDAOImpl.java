import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ManufacturerDAOImpl implements ManufacturerDAO {
	public Manufacturer loadManufacturerByORMID(int manufacturerID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadManufacturerByORMID(session, manufacturerID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer getManufacturerByORMID(int manufacturerID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getManufacturerByORMID(session, manufacturerID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer loadManufacturerByORMID(int manufacturerID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadManufacturerByORMID(session, manufacturerID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer getManufacturerByORMID(int manufacturerID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getManufacturerByORMID(session, manufacturerID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer loadManufacturerByORMID(PersistentSession session, int manufacturerID) throws PersistentException {
		try {
			return (Manufacturer) session.load(Manufacturer.class, new Integer(manufacturerID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer getManufacturerByORMID(PersistentSession session, int manufacturerID) throws PersistentException {
		try {
			return (Manufacturer) session.get(Manufacturer.class, new Integer(manufacturerID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer loadManufacturerByORMID(PersistentSession session, int manufacturerID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Manufacturer) session.load(Manufacturer.class, new Integer(manufacturerID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer getManufacturerByORMID(PersistentSession session, int manufacturerID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Manufacturer) session.get(Manufacturer.class, new Integer(manufacturerID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryManufacturer(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryManufacturer(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryManufacturer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryManufacturer(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer[] listManufacturerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listManufacturerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer[] listManufacturerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listManufacturerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryManufacturer(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Manufacturer as Manufacturer");
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
	
	public List queryManufacturer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Manufacturer as Manufacturer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Manufacturer", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer[] listManufacturerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryManufacturer(session, condition, orderBy);
			return (Manufacturer[]) list.toArray(new Manufacturer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer[] listManufacturerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryManufacturer(session, condition, orderBy, lockMode);
			return (Manufacturer[]) list.toArray(new Manufacturer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer loadManufacturerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadManufacturerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer loadManufacturerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadManufacturerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer loadManufacturerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Manufacturer[] manufacturers = listManufacturerByQuery(session, condition, orderBy);
		if (manufacturers != null && manufacturers.length > 0)
			return manufacturers[0];
		else
			return null;
	}
	
	public Manufacturer loadManufacturerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Manufacturer[] manufacturers = listManufacturerByQuery(session, condition, orderBy, lockMode);
		if (manufacturers != null && manufacturers.length > 0)
			return manufacturers[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateManufacturerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateManufacturerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateManufacturerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateManufacturerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateManufacturerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Manufacturer as Manufacturer");
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
	
	public java.util.Iterator iterateManufacturerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Manufacturer as Manufacturer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Manufacturer", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer createManufacturer() {
		return new Manufacturer();
	}
	
	public boolean save(Manufacturer manufacturer) throws PersistentException {
		try {
			ShopPersistentManager.instance().saveObject(manufacturer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(Manufacturer manufacturer) throws PersistentException {
		try {
			ShopPersistentManager.instance().deleteObject(manufacturer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(Manufacturer manufacturer)throws PersistentException {
		try {
			if (manufacturer.getProduct() != null) {
				manufacturer.getProduct().setManufacturerManufacturer(null);
			}
			
			return delete(manufacturer);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(Manufacturer manufacturer, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (manufacturer.getProduct() != null) {
				manufacturer.getProduct().setManufacturerManufacturer(null);
			}
			
			try {
				session.delete(manufacturer);
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
	
	public boolean refresh(Manufacturer manufacturer) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().refresh(manufacturer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(Manufacturer manufacturer) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().evict(manufacturer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Manufacturer loadManufacturerByCriteria(ManufacturerCriteria manufacturerCriteria) {
		Manufacturer[] manufacturers = listManufacturerByCriteria(manufacturerCriteria);
		if(manufacturers == null || manufacturers.length == 0) {
			return null;
		}
		return manufacturers[0];
	}
	
	public Manufacturer[] listManufacturerByCriteria(ManufacturerCriteria manufacturerCriteria) {
		return manufacturerCriteria.listManufacturer();
	}
}
