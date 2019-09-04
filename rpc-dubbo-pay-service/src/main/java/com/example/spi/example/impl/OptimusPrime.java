package com.example.spi.example.impl;

import com.example.spi.example.Robot;

public class OptimusPrime implements Robot {

	@Override
	public void sayHello() {
		System.out.println("Hello, I am Optimus Prime.");
	}
}
