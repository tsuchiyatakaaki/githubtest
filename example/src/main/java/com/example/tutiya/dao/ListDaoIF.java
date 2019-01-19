package com.example.tutiya.dao;

import java.util.List;

import com.example.tutiya.bean.ListBean;
import com.example.tutiya.bean.SearchForm;
import com.example.tutiya.mybatis.entity.generated.Teams;

public interface ListDaoIF {
	public List<ListBean> searchList(SearchForm searchForm);
}
