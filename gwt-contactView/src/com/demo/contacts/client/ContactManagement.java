package com.demo.contacts.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ContactManagement extends Composite {

	private static ContactManagementUiBinder uiBinder = GWT
			.create(ContactManagementUiBinder.class);

	interface ContactManagementUiBinder extends
			UiBinder<Widget, ContactManagement> {
	}

	public ContactManagement() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
