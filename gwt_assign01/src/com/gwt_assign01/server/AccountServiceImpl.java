package com.gwt_assign01.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.gwt_assign01.client.AccountService;;

public class AccountServiceImpl extends RemoteServiceServlet implements AccountService{
	private static final long serialVersionUID = 1L;

	@Override
	public boolean verify(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
