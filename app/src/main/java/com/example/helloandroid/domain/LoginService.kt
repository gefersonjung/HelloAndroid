package com.example.helloandroid.domain

class LoginService {
    fun login(login:String, senha: String): Usuario? {
        if (login == "geferson" && senha == "1234") {
            return Usuario("Geferson","a@a.com")
        } else if (login == "teste" && senha == "1234") {
            return Usuario("Teste","b@b.com")
        }
        return null
    }
}