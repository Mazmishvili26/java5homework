import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main (String [] args) {

//        1) შექმნის ძირითადი (root) საქაღალდეს (რომელიმე დისკზე), დისკის ამორჩევა
//        შეუძლია მომხარებელს;
//        Enter Drive Name:


        System.out.println("Enter the path where you want to create folder : ");

        Scanner sc = new Scanner(System.in);
        String path = sc.next();

        System.out.println("Enter the file name : ");

        path = path + sc.next();

//        create file

        File f1 = new File(path);

        Boolean bool = f1.mkdir();

        if(bool){
            System.out.println("Folder is created successfully ");
        }else{
            System.out.println("Error !!!");
        }



//        ----------------------------------------------------------------------------------------


//        2) ძირითად საქაღალდეში ქმნის საქაღალდეებს ან ფაილებს;


        String path2 = "C:\\Users\\nikam\\IdeaProjects\\java5\\Folder" + File.separator + "hello" + File.separator + "hi.txt";
        File f = new File(path2);

        f.getParentFile().mkdirs();
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    
}
