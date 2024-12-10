package com.sapiens.damian_ozga.interview_excercise.service.impl;

import base.AbstractBaseTest;
import com.sapiens.damian_ozga.interview_excercise.model.CustomFile;
import com.sapiens.damian_ozga.interview_excercise.service.ifc.ICustomFileService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CustomFileServiceImplTest extends AbstractBaseTest {

    @Autowired
    private ICustomFileService customFileService;

    @Test
    void save() {
        // given
        customFileService.save(new CustomFile("a1", "content1"));
        customFileService.save(new CustomFile("a2", "content2"));
        customFileService.save(new CustomFile("a3", "content3"));
        // when
        List<CustomFile> all = customFileService.getAll();

        // than
    }

    @Test
    void getById() {
    }
}