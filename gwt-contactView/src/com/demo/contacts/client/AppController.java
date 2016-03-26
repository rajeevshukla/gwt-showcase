package com.demo.contacts.client;

import com.demo.contacts.client.event.AddContactEvent;
import com.demo.contacts.client.event.AddContactEventHandler;
import com.demo.contacts.client.factory.ClientFactory;
import com.demo.contacts.client.presenter.ContactPresenter;
import com.demo.contacts.client.presenter.EditContactPresenter;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;

public class AppController implements ValueChangeHandler<String> {

	private ContactPresenter contactPresenter;
	private EditContactPresenter editContactPresenter;
	
	private static HandlerManager bus;
	public AppController(ClientFactory factory) {
	
		bus = factory.getBus();
		
		contactPresenter = new  ContactPresenter(factory.getContactView());
		 editContactPresenter = new EditContactPresenter();
	}

	
	private void bind(){
		bus.addHandler(AddContactEvent.getTypes(), new AddContactEventHandler());
	}
	
	
	@Override
	public void onValueChange(ValueChangeEvent<String> event) {

	}

}
