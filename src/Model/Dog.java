package Model;

import processing.core.PApplet;

public class Dog {
	private String name,age,breed,date;
	private String id;
	private int posX;
	public Dog(String name, String age, String breed, String date,String id, PApplet app){
		this.name=name;
		this.age=age;
		this.breed=breed;
		this.date=date;
		this.id=id;
		this.posX=50;
	}
	
	
	public void paintDog(int posY, PApplet app) {
		app.text(this.name,posX,posY);
		app.text(this.age,posX+50,posY);
		app.text(this.breed,posX+100,posY);
		app.text(this.date,posX+150,posY);
		app.text(this.id,posX+200,posY);
	}


public String getid() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getBreed() {
	return breed;
}

public void setBreed(String breed) {
	this.breed = breed;
}

public String getNAme() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}


}
