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
    private Animal animal;
    /**
     *Конструктор класса клиент
     *@nameClient имя клиента
     *@pet питомец
     */
    public Client(String nameClient, Animal animal){
        this.nameClient = nameClient;
        this.animal = animal;
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
    public Animal getAnimal(){
        return this.animal;
    }
}
