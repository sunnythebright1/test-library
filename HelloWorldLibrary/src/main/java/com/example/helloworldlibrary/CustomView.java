package com.example.helloworldlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class CustomView extends RelativeLayout implements View.OnClickListener {
    public CustomView(Context context) {
        super(context);
        initialize(context);
    }

    public CustomView(Context context, AttributeSet attrs){
        super(context, attrs);
        initialize(context);
    }

    private void initialize(Context context){
        setOnClickListener(this);
        inflate(context, R.layout.custom_layour, this);
    }




    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(), "Hello Mr Fahad", Toast.LENGTH_SHORT).show();

    }
}

