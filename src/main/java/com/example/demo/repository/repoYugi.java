package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public interface YugiRespository extends JpaRepository<Entity, Integer> {

    // custom query to search to blog post by title or content
    //List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
}
