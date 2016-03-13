package com.demo.mvp.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GetDataViewServiceAsync {
	public void getData(String name,AsyncCallback<String> asyn);
}
