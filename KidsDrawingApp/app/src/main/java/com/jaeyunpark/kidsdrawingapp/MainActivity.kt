package com.jaeyunpark.kidsdrawingapp

import android.app.Dialog
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private var drawingView: DrawingView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawingView = findViewById(R.id.drawing_view)
        drawingView?.setSizedForBrush(20.toFloat())

        val ib_brush : ImageButton = findViewById(R.id.ib_brush)
        ib_brush.setOnClickListener {
            showBrushSizeChooserDialog()
        }
    }

    private fun showBrushSizeChooserDialog(){
        val brushDialog = Dialog(this)
        brushDialog.setContentView(R.layout.dialog_brush_size)
        brushDialog.setTitle("Brush size: ")
        val smallBtn : ImageButton = brushDialog.findViewById(R.id.ib_small_brush)
        smallBtn.setOnClickListener{
            drawingView?.setSizedForBrush(10.toFloat())
            brushDialog.dismiss()
        }

        val mediumButton : ImageButton = brushDialog.findViewById(R.id.ib_medium_brush)
        mediumButton.setOnClickListener{
            drawingView?.setSizedForBrush(20.toFloat())
            brushDialog.dismiss()
        }

        val largeButton : ImageButton = brushDialog.findViewById(R.id.ib_large_brush)
        largeButton.setOnClickListener{
            drawingView?.setSizedForBrush(30.toFloat())
            brushDialog.dismiss()
        }
        brushDialog.show()
    }
}