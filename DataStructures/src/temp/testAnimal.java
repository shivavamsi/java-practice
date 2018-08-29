package temp;

import java.util.Arrays;

public class testAnimal {
	private int num1 = 0;
	
	public static void main(String[] args) {
		
		// local
		int numAnimals = 2;
		
		Animal myAnimal = new Animal();
		
		// instance variables
		myAnimal.name = "Tony";
		myAnimal.age = 8;
		myAnimal.colors = new String[] {"brown", "black", "white"};
		myAnimal.isMale = true;
		myAnimal.numLegs = 4;
		
		//myAnimal.makeNoise();
		/*System.out.println("My Animal details:\n");
		System.out.println(myAnimal);
		System.out.println(myAnimal.name);
		System.out.println(myAnimal.age);
		System.out.println(Arrays.toString(myAnimal.colors));
		System.out.println(myAnimal.isMale);
		System.out.println(myAnimal.numLegs);*/
		
		Animal myDog = new Dog();
		Dog dog = new Dog();
		System.out.println("myAnimal instanceof Animal: " + (myAnimal instanceof Animal));
		System.out.println("myDog instanceof Dog: " + (myDog instanceof Dog));
		System.out.println("myDog instanceof Animal: " + (myDog instanceof Animal));
		System.out.println("myDog getClass(): " + (myDog.getClass()));
		System.out.println("dog instanceof Dog: " + (dog instanceof Dog));
		System.out.println("dog instanceof Animal: " + (dog instanceof Animal));
		System.out.println("dog getClass(): " + (dog.getClass()));
		
		/*Animal myPet = new Animal();
		myPet.name = "bruce";
		myPet.makeNoise();*/
		
		// InnerClass innerobj = new InnerClass();
	}
}