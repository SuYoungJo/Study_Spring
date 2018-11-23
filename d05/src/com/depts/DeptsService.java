package com.depts;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.frame.Dao;
import com.frame.Service;
import com.vo.Depts;

@Component("dserv")
public class DeptsService implements Service<Integer, Depts> {
	
	@Resource(name="ddao")
	Dao dao;
	
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register(Depts v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(Depts v) throws Exception {
		dao.update(v);
	}

	@Override
	public Depts get(Integer k) throws Exception {
		return (Depts) dao.select(k);
	}

	@Override
	public ArrayList<Depts> getall() throws Exception {
		return dao.selectall();
	}

}
