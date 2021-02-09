package com.marcos.salariomes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        btnCalcular.setOnClickListener {
            //Variaveis
            var ValorHoraTrabalhada  = txtValorHoraTrabalhada.text.toString().toFloat()
            var QtdDiasTrabalhados  = txtDiasTrabalhados.text.toString().toInt()
            var QtdHorasDias = txtQtdHorasDias.text.toString().toInt()

            //Variaveis Descontos
            var iss = 0.05
            var fgts = 0.08

            var SalarioBruto = QtdHorasDias * QtdDiasTrabalhados * ValorHoraTrabalhada
            var descISS = SalarioBruto * iss
            var descFGTS = SalarioBruto * fgts
            var salarioLiquido = SalarioBruto - (descISS + descFGTS)

            lblSalarioBruto.text = "Salário Bruto: ${SalarioBruto}"
            lblDescISS.text = "Desc. ISS: ${descISS}"
            lblDescFGTS.text = "Desc. FGTS: ${descFGTS}"
            lblSalarioLiquido.text = "Salario Liquido: ${salarioLiquido}"




        }
        
    }
}