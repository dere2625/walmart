    package com.example.walmart

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

    class ShoppingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val txtEmail : TextView = findViewById(R.id.txtEmail)
        print(intent.getStringExtra("email"))
        txtEmail.text = "Welcome " +intent.getStringExtra("email")

        val clothing : ImageView = findViewById(R.id.fashion)
        val beauty : ImageView = findViewById(R.id.beauty)
        val electronics : ImageView = findViewById(R.id.electronics)
        val food : ImageView = findViewById(R.id.food)

        food.setOnClickListener{
            showToast(this,"Food")
        }

        clothing.setOnClickListener{
            showToast(this, "Clothing")
        }

        electronics.setOnClickListener{
            showToast(this,"Electronics")
        }
        beauty.setOnClickListener{
            showToast(this,"Beauty")
        }
    }
        private fun showToast (context : Context, category : String){
            Toast.makeText(context, "You've chosen the "+category+ " category of shopping",Toast.LENGTH_SHORT).show()
        }
}