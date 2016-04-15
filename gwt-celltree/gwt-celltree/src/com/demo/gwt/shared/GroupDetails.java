package com.demo.gwt.shared;

import java.util.ArrayList;
import java.util.List;

public class GroupDetails {

	private String groupId;
	private String groupDetails;
	private boolean clickAble;
	private List<AniDetails>  aniList;

	public GroupDetails(String id,String name) {
		this.groupId = id;
		this.groupDetails = name;
		clickAble =true;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupDetails() {
		return groupDetails;
	}
	public void setGroupDetails(String groupDetails) {
		this.groupDetails = groupDetails;
	}
	public boolean isClickAble() {
		return clickAble;
	}
	public void setClickAble(boolean clickAble) {
		this.clickAble = clickAble;
	}
	public List<AniDetails> getAniList() {
		if(aniList == null){
			aniList = new ArrayList<>();
		}
		return aniList;
	}
	public void setAniList(List<AniDetails> aniList) {
		this.aniList = aniList;
	}

}
