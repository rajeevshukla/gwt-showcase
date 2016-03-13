package com.demo.mvp.client;

import com.demo.mvp.client.impl.ClientFactoryImpl;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

public class MVPHello implements EntryPoint {


	@Override
	public void onModuleLoad() {
		ClientFactory clientFactory = new ClientFactoryImpl();
		Window.alert("WElcome man");
		RootPanel.get().add(clientFactory.getDataView());;
	}

}
