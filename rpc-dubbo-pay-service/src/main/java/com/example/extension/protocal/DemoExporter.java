package com.example.extension.protocal;

import java.util.Map;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.protocol.AbstractExporter;

public class DemoExporter<T> extends AbstractExporter<T> {
	private final String key;

	private final Map<String, Exporter<?>> exporterMap;

	public DemoExporter(Invoker<T> invoker, String key, Map<String, Exporter<?>> exporterMap) {
		super(invoker);
		this.key = key;
		this.exporterMap = exporterMap;
	}

	@Override
	public void unexport() {
		super.unexport();
		exporterMap.remove(key);
		Constants Constants;
	}
}
