package com.AI.Assignment.Service;

import com.AI.Assignment.Dto.GrammarResponse;
import com.AI.Assignment.Dto.SummaryResponse;
import com.AI.Assignment.Dto.TextRequestDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AiService {

    @Autowired
    private OpenAiClientService openAiClient;


    public SummaryResponse summarizeText(TextRequestDto request) {

        String prompt = "Summarize the following text in a concise way.";

        String response = openAiClient.callOpenAi(prompt, request.getText());

        return new SummaryResponse(response);
    }

    public GrammarResponse correctGrammar(TextRequestDto request) {

        String prompt = "Correct the grammar of the following text.";

        String response = openAiClient.callOpenAi(prompt, request.getText());

        return new GrammarResponse(response);
    }
}
