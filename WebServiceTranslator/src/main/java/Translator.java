import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

public class Translator {
    public String getTranslating(String world) throws IOException {
        String url = "https://translate.yandex.net/api/v1.5/tr.json/translate?key=trnsl.1.1.20171125T213257Z.7d70788ec1733349.14b93320eee6104866cfa752adf77a23ddd4fabc&text=" + world + "&lang=ru";
        org.apache.http.client.HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        String responseString = new BasicResponseHandler().handleResponse(response);
        ObjectMapper mapper = new ObjectMapper();
        YandexResponce yandexObject = mapper.readValue(responseString, YandexResponce.class);
        String[] tr = yandexObject.getText();
        return tr[0];
    }

    public String getTranscription(String world) throws IOException {
        String url = "https://dictionary.yandex.net/dicservice.json/lookupMultiple?ui=ru&srv=tr-text&sid=b09f2411.5a19dc9b.4ebe4de2&text=" + world + "&dict=en.syn%2Cen.ant%2Cen.deriv&flags=39";
        org.apache.http.client.HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        String responseString = new BasicResponseHandler().handleResponse(response);
        ObjectMapper mapper = new ObjectMapper();
        Root root = mapper.readValue(responseString, Root.class);
        try {
            return "[" + root.getEn().getSyn().get(0).getTs() + "]";
        }catch (Exception e){
            return "No transcription";
        }
    }
}
