package clinic;
/**
*Клиника с животными
*/
public class Clinic{
	/*
	*Объявление массива клиент
	*/
	private final Client[] clients;
	/*
	*Конструктор класса клиника
	*/
	public Clinic(final int size){
		this.clients = new Client[size];
	}
	/*
	*Добавление клиента и его питомца
	*/
	public void addClient(final int position, final Client client){
		this.clients[position] = client;
		System.out.println(this.clients[position]);
	}
	/*
	*Поиск клиента по имени питомца
	*/
	/*public Client[] findClientsByPetName(final String name){
		/*for(int i =0;i<clients.length;i++){
			if (clients[i].equals(name)){
				return clients[i];
			}
		}
		return clients[1].getNameClient(name);
		
	}*/
}