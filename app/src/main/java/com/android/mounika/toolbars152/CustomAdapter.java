package com.android.mounika.toolbars152;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import static com.android.mounika.toolbars152.R.id.parent;

/**
 * Created by mounika on 10/10/2017.
 */

class CustomAdapter {
    public CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>
    private final Object ViewGroup;

    {

        private ArrayList<String> mList;
        private Context mContext;

    public CustomAdapter(Context mContext, ArrayList<String> mList) {
            super();
            this.mContext = mContext;
            this.mList = mList;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder Object ViewHolder;
        (ViewHolder holder, int position) {
            holder.textView.setText(mList.get(position));
        }


        @Override
        public int getItemCount() {
            return mList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView textView;
            CardView cardView;

            public ViewHolder(View view) {
                super(view);
                textView = (TextView) view.findViewById(R.id.textview);
                cardView = (CardView) view.findViewById(R.id.myCardView);
            }