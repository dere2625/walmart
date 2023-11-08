package com.example.walmart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.walmart.ui.theme.WalmartTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val signInBtn : Button = findViewById(R.id.signInButton)
        signInBtn.setOnClickListener{
            val shoppingActivityIntent = Intent (this, ShoppingActivity::class.java)
            startActivity(shoppingActivityIntent)
        }
    }

    fun authenticateUser(userName: String, password : String) : Boolean{
        return false
    }
}
