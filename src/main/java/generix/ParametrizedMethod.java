package generix;

import java.util.ArrayList;

public class ParametrizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        arrayListInt.add(10);
        arrayListInt.add(20);
        arrayListInt.add(15);
        int a = GenMethod.getSecondElement(arrayListInt);
        System.out.println(a);
    }

}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}

