package com.crud.blog.repository;

import com.crud.blog.domain.entity.Blog;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Id> {
    Blog findBlogById(Long id);

}
