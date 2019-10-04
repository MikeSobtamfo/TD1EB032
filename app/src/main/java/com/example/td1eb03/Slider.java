package com.example.td1eb03;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import androidx.annotation.Nullable;

public class Slider extends View {
    final static float MIN_BAR_LENGTH=160;
    final static float MIN_CURSOR_DIAMETER=30;

    //Dimension par defaut
    final static float DEFAULT_BAR_WIDTH=20;
    final static float DEFAULT_BAR_LENGTH=160;
    final static float DEFAULT_CURSOR_DIAMETER=40;


    private float mbarLength;
    private float mbarWidth;
    private float mCursorDiameter;

    private Paint mCursorPaint=null;
    private Paint mValueBarPaint=null;
    private Paint mBarPaint=null;

    private int mDisabledColor;
    private int mCursorColor;
    private int mBarColor;
    private int mValueBarColor;

    private boolean mEnabled=true;

    //valeur du slider
    private float mValue=50;
    //borne min
    private float mMin=0;
    //borne max
    private float mMax=100;

    public Slider(Context context) {
        super(context);
        init(context,  null);
    }

    public Slider(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    private void init(Context context, AttributeSet attributeSet) {

    //Initialisation des dimensions par defaut en pixel
    mBarLength=dpToPixel(DEFAULT_BAR_LENGTH);
    mCursorDiameter=dpToPixel(DEFAULT_CURSOR_DIAMETER);
    mBarWidth= dpToPixel(DEFAULT_BAR_WIDTH);

    mCursorPaint=new Paint();
    mBarPaint=new Paint();
    mValueBarPaint=new Paint();

    //suppression du repliment
    mCursorPaint.setAntiAlias(true);
    mBarPaint.setAntiAlias(true);
    mValueBarPaint.setAntiAlias(true);

    //application du style (plein)
    mValueBarPaint.setStyle(Paint.Style.STROKE);
    mBarPaint.setStyle(Paint.Style.STROKE);
    mValueBarPaint.setStyle(Paint.Style.FILL_AND_STROKE);

    mBarPaint.setStrokeCap(Paint.Cap.ROUND);
    mValueBarPaint.setStrokeCap(Paint.Cap.ROUND);

    //couleurs par defaut
        mDisabledColor=ContextCompat.getColor(context, R.color.colorDisabled;
        mCursorColor=ContextCompat.getColor(context, R.color.colorAccent;
        mBarColor=ContextCompat.getColor(context, R.color.colorPrimary;
        mValueBarColor=ContextCompat.getColor(context, R.color.colorDisabled;

        mBarPaint.setStrokeWidth(mBarWidth);
        mValueBarPaint.setStrokeWidth(mBarWidth);
    }

    private float dpToPixel(float valueInDp){
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp, getResources().getDisplayMetrics());
    }

    }


