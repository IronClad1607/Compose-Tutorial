package com.ironclad.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Android")
        }
    }

    @Composable
    fun Greeting(name: String){
        Text(text = "Hello $name")
    }
    
    @Preview
    @Composable
    fun PreviewGreeting(){
        Greeting(name = "Android")
    }
}
