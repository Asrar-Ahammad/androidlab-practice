package com.example.graphicalpremitives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public class MyCustomView extends View {

        public MyCustomView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            // Create a Paint object for styling the primitives
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);

            // Draw a rectangle
            canvas.drawRect(100, 100, 400, 300, paint);

            // Draw a circle
            canvas.drawCircle(600, 200, 100, paint);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyCustomView customView = new MyCustomView(this);
        setContentView(customView);
    }
}