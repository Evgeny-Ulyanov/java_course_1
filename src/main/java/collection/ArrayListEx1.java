package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList1.add("SDFGS");
        arrayList1.add("iitykuy");
        arrayList1.add("hgdfnd");
        System.out.println(arrayList1);
        System.out.println(arrayList2.size());

        List<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
    }
}
