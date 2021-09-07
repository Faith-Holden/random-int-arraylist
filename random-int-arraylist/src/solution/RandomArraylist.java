package solution;

import java.util.ArrayList;

public class
RandomArraylist {

    public static void main (String[] Args){

        ArrayList<Integer> list = makeRandomArrayList(15, 300);
        for(int number: list){
            System.out.println(number);
        }

    }
    public static ArrayList<Integer> makeRandomArrayList(int listLength, int maxItemSize){

        ArrayList<Integer> list = new ArrayList<>();
        int randomInt;

        while (list.size()<listLength){
            randomInt = (int)(Math.random()*maxItemSize+1);
            if(!list.contains(randomInt)){
                list.add(randomInt);
            }
        }
        return list;
    }
}
