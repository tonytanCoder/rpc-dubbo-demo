package com.example.spi.example.impl;

import com.example.spi.example.Robot;

public class Bumblebee implements Robot {

	@Override
	public void sayHello() {
		System.out.println("Hello, I am Bumblebee.");
	}

}