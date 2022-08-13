package CollectionFramework.Collection_Overview;
class MyGen<T> {
    T x;
    static int count;
    MyGen()
    {
        count++;
    }
}
public class GenericExample {
    public static void main(String[] args) {
        // Creating object of generic class
        MyGen<Integer> m1 = new MyGen<>();

        // Creating object of a generic class
        MyGen<Integer> m2 = new MyGen<>();

        System.out.println(MyGen.count);
    }
}
