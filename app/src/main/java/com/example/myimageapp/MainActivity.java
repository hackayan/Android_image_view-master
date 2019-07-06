package com.example.myimageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton like;
    private Switch sw;
    private ImageView img;
    private RadioButton rb;
    private RadioButton rb2;
    private Button ref;
    private CheckBox cb;
    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        like = findViewById(R.id.imageButton);
        sw = findViewById(R.id.switch1);
        img = findViewById(R.id.friends_iv);
        rb = findViewById(R.id.radioButton);
        rb2 = findViewById(R.id.radioButton2);
        Button ref;
        cb = findViewById(R.id.checkBox);
        rg = findViewById(R.id.radioGroup);
        sw.setChecked(true);
        rb.setChecked(true);
        cb.setChecked(true);


//
    }

    //    int flag=0;
   boolean choose=false;

    public void ImButton(View view) {


        if (!choose) {
            like.setImageResource(R.drawable.liked1);
            choose = true;
        } else {
            like.setImageResource(R.drawable.like3);
            choose = false;
        }


    }
//
//    public void onSwitch(View view) {
//
//        if(flag==0) {
//
//            boolean status = sw.isChecked();
//            if (status) {
//                img.setVisibility(View.VISIBLE);
//            } else {
//                img.setVisibility(View.INVISIBLE);
//            }
//            flag = 1;
//        }
//    }
//
//    public void onRadio(View view) {
//
//        //int selectId=rg.getCheckedRadioButtonId();
//
//        if (flag == 0) {
//
//            if (rb.isChecked())
//                like.setClickable(true);
//            else if (rb2.isChecked())
//                like.setClickable(false);
//            flag = 1;
//        }
//    }
//
//    public void check(View view){
//
//
//        if(flag==0) {
//            if (!cb.isChecked())
//                like.setVisibility(View.INVISIBLE);
//            else {
//
//                like.setVisibility(View.VISIBLE);
//            }
//
//            flag = 1;
//        }
//    }
//
//    public void refresh(View view) {
//       flag=0;
//
//    }


    public void refresh(View view) {
        boolean status = sw.isChecked();
        if (status) {
            img.setVisibility(View.VISIBLE);
        } else {
            img.setVisibility(View.INVISIBLE);
        }

        if (rb.isChecked())
            like.setClickable(true);
        else if (rb2.isChecked())
            like.setClickable(false);

        if (!cb.isChecked())
            like.setVisibility(View.INVISIBLE);
        else {

            like.setVisibility(View.VISIBLE);
//            }

        }


//        flag=0;
//         App.refreshApp(this);

    }
}

