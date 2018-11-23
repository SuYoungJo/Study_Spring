package com.emps;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.frame.Dao;
import com.frame.Service;
import com.vo.Emps;

@Component("eserv")
public class EmpsService implements Service<String, Emps> {
	
	@Resource(name="edao")
	Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register(Emps v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(Emps v) throws Exception {
		dao.update(v);
	}

	@Override
	public Emps get(String k) throws Exception {
		return (Emps) dao.select(k);
	}

	@Override
	public ArrayList<Emps> getall() throws Exception {
		return dao.selectall();
	}
		


}
