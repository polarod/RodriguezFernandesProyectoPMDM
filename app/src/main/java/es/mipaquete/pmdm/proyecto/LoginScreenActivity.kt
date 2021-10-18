package es.mipaquete.pmdm.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginScreenActivity : AppCompatActivity() {
    lateinit var btlogin: Button
    lateinit var btregist: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        btlogin = findViewById(R.id.button)
        btregist= findViewById(R.id.button2)

        btregist.setOnClickListener(){
            val intento = Intent(this,RegisterScreenActivity::class.java)
            startActivity(intento)

        }

    }
}