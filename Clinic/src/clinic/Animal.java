package clinic;

/**
 * Created by М on 10.04.2017.
 */
public abstract class Animal{
    /**
     Имя пса
     */
    protected String name;
    /**
     * Конструктор класса Animal
     * @param name
     */
    public Animal(String name){
        this.name = name;
    }
    /**
     Перекрытый метод возвращающий имя питомца
     */
    public String getNameAnimal(){
        return this.name;
    }
    /*
    Перекытый метод устанавливающий кличку питомца
     */
    public void setNameAnimal(String name) {
        this.name = name;
    }
}
