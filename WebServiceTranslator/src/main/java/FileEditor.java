import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileEditor {
    public List<String> readFromFile(String filename) throws IOException {
        List<String> str = new ArrayList<String>();
        File file = new File(filename);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                str.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return str;
    }

    public void writeInFile(String filename, List<String> list){
        File file = new File(filename);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            for (String s : list){
                fr.write(s+System.getProperty("line.separator"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
