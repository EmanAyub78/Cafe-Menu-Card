package com.cafe.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class RecycleritemAdapter extends RecyclerView.Adapter<RecycleritemAdapter.ViewHolder> {
Context context;
ArrayList<ContactModel> arrContacts;
    RecycleritemAdapter(Context context , ArrayList<ContactModel> arrContacts){
    this.context = context;
    this.arrContacts = arrContacts;
}
    @NonNull
    @Override
    public RecycleritemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        boolean attachToRoot = false;
        View view = LayoutInflater.from(context).inflate(R.layout.item_row, parent, attachToRoot);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleritemAdapter.ViewHolder holder, int position) {
       holder.imgContact.setImageResource(arrContacts.get(position). img);
        holder.textView.setText(arrContacts.get(position). name);
        holder.textView1.setText(arrContacts.get(position). number);
    }

    @Override
    public int getItemCount() {

        return arrContacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView, textView1;
        ImageView imgContact;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textView1 = itemView.findViewById(R.id.textView2);
            imgContact = itemView.findViewById(R.id.imgContact);

        }
    }
}
