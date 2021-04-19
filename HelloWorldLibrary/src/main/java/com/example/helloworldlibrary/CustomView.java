package com.example.helloworldlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

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

    public void clicked(View view){
        Toast.makeText(getContext(), "hi there", Toast.LENGTH_SHORT).show();
    }

}

