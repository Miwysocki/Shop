
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	public Employee loadEmployeeByORMID(int employeeID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadEmployeeByORMID(session, employeeID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee getEmployeeByORMID(int employeeID) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getEmployeeByORMID(session, employeeID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee loadEmployeeByORMID(int employeeID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadEmployeeByORMID(session, employeeID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee getEmployeeByORMID(int employeeID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return getEmployeeByORMID(session, employeeID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee loadEmployeeByORMID(PersistentSession session, int employeeID) throws PersistentException {
		try {
			return (Employee) session.load(Employee.class, new Integer(employeeID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee getEmployeeByORMID(PersistentSession session, int employeeID) throws PersistentException {
		try {
			return (Employee) session.get(Employee.class, new Integer(employeeID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee loadEmployeeByORMID(PersistentSession session, int employeeID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Employee) session.load(Employee.class, new Integer(employeeID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee getEmployeeByORMID(PersistentSession session, int employeeID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Employee) session.get(Employee.class, new Integer(employeeID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEmployee(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryEmployee(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEmployee(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return queryEmployee(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee[] listEmployeeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listEmployeeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee[] listEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return listEmployeeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEmployee(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Employee as Employee");
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
	
	public List queryEmployee(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Employee as Employee");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Employee", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee[] listEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEmployee(session, condition, orderBy);
			return (Employee[]) list.toArray(new Employee[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee[] listEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEmployee(session, condition, orderBy, lockMode);
			return (Employee[]) list.toArray(new Employee[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee loadEmployeeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadEmployeeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee loadEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return loadEmployeeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee loadEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Employee[] employees = listEmployeeByQuery(session, condition, orderBy);
		if (employees != null && employees.length > 0)
			return employees[0];
		else
			return null;
	}
	
	public Employee loadEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Employee[] employees = listEmployeeByQuery(session, condition, orderBy, lockMode);
		if (employees != null && employees.length > 0)
			return employees[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateEmployeeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateEmployeeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ShopPersistentManager.instance().getSession();
			return iterateEmployeeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Employee as Employee");
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
	
	public java.util.Iterator iterateEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Employee as Employee");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Employee", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee createEmployee() {
		return new Employee();
	}
	
	public boolean save(Employee employee) throws PersistentException {
		try {
			ShopPersistentManager.instance().saveObject(employee);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(Employee employee) throws PersistentException {
		try {
			ShopPersistentManager.instance().deleteObject(employee);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(Employee employee)throws PersistentException {
		try {
			if (employee.getProduct() != null) {
				employee.getProduct().setEmployeeEmployee(null);
			}
			
			return delete(employee);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(Employee employee, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (employee.getProduct() != null) {
				employee.getProduct().setEmployeeEmployee(null);
			}
			
			try {
				session.delete(employee);
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
	
	public boolean refresh(Employee employee) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().refresh(employee);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(Employee employee) throws PersistentException {
		try {
			ShopPersistentManager.instance().getSession().evict(employee);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Employee loadEmployeeByCriteria(EmployeeCriteria employeeCriteria) {
		Employee[] employees = listEmployeeByCriteria(employeeCriteria);
		if(employees == null || employees.length == 0) {
			return null;
		}
		return employees[0];
	}
	
	public Employee[] listEmployeeByCriteria(EmployeeCriteria employeeCriteria) {
		return employeeCriteria.listEmployee();
	}
}
