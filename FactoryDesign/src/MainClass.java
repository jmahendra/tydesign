import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter animal name");
		String animal=sc.next();
		System.out.println("Animal which you entered--->"+animal);
		
		Animal a=AnimalFactory.getAnimal(animal);
		
		a.eat();
		a.sleep();

	}

}
