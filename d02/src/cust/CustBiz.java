package cust;

import java.util.ArrayList;

import frame.Biz;
import frame.Dao;

public class CustBiz implements Biz<String, Cust> {

	Dao dao;
		
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register(Cust v) {
		dao.insert(v);
	}

	@Override
	public void remove(String k) {
		dao.delete(k);
	}

	@Override
	public void modify(Cust v) {
		dao.update(v);
	}

	@Override
	public Cust get(String k) {
		return (Cust) dao.select(k);
	}

	@Override
	public ArrayList<Cust> get() {
		return dao.select();
	}

}
