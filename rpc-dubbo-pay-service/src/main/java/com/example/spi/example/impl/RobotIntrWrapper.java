package com.example.spi.example.impl;

import com.example.spi.example.Robot;

public class RobotIntrWrapper  implements Robot {
	 private final Robot robot;

	    // 有一个参数是Protocol的复制构造函数
	    public RobotIntrWrapper(Robot robot) {
	        if (robot == null) {
	            throw new IllegalArgumentException("robot == null");
	        }
	        this.robot = robot;
	    }

		@Override
		public void sayHello() {
			System.out.println("Robot wrapper Intrument before");
			robot.sayHello();
			System.out.println("Robot wrapper Intrument after");
		}
}
