package cust;

import java.util.ArrayList;

import frame.Dao;

public class OracleCustDao implements Dao<String, Cust> {

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
		System.out.println(dbip+" Oracle inserted");
	}

	@Override
	public void delete(String k) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Cust v) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cust select(String k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cust> select() {
		// TODO Auto-generated method stub
		return null;
	}

}
