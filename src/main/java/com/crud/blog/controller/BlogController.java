package com.crud.blog.controller;

import com.crud.blog.domain.dto.BlogDto;
import com.crud.blog.domain.entity.Blog;
import com.crud.blog.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/blogs")
public class BlogController {
    private final BlogService blogService;

    // Create a new blog post
    @PostMapping
    public ResponseEntity<BlogDto> createBlogPost(@RequestBody BlogDto blogDto) {
        blogService.createBlog(blogDto);
        return ResponseEntity.ok(blogDto);
    }

    // Get all blog posts
    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlogPosts() {
        List<Blog> blogPosts = blogService.getBlogs();
        return ResponseEntity.ok(blogPosts);
    }

    // Get a single blog post by ID
    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlogPostById(@PathVariable Long id) {
        Blog blogPost = blogService.getBlogById(id);
        return ResponseEntity.ok(blogPost);
    }

    // Update a blog post by ID
    @PutMapping("/{id}")
    public ResponseEntity<BlogDto> updateBlogPost(@PathVariable Long id, @RequestBody BlogDto blogPostDetails) {
        blogService.updateBlog(id, blogPostDetails);
        return ResponseEntity.ok(blogPostDetails);
    }

    // Delete a blog post by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlogPost(@PathVariable Long id) {
        blogService.deleteBlogById(id);
        return ResponseEntity.noContent().build();
    }
}
