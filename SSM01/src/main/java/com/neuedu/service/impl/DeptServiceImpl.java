package com.neuedu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.DeptMapper;
import com.neuedu.pojo.Dept;
import com.neuedu.service.DeptService;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptMapper mapper;
	@Override
	public int addDept(Dept dept) throws Exception {
		
		return mapper.addDept(dept);
	}

}
