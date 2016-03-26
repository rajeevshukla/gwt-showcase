package com.demo.contacts.client;

import com.demo.contacts.client.factory.ClientFactory;
import com.demo.contacts.client.factory.ClientFactoryImpl;
import com.demo.contacts.client.presenter.ContactPresenter;
import com.demo.contacts.client.view.ContactView;
import com.demo.contacts.shared.Contact;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;

public class ContactEntry implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		Contact contact = new Contact("Rajeev ", "Shukla");
		ContactView  view = new ContactView();
		HandlerManager bus = new HandlerManager(null);
		ClientFactory clientFactory = new ClientFactoryImpl(bus);
		AppController appController = new AppController();
	}

}
