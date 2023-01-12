package generix;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        shovList(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("3.14");
        list2.add("fgssdg");
        list2.add("gdsgdsgdf4");
        shovList(list2);

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(3.14);
        doubleArrayList.add(3.15);
        doubleArrayList.add(3.16);
        System.out.println(summ(doubleArrayList));
    }

    static void shovList(List<?> list) {
        System.out.println("list " + list);
    }

    public static double summ(ArrayList<? extends Number> arrayList) {
        double summ = 0;

        for (Number n:
             arrayList) {
            summ+=n.doubleValue();
        }
        return summ;

    }

}
