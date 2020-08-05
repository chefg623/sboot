package com.chefg.sbot.service;

import com.chefg.sbot.dao.BookDao;
import com.chefg.sbot.pojo.Book;
import com.chefg.sbot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * created by chefg On2020/8/4
 */
@Service
public class BookService {
    @Autowired
    BookDao bookDao;
    @Autowired
    CategoryService categoryService;

    public List<Book> list() {
        /*return bookDao.findAll(Sort.by(Sort.Direction.DESC, "id"));*/
        Sort sort = Sort.by(Sort.Direction.DESC, "Id");
        return bookDao.findAll(sort);
    }
    public List<Book> Search(String keywords) {
        return bookDao.findAllByTitleLikeOrAuthorLike('%' + keywords + '%', '%' + keywords + '%');
    }

    public void addOrUpdate(Book book) {
        bookDao.save(book);
    }

    public void deleteById(int id) {
        bookDao.deleteById(id);
    }

    public List<Book> listByCategory(int cid) {
        Category category = categoryService.get(cid);
        return bookDao.findAllByCategory(category);
    }
}