package com.example.additioncontract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class AdditionController {

    @GetMapping("/api/add")
    public Map<String, Integer> add(
            @RequestParam int a,
            @RequestParam int b) {
        return Map.of("result", a + b);
    }
}
