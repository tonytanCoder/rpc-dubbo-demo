package com.example.spi.example;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface RobotAdaptive {
	 @Adaptive	
	void sayHello(URL url);
}
