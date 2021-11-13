package ua.lviv.lgs.Robots;

public class RobotCooker extends Robot {

	private String WhatRobotDo; 
	 
	
	public void work() {
		this.WhatRobotDo = "я RobotCoocker Ц € просто готую";
		System.out.println(WhatRobotDo);
	}
}
