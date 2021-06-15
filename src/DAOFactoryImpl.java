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
public class DAOFactoryImpl extends DAOFactory {
	private CustomerDAO _customerDAO = new CustomerDAOImpl();
	public CustomerDAO getCustomerDAO() {
		return _customerDAO;
	}
	
	private DeliveryAddressDAO _deliveryAddressDAO = new DeliveryAddressDAOImpl();
	public DeliveryAddressDAO getDeliveryAddressDAO() {
		return _deliveryAddressDAO;
	}
	
	private OrdersDAO _ordersDAO = new OrdersDAOImpl();
	public OrdersDAO getOrdersDAO() {
		return _ordersDAO;
	}
	
	private OrderEntryDAO _orderEntryDAO = new OrderEntryDAOImpl();
	public OrderEntryDAO getOrderEntryDAO() {
		return _orderEntryDAO;
	}
	
	private ProductDAO _productDAO = new ProductDAOImpl();
	public ProductDAO getProductDAO() {
		return _productDAO;
	}
	
	private EmployeeDAO _employeeDAO = new EmployeeDAOImpl();
	public EmployeeDAO getEmployeeDAO() {
		return _employeeDAO;
	}
	
	private ManufacturerDAO _manufacturerDAO = new ManufacturerDAOImpl();
	public ManufacturerDAO getManufacturerDAO() {
		return _manufacturerDAO;
	}
	
	private VatCategoryDAO _vatCategoryDAO = new VatCategoryDAOImpl();
	public VatCategoryDAO getVatCategoryDAO() {
		return _vatCategoryDAO;
	}
	
}

