package com.demo.mvp.client.impl;

import com.demo.mvp.client.ClientFactory;
import com.demo.mvp.client.getdata.GetDataView;
import com.demo.mvp.client.getdata.impl.GetDataViewImpl;

public class ClientFactoryImpl  implements ClientFactory{

	private GetDataView getDataView;



	public ClientFactoryImpl() {
         getDataView = new  GetDataViewImpl();
	}
	@Override
	public GetDataView getDataView() {
		if(getDataView == null)
			getDataView =  new GetDataViewImpl(); 

		return getDataView;
	}
}
