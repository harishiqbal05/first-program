package exception_hadling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class mainclass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();

            int b = scan.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (InputMismatchException e) {
            System.out.println("enter correct input:" + e);
        } catch (ArithmeticException e) {
            System.out.println("enter valid number:" + e);
        }
        System.out.println("code end");

        int j=0;
        try {


                int age = scan.nextInt();
                if (age < 1) {
                    throw new ArithmeticException("enter valid number");    //ithu tha throw keyword exception namaku therinju namalave throw pannuvom
                } else {                                                    //throws keyword na oru function error throw pannum therinja athuku pakkathula namma throws use pannuvom bcoz antha function ah yaaru call pandragalo avaga tha expectiton handle pannanum try ctach block potu.
                    System.out.println(age);

                }
            }catch(Exception e){
                System.out.println(e);

            }

        }
    }
