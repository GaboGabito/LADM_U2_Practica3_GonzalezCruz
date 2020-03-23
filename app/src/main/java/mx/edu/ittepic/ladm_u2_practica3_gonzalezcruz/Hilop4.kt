package mx.edu.ittepic.ladm_u2_practica3_gonzalezcruz

import android.app.AlertDialog
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class Hilop4(puntero:MainActivity) : Thread(){
    var p = puntero
    override fun run() {
        super.run()
        p.iniciado4 = true
        //p.setTitle("Iniciado")
        while(p.iniciado4) {

            if (!p.pausaj4 && p.vuelta) {
                p.player4.setText("PLAYER 4         JUGANDO")
                ponerValor(p.valorp4r1)
                //p.valorp2r1.setText((1..6).shuffled().first().toString())
                sleep(1000)
                ponerValor(p.valor2p4r1)
                //p.valor2p2r1.setText((1..6).shuffled().first().toString())
                sleep(1000)
                total(p.valorp2r1,p.valor2p4r1,p.valor3p4r1)
                //p.valor3p2r1.setText((p.valorp2r1.text.toString().toInt() + p.valor2p2r1.text.toString().toInt()).toString())
                sleep(1000)
                pausar()
                p.player4.setText("PLAYER 4         ESPERANDO")
                p.vuelta = false
                p.vuelta2 = true
                p.pausaj1 = false

            }
            if (!p.pausaj4 && p.vuelta2) {
                p.player4.setText("PLAYER 4         JUGANDO")
                ponerValor(p.valorp4r2)
                sleep(1000)
                ponerValor(p.valor2p4r2)
                sleep(1000)
                total(p.valorp4r2,p.valor2p4r2,p.valor3p4r2)
                //p.valor3p2r2.setText((p.valorp2r2.text.toString().toInt() + p.valor2p2r2.text.toString().toInt()).toString())
                sleep(1000)
                pausar()
                p.player4.setText("PLAYER 4         ESPERANDO")
                p.vuelta2 = false
                p.vuelta3 = true
                p.pausaj1 = false

            }
            if (!p.pausaj4 && p.vuelta3) {
                p.player4.setText("PLAYER 4         JUGANDO")
                ponerValor(p.valorp4r3)
                sleep(1000)
                ponerValor(p.valor2p4r3)
                sleep(1000)
                total(p.valorp4r3,p.valor2p4r3,p.valor3p4r3)
                //p.valor3p2r3.setText((p.valorp2r3.text.toString().toInt() + p.valor2p2r3.text.toString().toInt()).toString())
                sleep(1000)
                pausar()
                p.vuelta3 = false
                p.vuelta4 = true
                p.pausaj1 = false
            }
            if (!p.pausaj4 && p.vuelta4) {
                p.player4.setText("PLAYER 4         JUGANDO")
                ponerValor(p.valorp4r4)
                sleep(1000)
                ponerValor(p.valor2p4r4)
                sleep(1000)
                total(p.valorp4r4, p.valor2p4r4, p.valor3p4r4)
                //p.valor3p2r4.setText((p.valorp2r4.text.toString().toInt() + p.valor2p2r4.text.toString().toInt()).toString())
                sleep(1000)
                pausar()
                p.player4.setText("PLAYER 4         ESPERANDO")

                var arreglo = ArrayList<Int>()
                arreglo.add(p.valor3p1r1.text.toString().toInt() + p.valor3p1r2.text.toString().toInt() + p.valor3p1r3.text.toString().toInt() + p.valor3p1r4.text.toString().toInt())
                arreglo.add(p.valor3p2r1.text.toString().toInt() + p.valor3p2r2.text.toString().toInt() + p.valor3p2r3.text.toString().toInt() + p.valor3p2r4.text.toString().toInt())
                arreglo.add(p.valor3p3r1.text.toString().toInt() + p.valor3p3r2.text.toString().toInt() + p.valor3p3r3.text.toString().toInt() + p.valor3p3r4.text.toString().toInt())
                arreglo.add(p.valor3p4r1.text.toString().toInt() + p.valor3p4r2.text.toString().toInt() + p.valor3p4r3.text.toString().toInt() + p.valor3p4r4.text.toString().toInt())

                var puntajeMayor = arreglo[0]
                var ganador = ""
                (0..3).forEach {

                    if (puntajeMayor < arreglo[it]) {
                        puntajeMayor = arreglo[it]
                        ganador = "jugador ${it + 1}"

                    } else {
                        ganador = "jugador 1"

                    }

                }
                p.runOnUiThread {
                    AlertDialog.Builder(p).setTitle("GANADOR")
                        .setMessage(ganador + "\nPuntajeMayor: " + puntajeMayor).show()
                    p.vuelta4 = false
                    p.pausaj1 = false
                    p.iniciado = false
                    p.iniciado2 = false
                    p.iniciado3 = false
                    p.iniciado4 = false
                }
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
        p.pausaj4 = true
    }
}