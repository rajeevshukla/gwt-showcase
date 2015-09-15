package com.hello.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class DocLayoutPannel extends Composite {

	private static DocLayoutPannelUiBinder uiBinder = GWT.create(DocLayoutPannelUiBinder.class);

	interface DocLayoutPannelUiBinder extends UiBinder<Widget, DocLayoutPannel> {
	}
 
	public DocLayoutPannel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
