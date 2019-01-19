package com.example.tutiya.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tutiya.bean.ListBean;
import com.example.tutiya.bean.SearchForm;
import com.example.tutiya.dao.ListDaoIF;
import com.example.tutiya.exception.ExampleException;
import com.example.tutiya.mybatis.entity.generated.Teams;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Transactional
@Service
@Primary
public class ListServiceImpl implements ListServiceIF {

	@Autowired
	ListDaoIF listDao;
	
	public List<ListBean> searchList(SearchForm searchForm) {
		
		List<ListBean> resultList = listDao.searchList(searchForm);
		
		return resultList;
	}
}
