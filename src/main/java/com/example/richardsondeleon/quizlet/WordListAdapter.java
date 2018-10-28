package com.example.richardsondeleon.quizlet;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import javax.security.auth.Subject;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.ViewHolder> {
    private int selectedItem = -1;
    private LayoutInflater layoutInflater;
    private ArrayList<Subject> mSportsData;


    private Context mContext;

    WordListAdapter(Context context, ArrayList<Subject> sportsData) {
        this.mSportsData = sportsData;
        this.mContext = context;
    }


    @NonNull
    @Override
    public WordListAdapter.ViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myItemView = layoutInflater.inflate(R.layout.wordlist_item, parent, false);
        return new ViewHolder(myItemView,this);
    }

    @Override
    public void onBindViewHolder(WordListAdapter.ViewHolder currentSubject, int position) {
        Subject currentSub = mSportsData.get(position);
        currentSubject.bindTo(currentSub);
    }

    @Override
    public int getItemCount() {
        return mSportsData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView wordItemView;
        private TextView mInfoText;
        WordListAdapter myAdapter;

        public void bindTo(Subject currentSubject) {
            wordItemView.setText(Subjects.getTitle());
            mInfoText.setText(Subjects.getInfo());
        }

        public ViewHolder(View itemView) {
            super(itemView);
        }
        public ViewHolder(View itemView, WordListAdapter wordListAdapter){
            super(itemView);
            wordItemView = itemView.findViewById(R.id.item_textview);
            myAdapter = wordListAdapter;
            mInfoText = (TextView)itemView.findViewById(R.id.subTitle);
            itemView.setOnCreateContextMenuListener((View.OnCreateContextMenuListener)this);
        }

    }

}
