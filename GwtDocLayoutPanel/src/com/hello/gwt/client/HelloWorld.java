package com.hello.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootLayoutPanel.get().add(new DocLayoutPannel());
	}

}
 