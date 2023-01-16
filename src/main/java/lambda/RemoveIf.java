package lambda;

import java.util.ArrayList;

public class RemoveIf {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Privet");
        arrayList.add("Poka");
        arrayList.add("Ok");
        arrayList.add("Java");
        arrayList.add("Lambdas");
        arrayList.removeIf(element -> element.length() < 5);
        System.out.println(arrayList);
    }

}
