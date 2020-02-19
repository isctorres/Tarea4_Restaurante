package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class splashscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_principal,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when( item.itemId ){
            R.id.itmAcerca-> {
                val intAcerca = Intent(this,Acerca::class.java)
                startActivity(intAcerca)
            }
            R.id.itmEnsalada-> abrirPlatillos("2")
            R.id.itmPlatilloF-> abrirPlatillos("1")
            R.id.itmBebidas-> abrirPlatillos("3")
        }

        return super.onOptionsItemSelected(item)
    }

    private fun abrirPlatillos(i: String) {
        val intPlatillos = Intent(this,MainActivity::class.java)
        intPlatillos.putExtra("PLATILLO",i)
        startActivity(intPlatillos)
    }
}
