package com.demo.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTree;
import com.google.gwt.user.cellview.client.TreeNode;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class CellTreeWidget extends Composite  {

	private static CellTreeWidgetUiBinder uiBinder = GWT.create(CellTreeWidgetUiBinder.class);

	interface CellTreeWidgetUiBinder extends UiBinder<Widget, CellTreeWidget> {
	}

	public CellTreeWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		bind();
	}

	@UiField
	CellTree cellTree ;

	@UiField
	Button expandAll;
	@UiField 
	Button collapseAll;

	public void bind(){

	}
	@UiFactory
	public CellTree createCellTree(){
		cellTree = new CellTree(new CustomTreeModel(),null);
		TreeNode treeNode = cellTree.getRootTreeNode();
		treeNode.setChildOpen(0, true);
		return cellTree;
	}


	@UiHandler("expandAll")
	public void onExpandAllClicked(ClickEvent event){
		TreeNode node = cellTree.getRootTreeNode();
		for (int i = 0; i < node.getChildCount(); i++) {
			if(!node.isChildLeaf(i)){
				node.setChildOpen(i, true);
			}
		}
	}

	@UiHandler("collapseAll")
	public void onCollapseAllClicked(ClickEvent event){
		TreeNode node = cellTree.getRootTreeNode();
		for (int i = 0; i < node.getChildCount(); i++) {
			if(!node.isChildLeaf(i)){
				node.setChildOpen(i, false);
			}
		}
	}

}
