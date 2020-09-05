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


    fun botao(componente: View){

        tv_final.setTextColor(Color.MAGENTA)
        tv_final.text = "MUDANDO A FRASEEEE !!!"

        val salario = et_segundo.text.toString().toInt()
        val gasto = et_terceiro.text.toString().toInt()
        val total = salario - gasto

        if(salario < 100){
            tv_final.text = "É necessário ter uma renda maior que 100 reais"
        }else if (gasto < 30){
            tv_final.text = "É necessário ter um gasto maior que 30 reais para poder calcular"
        } else {
            if (salario > gasto) {
                tv_final.text = "Ainda resta ${total} para gastar, " +
                        "se você guardar todo mês esse dinheiro durante 1 ano vai sobrar $ ${total * 12} reais"
//        }else if (gasto > salario){
//            tv_final.text = "Valor inválido, você não pode gastar mais do que você ganha"
            } else {
                tv_final.text = "Valor inválido, você tem ${total} e não pode gastar " +
                        "mais do que você ganha. VC QUER FALIR ???"
            }
        }


    }
}