package com.example.hannis.hw1.feature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText sex,age;
    Button btn;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sex=(EditText)findViewById(R.id.editText);
        age=(EditText)findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button);
        output=(TextView)findViewById(R.id.textView3);

        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View aa){

                if(!("".equals(age.getText().toString()) || "".equals(sex.getText().toString()))){
                    int iage = Integer.parseInt(age.getText().toString());

                    if("男".equals(sex.getEditableText().toString())){
                       if(iage<30){
                           output.setText("還不急");
                       }

                       else if(iage<35 && iage>=30){
                           output.setText("結婚吧");
                       }

                       else if(iage>35){
                           output.setText("找個女朋友吧");
                       }
                    }

                    else if("女".equals(sex.getEditableText().toString())){
                        if(iage<28){
                            output.setText("還不急");
                        }

                        else if(iage<32 && iage>=28){
                            output.setText("結婚吧");
                        }

                        else if(iage>32){
                            output.setText("找個男朋友吧");
                        }
                    }

                    else{
                        output.setText("輸入錯誤");
                    }
                }

                else{
                    output.setText("尚未輸入資料");
                }
            }

        }
        );

    }
}
