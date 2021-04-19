package com.example.helloworldlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class CustomView extends RelativeLayout {
    public CustomView(Context context) {
        super(context);
        initialize(context);
    }

    public CustomView(Context context, AttributeSet attrs){
        super(context, attrs);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.custom_layour, this);
    }

}

