package org.example.dadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DadataResponse {

    private List<Suggestion> suggestions;
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class Suggestion{

        private String value;

        private String unrestricted_value;

        private Info data;
    }

}
