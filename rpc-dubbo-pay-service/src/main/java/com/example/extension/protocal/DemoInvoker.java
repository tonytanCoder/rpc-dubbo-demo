package com.example.extension.protocal;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.remoting.RemotingException;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.protocol.AbstractInvoker;

public class DemoInvoker<T> extends AbstractInvoker<T> {
	 public DemoInvoker(Class<T> type, URL url) throws RemotingException{
	        super(type, url);
	    }

	@Override
	protected Result doInvoke(Invocation arg0) throws Throwable {
		return null;
	}
}
