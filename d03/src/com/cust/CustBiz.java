package com.cust;

import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.frame.Biz;
import com.frame.Dao;
import com.frame.LogAdvice;

@Component("cbiz")
public class CustBiz implements Biz<String, Cust> {
	
	LogAdvice logAdvice;
	
	@Resource(name = "cdao")
	Dao dao;
	
	public CustBiz() {
	}
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register(Cust v) throws Exception{
		if(v.getId().equals("id01")) {
			throw new Exception();
		}else {
			dao.insert(v);
		}
		dao.insert(v);
	}

	@Override
	public void remove(String k) throws Exception{
		dao.delete(k);
	}

	@Override
	public void modify(Cust v) throws Exception{
		dao.update(v);
	}

	@Override
	public Cust get(String k) throws Exception{
		return (Cust) dao.select(k);
	}

	@Override
	public ArrayList<Cust> get() throws Exception{
		return dao.select();
	}

}
