package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.TblUser;
import com.example.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserRestController {

    @Autowired
    UserService userService;
    
    /**
     * ユーザー一覧取得API
     * @return List<TblUser>
     */
    @GetMapping
    List<TblUser> getItems() {
        List<TblUser> users = userService.findAll();
        return users;
    }
    
    /**
     * ユーザー登録API
     * @param TblUser
     * @return int
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    int postItem(@RequestBody TblUser user) {
    	return userService.create(user);
    }
    
    /**
     * ユーザー削除API
     * @param String
     */
    @DeleteMapping(path = "{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteItem(@PathVariable String id) {
    	userService.delete(id);
    }
    
    /**
     * ユーザー更新API
     * @param id
     * @param item
     * @return item
     */
    @PutMapping(path = "{id}")
    int putItem(@PathVariable String id, @RequestBody TblUser user) {
    	user.setUserId(id);
    	return userService.update(user);
    }

}