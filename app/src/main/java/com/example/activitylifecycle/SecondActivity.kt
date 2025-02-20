package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Activity Lifecycle 2 ","onCreate")
        setContent {
            val intent = Intent(this, FirstActivity::class.java)
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {
                    startActivity(intent)
                }) {
                    Text(text = "Back")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity Lifecycle 2 ","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity Lifecycle 2 ","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity Lifecycle 2 ","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity Lifecycle 2 ","onStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("Activity Lifecycle 2 ","onRestart")

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity Lifecycle 2 ","onDestroy")
    }
}

