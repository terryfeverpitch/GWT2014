package com.gwt_assign01.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AccountServiceAsync {
	void verify(String username, String password, AsyncCallback<Boolean> callback);
}
