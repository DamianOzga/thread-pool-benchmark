package com.sapiens.damian_ozga.interview_excercise.service.impl;

import com.sapiens.damian_ozga.interview_excercise.model.CustomFile;
import com.sapiens.damian_ozga.interview_excercise.repository.ICustomFileRepository;
import com.sapiens.damian_ozga.interview_excercise.service.ifc.ICustomFileService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class CustomFileServiceImpl implements ICustomFileService {

    private final ICustomFileRepository customFileRepository;

    @Override
    public void save(CustomFile entity) {
        customFileRepository.save(entity);
    }

    @Override
    public CustomFile getById(String entityId) throws NoSuchElementException {
        return customFileRepository.findById(entityId)
                .orElseThrow(() -> new NoSuchElementException("Element does not exist in database"));
    }

    @Override
    public List<CustomFile> getAll() {
        List<CustomFile> customFiles = customFileRepository.findAll();
        if (customFiles.isEmpty()) {
            throw new NoSuchElementException("There are no entities in the database.");
        }
        return customFiles;
    }
}
