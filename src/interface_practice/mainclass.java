package interface_practice;
interface playable{       //interface ulla yallame abstract tha ,and public static fianl ,body kedaiyathu,vera class la implement pannikalam
    void play();
}
class guitar implements playable{
    public void play(){
        System.out.println("play guitar");
    }
}class piono implements playable{

   public void play(){
    System.out.println("play piono");
}}
public class mainclass {
       public static void main(String args[]){
           piono p1 = new piono();
           p1.play();
       }
}
