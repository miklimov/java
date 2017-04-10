package clinic;

/**
 * Created by М on 26.03.2017.
 */
public class Cat extends Animal {
    /**
     Имя кошки
     */
    private String nameС;
    /**
     * Конструктор класса Cat
     * @param name
     */
    public Cat(String name){
        super(name);
    }

    @Override
    public String getNameAnimal(){
        nameС = " кошка "+name;
        return this.nameС;
    }
}
