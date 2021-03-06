package com.example.server2.server2.Controller

import com.example.server2.server2.Model.Dto.LoginMessage
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/abc"])
class LoginController {
    @PostMapping("def")
    fun home(@RequestBody loginMessage: LoginMessage):String{
        return "ssss"
    }
    @GetMapping("def")
    fun homeGet():String{
        return "s"
    }
}