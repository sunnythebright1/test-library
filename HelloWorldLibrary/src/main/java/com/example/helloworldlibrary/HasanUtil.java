package com.example.helloworldlibrary;

import android.content.Context;
import android.widget.Toast;

public class HasanUtil {
    private static final String TAG = "Hasan";

    public static void showCustomToast(Context context){
        Toast.makeText(context, "Hello from Hasan's SDK", Toast.LENGTH_SHORT).show();
    }

    public String whoIsTheChamp(){
        return "Hassan";
    }
}
