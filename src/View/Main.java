package View;

import Controller.LogicControl;
import processing.core.PApplet;

public class Main extends PApplet {
	LogicControl Paint;
	LogicControl ListM;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Main");
	}

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		Paint = new LogicControl(this);
		ListM = new LogicControl(this);
	}

	public void draw() {
		background(0);

		for (int i = 0; i < Paint.dog().size(); i++) {
			Paint.dog().get(i).drawDog((i * (50)) + 80, this);
		}

	}

	public void keyPressed() {

	}
}
