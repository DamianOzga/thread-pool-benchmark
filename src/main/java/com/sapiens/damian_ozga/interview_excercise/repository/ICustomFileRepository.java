package com.sapiens.damian_ozga.interview_excercise.repository;

import com.sapiens.damian_ozga.interview_excercise.model.CustomFile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomFileRepository extends MongoRepository<CustomFile, String> {
}
