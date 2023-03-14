package com.leyou.service;

import com.leyou.mapper.CategoryMapper;
import com.leyou.pojo.Category;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GengXuelong
 * @version 1.0
 * @email 3349495429@qq.com
 * @Date 2023/1/4 17:05
 * @className CategoryService
 * @description:
 */
@Service
public class CategoryService {
    @Resource
    CategoryMapper categoryMapper;
    public List<Category> queryListByParentId(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        return categoryMapper.select(category) ;
    }

    public List<Category> getAll(Long pid) {
        return categoryMapper.selectAll();
    }
}
