package com.gwt_assign01.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;

public class Gwt_assign01 implements EntryPoint {
	private LoginPage dialog = new LoginPage();
	private AccountHandler handler = new AccountHandler();
	public void onModuleLoad() {
		dialog.btn_submit.addClickHandler(handler);
		dialog.btn_signup.addClickHandler(handler);
		dialog.center();
		dialog.show();
		
//		RootPanel.get("loginContainer").add(pop_loginPage);
	}
	
	public class AccountHandler implements ClickHandler {
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			Widget source = (Widget) event.getSource();	
			if(source == dialog.btn_signup) {
				// do sign up task.
				Window.alert("sign up");
			}
			else if(source == dialog.btn_submit) {
				// do login task.
				Window.alert("username : " + dialog.tb_username.getText() + "\n" + 
							 "password : " + dialog.ptb_password.getText());
			}
		}
		
	}
}
