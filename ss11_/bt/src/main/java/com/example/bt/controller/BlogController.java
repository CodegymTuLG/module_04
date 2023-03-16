package com.example.bt.controller;

import com.example.bt.dto.BlogDto;
import com.example.bt.model.Blog;
import com.example.bt.model.Type;
import com.example.bt.service.IBlogService;
import com.example.bt.service.ITypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ITypeService typeService;
    @GetMapping("/get-blog-type")
    public ResponseEntity<List<Type>> getBlogTypeList(){
        List<Type> blogTypeList = typeService.findAll();
        if(blogTypeList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogTypeList, HttpStatus.OK);
    }
    @GetMapping("/get-list-blog")
    public ResponseEntity<List<Blog>> getListBlog(){
        List<Blog> blogList = blogService.findAll();
        if(blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping("/get-blog/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable int id){
        Blog blog = blogService.findById(id);
        if(blog==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @GetMapping("/get-blog-by-type/{id}")
    public ResponseEntity<List<Blog>> getBloglistByType(@PathVariable int id){
        List<Blog> list = blogService.findByTypeId(id);
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/find-blog-by-text")
    public ResponseEntity<List<Blog>> getBlogsByText(@RequestParam String text){
        if(text.isEmpty()){
            List<Blog> list = blogService.findAll();
            if(list.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
        String searchText = "%"+text+"%";
        List<Blog> list = blogService.findBytext(searchText);
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/getPage")
    public ResponseEntity<Page<Blog>> pagination(@RequestParam Pageable pageable){
        Page<Blog> pages = blogService.findAll(pageable);
        return new ResponseEntity<Page<Blog>>(pages,HttpStatus.OK);
    }

    @PostMapping("/create-new-blog")
    public ResponseEntity<?> save(@RequestBody BlogDto blogDto){
        Blog blog = new Blog();
        BeanUtils.copyProperties(blogDto,blog);
        blogService.save(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete-blog/{id}")
    public ResponseEntity<?> deleteBlog(@PathVariable int id){
        Blog blog = blogService.findById(id);
        if (blog==null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            blogService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @PatchMapping("/update-blog")
    public ResponseEntity<?> update(@RequestBody BlogDto blogDto){
        Blog blog = blogService.findById(blogDto.getId());
        if (blog==null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            BeanUtils.copyProperties(blogDto,blog);
            blogService.save(blog);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}
