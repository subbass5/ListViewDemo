package com.kritsanaro.week5app.listviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {

    TextView tv_result,tv_name;
    Button btn_back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2activity);

        //bind widget
        tv_result = findViewById(R.id.tv_result);
        tv_name = findViewById(R.id.tv_name);

        btn_back = findViewById(R.id.btn_back);

        String result = getIntent().getExtras().getString("list_data");
        String name_send = getIntent().getExtras().getString("user_send");


        tv_name.setText("ชื่อผู้ส่ง : "+name_send);
        tv_result.setText("ข้อมูล: "+result);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goListView
                        = new Intent(Page2Activity.this,
                        MainActivity.class);
                startActivity(goListView);
                finish();
            }
        });


    }
}
