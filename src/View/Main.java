package View;

import java.io.FileNotFoundException;
import java.util.Collections;

import Model.AgeDog;
import Model.DateDog;
import Model.IdDog;
import Model.NameDog;
import Model.BreedDog;
import Model.Dog;
import Model.Logic;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Main");
	}

	public void settings() {
		
	}
	
	
	public void setup() {
		
	}
	
	public void draw() {
	background(0);

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

public void keyPressed() {

	if (key == 'a' || key == 'A') {

		Collections.sort(listaPerros, new CompareNombre());
		try {
			printReport();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	if (key == 's' || key == 'S') {

		Collections.sort(listaPerros, new CompareId());
		try {
			printReport();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	if (key == 'd' || key == 'D') {

		Collections.sort(listaPerros, new CompareEdad());
		try {
			printReport();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	if (key == 'f' || key == 'F') {

		Collections.sort(listaPerros, new CompareRaza());
		try {
			printReport();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	if (key == 'g' || key == 'G') {

		Collections.sort(listaPerros, new CompareFecha());
		try {
			printReport();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
	
	
	
}
