package kr.hs.emirim.young111.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyImage extends View {

    MyImage(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Bitmap picture = BitmapFactory.decodeResource(getResources(),R.drawable.s1);
        float cx = getWidth()/2.0f;
        float cy = getWidth()/2.0f;
        float x = (getWidth()-picture.getWidth())/2.0f;
        float y = (getHeight()-picture.getWidth())/2.0f;
        // canvas.rotate(45,cx,cy); -> 회전
        // canvas.translate(-150,200); -> 이동
        canvas.scale(0.5f,0.5f,cx,cy);
        // canvas.skew(0.4f,0.4f); -> 비틀기
        canvas.drawBitmap(picture,x,y,null);
    }
}
