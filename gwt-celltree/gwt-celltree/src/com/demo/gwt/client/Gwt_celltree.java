package com.demo.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwt_celltree implements EntryPoint {
	
	/**
	 * This is the entry point method.
	 */
	
	private final CellTreeWidget cellTreeWidget = new CellTreeWidget();
	
	public void onModuleLoad() {
		RootPanel.get("celltreecontainer").add(cellTreeWidget);
	}
	
}
