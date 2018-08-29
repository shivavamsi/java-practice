package temp;

public class Animal {
	public String name;
	public int age;
	public String[] colors;
	public int numLegs;
	public boolean isMale;
	
	public Animal() {
		System.out.println("Animal constructor");
	}
	
	public void makeNoise() {
		System.out.println("I'm a " + name);
	}
}