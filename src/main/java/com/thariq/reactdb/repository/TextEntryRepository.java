package com.thariq.reactdb.repository;


import com.thariq.reactdb.model.TextEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TextEntryRepository extends MongoRepository<TextEntry, String> {
}
