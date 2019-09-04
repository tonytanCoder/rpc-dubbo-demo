package com.example.spi.example;

import org.junit.Test;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class DubboSPIAdaptiveTest {
	@Test
    public void sayHello() throws Exception {
        ExtensionLoader<RobotAdaptive> extensionLoader = 
            ExtensionLoader.getExtensionLoader(RobotAdaptive.class);
        /**
         * 事实上这里返回的是optimusPrime实现类的wrapper类
         */
        RobotAdaptive optimusPrime = extensionLoader.getAdaptiveExtension();
        URL url = URL.valueOf("dubbo://192.168.0.101:20880?robot.adaptive=bumblebeeAdaptive");
        optimusPrime.sayHello(url);
        
    }
}
