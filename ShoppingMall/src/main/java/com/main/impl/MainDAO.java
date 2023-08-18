package com.main.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class MainDAO {
	
	@Autowired
	private SqlSession sql;
}
