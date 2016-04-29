package com.yxc.view;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.view.View;

public class MyShaderView extends View{
	
	private LinearGradient linearGradient;//线性渲染对象
	private SweepGradient sweepGradient;//梯度渲染对象
	private RadialGradient radialGradient;//环信渲染对象
	private ComposeShader composeShader;//混合渲染对象
	private BitmapShader bitmapShader;//图形渲染对象

	public MyShaderView(Context context) {
		super(context);
		linearGradient = new LinearGradient(0, 0, 20, 20, new int[]{Color.WHITE, Color.WHITE}, null, Shader.TileMode.REPEAT);
	}
	
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		Paint paint = new Paint();
		canvas.drawColor(Color.BLACK);
		
		paint.setShader(linearGradient);
		paint.setTextSize(20);
		canvas.drawText("线性渲染测试文字渲染", 50, 50, paint);
	}
}
