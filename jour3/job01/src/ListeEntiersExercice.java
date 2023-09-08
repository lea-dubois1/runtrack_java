import java.util.ArrayList;

public class ListeEntiersExercice {
    public static void main(String[] args) {
        int total = 0;

        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (String inpNum : args) {
            int num = Integer.parseInt(inpNum);
            numList.add(num);
            if(num % 2 == 0) total += num;
        }

        System.out.println("Somme des nombres pairs: " + total);
    }
}