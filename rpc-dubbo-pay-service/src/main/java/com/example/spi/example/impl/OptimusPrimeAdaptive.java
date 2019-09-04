package com.example.spi.example.impl;

import com.alibaba.dubbo.common.URL;
import com.example.spi.example.RobotAdaptive;

public class OptimusPrimeAdaptive implements RobotAdaptive {

	@Override
	public void sayHello(URL url) {
		System.out.println("Hello, I am Optimus Prime.");
	}
}
