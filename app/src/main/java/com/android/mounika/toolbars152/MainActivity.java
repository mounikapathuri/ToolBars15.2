package com.android.mounika.toolbars152;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    FloatingActionButton fab;
    RecyclerView recyclerView;
    CustomAdapter customAdapter;
    ArrayList<String> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        mList = new ArrayList<>();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You Clicked on Floating Action Button..!!", Toast.LENGTH_SHORT).show();
            }
        });

        setSupportActionBar(toolbar);
        String mVersions[] = new String[]{"Alpha", "Beta", "Cupcake", "Donut", "Eclairs", "Froyo", "Gingerbread", "HoneyComb", "IceCreamSandwich"};
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        for (int i = 0; i <mVersions.length; i++) {
            mList.add(mVersions[i]);
        }
        customAdapter = new CustomAdapter(MainActivity.this, mList);
        recyclerView.setAdapter(customAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int mId = menuItem.getItemId();
        int i = 5000;
        if (mId == R.id.search) {
            Toast.makeText(this, "You Clicked on Search..!!", Toast.LENGTH_SHORT).show();
        }
        if (mId == R.id.add) {
            Toast.makeText(this, "You Clicked on Add..!!", Toast.LENGTH_SHORT).show();
        }
        if (mId == R.id.delete) {
            Toast.makeText(this, "You Clicked on Delete..!!", Toast.LENGTH_SHORT).show();
        }
        if (mId == R.id.setting) {
            Toast.makeText(this, "You Clicked on Setting..!!", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
