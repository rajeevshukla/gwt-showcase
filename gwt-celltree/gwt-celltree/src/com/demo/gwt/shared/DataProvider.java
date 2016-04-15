package com.demo.gwt.shared;

public class DataProvider {

	private DataModel dataModel;

	{
		dataModel = new DataModel();

		GroupDetails groupDetails1 = new GroupDetails("G1", "Group A");
		GroupDetails groupDetails2 = new GroupDetails("G2", " Group B");
		GroupDetails groupDetails3 = new GroupDetails("G3", "Group C");
		GroupDetails groupDetails4 = new GroupDetails("G4", "Group D");

		AniDetails aniDetails = new AniDetails("8989898998");
		groupDetails1.getAniList().add(aniDetails);
		EnterpriseDetails details1 = new EnterpriseDetails("E1", "Ent1");
		EnterpriseDetails details2 = new EnterpriseDetails("E2", "Ent 2");

		details1.getGroupList().add(groupDetails1);
		details1.getGroupList().add(groupDetails2);
		details2.getGroupList().add(groupDetails3);
		details2.getGroupList().add(groupDetails4);
		dataModel.getEnterpiseList().add(details1);
		dataModel.getEnterpiseList().add(details2);
	}

	public DataModel getDataModel() {
		return dataModel;
	}

	public void setDataModel(DataModel dataModel) {
		this.dataModel = dataModel;
	}

}
