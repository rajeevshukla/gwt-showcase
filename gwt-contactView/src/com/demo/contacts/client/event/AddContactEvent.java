package com.demo.contacts.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class AddContactEvent  extends GwtEvent<AddContactEventHandler>{

	public AddContactEvent() {

	}

	@Override
	protected void dispatch(AddContactEventHandler handler) {
		handler.onAddContact(this);
	}
	
	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<AddContactEventHandler> getAssociatedType() {
		return getTypes();
	}



	public static com.google.gwt.event.shared.GwtEvent.Type<AddContactEventHandler> getTypes(){
		return new Type<AddContactEventHandler>();
	}
}
