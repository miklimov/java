
package clinic;
/**
* Класс реализующий клиента
*/
public class Client{
	/*
	*Имя клиента
	*/
	private final String nameClient;
	/*
	*Питомец
	*/
	private final Pet pet;
	
	/**
	*Конструктор класса клиент
	*@nameClient имя клиента
	*@pet питомец
	*/
	public Client(String nameClient, Pet pet){
		this.nameClient = nameClient;
		this.pet = pet;
	}
	/*
	*Возвращает имя клиента
	*/
	public String getNameClient(){
		return this.nameClient;
	}
	/*
	*Возвращает питомеца
	*/
	public Pet getPet(){
		return this.pet;
	}
}
