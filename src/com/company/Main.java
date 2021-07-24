package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        Question question = new Question("question", "answerchoice", "trueAnswer", 10);
        File file = new File("questions.json");
        objectMapper.writeValue(file, question);

        byte[] jsonData = Files.readAllBytes(Paths.get("questions.json"));
        System.out.println(new String(jsonData));
        Question question1 = objectMapper.readValue(jsonData, Question.class);
        System.out.println(question1);


        StringWriter stringQuestion = new StringWriter();
        objectMapper.writeValue(stringQuestion, question);
        System.out.println(stringQuestion);




    }
}
