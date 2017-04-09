package clinic;
/**
*Реализация пса
*/
public class Dog implements Pet{
	/**
	Базовая реализация питомца
	*/
	private final String name;

	public Dog(final String name){
		this.name = name;
	}
	/**
	(@inheritDoc)
	*/
	@Override
	public void makeSound(){
		System.out.println("Gav, gav");
	}
	/**
	(@inheritDoc)
	*/
	@Override
	public String getName(){
		return this.name;
	}
}