package com.example.tutiya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tutiya.dao.ListDaoIF;

@Transactional
@Service
@Primary
public class ListServiceImpl implements ListServiceIF {

	@Autowired
	ListDaoIF listDao;
	
	public List search() {
		return listDao.search();
	}
}
