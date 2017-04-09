package clinic;
/**
 * Класс реализующий клиента
 */
public class Client{
    /*
    *Имя клиента
    */
    private String nameClient;
    /*
    *Питомец
    */
    private Pet pet;
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
    /**
     *Установка имени клиента
     */
    public void setNameClient(String name){
        this.nameClient = name;
    }
    /*
    *Возвращает питомеца
    */
    public Pet getPet(){
        return this.pet;
    }
}
