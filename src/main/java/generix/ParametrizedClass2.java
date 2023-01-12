package generix;

public class ParametrizedClass2 {

    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Privet");
//        System.out.println(info1);
//        String s = info1.getValue();

        Info<Integer> info2 = new Info<>( 32);
        System.out.println(info2);
    }

}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}
