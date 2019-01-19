package com.example.tutiya.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.remoting.caucho.BurlapServiceExporter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import com.example.tutiya.bean.ListBean;
import com.example.tutiya.bean.SearchForm;
import com.example.tutiya.dao.ListDaoIF;
import com.example.tutiya.dao.RegistUpdateDaoIF;
import com.example.tutiya.exception.ExampleException;
import com.example.tutiya.mybatis.entity.generated.Teams;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
@Primary
public class AjaxServiceImpl implements AjaxServiceIF {

	@Autowired
	RegistUpdateServiceIF registUpdateService;
	
	/** 
	 * チームIDよりデータを検索(登録更新クラスに処理を移譲)
	 * 
	 * @param	teamId	チームID
	 * @return	検索結果オブジェクト
	 */
	public ListBean searchData(int teamId) {

		ListBean resultBean = registUpdateService.searchData(teamId);

		return resultBean;
	}
}
