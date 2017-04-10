package sb;

import java.util.*;
/**
 * Created by М on 03.04.2017.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    /**
     * Установка сайтов
     * @param loc
     */
    public void setLocationCells (ArrayList<String> loc) {
        this.locationCells = loc;
    }

    /**
     * Установка имени сайта
     * @param n название
     */
    public void setName(String n) {
        this.name = n;
    }
    public String checkYourself (String userlnput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userlnput);
        if (index >= 0) {
           locationCells.remove(index);
                if (locationCells. isEmpty ()) {
                        result = "Потопил";
                    System.out.println("Вы потопили " + this.name);
                } else {
                    result = "Попал";
                }
            }
            return result;
        }
}

