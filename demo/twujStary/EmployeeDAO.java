import org.orm.*;
import org.hibernate.LockMode;

public interface EmployeeDAO {
	public Employee loadEmployeeByORMID(int employeeID) throws PersistentException;
	public Employee getEmployeeByORMID(int employeeID) throws PersistentException;
	public Employee loadEmployeeByORMID(int employeeID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Employee getEmployeeByORMID(int employeeID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Employee loadEmployeeByORMID(PersistentSession session, int employeeID) throws PersistentException;
	public Employee getEmployeeByORMID(PersistentSession session, int employeeID) throws PersistentException;
	public Employee loadEmployeeByORMID(PersistentSession session, int employeeID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Employee getEmployeeByORMID(PersistentSession session, int employeeID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Employee[] listEmployeeByQuery(String condition, String orderBy) throws PersistentException;
	public Employee[] listEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEmployee(String condition, String orderBy) throws PersistentException;
	public java.util.List queryEmployee(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEmployeeByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Employee[] listEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Employee[] listEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEmployee(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryEmployee(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Employee loadEmployeeByQuery(String condition, String orderBy) throws PersistentException;
	public Employee loadEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Employee loadEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Employee loadEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Employee createEmployee();
	public boolean save(Employee employee) throws PersistentException;
	public boolean delete(Employee employee) throws PersistentException;
	public boolean deleteAndDissociate(Employee employee) throws PersistentException;
	public boolean deleteAndDissociate(Employee employee, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(Employee employee) throws PersistentException;
	public boolean evict(Employee employee) throws PersistentException;
	public Employee loadEmployeeByCriteria(EmployeeCriteria employeeCriteria);
	public Employee[] listEmployeeByCriteria(EmployeeCriteria employeeCriteria);
}
