package com.example.tutiya.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.example.tutiya.mybatis.mapper.ListMapper;

@Repository
@Primary
public class ListDaoImpl implements ListDaoIF {
	
	//TODO
//	トランザクションの動作確認
//	selectして画面への一覧表示
//	CRUDすべて試すこと
	
	
	@Autowired
	ListMapper listMapper;
	
	public List search() {
		
		long temp = listMapper.countAll();
		System.out.println("件数は" + temp);
		
		return new ArrayList<>();
	}
}
