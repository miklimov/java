package clinic;

/**
 * Created by М on 26.03.2017.
 */
public class Cat implements Pet {
    /**
     Имя кошки
     */
    private String name;
    /**
     * Конструктор класса Cat
     * @param name
     */
    public Cat(String name){
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
