import java.util.List;
import java.util.ArrayList;
public class GrandSon {
    public static void main(String[] args) {
        String[][] arr = {{"Paari", "Karikalan"}, {"Udhiran", "Sendhan"}, {"Sendhan", "Arulmozhi"}, {"Karikalan", "Sendhan"}};
        int row = arr.length;
        int col = arr[0].length;
        List<String> sons=new ArrayList<>();
        String GrandFather = "Sen";
        String son = "";
        for (int i = 0; i < row; i++) {
            if (arr[i][1].equals(GrandFather)) {
                sons.add(arr[i][0]);
            }
        }
        int count = 0;
        for (int i = 0; i < row; i++) {
            if (sons.contains(arr[i][1])) {
                count++;
            }
        }
        System.out.println("Grand Son for "+ GrandFather + " :  " + count);

    }
}



