package practice_question;

class person {
    public String name;
   protected int age;
    private int security_number;
    private String address;//this also not acces bcoz its private
}
class employee extends person{
    public static void main(String args[]){
        person s1 = new person();
        s1.name = "john";
        s1.age = 22;
      //  s1.security_number = 33;   because its private class above
        System.out.println(s1.name);
        System.out.println(s1.age);
    }

}
