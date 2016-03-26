package com.demo.contacts.client.presenter;

import com.demo.contacts.client.factory.ClientFactory;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class ContactPresenter implements Presenter {
	Display view;
	
	public interface Display {
		public void clear();
		public void setName(String name);
		public Widget asWidget();
		public void setPresenter(ContactPresenter presenter);
	}

	public ContactPresenter(ClientFactory factory) {
		this.view = factory.getContactView();
		bind();
	}

	@Override
	public void bind() {
		view.setPresenter(this);
	}

	@Override
	public void go(Panel panel) {
		panel.add(view.asWidget());
	}

}
