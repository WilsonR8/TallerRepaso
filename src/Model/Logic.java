package Model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	private String[] data1;
	private String[] data2;
	private String[] txtsplit1;
	private String[] txtsplit2;
	private LinkedList<Dog> dog;
	private String id;
	private String name;
	private String age;
	private String breed;
	private String date;
	public PApplet app;

	public Logic(PApplet app) {
		this.app = app;

		data1 = app.loadStrings("data/imports/datosUno.txt");
		data2 = app.loadStrings("data/imports/datosDos.txt");
		dog = new LinkedList <Dog> ();
		createDog();
		
		
		
	}
	
	private void createDog(){
		for (int i = 0; i < data1.length; i++) {
			txtsplit1 = data1[i].split(",");
			for (int j = 0; j <data2.length; j++) {
				txtsplit2 = data2[j].split(",");
			if (txtsplit2[0].equals(txtsplit1[0])) {
			    id = txtsplit1[0];
			    name = txtsplit1[1];
			    age =  txtsplit1[2];
			    breed = txtsplit2[1];
			    date = txtsplit2 [2];
			    
			    dog.add(new Dog (name, age, breed, date, id, app));
			    
		
			}
		}
	}
	
		
	for (int i = 0; i < dog.size(); i++) {
		Dog d = dog.get(i);
		
		text(d.getId() + " " + d.getName() + " " + d.getDate() + " " + d.getBreed() + " " + d.getAge(), 200,
				100 + i * 50);
	}

	fill(255);
	text("Key A = ordena el Nombre", 260, 650);
	text("Key S = ordena el ID", 260, 665);
	text("Key D = ordena la Edad", 260, 680);
	text("Key F = ordena la Raza", 260, 695);
	text("Key G = ordena la Fecha", 260, 710);
}
		
	}

