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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EmployeeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression employeeID;
	public final StringExpression name;
	public final StringExpression position;
	public final IntegerExpression productId;
	public final AssociationExpression product;
	
	public EmployeeDetachedCriteria() {
		super(Employee.class, EmployeeCriteria.class);
		employeeID = new IntegerExpression("employeeID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		position = new StringExpression("position", this.getDetachedCriteria());
		productId = new IntegerExpression("product.employeeID", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
	}
	
	public EmployeeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, EmployeeCriteria.class);
		employeeID = new IntegerExpression("employeeID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		position = new StringExpression("position", this.getDetachedCriteria());
		productId = new IntegerExpression("product.employeeID", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria createProductCriteria() {
		return new ProductDetachedCriteria(createCriteria("product"));
	}
	
	public Employee uniqueEmployee(PersistentSession session) {
		return (Employee) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Employee[] listEmployee(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Employee[]) list.toArray(new Employee[list.size()]);
	}
}

