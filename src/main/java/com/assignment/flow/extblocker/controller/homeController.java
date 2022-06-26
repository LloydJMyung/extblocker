package com.assignment.flow.extblocker.controller;

import com.assignment.flow.extblocker.dto.CustomExtRequest;
import com.assignment.flow.extblocker.dto.PositionsRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Controller
public class homeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/checkform")
    public ResponseEntity<Void> checkform(@RequestBody PositionsRequest positionsRequest) {
        System.out.println(positionsRequest);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/customs")
    public ResponseEntity<Void> customs(@RequestBody CustomExtRequest customExtRequest) {
        log.info("ext: " + customExtRequest.getExt());
        System.out.println(customExtRequest);
        return ResponseEntity.noContent().build();
    }

}
