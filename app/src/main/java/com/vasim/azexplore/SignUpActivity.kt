package com.vasim.azexplore


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        findViewById<Button>(R.id.signupButton).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
