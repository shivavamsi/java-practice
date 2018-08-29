package temp;

public class testNP {

	public static void swap(String a, String b) {
		String temp = b;
		b = a;
		a = temp;
	}

	public static void change(String changed) {
		changed = "I changed";
	}

	public static void main(String[] args) {
		String x = "Rahul";
		String y = "Vamsi";
		System.out.println("before swapping: \nx: " + x + "\ny: " + y);
		swap(x, y);
		System.out.println("after swapping: \nx: " + x + "\ny: " + y);
		change(y);
		System.out.println(y);
	}

}