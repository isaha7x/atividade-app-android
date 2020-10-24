package com.example.atv_app_isabela

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun botao(compon0ente: View){

        val nome = et_primeiro.text.toString()
        val salario = et_segundo.text.toString().toDouble()
        val gasto = et_terceiro.text.toString().toDouble()
        val total = salario - gasto

        if(nome.length < 3){
            tv_final.setTextColor(Color.RED)
            tv_final.text = "Nome inválido, por favor digite um nome com 3 ou mais caracteres"
        } else if(salario < 100){
            tv_final.setTextColor(Color.RED)
            tv_final.text = "É necessário ter uma renda maior que 100 reais para poder calcular"
        }else if (gasto < 30){
            tv_final.setTextColor(Color.RED)
            tv_final.text = "É necessário ter um gasto maior que 30 reais para poder calcular"
        } else {
            if (salario > gasto) {
                tv_final.setTextColor(Color.GREEN)
                tv_final.text = "${nome}, ainda resta R$ ${total} para você gastar, " +
                        "se você guardar todo mês essa quantia, durante 1 ano você terá R$ ${total * 12} guardado. :D"

            } else {
                tv_final.setTextColor(Color.RED)
                tv_final.text = "${nome}, você gastou R$ ${gasto - salario} a mais do que você ganha." +
                        " VOCÊ QUER FALIR ???"
            }
        }


    }
}