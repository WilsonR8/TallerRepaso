package Controller;

import java.util.LinkedList;

import Model.Dog;
import Model.Logic;
import processing.core.PApplet;

public class LogicControl {

	public PApplet app;
	Logic lControl;
	
	public LogicControl (PApplet app) {
		lControl = new Logic (app);
	}
	
	public LinkedList<Dog> dog () {
		return lControl.getDog();
	}
	
	public void sortListController (char i) {
		lControl.sortList(i);
	}

}
	
	

