package com.example.pita.myapplication;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class AddMemoActivity extends AppCompatActivity {

    EditText title;
    EditText content;
    Button button;
    ListViewAdapter adapter;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_memo);

        adapter = new ListViewAdapter() ;
        title = (EditText)findViewById(R.id.title);
        content = (EditText)findViewById(R.id.content);
        button = (Button)findViewById(R.id.add);
        //listview = (ListView) findViewById(R.id.listView);
        //listview.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_account_circle_black_24dp), title.getText().toString(), content.getText().toString()) ;
                finish();
            }
        });
    }
}

