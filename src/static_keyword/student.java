package static_keyword;
//static na last yaaru antha value change pandragalo athu all object kum set aagirum,ithu class based,class name vachi tha call pannanum
class staff{
    static String staff_name = "ajay";
    static void display(){
        System.out.println("hello");
    }
}
public class student {
    public static void main(String args[]){
        staff s1 = new staff();
        staff s2 = new staff();
        s1.staff_name = "harish";
        s2.staff_name = "iqbal";
        staff.staff_name = "luke";
        System.out.println(s1.staff_name);
        staff.display();

    }
}
