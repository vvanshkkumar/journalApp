package com.project.journalApp.journalApp.Controller;

import com.project.journalApp.journalApp.Entitiy.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journals")
public class JournalEntryController {

    private Map<Long, JournalEntry> entries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(entries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        entries.put(myEntry.getId(),myEntry);
        return true;
    }

    @GetMapping("/id/{myid}")
    public JournalEntry findById(@PathVariable Long myid){
        return entries.get(myid);
    }
}
