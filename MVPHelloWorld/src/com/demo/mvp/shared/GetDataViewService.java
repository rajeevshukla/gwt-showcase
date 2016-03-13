package com.demo.mvp.shared;

import com.google.gwt.user.client.rpc.RemoteService;

public interface GetDataViewService extends RemoteService {

	public String getData(String name);
}
