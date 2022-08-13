package CollectionFramework.Collection_Overview;

class Pair{
    Object x;
    Object y;
}
public class CodeWithoutGenerics {
    public static void main(String[] args) {
        Pair p = new Pair();

        p.x = 12;
        p.y = "GFG";

        //So below mentioned code gives runtime exception i.e the cast is not possible
        //So doesnot make type safe
        String s = (String) (p.x);
    }
}

