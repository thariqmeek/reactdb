package com.thariq.reactdb.controller;

import com.thariq.reactdb.model.TextEntry;
import com.thariq.reactdb.repository.TextEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/texts")
@CrossOrigin(origins = "http://localhost:3000")
public class TextEntryController {

    @Autowired
    private TextEntryRepository textEntryRepository;

    @PostMapping
    public TextEntry createTextEntry(@RequestBody TextEntry textEntry) {
        return textEntryRepository.save(textEntry);
    }

    @GetMapping
    public List<TextEntry> getAllTextEntries() {
        return textEntryRepository.findAll();
    }

    @GetMapping("/text1")
    public List<String> getAllText1() {
        return textEntryRepository.findAll().stream()
                .map(TextEntry::getText1)
                .collect(Collectors.toList());
    }
}
