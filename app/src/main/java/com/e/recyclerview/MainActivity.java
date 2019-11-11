package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.PresidentAdapter;
import model.President;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("U.S.A Presidents");

        recyclerView = findViewById(R.id.recyclerView);

        //create a list of contacts
        List<President> presidentList = new ArrayList<>();
        presidentList.add(new President("George H. W. Bush","George H. W. Bush Was an American Politician who served as the 41st president of the United States.",R.drawable.george));
        presidentList.add(new President("Donald Trump","Donald Trump Was an American Politician who served as the 45st president of the United States.",R.drawable.trump));

        presidentList.add(new President("James Buchanan","James Buchanan Was an American Politician who served as the 15th president of the United States.",R.drawable.james));
        presidentList.add(new President("Ronald Reagan","Ronald Reagan as an American Politician who served as the 40st president of the United States.",R.drawable.ronald));

        presidentList.add(new President("William Henry Harrison","William Henry Harrison Was an American Politician who served as the 9th president of the United States.",R.drawable.willam));
        presidentList.add(new President("Zachary Taylor","Zachary Taylor Was an American Politician who served as the 12th president of the United States.",R.drawable.taylor));


///       Pass List to adapter class
        PresidentAdapter presidentAdapter = new PresidentAdapter(this, presidentList);
        recyclerView.setAdapter(presidentAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
