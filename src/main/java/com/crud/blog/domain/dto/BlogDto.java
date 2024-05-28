package com.crud.blog.domain.dto;

import jakarta.persistence.Lob;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BlogDto {
    private Long id;
    private String title;
    private String author;
    @Lob
    private String content;
}
