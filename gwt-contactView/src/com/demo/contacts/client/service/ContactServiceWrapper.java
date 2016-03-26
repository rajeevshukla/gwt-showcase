package com.demo.contacts.client.service;

import com.demo.contacts.client.ContactsServiceAsync;
import com.demo.contacts.shared.Contact;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class ContactServiceWrapper implements ContactsServiceAsync {

	@Override
	public void getAllContact(AsyncCallback<Contact> callback) {
		
	}

	@Override
	public void addContact(Contact contact, AsyncCallback<Void> callback) {
		
	}

	@Override
	public void deleteContact(int contactId, AsyncCallback<Void> callback) {
		
	  
	}

	@Override
	public void updateContact(Contact contact, AsyncCallback<Void> callback) {
		
	}

	
}
