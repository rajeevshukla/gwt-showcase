package com.demo.gwt.shared;

import java.util.ArrayList;
import java.util.List;

public class DataModel {
	private List<EnterpriseDetails> enterpiseList;

	public List<EnterpriseDetails> getEnterpiseList() {
		if (enterpiseList == null) {
			enterpiseList = new ArrayList<EnterpriseDetails>();
		}
		return enterpiseList;
	}

	public void setEnterpiseList(List<EnterpriseDetails> enterpiseList) {
		this.enterpiseList = enterpiseList;
	}

}
