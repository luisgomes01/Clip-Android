package com.clip.clip;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    private List<Bill> billList;

    public recyclerAdapter(List<Bill> billList) {
        this.billList = billList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView billText;

        public MyViewHolder(final View view) {
            super(view);
            billText = view.findViewById(R.id.textView);
        }
    }

    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        String finalText = billList.get(position).getBill();
        holder.billText.setText(finalText);
    }

    @Override
    public int getItemCount() {
        return billList.size();
    }
}
