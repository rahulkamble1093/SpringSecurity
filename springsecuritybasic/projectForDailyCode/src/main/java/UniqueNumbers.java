import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueNumbers {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,5));
        List<Integer> uniqueList = UniqueNumbersFromList(l);
        System.out.println(uniqueList);
    }

    //12312345
    private static List<Integer> UniqueNumbersFromList(List<Integer> intList){
        ArrayList newList = new ArrayList<>();
        for(int i = 0; i < intList.size(); i++){
            for (int j= i+1; j == intList.size() ; i++ )
            {
                if (intList.get(i) != intList.get(j)) {
                    newList.add(i);
                }
            }
        }
        return newList;
    }
}
