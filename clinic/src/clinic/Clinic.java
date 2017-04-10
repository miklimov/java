package clinic;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *Клиника с животными
 */
public class Clinic{
    /*
    *Объявление массива клиент
    */
    private ArrayList<Client> clients = new ArrayList<Client>();
    /*
    *Добавление клиента и его питомца
    */
    public void addClient(final Client client){
        clients.add(client);
    }

    /**
     * Валидация на существование такого же клиента
     * @param nameClient
     * @return
     */
    public boolean validationClient(String nameClient){
        boolean isTrue = true;
        if(clients.size()>0)
        for(int inc = 0;inc < clients.size();inc++){
            if(clients.get(inc).getNameClient().contains(nameClient)){
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
    /**
     * Ввод клиента и питомца
     */
    public void inputUserAnimal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя владельца:");
        String nameClient = scan.next();
        boolean result = validationClient(nameClient);
        if(result) {
            System.out.println("Выберите питомца:");
            System.out.println("Собака - 1");
            System.out.println("Кошка  - 2");
            String pet = scan.next();
            System.out.println("Введите имя питомца:");
            String nameAnimal = scan.next();
            switch (pet) {
                case "1":
                    addClient(new Client(nameClient, new Dog(nameAnimal)));
                    break;
                case "2":
                    addClient(new Client(nameClient, new Cat(nameAnimal)));
                    break;
                default:
                    addClient(new Client(nameClient, new Dog(nameAnimal)));
            }
        }else{
            System.out.println("Клиент "+nameClient+" существует.");
        }
    }

    /**
     * Стартовое меню
     */
    public void startMenu(){
        System.out.println("Клиника - Домашние животные.");
        System.out.println("Добавить питомца ------------- 1");
        System.out.println("Поиск по кличке питомца ------ 2");
        System.out.println("Поиск по имени клиента ------- 3");
        System.out.println("Редактировать имя клиента ---- 4");
        System.out.println("Редактировать кличку питомца - 5");
        System.out.println("Удалить клиента -------------- 6");
        System.out.println("Просмотр клиентов------------- 7");
        Scanner s = new Scanner(System.in);
        String itemMenu = s.next();
        String name,newName;
        switch (itemMenu){
            case "1":
                inputUserAnimal();
                break;
            case "2":
                System.out.println("Введите кличку питомца:");
                name = s.next();
                System.out.println("Клиент - "+findPetByClient(name));
                break;
            case "3":
                System.out.println("Введите имя клиента:");
                name = s.next();
                System.out.println("Питомец - "+findClientsByNamePet(name));
                break;
            case "4":
                System.out.println("Введите имя клиента для редактирования:");
                name = s.next();
                System.out.println("Введите измененное имя:");
                newName = s.next();
                editNameClient(name,newName);
                break;
            case "5":
                System.out.println("Введите имя клиента для редактирования:");
                name = s.next();
                System.out.println("Введите измененную кличку питомца");
                newName = s.next();
                editNamePet(name,newName);
                break;
            case "6":
                System.out.println("Введите имя клиента:");
                name = s.next();
                deleteClient(name);
                break;
            case "7":
                System.out.println("****************************");
                System.out.println("* Список клиентов клиники: *");
                System.out.println("****************************");
                viewClient();
                break;
            default:
                    System.out.println("Вы не выбрали пункт меню.");
        }
    }
	/*
	*Поиск питомца по имени клиента
	*/
	public String findClientsByNamePet(final String name){
        String nameP="Не найдено совпадение!";
        for(int cln=0;cln<clients.size(); cln++) {
            if (clients.get(cln).getNameClient().contains(name)) {
                nameP = clients.get(cln).getAnimal().getNameAnimal();
            }
        }
        return nameP ;
	}
    /**
	*Поиск клиента по кличке питомца
	*/
    public String findPetByClient(String name){
        String nameP = "Не найдено совпадение!";
        for(int cln=0;cln<clients.size(); cln++) {
            if (clients.get(cln).getAnimal().getNameAnimal().contains(name)) {
                nameP = clients.get(cln).getNameClient();
            }
        }
        return nameP ;
    }
    /**
     * Редактирует имя клиента
     */
    public void editNameClient(String name,String newName){
        for(int inc=0;inc<clients.size(); inc++) {
            if (clients.get(inc).getNameClient().contains(name)) {
                clients.get(inc).setNameClient(newName);
            }
        }
        System.out.println("Изменения сохранены.");
    }
    /**
     * Редактирует кличку питомца
     */
    public void editNamePet(String name,String namePet){
        for(int inc=0;inc<clients.size(); inc++) {
            if (clients.get(inc).getNameClient().contains(name)) {
                clients.get(inc).getAnimal().setNameAnimal(namePet);
            }
        }
        System.out.println("Изменения сохранены.");
    }
    /**
     * Удаление клиента
     */
    public void deleteClient(String name){
        int size = clients.size();
        for(int inc=0;inc<clients.size(); inc++) {
            if (clients.get(inc).getNameClient().contains(name)) {
                clients.remove(inc);
                System.out.println("Клиент удален.");
            }
        }
        if(size==clients.size()){
            System.out.println("Клиент не найден.");
        }
    }

    /**
     * Вывод клиентов клиники
     */
    public void viewClient(){
        if(!clients.isEmpty()){
            for(int inc=0;inc<clients.size(); inc++) {
                System.out.println((inc+1)+". Клиент: "+clients.get(inc).getNameClient()+" - Питомец: "
                        +clients.get(inc).getAnimal().getNameAnimal());
            }
        }else {
            System.out.println("В клиники нет еще клиентв.");
        }
    }


}