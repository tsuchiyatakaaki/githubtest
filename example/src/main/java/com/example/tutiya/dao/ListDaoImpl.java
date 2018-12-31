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
//	�g�����U�N�V�����̓���m�F
//	select���ĉ�ʂւ̈ꗗ�\��
//	CRUD���ׂĎ�������
	
	
	@Autowired
	ListMapper listMapper;
	
	public List search() {
		
		long temp = listMapper.countAll();
		System.out.println("������" + temp);
		
		return new ArrayList<>();
	}
}
