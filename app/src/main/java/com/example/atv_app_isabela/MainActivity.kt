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

        val nome = et_primeiro.text.toString()
        val salario = et_segundo.text.toString().toInt()
        val gasto = et_terceiro.text.toString().toInt()
        val total = salario - gasto

        if(nome.length < 3){
            tv_final.setTextColor(Color.RED)
            tv_final.text = "Nome inválido, por favor digite um nome com mais de 3 ou maos caracteres"
        } else if(salario < 100){
            tv_final.setTextColor(Color.RED)
            tv_final.text = "É necessário ter uma renda maior que 100 reais"
        }else if (gasto < 30){
            tv_final.setTextColor(Color.RED)
            tv_final.text = "É necessário ter um gasto maior que 30 reais para poder calcular"
        } else {
            if (salario > gasto) {
                tv_final.setTextColor(Color.GREEN)
                tv_final.text = "${nome}, ainda resta ${total} para você gastar, " +
                        "se você guardar todo mês esse dinheiro durante 1 ano vai sobrar $ ${total * 12} reais"

            } else {
                tv_final.setTextColor(Color.RED)
                tv_final.text = "${nome}, você gastou R$ ${gasto - salario} a mais do que você ganha" +
                        " VC QUER FALIR ???"
            }
        }


    }
}