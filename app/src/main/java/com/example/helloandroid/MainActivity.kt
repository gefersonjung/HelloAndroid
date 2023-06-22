package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// Comentário de alteração 1.1
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //organizando o código com uma função separada para cada chamada
        findViewById<Button>(R.id.btLogin).setOnClickListener{
            //delega o tratamento para o método correto
            onClickLogin()
        }
        findViewById<TextView>(R.id.btEsqueciSenha).setOnClickListener{
            onClickEsqueciSenha()
        }
        findViewById<TextView>(R.id.btCadastrar).setOnClickListener{
            onClickCadastrar()
        }


    }
    private fun onClickLogin(){
        startActivity(Intent(this,HomeActivity::class.java))
    }
    private fun onClickEsqueciSenha(){
        startActivity(Intent(this,EsqueciSenhaActivity::class.java))
    }
    private fun onClickCadastrar(){
        startActivity(Intent(this,CadastroActivity::class.java))
    }
}

       /* //utilização da classe amonima para chamar a função
        findViewById<Button>(R.id.btLogin).setOnClickListener(object: View.OnClickListener{
            override fun onClick(view: View?){
                startActivity(Intent(this@MainActivity,HomeActivity::class.java))
            }
        })
        //utilização do lambda para chamar a função
        findViewById<TextView>(R.id.btEsqueciSenha).setOnClickListener({
            startActivity(Intent(this,EsqueciSenhaActivity::class.java))
        })
        findViewById<TextView>(R.id.btCadastrar).setOnClickListener(this)
    }

    override fun onClick(view: View?){
        when(view?.id){
          /*  R.id.btLogin -> {
                startActivity(Intent(this,HomeActivity::class.java))
            }
            R.id.btEsqueciSenha -> {
                startActivity(Intent(this,EsqueciSenhaActivity::class.java))
            } */
            R.id.btCadastrar -> {
                startActivity(Intent(this,CadastroActivity::class.java))
            }
        }
    }

//        findViewById<Button>(R.id.btLogin).setOnClickListener {
//            startActivity(Intent(this, HomeActivity::class.java))
//        }
//        findViewById<TextView>(R.id.btEsqueciSenha).setOnClickListener {
//            startActivity(Intent(this, EsqueciSenhaActivity::class.java))
//        }
//        findViewById<TextView>(R.id.btCadastrar).setOnClickListener {
//            startActivity(Intent(this, CadastroActivity::class.java))
//        }

}  */