package Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/login")
class LoginController {
    @GetMapping("/login2")
    fun login():String{
        return "s"
    }
}