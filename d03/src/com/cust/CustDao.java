package com.cust;

import java.util.ArrayList;

import com.frame.Dao;

public class CustDao implements Dao<String, Cust> {
	String dbip;
	
	public String getDbip() {
		return dbip;
	}

	public void setDbip(String dbip) {
		this.dbip = dbip;
	}

	@Override
	public void insert(Cust v) {
		System.out.println(v);
		System.out.println(dbip + " Inserted...");
	}

	@Override
	public void delete(String k) {
		System.out.println(k);
		System.out.println(dbip + " Deleted...");
		
	}

	@Override
	public void update(Cust v) {
		System.out.println(v);
		System.out.println(dbip + " Updated...");
		
	}

	@Override
	public Cust select(String k) {
		return new Cust("id34", "pwd34", "JO", 34);
	}

	@Override
	public ArrayList<Cust> select() {
		ArrayList<Cust> list = new ArrayList<>();
		list.add(new Cust("id34", "pwd34", "JO", 34));
		list.add(new Cust("id35", "pwd35", "KO", 54));
		list.add(new Cust("id36", "pwd36", "HO", 74));
		list.add(new Cust("id37", "pwd37", "WO", 24));
		list.add(new Cust("id38", "pwd38", "SO", 14));
		list.add(new Cust("id39", "pwd39", "MO", 64));
		return list;
	}
}
