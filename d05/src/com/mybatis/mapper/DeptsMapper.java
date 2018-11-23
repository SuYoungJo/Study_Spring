package com.mybatis.mapper;

import java.util.ArrayList;

import com.vo.Depts;

public interface DeptsMapper {
	public void insert(Depts depts);
	public void delete(int id);
	public void update(Depts depts);
	public Depts select(int id);
	public ArrayList<Depts> selectall();
}
