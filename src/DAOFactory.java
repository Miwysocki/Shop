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
public abstract class DAOFactory {
	private static DAOFactory _factory = new DAOFactoryImpl();
	
	public static DAOFactory getDAOFactory() {
		return _factory;
	}
	
	public abstract CustomerDAO getCustomerDAO();
	public abstract DeliveryAddressDAO getDeliveryAddressDAO();
	public abstract OrdersDAO getOrdersDAO();
	public abstract OrderEntryDAO getOrderEntryDAO();
	public abstract ProductDAO getProductDAO();
	public abstract EmployeeDAO getEmployeeDAO();
	public abstract ManufacturerDAO getManufacturerDAO();
	public abstract VatCategoryDAO getVatCategoryDAO();
}

