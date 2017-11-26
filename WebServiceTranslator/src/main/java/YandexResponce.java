import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YandexResponce {
    private String[] text;

    public String[] getText() {
        return text;
    }
}
