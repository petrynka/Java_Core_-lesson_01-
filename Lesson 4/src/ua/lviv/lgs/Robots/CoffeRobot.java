package ua.lviv.lgs.Robots;

public class CoffeRobot extends Robot {

	private String WhatRobotDo; 
	 
	
	public void work() {
		this.WhatRobotDo = "я CoffeRobot Ц € варю каву";
		System.out.println(WhatRobotDo);
	}
}
