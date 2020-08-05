package com.chefg.sbot.service;

import com.chefg.sbot.dao.CategoryDao;
import com.chefg.sbot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by chefg On2020/8/4
 */
@Service
public class CategoryService {
    @Autowired
    CategoryDao categoryDao;

    public List<Category> list() {

        return categoryDao.findAll(Sort.by(Sort.Direction.DESC,"Id"));
    }

    public Category get(int id) {
        Category c= categoryDao.findById(id).orElse(null);
        return c;
    }

}
