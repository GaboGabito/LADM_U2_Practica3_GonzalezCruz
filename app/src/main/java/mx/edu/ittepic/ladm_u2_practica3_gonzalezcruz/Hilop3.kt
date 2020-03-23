package mx.edu.ittepic.ladm_u2_practica3_gonzalezcruz

import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class Hilop3 (puntero:MainActivity):Thread(){
    var p = puntero

    override fun run() {
        super.run()
        p.iniciado3 = true

        //p.setTitle("Iniciado")
        while (p.iniciado3) {

            if (!p.pausaj3 && p.vuelta) {
                p.player3.setText("PLAYER 3         JUGANDO")
                ponerValor(p.valorp3r1)
                sleep(1000)
                ponerValor(p.valor2p3r1)
                sleep(1000)
                total(p.valorp3r1,p.valor2p3r1,p.valor3p3r1)
                sleep(1000)
                pausar()
                p.player3.setText("PLAYER 3         ESPERANDO")
                p.pausaj4 = false

            }
            if (!p.pausaj3 && p.vuelta2) {
                p.player3.setText("PLAYER 3         JUGANDO")
                ponerValor(p.valorp3r2)
                sleep(1000)
                ponerValor(p.valor2p3r2)
                sleep(1000)
                total(p.valorp3r2,p.valor2p3r2,p.valor3p3r2)
                sleep(1000)
                p.player3.setText("PLAYER 3         ESPERANDO")
                pausar()
                p.pausaj4 = false
            }
            if (!p.pausaj3 && p.vuelta3) {
                p.player3.setText("PLAYER 3        JUGANDO")
                ponerValor(p.valorp3r3)
                sleep(1000)
                ponerValor(p.valor2p3r3)
                sleep(1000)
                total(p.valorp3r3,p.valor2p3r3,p.valor3p3r3)
                sleep(1000)
                p.player3.setText("PLAYER 3         ESPERANDO")
                pausar()
                p.pausaj4 = false
            }
            if (!p.pausaj3 && p.vuelta4) {
                p.player3.setText("PLAYER 3         JUGANDO")
                ponerValor(p.valorp3r4)
                sleep(1000)
                ponerValor(p.valor2p3r4)
                sleep(1000)
                total(p.valorp2r4,p.valor2p3r4,p.valor3p3r4)
                sleep(1000)
                p.player3.setText("PLAYER 3         ESPERANDO")
                pausar()
                p.pausaj4 = false
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
        p.pausaj3 = true
    }
}