package com.vasim.azexplore


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login2)

        findViewById<Button>(R.id.loginButton).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        findViewById<TextView>(R.id.signup_text).setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
