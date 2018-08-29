package temp;

public class Dog extends Animal {
	
	public Dog() {
		System.out.println("Dog constructor");
	}
	
	public void makeNoise() {
		System.out.println("I'm a dog. My name is " + name);
	}
}
