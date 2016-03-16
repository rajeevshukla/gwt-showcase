package com.demo.contacts.client;

import com.demo.contacts.shared.Contact;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ContactsServiceAsync {

	void getAllContact(AsyncCallback<Contact> callback);

	void addContact(Contact contact, AsyncCallback<Void> callback);

	void deleteContact(int contactId, AsyncCallback<Void> callback);

	void updateContact(Contact contact, AsyncCallback<Void> callback);
}
