import java.io.*;
class Pet {
	String name;
	int age;
	String breed;
	Pet(String name, int age, String breed)
	{
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
}

public class Pets {
	public static void main(String args[])
	{
		Pet dog1 = new Pet("Teddy", 2, "German Shepherd");
		Pet cat = new Pet("Sheero", 2, "Tabby");
		Pet dog2 = new Pet("Teddy", 2, "German Shepherd");
		System.out.println(dog1.equals(dog2));
	}
}
