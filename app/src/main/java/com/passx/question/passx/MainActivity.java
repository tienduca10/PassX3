package com.passx.question.passx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imitView();
    }

    public void imitView(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);  // Tối ưu hóa dữ liệu ko bị ảnh hưởng nội dung trong adapter
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<giaodienchinh> arrayList = new ArrayList<>();
        arrayList.add(new giaodienchinh(R.drawable.java1,"JAVA1"));
        arrayList.add(new giaodienchinh(R.drawable.java2,"JAVA3"));
        arrayList.add(new giaodienchinh(R.drawable.jav3,"JAVA4"));
        arrayList.add(new giaodienchinh(R.drawable.java4,"JAVA5"));
        arrayList.add(new giaodienchinh(R.drawable.java6,"JAVA6"));
        Adapter adapter = new Adapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
