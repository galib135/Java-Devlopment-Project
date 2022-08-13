package CollectionFramework.Collection_Overview;

class Pairs<T,S>{
    T x;
    S y;
}
public class CodewithGenerics {
    public static void main(String[] args) {
        // Creating object of generic class
        Pairs<Integer, String> p = new Pairs<Integer, String>();

        // Compiles fine because
        // p being an object accepts integer
        p.x = 12;

        // Compiles fine because
        // p being an object accepts string
        p.y = "GfG";

        // This shows compiler error
        // as p.x was an integer and cannot be
        // casted to a string
//        String str = (String) p.x;
    }
}
