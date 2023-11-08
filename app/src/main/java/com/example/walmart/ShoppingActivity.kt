    package com.example.walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

    class ShoppingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val txtEmail : TextView = findViewById(R.id.txtEmail)
        print(intent.getStringExtra("email"))
        txtEmail.text = "Welcome " +intent.getStringExtra("email")
    }
}