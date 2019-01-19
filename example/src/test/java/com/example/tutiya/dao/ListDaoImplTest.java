package com.example.tutiya.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.tutiya.bean.ListBean;
import com.example.tutiya.bean.SearchForm;
import com.example.tutiya.service.ListServiceIF;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:servletContext.xml"})
public class ListDaoImplTest {

	@Autowired
	ListDaoIF ListDao;
	
	@Test
	public void ケース001_検索結果件数の確認() {
		
		int 期待値 = 3;
		
		List<ListBean> searchResultList = ListDao.searchList(new SearchForm());
		
		int 実際の値 = searchResultList.size();
		
		assertEquals(期待値, 実際の値);
	}

}
