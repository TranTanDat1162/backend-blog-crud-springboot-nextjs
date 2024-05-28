package com.crud.blog.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Table(name = "blog")
@Getter
@Setter
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id")
    private Long id;

    @Column(name = "blog_title")
    private String title;

    @Column(name = "blog_author")
    private String author;

    @Column(name="blog_content", columnDefinition="TEXT")
    private String content;
}
