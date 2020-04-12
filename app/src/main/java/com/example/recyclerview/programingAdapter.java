package com.example.recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class programingAdapter extends RecyclerView.Adapter<programingAdapter.programingviewholder> {
    public String[] data;
    public programingAdapter(String[] data){
        this.data=data;
    }


    @NonNull
    @Override
    public programingviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item ,parent, false);

        return new programingviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull programingviewholder holder, int position) {
        String title = data[position];
        holder.texttitle.setText(title);


    }


    @Override
    public int getItemCount() {
        return data.length;
    }

    public class programingviewholder extends RecyclerView.ViewHolder {
        ImageView Imgicon;
        TextView texttitle;
        public programingviewholder(@NonNull View itemView) {

            super(itemView);
            Imgicon=itemView.findViewById(R.id.Imgicon);
            texttitle=itemView.findViewById(R.id.texttitle);
        }
    }
}
