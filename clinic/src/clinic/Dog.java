package clinic;
/**
 *Реализация пса
 */
public class Dog implements Pet{
    /**
     Имя пса
     */
    private String name;
    /**
     * Конструктор класса Dog
     * @param name
     */
    public Dog(String name){
        this.name = name;
    }
    /**
     Перекрытый метод возвращающий имя питомца
     */
    @Override
    public String getNamePet(){
        return this.name;
    }
    /*
    Перекытый метод устанавливающий кличку питомца
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
}