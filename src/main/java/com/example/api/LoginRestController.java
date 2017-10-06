package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.TblUser;
import com.example.service.LoginService;

@CrossOrigin
@RestController
@RequestMapping("api/login")
public class LoginRestController {

    @Autowired
    LoginService loginService;
    
	/**
	 * ログイン処理API
	 * @param TblUser
	 * @return TblUser
	 */
	@PostMapping
	public TblUser login(@RequestBody  TblUser user){
				return loginService.login(user);
	}
}
