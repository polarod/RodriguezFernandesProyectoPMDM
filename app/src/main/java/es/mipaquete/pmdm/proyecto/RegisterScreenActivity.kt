package es.mipaquete.pmdm.proyecto

import android.content.Context
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterScreenActivity : AppCompatActivity() {
    lateinit var send:Button


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.regist_screen)

        send=findViewById(R.id.button3)

        send.setOnClickListener(){
            val sharedPref=RegisterScreenActivity()?.getPreferences(Context.MODE_PRIVATE)
            with(sharedPref.edit()){
                //putString( )

            }
        }



    }

}