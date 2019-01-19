package com.example.tutiya.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.example.tutiya.bean.ListBean;
import com.example.tutiya.bean.SearchForm;
import com.example.tutiya.exception.ExampleException;
import com.example.tutiya.mybatis.entity.generated.Teams;
import com.example.tutiya.mybatis.entity.generated.TeamsExample;
import com.example.tutiya.mybatis.entity.generated.TeamsExample.Criteria;
import com.example.tutiya.mybatis.mapper.ListMapper;
import com.example.tutiya.mybatis.mapper.RegistUpdateMapper;
import com.example.tutiya.mybatis.mapper.generated.TeamsMapper;

@Repository
@Primary
public class RegistUpdateDaoImpl implements RegistUpdateDaoIF {

	@Autowired
	RegistUpdateMapper registUpdateMapper;
	
	@Autowired
	TeamsMapper teamsMapper;
	
	public ListBean searchData(int teamId) {
		ListBean resultBean = registUpdateMapper.searchData(teamId);
		return resultBean;
	}
	
	public int updateTeams(Teams record) throws ExampleException{
		
		//更新条件を設定　バージョンNoパターンで対象データを更新
		TeamsExample example = new TeamsExample();
		example.createCriteria().andTeamidEqualTo(record.getTeamid()).andVersionEqualTo(record.getVersion());
		
		int resultCount = teamsMapper.updateByExample(record, example);
		
		if(resultCount > 0) {
			//バージョンNoの繰り上げ
			record.setVersion(record.getVersion() + 1);
			teamsMapper.updateByPrimaryKeySelective(record);
		}else {
			throw new ExampleException("他で更新されています");
		}

		return resultCount;
	}
}
