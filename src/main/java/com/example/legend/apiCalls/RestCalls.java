package com.example.legend.apiCalls;

import com.example.legend.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class RestCalls {

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<List<Question>> getAllQuestions(){

        String url = "http://localhost:8081/question/allQuestions";

        return restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Question>>() {});

    }


}
