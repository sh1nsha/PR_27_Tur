package com.example.pr_27_tur;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class Draw2D extends View {
    private Paint mPaint = new Paint();
    public Draw2D(Context context) {
        super(context);
    }
    private Rect mRect = new Rect();
    int x = 700;
    int y = 350;


    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);//холст

        mPaint.setStyle(Paint.Style.FILL);// стиль Заливка
        mPaint.setColor(getResources().getColor(R.color.orange));// закрашиваем холст белым цветом
        canvas.drawPaint(mPaint);
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(950, 100, 100, mPaint);//Рисуем круг

        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.GRAY);

        mPaint.setColor(Color.GREEN);
        canvas.drawRect(0, 2500, 1100, 680, mPaint);//Рисуем прямоугольник

        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(42);
        canvas.drawText("Это Моя Поляна", 30, 648, mPaint);

        mPaint.setColor(Color.GRAY);
        mPaint.setTextSize(36);
        String str2rotate = "Лучик солнца!";
        canvas.save();

        mPaint.setColor(Color.RED);

        canvas.rotate(-45, x + mRect.exactCenterX(), y + mRect.exactCenterY());
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(str2rotate, x, y, mPaint);
        canvas.restore();
        // Рисуем кузов машины
        mPaint.setColor(Color.RED);
        canvas.drawRect(300, 500, 800, 600, mPaint);

        // Рисуем колеса
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(400, 650, 50, mPaint);
        canvas.drawCircle(700, 650, 50, mPaint);

        // Рисуем окно
        mPaint.setColor(Color.CYAN);
        canvas.drawRect(550, 520, 750, 580, mPaint);

        // Рисуем текст "Машина"
        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(60);
        canvas.drawText("Машина", 400, 450, mPaint);
    }
}
