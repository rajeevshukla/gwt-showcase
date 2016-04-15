package com.demo.gwt.shared;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseDetails {

	private String enterpiseId;
	private String enterpriseName;
	private boolean clickAble;
	private List<GroupDetails> groupList;
	

	public EnterpriseDetails(String enterpriseId,String enterpriseName) {

		this.enterpiseId = enterpriseId;
		this.enterpriseName = enterpriseName;
	}

	public String getEnterpiseId() {
		return enterpiseId;
	}
	public void setEnterpiseId(String enterpiseId) {
		this.enterpiseId = enterpiseId;
	}
	public String getEnterpriseName() {
		return enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public boolean isClickAble() {
		return clickAble;
	}
	public void setClickAble(boolean clickAble) {
		this.clickAble = clickAble;
	}
	public List<GroupDetails> getGroupList() { 
		if(groupList == null) {
			groupList = new ArrayList<GroupDetails>();
		}
		return groupList;
	}
	public void setGroupList(List<GroupDetails> groupList) {
		this.groupList = groupList;
	}




}
