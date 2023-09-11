package com.example.calcfig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun onTriangleButtonClick(view: View){
        val triangleActivity = Intent(this, TriangleActivity::class.java)
        startActivity(triangleActivity)
    }
    public fun onTrapezoidButtonClick(view: View){
        val trapezoidActivity = Intent(this, TrapezoidActivity::class.java)
        startActivity(trapezoidActivity)
    }
    public fun onSquareButtonClick(view: View){
        val squareActivity = Intent(this, SquareActivity::class.java)
        startActivity(squareActivity)
    }
    public fun onRectangleButtonClick(view: View){
        val rectangleActivity = Intent(this, RectangleActivity::class.java)
        startActivity(rectangleActivity)
    }
}