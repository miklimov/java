package clinic;
/**
 *Реализация пса
 */
public class Dog extends Animal{

    /**
     * собака+ Кличка
     */
    private String nameD;

    /**
     * Конструктор класса Dog
     * @param name
     */
    public Dog(String name){
        super(name);
    }
    @Override
    public String getNameAnimal(){
        nameD = " собака "+name;
        return this.nameD;
    }

}