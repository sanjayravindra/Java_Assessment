package com.Collections;

public class Shipment implements Comparable<Shipment> {
	private String name;
	private String arrivalPort;
	private String departurePort;
	private Integer priority;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArrivalPort() {
		return arrivalPort;
	}

	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}

	public String getDeparturePort() {
		return departurePort;
	}

	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Shipment(String name, String arrivalPort, String departurePort, Integer priority) {
		super();
		this.name = name;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
		this.priority = priority;
	}

	@Override
	public int compareTo(Shipment shipment) {
		if (this.getPriority() > shipment.getPriority())
			return -1;
		else if (this.getPriority() > shipment.getPriority())
			return 1;
		else
			return 0;
	}

	@Override
	public String toString() {
		String express;
		if (this.getPriority() == 1) {
			express = "Yes";
		} else
			express = "No";
		return String.format("%-15s%-15s%-15s%s", name, arrivalPort, departurePort, express);
	}

}
