package com.example.walmart

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
    init {
         val user = User("derejedejene20@gmail.com","1234")

    }
    private val user = User("derejedejene20@gmail.com","1234")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)



        val signInBtn : Button = findViewById(R.id.signInButton)
        val userName : EditText = findViewById(R.id.emailEditText)
        val password : EditText = findViewById(R.id.passwordEditText)
        signInBtn.setOnClickListener{
            print(authenticateUser(userName.text.toString(), password.text.toString()))
            if(authenticateUser(userName.text.toString(), password.text.toString())){
                val shoppingActivityIntent = Intent (this, ShoppingActivity::class.java)
                shoppingActivityIntent.putExtra("email", userName.text.toString())
                startActivity(shoppingActivityIntent)
            }else{
                Toast.makeText(this,"Username or password incorrect", Toast.LENGTH_LONG).show()
                password.text.clear()
            }

        }
    }

    private fun authenticateUser(userName: String, password : String) : Boolean{
        val tempUser = User(userName,password)
        return true
    }
}
