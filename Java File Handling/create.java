import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class create {
    public static void main(String[] args) {
        try {
            File myfile = new File("Hawk_Tuah_Coin.txt");
            if (myfile.createNewFile()) {
                System.out.println("File created: " + myfile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("Hawk_Tuah_Coin.txt");
            myWriter.write("Classic Rug");
            myWriter.close();
            System.out.println("Successfully Written to File.");
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}