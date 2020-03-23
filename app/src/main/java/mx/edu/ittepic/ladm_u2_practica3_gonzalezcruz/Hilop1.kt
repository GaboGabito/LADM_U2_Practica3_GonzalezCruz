package mx.edu.ittepic.ladm_u2_practica3_gonzalezcruz

import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class Hilop1(puntero:MainActivity) : Thread(){
    var p = puntero

    override fun run() {
        super.run()
        p.iniciado = true

        while (p.iniciado) {

            if (!p.pausaj1 && p.vuelta) {
                p.player1.setText("PLAYER 1         JUGANDO")
                ponerValor(p.valorp1r1)
                sleep(1000)
                ponerValor(p.valor2p1r1)
                sleep(1000)
                total(p.valorp1r1,p.valor2p1r1,p.valor3p1r1)
                sleep(1000)
                pausar()
                p.player1.setText("PLAYER 1         ESPERANDO")
                p.pausaj2 = false

            }
            if (!p.pausaj1 && p.vuelta2) {
                p.player1.setText("PLAYER 1         JUGANDO")
                ponerValor(p.valorp1r2)
                sleep(1000)
                ponerValor(p.valor2p1r2)
                sleep(1000)
                total(p.valorp1r2,p.valor2p1r2,p.valor3p1r2)
                sleep(1000)
                p.player1.setText("PLAYER 1         ESPERANDO")
                pausar()
                p.pausaj2 = false
            }
            if (!p.pausaj1 && p.vuelta3) {
                p.player1.setText("PLAYER 1         JUGANDO")
                ponerValor(p.valorp1r3)
                sleep(1000)
                ponerValor(p.valor2p1r3)
                sleep(1000)
                total(p.valorp1r3,p.valor2p1r3,p.valor3p1r3)
                sleep(1000)
                p.player1.setText("PLAYER 1         ESPERANDO")
                pausar()
                p.pausaj2 = false
            }
            if (!p.pausaj1 && p.vuelta4) {
                p.player1.setText("PLAYER 1         JUGANDO")
                ponerValor(p.valorp1r4)
                sleep(1000)
                ponerValor(p.valor2p1r4)
                sleep(1000)
                total(p.valorp1r4,p.valor2p1r4,p.valor3p1r4)
                sleep(1000)
                p.player1.setText("PLAYER 1         ESPERANDO")
                pausar()
                p.pausaj2 = false
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
        p.pausaj1 = true
    }

}