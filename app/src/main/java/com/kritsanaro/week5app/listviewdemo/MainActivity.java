package com.kritsanaro.week5app.listviewdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_data;
    String [] arr_data =
            {"Android","IOS","Windows Phone","OSX","Ubuntu","ขี้เหล้าปวส.1"};
    ArrayAdapter arrayAdapter;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getBaseContext();
        //bind widget
        lv_data = findViewById(R.id.lv_data);

        arrayAdapter = new ArrayAdapter<String>(MainActivity.this,
                                                android.R.layout.simple_list_item_1,
                                                arr_data);
        lv_data.setAdapter(arrayAdapter);
        lv_data.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Intent goPage2 = new Intent(context,Page2Activity.class);
                goPage2.putExtra("list_data",arr_data[position]);
                goPage2.putExtra("user_send","Kritsana");
                startActivity(goPage2);
                finish();

                Toast.makeText(MainActivity.this,
                        "ListView row["+(position+1)+"] = "+arr_data[position],
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
