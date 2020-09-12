package com.DataBase;

public class ShipmentStatus {

	private int id;
	private String name;
	private int code;

	public ShipmentStatus(int id, String name, int code) {
		this.id = id;
		this.name = name;
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public ShipmentStatus() {

	}

	@Override
	public String toString() {
		return name;
	}

}
