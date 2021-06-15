import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class VatCategoryDAOImpl implements VatCategoryDAO {
	public VatCategory loadVatCategoryByORMID(int vatCategoryID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadVatCategoryByORMID(session, vatCategoryID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory getVatCategoryByORMID(int vatCategoryID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getVatCategoryByORMID(session, vatCategoryID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory loadVatCategoryByORMID(int vatCategoryID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadVatCategoryByORMID(session, vatCategoryID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory getVatCategoryByORMID(int vatCategoryID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getVatCategoryByORMID(session, vatCategoryID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory loadVatCategoryByORMID(PersistentSession session, int vatCategoryID) throws PersistentException {
		try {
			return (VatCategory) session.load(VatCategory.class, new Integer(vatCategoryID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory getVatCategoryByORMID(PersistentSession session, int vatCategoryID) throws PersistentException {
		try {
			return (VatCategory) session.get(VatCategory.class, new Integer(vatCategoryID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory loadVatCategoryByORMID(PersistentSession session, int vatCategoryID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (VatCategory) session.load(VatCategory.class, new Integer(vatCategoryID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory getVatCategoryByORMID(PersistentSession session, int vatCategoryID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (VatCategory) session.get(VatCategory.class, new Integer(vatCategoryID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryVatCategory(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryVatCategory(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryVatCategory(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryVatCategory(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory[] listVatCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listVatCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory[] listVatCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listVatCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryVatCategory(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From VatCategory as VatCategory");
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
	
	public List queryVatCategory(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From VatCategory as VatCategory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("VatCategory", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory[] listVatCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVatCategory(session, condition, orderBy);
			return (VatCategory[]) list.toArray(new VatCategory[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory[] listVatCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVatCategory(session, condition, orderBy, lockMode);
			return (VatCategory[]) list.toArray(new VatCategory[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory loadVatCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadVatCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory loadVatCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadVatCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory loadVatCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		VatCategory[] vatCategorys = listVatCategoryByQuery(session, condition, orderBy);
		if (vatCategorys != null && vatCategorys.length > 0)
			return vatCategorys[0];
		else
			return null;
	}
	
	public VatCategory loadVatCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		VatCategory[] vatCategorys = listVatCategoryByQuery(session, condition, orderBy, lockMode);
		if (vatCategorys != null && vatCategorys.length > 0)
			return vatCategorys[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateVatCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateVatCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateVatCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateVatCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateVatCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From VatCategory as VatCategory");
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
	
	public java.util.Iterator iterateVatCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From VatCategory as VatCategory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("VatCategory", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory createVatCategory() {
		return new VatCategory();
	}
	
	public boolean save(VatCategory vatCategory) throws PersistentException {
		try {
			ShopPersistentManager.instance().saveObject(vatCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(VatCategory vatCategory) throws PersistentException {
		try {
			ShopPersistentManager.instance().deleteObject(vatCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(VatCategory vatCategory)throws PersistentException {
		try {
			if (vatCategory.getProduct() != null) {
				vatCategory.getProduct().setVatCategoryVatCategory(null);
			}
			
			return delete(vatCategory);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(VatCategory vatCategory, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (vatCategory.getProduct() != null) {
				vatCategory.getProduct().setVatCategoryVatCategory(null);
			}
			
			try {
				session.delete(vatCategory);
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
	
	public boolean refresh(VatCategory vatCategory) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().refresh(vatCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(VatCategory vatCategory) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().evict(vatCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public VatCategory loadVatCategoryByCriteria(VatCategoryCriteria vatCategoryCriteria) {
		VatCategory[] vatCategorys = listVatCategoryByCriteria(vatCategoryCriteria);
		if(vatCategorys == null || vatCategorys.length == 0) {
			return null;
		}
		return vatCategorys[0];
	}
	
	public VatCategory[] listVatCategoryByCriteria(VatCategoryCriteria vatCategoryCriteria) {
		return vatCategoryCriteria.listVatCategory();
	}
}
