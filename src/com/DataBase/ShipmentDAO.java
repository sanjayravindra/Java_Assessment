package com.DataBase;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ShipmentDAO {
	List<Shipment> getAllShipment() throws Exception {

		// fill your code
		List<Shipment> list = new ArrayList<>();
		Statement stmt = DB.getConnection().createStatement();
		ResultSet rs = stmt
				.executeQuery("select * from shipment a inner join shipment_status b on a.shipment_status_id = b.id;");
		while (rs.next()) {
			list.add(new Shipment(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5),
					new ShipmentStatus(rs.getInt(7), rs.getString(8), rs.getInt(9))));
		}
		return list;
	}

	List<ShipmentStatus> getAllShipmentStatus() throws Exception {
		// fill your code
		List<ShipmentStatus> list = new ArrayList<>();
		Statement stmt = DB.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery("select * from shipment_status");
		while (rs.next()) {
			list.add(new ShipmentStatus(rs.getInt(1), rs.getString(2), rs.getInt(3)));
		}
		return list;
	}

	void updateShipment(int shipmentId, int shipmentStatusId) throws Exception {
		// fill your code
		Statement stmt = DB.getConnection().createStatement();
		stmt.execute("update shipment set shipment_status_id =" + shipmentStatusId + " where id =" + shipmentId);
	}

}
