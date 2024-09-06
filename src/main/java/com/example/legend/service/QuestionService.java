package com.example.legend.service;

import com.example.legend.apiCalls.RestCalls;
import com.example.legend.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    RestCalls restCalls;


    public ResponseEntity<List<Question>> getAllQuestions() {

        return restCalls.getAllQuestions();


    }
}
