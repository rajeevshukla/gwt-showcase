package com.demo.mvp.client.getdata.impl;

import com.demo.mvp.client.getdata.GetDataView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class GetDataViewImpl<T> extends Composite implements GetDataView<T> {

	private static GetDataViewImplUiBinder uiBinder = GWT.create(GetDataViewImplUiBinder.class);

	interface GetDataViewImplUiBinder extends UiBinder<Widget, GetDataViewImpl> {
	}

	public GetDataViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button button;

	public GetDataViewImpl(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

	public void setText(String text) {
		button.setText(text);
	}

	public String getText() {
		return button.getText();
	}

}
