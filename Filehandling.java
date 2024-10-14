import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling
{
    public static void main(String[] args) throws IOException {
//        // for creating a file
//       File newFile = new File("Yogesh.txt");
//
//        // for writing a file
//  FileWriter fileWriter = new FileWriter("Yogesh.txt");
//      fileWriter.write("public void getName(){};");
//     fileWriter.close();


        //Reading a file
//        File newfile= new File("Yogesh.txt");
//        Scanner sc = new Scanner(newfile);
//        while(sc.hasNextLine())
//        {
//            String Line = sc.nextLine();
//            System.out.println(Line);
//        }
//        sc.close();



        //Deleting a file
        File newFile = new File("Yogesh.txt");
        newFile.delete();




    }
}
