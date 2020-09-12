package com.DataBase;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class ShipmentMain {

	public static void main(String ags[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("List of the Shipment Details");
		System.out.println(String.format("%-5s %-20s %-20s %-20s %-10s %s", "Id", "Name", "Arrival PortName",
				"Departure PortName", "Cost", "Status"));
		// fill your code
		ShipmentDAO dao = new ShipmentDAO();
		List<Shipment> list = dao.getAllShipment();
		for (Shipment shipment : list) {
			System.out.println(shipment);
		}
		System.out.println("Select the shipment id to be updated");
		// fill your code
		int sid = Integer.parseInt(br.readLine());

		List<ShipmentStatus> slist = dao.getAllShipmentStatus();
		int i = 0;
		for (ShipmentStatus shipmentStatus : slist) {
			i++;
			System.out.println(i + "." + shipmentStatus);
		}
		System.out.println("Select the id of new shipment status");
		// fill your code
		int id = Integer.parseInt(br.readLine());
		dao.updateShipment(sid, id);
		System.out.println("List of the updated Shipment Details");
		System.out.println(String.format("%-5s %-20s %-20s %-20s %-10s %s", "Id", "Name", "Arrival PortName",
				"Departure PortName", "Cost", "Status"));
		List<Shipment> up = dao.getAllShipment();
		for (Shipment shipment : up) {
			System.out.println(shipment);
		}
	}

}
