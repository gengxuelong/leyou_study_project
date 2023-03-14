package com.leyou.controller;

import com.leyou.pojo.Category;
import com.leyou.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GengXuelong
 * @version 1.0
 * @email 3349495429@qq.com
 * @Date 2023/1/4 17:04
 * @className CategoryController
 * @description:
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Resource
    CategoryService categoryService;

    @RequestMapping("list")
    public ResponseEntity<List<Category>> queryByParentId(@RequestParam(value = "pid",defaultValue = "0") Long pid){

        List<Category> list = this.categoryService.queryListByParentId(pid);
        if(list==null||list.size()<1){
            System.out.println("内容为空");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(list);
    }

}
