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
    mbarLength=dpToPixel(DEFAULT_BAR_LENGTH);
    mCursorDiameter=dpToPixel(DEFAULT_CURSOR_DIAMETER);
    mbarWidth= dpToPixel(DEFAULT_BAR_WIDTH);
    }

    private float dpToPixel(float valueInDp){
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp, getResources().getDisplayMetrics());
    }

    }


