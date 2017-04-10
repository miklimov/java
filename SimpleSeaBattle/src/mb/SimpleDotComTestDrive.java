package mb;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        DotHelper helper = new DotHelper();
        int startCells = helper.getRandomNumber(5);
        int inc= 0;
        int[] locations = {startCells, startCells+1, startCells+2};
        dot.setLocationCells(locations);
        boolean flag = true;
        while (flag) {
            String userGuess = String.valueOf(helper.getRandomNumber(5));
            System.out.println("Ход:");
            System.out.println(userGuess);
            String result = dot.checkYourself(userGuess);
            inc++;
            if(result.equals("Потопил")){
                flag = false;
            }
        }
        System.out.println("Вы потопили: "+inc+" попыток (и)");
    }
}