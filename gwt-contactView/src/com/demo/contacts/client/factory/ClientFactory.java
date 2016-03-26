package com.demo.contacts.client.factory;

import com.demo.contacts.client.ContactsServiceAsync;
import com.demo.contacts.client.view.ContactView;
import com.demo.contacts.client.view.EditContactView;
import com.demo.contacts.client.view.LandingView;
import com.google.gwt.event.shared.HandlerManager;

public interface ClientFactory {

	public LandingView getLandingView();
	
	public EditContactView getEditContactView();
	
	public ContactView getContactView();
	
	public HandlerManager getBus();
	
	public ContactsServiceAsync getRPCService();
	
}
