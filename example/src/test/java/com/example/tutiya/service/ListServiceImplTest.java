package com.example.tutiya.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.tutiya.bean.ListBean;
import com.example.tutiya.bean.ListForm;
import com.example.tutiya.bean.SearchForm;
import com.example.tutiya.dao.ListDaoIF;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:servletContext.xml"})
public class ListServiceImplTest {

	@Autowired
	ListServiceIF listService;
	
	@Test
	public void �P�[�X001_�������ʌ����̊m�F() {
		
		int ���Ғl = 3;
		
		List<ListBean> searchResultList = listService.searchList(new SearchForm());
		
		int ���ۂ̒l = searchResultList.size();
		
		assertEquals(���Ғl, ���ۂ̒l);
	}

}