package file_writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
//ithu tha oru file la write pandrathukaana format
public class mainclass {public static void  main(String args[]){
   try{
    FileWriter fw = new  FileWriter("output.txt");
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write("hello harish");
       bw.newLine();
       bw.append("iam a hero");
       bw.newLine();
       bw.append("thakyou");
       bw.close();
       System.out.println("success");

}catch(Exception e){
       System.out.println(e);
   }

    }
}
