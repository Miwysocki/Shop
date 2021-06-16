import org.orm.*;
import org.hibernate.LockMode;

public interface ProductDAO {
	public Product loadProductByORMID(int productID) throws PersistentException;
	public Product getProductByORMID(int productID) throws PersistentException;
	public Product loadProductByORMID(int productID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Product getProductByORMID(int productID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Product loadProductByORMID(PersistentSession session, int productID) throws PersistentException;
	public Product getProductByORMID(PersistentSession session, int productID) throws PersistentException;
	public Product loadProductByORMID(PersistentSession session, int productID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Product getProductByORMID(PersistentSession session, int productID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Product[] listProductByQuery(String condition, String orderBy) throws PersistentException;
	public Product[] listProductByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryProduct(String condition, String orderBy) throws PersistentException;
	public java.util.List queryProduct(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateProductByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateProductByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Product[] listProductByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Product[] listProductByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryProduct(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryProduct(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateProductByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateProductByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Product loadProductByQuery(String condition, String orderBy) throws PersistentException;
	public Product loadProductByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Product loadProductByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Product loadProductByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Product createProduct();
	public boolean save(Product product) throws PersistentException;
	public boolean delete(Product product) throws PersistentException;
	public boolean deleteAndDissociate(Product product) throws PersistentException;
	public boolean deleteAndDissociate(Product product, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(Product product) throws PersistentException;
	public boolean evict(Product product) throws PersistentException;
	public Product loadProductByCriteria(ProductCriteria productCriteria);
	public Product[] listProductByCriteria(ProductCriteria productCriteria);
}
