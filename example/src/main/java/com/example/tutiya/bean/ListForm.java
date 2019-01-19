package com.example.tutiya.bean;

import java.util.List;

public class ListForm {
	
	private String dataId;
	
	private List<ListBean> dataList;

	private List<String> selected;
	

	public List<String> getSelected() {
		return selected;
	}

	public void setSelected(List<String> selected) {
		this.selected = selected;
	}

	public String getDataId() {
		return dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public List<ListBean> getDataList() {
		return dataList;
	}

	public void setDataList(List<ListBean> dataList) {
		this.dataList = dataList;
	}
}
