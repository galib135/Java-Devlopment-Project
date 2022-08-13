package CollectionFramework.Collection_Overview;
class Student
{
 Student(){
     System.out.println("A student is enter");
 }
}
class EnggStudent extends Student
{
 EnggStudent(){
     System.out.println("THe student is engineering student");
 }
}

//We can do this as inheritance allow us to do it.

public class WildCardRole {
    public static void main(String args[])
    {
        Student s1 = new Student();
        EnggStudent s2 = new EnggStudent();
        s1 = s2;
    }
}
