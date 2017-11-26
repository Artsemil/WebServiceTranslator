import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) throws IOException {
        Translator translator = new Translator();
        FileEditor editor = new FileEditor();
        List<String> list = editor.readFromFile("words.txt");
        List<String> translatedList = new ArrayList<String>();
        List<String> transcriptedList = new ArrayList<String>();
        for (String s : list) {
            translatedList.add(translator.getTranslating(s.trim()));

        }
        editor.writeInFile("translate.txt", translatedList);
    }
}
