package mx.edu.ittepic.ladm_u2_practica3_gonzalezcruz

import android.app.AlertDialog
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class Hilop2(puntero:MainActivity) : Thread(){
    var p = puntero

    override fun run() {
        super.run()
        p.iniciado2 = true

        //p.setTitle("Iniciado")
        while (p.iniciado2) {

            if (!p.pausaj2 && p.vuelta) {
                p.player2.setText("PLAYER 2         JUGANDO")
                ponerValor(p.valorp2r1)
                sleep(1000)
                ponerValor(p.valor2p2r1)
                sleep(1000)
                total(p.valorp2r1,p.valor2p2r1,p.valor3p2r1)
                sleep(1000)
                pausar()
                p.player2.setText("PLAYER 2         ESPERANDO")
                p.pausaj3 = false

            }
            if (!p.pausaj2 && p.vuelta2) {
                p.player2.setText("PLAYER 2         JUGANDO")
                ponerValor(p.valorp2r2)
                sleep(1000)
                ponerValor(p.valor2p2r2)
                sleep(1000)
                total(p.valorp2r2,p.valor2p2r2,p.valor3p2r2)
                sleep(1000)
                p.player2.setText("PLAYER 2         ESPERANDO")
                pausar()
                p.pausaj3 = false
            }
            if (!p.pausaj2 && p.vuelta3) {
                p.player2.setText("PLAYER 2        JUGANDO")
                ponerValor(p.valorp2r3)
                sleep(1000)
                ponerValor(p.valor2p2r3)
                sleep(1000)
                total(p.valorp2r3,p.valor2p2r3,p.valor3p2r3)
                sleep(1000)
                p.player2.setText("PLAYER 2         ESPERANDO")
                pausar()
                p.pausaj3 = false
            }
            if (!p.pausaj2 && p.vuelta4) {
                p.player2.setText("PLAYER 2         JUGANDO")
                ponerValor(p.valorp2r4)
                sleep(1000)
                ponerValor(p.valor2p2r4)
                sleep(1000)
                total(p.valorp2r4,p.valor2p2r4,p.valor3p2r4)
                sleep(1000)
                p.player2.setText("PLAYER 2         ESPERANDO")
                pausar()
                p.pausaj3 = false
            }


        }

    }
    fun total(dado1: TextView, dado2: TextView, EtiquetaTotal: TextView){ p.runOnUiThread {
        var resultado = dado1.text.toString().toInt() + dado2.text.toString().toInt(); EtiquetaTotal.setText(  resultado.toString()) }
    }
    fun ponerValor(etiqueta: TextView){ p.runOnUiThread {
        (0..50).forEach{etiqueta.setText((1..6).shuffled().first().toString());sleep(10)}
    }
    }
    fun pausar() {
        p.pausaj2 = true
    }
}