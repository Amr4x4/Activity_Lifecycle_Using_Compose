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


class FirstActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Activity Lifecycle 1 ","onCreate")
        setContent {
            val intent = Intent(this, SecondActivity::class.java)
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {
                    startActivity(intent)
                }) {
                    Text(text = "Next")
                }
            }
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity Lifecycle 1 ","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity Lifecycle 1 ","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity Lifecycle 1 ","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity Lifecycle 1 ","onStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("Activity Lifecycle 1 ","onRestart")

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity Lifecycle 1 ","onDestroy")
    }
}





