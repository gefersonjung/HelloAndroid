package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.helloandroid.domain.EsqueciSenhaService
import com.example.helloandroid.extension.alert

class EsqueciSenhaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esqueci_senha)
        findViewById<Button>(R.id.btEsqueciSenha).setOnClickListener {
            onClickEnviar()
        }
    }
    private fun onClickEnviar() {
        val tLogin = findViewById<TextView>(R.id.tLogin)
        val login = tLogin.text.toString()
        val service = EsqueciSenhaService()
        val ok = service.recuperarSenha(login)
        if (ok) {
            alert("Sua nova senha foi enviada para seu email com sucesso")
            finish()
        }else {
            alert("Ocorreu um erro ao recuperar sua senha")
        }

    }
}