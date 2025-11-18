package writefile;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        // How to write a file using Java (4 popular options)

        // Jangan lupa untuk import!

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        // Ada cara lain untuk menulis path misal:
        // String filePath = "anggep aja ini file path";
        // Lalu didalam line 22 tinggal isi "filePath"

        try(FileWriter writer = new FileWriter("C:\\Users\\Mahendra's\\OneDrive\\Documents\\Double Shot Espresso\\Java\\Resources\\writefile\\test.txt")){
            // Karena ini dangerous code, maka kita masukan di try{}
            // Ganti file pathnya dengan punyamu!
            writer.write("I like java!\nIt's easy!");
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }

        // Dari yang gue pelajari, kalau nama file yang mau di write sudah ada isinya, maka file tersebut akan di overwrite.
        // Oleh karena itu, ini dangerous code!
    }
}
