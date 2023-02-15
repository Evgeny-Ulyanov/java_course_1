package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("SDFGS");
        arrayList1.add("iitykuy");
        arrayList1.add("hgdfnd");
        arrayList1.add(1,"dfsdfg");
        for (String s :
                arrayList1) {
            System.out.println(s);
        }

        System.out.println(arrayList1.get(0));
    }
}
