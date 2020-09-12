package com.DataBase;
import java.sql.ResultSet;
import java.sql.Statement;
public class Shop {
		public Product viewProduct(int pid) throws Exception
		{
		//fill the logic to retrive the product details from database and return product object
		    Product p = new Product();
			String view = "select * from product where prodId = " + pid;
			DB d = new DB();
			Statement stmt = d.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(view);
			while (rs.next()) {
				p.setProdId(rs.getInt(1));
				p.setProdName(rs.getString(2));
				p.setUnitPrice(rs.getInt(3));
			}
			return p;
			
		}

}
