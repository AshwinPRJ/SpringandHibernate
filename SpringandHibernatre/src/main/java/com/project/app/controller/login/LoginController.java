package com.project.app.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.bean.LoginBean;
import com.project.app.service.ILoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private ILoginService iLoginService;

	@PostMapping(value = "/loginSave", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> saveLogin(@RequestBody LoginBean loginBean) {
	      String response = iLoginService.saveLogin(loginBean);
	      return ResponseEntity.ok().body("New Book has been saved with ID:" + response);
	   }
}
