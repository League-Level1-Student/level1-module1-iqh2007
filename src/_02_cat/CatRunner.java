package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	
	Cat c1 = new Cat("Mr.Mittens");
	
	c1.meow();
	
	c1.printName();
	
	for(int i = 0; i<10; i++) {
		c1.kill();
	}
	
}
}
