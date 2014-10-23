package com.gwt_assign01.client;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class LoginPage extends DialogBox {
	protected Button btn_submit = new Button("submit");
	protected Button btn_signup = new Button("sign up");
	protected TextBox tb_username = new TextBox();
	protected PasswordTextBox ptb_password = new PasswordTextBox();
	
	public LoginPage() {
		this.setSize("300px", "150px");
		this.setStyleName("gwt-loginPage");
		// main widget
		FlexTable flexTable = new FlexTable();
		flexTable.setSize("100%", "100%");
		setWidget(flexTable);			
		// username component
		Label lbl_username = new Label("USERNAME");
		lbl_username.setStyleName("gwt-loginPage-label");
		flexTable.setWidget(0, 0, lbl_username);		
		
		tb_username.setTitle("input your username here.");
		tb_username.setStyleName("gwt-loginPage-input");
		tb_username.setSize("95%", "80%");
		flexTable.setWidget(0, 1, tb_username);
		// password component
		Label lbl_password = new Label("PASSWORD");
		lbl_password.setStyleName("gwt-loginPage-label");
		flexTable.setWidget(1, 0, lbl_password);	
		
		ptb_password.setTitle("input your password here.");
		ptb_password.setStyleName("gwt-loginPage-input");
		ptb_password.setSize("95%", "80%");
		flexTable.setWidget(1, 1, ptb_password);
		// bottom panel
		HorizontalPanel horizontalPanel = new HorizontalPanel();		
		horizontalPanel.setHeight("100%");
		flexTable.setWidget(2, 0, horizontalPanel);
		// submit button	
		btn_submit.setStyleName("gwt-loginPage-button");	
		btn_submit.setWidth("100%");
		horizontalPanel.add(btn_submit);
		// signup button
		btn_signup.setStyleName("gwt-loginPage-button");
		btn_signup.setWidth("100%");
		horizontalPanel.add(btn_signup);
		
		flexTable.getCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_LEFT);
		flexTable.getCellFormatter().setVerticalAlignment  (0, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		
		flexTable.getCellFormatter().setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_LEFT);
		
		flexTable.getCellFormatter().setVerticalAlignment  (0, 1, HasVerticalAlignment.ALIGN_MIDDLE);
		flexTable.getCellFormatter().setHorizontalAlignment(0, 1, HasHorizontalAlignment.ALIGN_LEFT);
		
		flexTable.getCellFormatter().setVerticalAlignment  (1, 1, HasVerticalAlignment.ALIGN_MIDDLE);
		flexTable.getCellFormatter().setHorizontalAlignment(1, 1, HasHorizontalAlignment.ALIGN_LEFT);
		
		flexTable.getCellFormatter().setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_CENTER);
		
		flexTable.getFlexCellFormatter().setColSpan(2, 0, 2);
		// add click handler
		
	}
}
