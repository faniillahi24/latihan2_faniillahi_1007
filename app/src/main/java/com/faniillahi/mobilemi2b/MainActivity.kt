
package com.faniillahi.mobilemi2b

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var Username: EditText
    lateinit var Password: EditText
    lateinit var Login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Username = findViewById(R.id.username)
        Password = findViewById(R.id.password)
        Login = findViewById(R.id.login)


        Login.setOnClickListener {
            val username = Username.text.toString()
            val password = Password.text.toString()

            if (username == "admin" && password == "123456") {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Username atau password salah",
                    Toast.LENGTH_SHORT).show()
            }


        }
    }
}
