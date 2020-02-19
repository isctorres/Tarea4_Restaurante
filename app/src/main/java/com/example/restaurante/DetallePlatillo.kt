package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acerca.*
import kotlinx.android.synthetic.main.activity_detalle_platillo.*

class DetallePlatillo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_platillo)

        val intPlatillo = this.intent
        txtNombrePlatillo.text = intPlatillo.getStringExtra("PLATILLO")
        txtDetallePlatillo.text = intPlatillo.getStringExtra("DETALLE")
    }
}
