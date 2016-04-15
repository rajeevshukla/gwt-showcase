package com.demo.gwt.client;

import java.util.List;

import com.demo.gwt.shared.AniDetails;
import com.demo.gwt.shared.DataProvider;
import com.demo.gwt.shared.EnterpriseDetails;
import com.demo.gwt.shared.GroupDetails;
import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.TreeViewModel;

public class CustomTreeModel  implements TreeViewModel{


	@Override
	public <T> NodeInfo<?> getNodeInfo(T value) {

		if (value == null )  { 
			ListDataProvider<EnterpriseDetails> listDataProvider = new ListDataProvider<>(new DataProvider().getDataModel().getEnterpiseList());
			//create a cell to display Enterprise Details  : 
			Cell<EnterpriseDetails> entCell = new AbstractCell<EnterpriseDetails>() {
				@Override
				public void render(com.google.gwt.cell.client.Cell.Context context, EnterpriseDetails value,
						SafeHtmlBuilder sb) {
					sb.appendEscaped(value.getEnterpriseName());
				}
			};
			return new DefaultNodeInfo(listDataProvider, entCell);
		}else if (value instanceof EnterpriseDetails ) {
			ListDataProvider<GroupDetails>  groupListProvider = new ListDataProvider<>( ((EnterpriseDetails)value).getGroupList());
			Cell<GroupDetails> cell = new AbstractCell<GroupDetails>() {
				@Override
				public void render(com.google.gwt.cell.client.Cell.Context context, GroupDetails value,
						SafeHtmlBuilder sb) {
				sb.appendEscaped(value.getGroupId());
				}
			};
			return new DefaultNodeInfo(groupListProvider, cell);
		} else if ( value instanceof GroupDetails) {
			
			List<AniDetails> aniList = ((GroupDetails)value).getAniList();
			
			if(null!=aniList && !aniList.isEmpty()){
				
				ListDataProvider<AniDetails> aniListProvider = new ListDataProvider<>(aniList);
				Cell<AniDetails> aniCell = new  AbstractCell<AniDetails>() {
				
					@Override
					public void render(com.google.gwt.cell.client.Cell.Context context, AniDetails value,
							SafeHtmlBuilder sb) {
						sb.appendEscaped(value.getTnNumber());
					}
				};
               return new DefaultNodeInfo(aniListProvider, aniCell);				
			}
		}

		return null;
	}

	@Override
	public boolean isLeaf(Object value) {
		return value instanceof AniDetails;
	}


}
