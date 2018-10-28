package com.example.richardsondeleon.quizlet;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.security.auth.Subject;


public class MainActivity extends AppCompatActivity {
    private Button button;
    ConstraintLayout myLayout;
    AnimationDrawable animationDrawable;
    private ArrayList<Subject> mSportsData;
    private RecyclerView myRecyclerView;
    private WordListAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout = (ConstraintLayout) findViewById(R.id.myLayout);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });


        animationDrawable = (AnimationDrawable) myLayout.getBackground();

        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        myRecyclerView = (RecyclerView) findViewById(R.id.recylerview);
        myAdapter = new  WordListAdapter(this, mSportsData);
        myRecyclerView.setAdapter(myAdapter);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        initializeData();


    }
    private void initializeData() {

        String[] subjectTitles = getResources().getStringArray(R.array.subject_titles);
        String[] subjectInfo = getResources().getStringArray(R.array.subject_info);

        mSportsData.clear();


        //Notify the adapter of the change
        myAdapter.notifyDataSetChanged();
    }


    public void openHomeActivity () {
        Intent intent = new Intent(this, HomeActivity1.class);
        startActivity(intent);
    }


}
