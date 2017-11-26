import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DictionaryResponce {
    private class En{

        private class Syn{
            String ts;

            public String getTs() {
                return ts;
            }
        }
    }
}
