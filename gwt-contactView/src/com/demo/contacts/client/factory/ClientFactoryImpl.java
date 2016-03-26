package com.demo.contacts.client.factory;

import com.demo.contacts.client.ContactsService;
import com.demo.contacts.client.ContactsServiceAsync;
import com.demo.contacts.client.view.ContactView;
import com.demo.contacts.client.view.EditContactView;
import com.demo.contacts.client.view.LandingView;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.rpc.RpcRequestBuilder;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class ClientFactoryImpl implements ClientFactory {


	private LandingView landingView;
	private ContactView contactView;
	private EditContactView editContactView;
	private HandlerManager bus;
	private ContactsServiceAsync rpcService;

	public ClientFactoryImpl(HandlerManager bus ) {
		this.bus =  bus;
	}

	@Override
	public LandingView getLandingView() {
		if(landingView == null) 
			landingView = new LandingView();
		return landingView;
	}

	@Override
	public EditContactView getEditContactView() {

		if(editContactView == null)
			editContactView = new EditContactView();
		return editContactView;
	}


	public ContactView getContactView() {
	
		if(contactView == null)
			contactView = new ContactView();
		return contactView;

	}

	@Override
	public HandlerManager getBus() {
		return bus;
	}

	@Override
	public ContactsServiceAsync getRPCService() {

		if(rpcService == null)
			rpcService = GWT.create(ContactsService.class);

		ServiceDefTarget defTarget = (ServiceDefTarget) rpcService;
		defTarget.setRpcRequestBuilder(new RpcRequestBuilder());
		defTarget.setServiceEntryPoint("/abc/hello.action");

		return rpcService;
	}



}
