package com.mybatis.mapper;

import java.util.ArrayList;

import com.vo.Emps;

public interface EmpsMapper {
	public void insert(Emps emps);
	public void delete(String id);
	public void update(Emps emps);
	public Emps select(String id);
	public ArrayList<Emps> selectall();
}
