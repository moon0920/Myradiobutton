package com.mmj.www.myradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
//    RadioButton radioButton1;
//    RadioButton radioButton2;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        radioButton1 = (RadioButton)findViewById(R.id.rdobtn1);
//        radioButton2 = (RadioButton)findViewById(R.id.rdobtn2);
        textView = (TextView)findViewById(R.id.text1);

    }
    public void onclickwidjet(View view){
        int id = view.getId();
        String text = ((RadioButton)view).getText().toString();
        switch (id){
            case R.id.rdobtn1:
                text = text + "-" + ((RadioButton)view).isChecked();
                break;
            case R.id.rdobtn2:
                text = text + "-" + ((RadioButton)view).isChecked();
                break;
                default: text = "noting!";
    }
    textView.setText(text);
    }
}
