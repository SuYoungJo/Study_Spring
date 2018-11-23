package com.depts;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.mybatis.mapper.DeptsMapper;
import com.vo.Depts;

@Repository("ddao")
public class DeptsDao implements Dao<Integer, Depts> {
	
	@Autowired
	DeptsMapper dm;
	
	@Override
	public void insert(Depts v) throws Exception {
		dm.insert(v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		dm.delete(k);
	}

	@Override
	public void update(Depts v) throws Exception {
		dm.update(v);
	}

	@Override
	public Depts select(Integer k) throws Exception {
		return dm.select(k);
	}

	@Override
	public ArrayList<Depts> selectall() throws Exception {
		return dm.selectall();
	}

}
