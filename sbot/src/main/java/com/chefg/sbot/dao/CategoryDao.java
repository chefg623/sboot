package com.chefg.sbot.dao;

import com.chefg.sbot.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by chefg On2020/8/4
 */
public interface CategoryDao extends JpaRepository<Category,Integer> {
}
