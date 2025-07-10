package final_keyword;

class a{
    final void display(){      //dont overwrite other class this method and same as class.
System.out.println("one");
    }
}class b extends a{

}
public class mainclass{
    public static void main(String args[]) {
        final int a = 10;//fianl keyword is dont change a vaule its constant
       // a = 15;
        System.out.println(a);
        //final function

    }
}