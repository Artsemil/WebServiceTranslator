import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
    private En en;

    public En getEn() {
        return this.en;
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class En {
    private List<Syn> syn;

    public List<Syn> getSyn() {
        return this.syn;
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Syn {
    private String ts;

    public String getTs() {
        return this.ts;
    }
}