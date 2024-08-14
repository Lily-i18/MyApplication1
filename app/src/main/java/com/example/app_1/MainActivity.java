package com.example.app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewText1,textViewTest2;
    private Button buttonChange,buttonText2;
    private boolean textFlag;
    private boolean text2Flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewText1 = (TextView) findViewById(R.id.textView_text1);
        textViewTest2 = (TextView) findViewById(R.id.textView_text2);
        buttonChange = (Button) findViewById(R.id.button_change);


        textFlag = true ;
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textFlag){
                    textViewText1.setText("Hello world");
                    textViewTest2.setText("Good morning !");
                    textFlag = false;
                }else{
                    textViewText1.setText("Good morning !");
                    textViewTest2.setText("Hello world");
                    textFlag = true;
                }

            }
        });

        buttonText2 = (Button)findViewById(R.id.button_text2);
        text2Flag = true;
        buttonText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text2Flag){
                    textViewTest2.setText("1234567");
                    text2Flag = false;
                }else {
                    textViewTest2.setText("Good morning~");
                    text2Flag = true;
                }
            }
        });
    }
}