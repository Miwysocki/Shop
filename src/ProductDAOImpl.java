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

public class ProductDAOImpl implements ProductDAO {
	public Product loadProductByORMID(int productID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadProductByORMID(session, productID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product getProductByORMID(int productID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getProductByORMID(session, productID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product loadProductByORMID(int productID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadProductByORMID(session, productID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product getProductByORMID(int productID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getProductByORMID(session, productID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product loadProductByORMID(PersistentSession session, int productID) throws PersistentException {
		try {
			return (Product) session.load(Product.class, new Integer(productID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product getProductByORMID(PersistentSession session, int productID) throws PersistentException {
		try {
			return (Product) session.get(Product.class, new Integer(productID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product loadProductByORMID(PersistentSession session, int productID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Product) session.load(Product.class, new Integer(productID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product getProductByORMID(PersistentSession session, int productID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Product) session.get(Product.class, new Integer(productID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryProduct(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryProduct(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryProduct(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryProduct(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product[] listProductByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listProductByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product[] listProductByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listProductByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryProduct(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Product as Product");
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
	
	public List queryProduct(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Product as Product");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Product", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product[] listProductByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProduct(session, condition, orderBy);
			return (Product[]) list.toArray(new Product[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product[] listProductByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProduct(session, condition, orderBy, lockMode);
			return (Product[]) list.toArray(new Product[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product loadProductByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadProductByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product loadProductByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadProductByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product loadProductByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Product[] products = listProductByQuery(session, condition, orderBy);
		if (products != null && products.length > 0)
			return products[0];
		else
			return null;
	}
	
	public Product loadProductByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Product[] products = listProductByQuery(session, condition, orderBy, lockMode);
		if (products != null && products.length > 0)
			return products[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateProductByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateProductByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateProductByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateProductByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateProductByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Product as Product");
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
	
	public java.util.Iterator iterateProductByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Product as Product");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Product", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product createProduct() {
		return new Product();
	}
	
	public boolean save(Product product) throws PersistentException {
		try {
			ShopPersistentManager.instance().saveObject(product);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(Product product) throws PersistentException {
		try {
			ShopPersistentManager.instance().deleteObject(product);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(Product product)throws PersistentException {
		try {
			if (product.getOrderEntryOrderEntry() != null) {
				product.getOrderEntryOrderEntry().product.remove(product);
			}
			
			if (product.getEmployeeEmployee() != null) {
				product.getEmployeeEmployee().setProduct(null);
			}
			
			if (product.getManufacturerManufacturer() != null) {
				product.getManufacturerManufacturer().setProduct(null);
			}
			
			if (product.getVatCategoryVatCategory() != null) {
				product.getVatCategoryVatCategory().setProduct(null);
			}
			
			return delete(product);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(Product product, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (product.getOrderEntryOrderEntry() != null) {
				product.getOrderEntryOrderEntry().product.remove(product);
			}
			
			if (product.getEmployeeEmployee() != null) {
				product.getEmployeeEmployee().setProduct(null);
			}
			
			if (product.getManufacturerManufacturer() != null) {
				product.getManufacturerManufacturer().setProduct(null);
			}
			
			if (product.getVatCategoryVatCategory() != null) {
				product.getVatCategoryVatCategory().setProduct(null);
			}
			
			try {
				session.delete(product);
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
	
	public boolean refresh(Product product) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().refresh(product);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(Product product) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().evict(product);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Product loadProductByCriteria(ProductCriteria productCriteria) {
		Product[] products = listProductByCriteria(productCriteria);
		if(products == null || products.length == 0) {
			return null;
		}
		return products[0];
	}
	
	public Product[] listProductByCriteria(ProductCriteria productCriteria) {
		return productCriteria.listProduct();
	}
}
