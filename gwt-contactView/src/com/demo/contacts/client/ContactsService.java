package com.demo.contacts.client;

import com.demo.contacts.shared.Contact;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("/contacts")
public interface ContactsService  extends RemoteService{
  
	public Contact getAllContact();
	public void  addContact(Contact  contact);
	public void  updateContact(Contact contact);
	public void deleteContact(int contactId);
	
}
