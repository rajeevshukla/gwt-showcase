package com.demo.mvp.client.service;

import com.demo.mvp.shared.GetDataViewServiceAsync;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class GetDataViewServiceWrapper implements GetDataViewServiceAsync {

	@Override
	public void getData(String name, AsyncCallback<String> asyn) {
	
		  asyn.onSuccess("Welcome");
		
	}
}
