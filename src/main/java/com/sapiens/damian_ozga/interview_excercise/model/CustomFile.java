package com.sapiens.damian_ozga.interview_excercise.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "CustomFile")
public class CustomFile {

    @Id
    private String key;

    private String content;
}
