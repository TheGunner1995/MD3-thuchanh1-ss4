public class MyClass {
    private int rollno ;
    private String name;
    private static  String college = "BBDIT";

    MyClass(int r, String n){
        rollno = r;
        name = n;
    }
     static void change(){
        college = "RIKEI ACADEMY";
    }
    void  Display(){
        System.out.println(rollno + " " + name + " "+ college);
    }

}
