package com.mohitSpring.journalAPP.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class journalEnteryController {
    private Map< Long, jaurnalEntery > jarnalEntries = new HashMap<>();
    public List<jaurnalEntery >getAll(){
        return new ArrayList<>(jarnalEntries.values());
    }
}
