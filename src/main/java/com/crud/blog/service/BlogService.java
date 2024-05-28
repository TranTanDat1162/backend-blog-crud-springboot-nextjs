package com.crud.blog.service;

import com.crud.blog.domain.dto.BlogDto;
import com.crud.blog.domain.entity.Blog;
import com.crud.blog.repository.IBlogRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BlogService {
    private final IBlogRepository iBlogRepository;

    public Blog getBlogById(Long id) {
        return iBlogRepository.findBlogById(id);
    }

    public List<Blog> getBlogs() {
        return iBlogRepository.findAll();
    }
    public void createBlog(BlogDto blogDto) {
        try {
            Blog blog = new Blog();
            blog.setId(blogDto.getId());
            blog.setAuthor(blogDto.getAuthor());
            blog.setContent(blogDto.getContent());
            blog.setTitle(blogDto.getTitle());
            iBlogRepository.save(blog);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updateBlog(Long id, BlogDto blogDto) {
        Blog blog = iBlogRepository.findBlogById(id);
        try {
            blog.setAuthor(blogDto.getAuthor());
            blog.setContent(blogDto.getContent());
            blog.setTitle(blogDto.getTitle());
            iBlogRepository.save(blog);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteBlogById(Long id) {
        Blog blog = iBlogRepository.findBlogById(id);
        iBlogRepository.delete(blog);
    }
}
