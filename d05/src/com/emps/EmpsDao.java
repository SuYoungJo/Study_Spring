package com.emps;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.mybatis.mapper.EmpsMapper;
import com.vo.Emps;

@Repository("edao")
public class EmpsDao implements Dao<String, Emps> {
	
	@Autowired
	EmpsMapper em;
	
	@Override
	public void insert(Emps v) throws Exception {
		em.insert(v);
	}

	@Override
	public void delete(String k) throws Exception {
		em.delete(k);
	}

	@Override
	public void update(Emps v) throws Exception {
		em.update(v);
	}

	@Override
	public Emps select(String k) throws Exception {
		return em.select(k);
	}

	@Override
	public ArrayList<Emps> selectall() throws Exception {
		return em.selectall();
	}

}
