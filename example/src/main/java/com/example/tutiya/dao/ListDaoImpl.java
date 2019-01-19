package com.example.tutiya.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.example.tutiya.bean.ListBean;
import com.example.tutiya.bean.SearchForm;
import com.example.tutiya.controller.SearchController;
import com.example.tutiya.exception.ExampleException;
import com.example.tutiya.mybatis.entity.generated.Teams;
import com.example.tutiya.mybatis.entity.generated.TeamsExample;
import com.example.tutiya.mybatis.entity.generated.TeamsExample.Criteria;
import com.example.tutiya.mybatis.mapper.ListMapper;
import com.example.tutiya.mybatis.mapper.generated.TeamsMapper;

@Repository
@Primary
public class ListDaoImpl implements ListDaoIF {
	
	private static final Logger log = LoggerFactory.getLogger(SearchController.class);
	
	@Autowired
	ListMapper listMapper;
	
	@Autowired
	TeamsMapper teamsMapper;
	
	public List<ListBean> searchList(SearchForm searchForm) {
		List<ListBean> resultList = listMapper.searchList(searchForm);
		
		log.info("éÊìæåèêîÅF" + resultList.size() + "åè");
		
		return resultList;
	}
}
