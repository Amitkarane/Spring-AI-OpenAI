package com.AI.Assignment.Controller;


import com.AI.Assignment.Dto.GrammarResponse;
import com.AI.Assignment.Dto.SummaryResponse;
import com.AI.Assignment.Dto.TextRequestDto;
import com.AI.Assignment.Service.AiService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    @Autowired
    private AiService aiService;

    @PostMapping("/summarize")
    public ResponseEntity<SummaryResponse> summarize(@Valid @RequestBody TextRequestDto request){
        return ResponseEntity.ok(aiService.summarizeText(request));
    }

    @PostMapping("/grammarCorrect")
    public ResponseEntity<GrammarResponse> correctGrammar(@Valid @RequestBody TextRequestDto request){
        return ResponseEntity.ok(aiService.correctGrammar(request));
    }
}
