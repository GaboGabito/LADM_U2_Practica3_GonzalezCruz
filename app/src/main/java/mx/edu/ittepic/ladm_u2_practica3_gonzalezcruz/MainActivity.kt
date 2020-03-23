package mx.edu.ittepic.ladm_u2_practica3_gonzalezcruz

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var vuelta = false
    var vuelta2 = false
    var vuelta3 = false
    var vuelta4 = false
    var pausaj1 = true
    var pausaj2 = true
    var pausaj3 = true
    var pausaj4 = true
    var iniciado = false
    var iniciado2 = false
    var iniciado3 = false
    var iniciado4 = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var hilo = Hilop1(this); hilo.start()
            var hilo2 = Hilop2(this); hilo2.start()
            var hilo3 = Hilop3(this);hilo3.start()
            var hilo4 = Hilop4(this);hilo4.start()
            vuelta = true
            pausaj1=false
        }
    }

}
