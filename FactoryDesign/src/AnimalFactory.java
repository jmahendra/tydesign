
public class AnimalFactory 
{
	public static Animal getAnimal(String animal)
	{
		if(animal.equalsIgnoreCase("dog"))
		{
			return new Dog();
		}
		else if(animal.equalsIgnoreCase("cat"))
		{
			return new Cat();
		}
		else if(animal.equalsIgnoreCase("Goat"))
		{
			return new Goat();
		}
		else
		{
			System.out.println("no such data");
		}
		return null;
	}
}
