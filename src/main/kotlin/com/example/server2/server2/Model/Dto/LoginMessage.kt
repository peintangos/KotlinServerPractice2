package com.example.server2.server2.Model.Dto

import lombok.Data
import lombok.Getter
import lombok.Setter
import java.io.Serializable

@Data
@Getter
@Setter
class LoginMessage :Serializable{
    private var name:String? = null
    private var password:Int? = null
}