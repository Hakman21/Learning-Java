import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        try {
            File myFile = new File("Hawk_Tuah_Coin.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
            }
            myReader.close();

            if (myFile.exists()) {
                System.out.println("File name: " + myFile.getName());
                System.out.println("Absolute path: " + myFile.getAbsolutePath());
                System.out.println("Writeable: " + myFile.canWrite());
                System.out.println("Readable " + myFile.canRead());
                System.out.println("File size in bytes " + myFile.length());
            } else {
                System.out.println("The file does not exist.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
    }
}
