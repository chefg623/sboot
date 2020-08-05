package com.chefg.sbot.dao;

import com.chefg.sbot.pojo.Book;
import com.chefg.sbot.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * created by chefg On2020/8/4
 */
public interface BookDao extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);

}
