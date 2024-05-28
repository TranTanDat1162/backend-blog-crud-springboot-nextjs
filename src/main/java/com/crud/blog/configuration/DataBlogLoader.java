package com.crud.blog.configuration;

import com.crud.blog.domain.entity.Blog;
import com.crud.blog.repository.IBlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataBlogLoader implements CommandLineRunner {

    private final IBlogRepository iBlogRepository;

    @Override
    public void run(String... args) throws Exception {
        if (iBlogRepository.count() == 0) {
            Blog post = new Blog();
            post.setId(1L);
            post.setTitle("What is Lorem Ipsum?");
            post.setAuthor("tadnat");
            post.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
            iBlogRepository.save(post);

            Blog post2 = new Blog();
            post2.setId(2L);
            post2.setTitle("Why do we use it?");
            post2.setAuthor("tadnat");
            post2.setContent("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
            iBlogRepository.save(post2);

            Blog post3 = new Blog();
            post3.setId(3L);
            post3.setTitle("Where does it come from?");
            post3.setAuthor("tadnat");
            post3.setContent("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum,comes from a line in section 1.10.32.");
            iBlogRepository.save(post3);

            Blog post4 = new Blog();
            post4.setId(4L);
            post4.setTitle("Why do we use it?");
            post4.setAuthor("tadnat");
            post4.setContent("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
            iBlogRepository.save(post4);

            Blog post5 = new Blog();
            post5.setId(5L);
            post5.setTitle("Where can I get some?");
            post5.setAuthor("tadnat");
            post5.setContent("There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.");
            iBlogRepository.save(post5);
        }
    }
}
