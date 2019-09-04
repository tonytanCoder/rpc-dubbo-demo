package com.example.spi.example;

import org.junit.Test;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class DubboSPIWrapperTest {
	@Test
    public void sayHello() throws Exception {
        ExtensionLoader<Robot> extensionLoader = 
            ExtensionLoader.getExtensionLoader(Robot.class);
        /**
         * 事实上这里返回的是optimusPrime实现类的wrapper类
         */
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
    }
}
