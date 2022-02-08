package com.abhishekchoksi.radiobuttonapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void radioButtobClickEvent(View view){
        boolean isChecked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.rbtMale:
                if(isChecked){
                    Toast.makeText(this, "Male is Selected.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.rbtFemale:
                if(isChecked){
                    Toast.makeText(this, "Female is Selected.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.rbtOther:
                if(isChecked){
                    Toast.makeText(this, "Other is Selected.", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}