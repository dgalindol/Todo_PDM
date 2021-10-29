package com.diegog.a2_ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Ciclos de vida", "Entramos al metodo onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclos de vida", "Entramos al metodo onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclos de vida", "Entramos al metodo onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclos de vida", "Entramos al metodo onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclos de vida", "Entramos al metodo onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclos de vida", "Entramos al metodo onDestroy()")
    }
}