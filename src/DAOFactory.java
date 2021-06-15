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

