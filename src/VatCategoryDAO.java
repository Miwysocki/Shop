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

public interface VatCategoryDAO {
	public VatCategory loadVatCategoryByORMID(int vatCategoryID) throws PersistentException;
	public VatCategory getVatCategoryByORMID(int vatCategoryID) throws PersistentException;
	public VatCategory loadVatCategoryByORMID(int vatCategoryID, org.hibernate.LockMode lockMode) throws PersistentException;
	public VatCategory getVatCategoryByORMID(int vatCategoryID, org.hibernate.LockMode lockMode) throws PersistentException;
	public VatCategory loadVatCategoryByORMID(PersistentSession session, int vatCategoryID) throws PersistentException;
	public VatCategory getVatCategoryByORMID(PersistentSession session, int vatCategoryID) throws PersistentException;
	public VatCategory loadVatCategoryByORMID(PersistentSession session, int vatCategoryID, org.hibernate.LockMode lockMode) throws PersistentException;
	public VatCategory getVatCategoryByORMID(PersistentSession session, int vatCategoryID, org.hibernate.LockMode lockMode) throws PersistentException;
	public VatCategory[] listVatCategoryByQuery(String condition, String orderBy) throws PersistentException;
	public VatCategory[] listVatCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryVatCategory(String condition, String orderBy) throws PersistentException;
	public java.util.List queryVatCategory(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateVatCategoryByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateVatCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public VatCategory[] listVatCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public VatCategory[] listVatCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryVatCategory(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryVatCategory(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateVatCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateVatCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public VatCategory loadVatCategoryByQuery(String condition, String orderBy) throws PersistentException;
	public VatCategory loadVatCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public VatCategory loadVatCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public VatCategory loadVatCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public VatCategory createVatCategory();
	public boolean save(VatCategory vatCategory) throws PersistentException;
	public boolean delete(VatCategory vatCategory) throws PersistentException;
	public boolean deleteAndDissociate(VatCategory vatCategory) throws PersistentException;
	public boolean deleteAndDissociate(VatCategory vatCategory, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(VatCategory vatCategory) throws PersistentException;
	public boolean evict(VatCategory vatCategory) throws PersistentException;
	public VatCategory loadVatCategoryByCriteria(VatCategoryCriteria vatCategoryCriteria);
	public VatCategory[] listVatCategoryByCriteria(VatCategoryCriteria vatCategoryCriteria);
}
