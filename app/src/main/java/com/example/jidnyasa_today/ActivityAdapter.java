package com.example.jidnyasa_today;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder> {

    private Context context;
    private List<ActivityItem> activities;

    public ActivityAdapter(Context context, List<ActivityItem> activities) {
        this.context = context;
        this.activities = activities;
    }

    @NonNull
    @Override
    public ActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_activity, parent, false);
        return new ActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivityViewHolder holder, int position) {
        ActivityItem activity = activities.get(position);

        holder.categoryText.setText(activity.getCategory());
        holder.titleText.setText(activity.getTitle());

        try {
            holder.categoryBadge.setCardBackgroundColor(
                    Color.parseColor(activity.getCategoryColor()));
        } catch (Exception e) {
            holder.categoryBadge.setCardBackgroundColor(Color.parseColor("#95A5A6"));
        }
    }

    @Override
    public int getItemCount() {
        return activities == null ? 0 : activities.size();
    }

    static class ActivityViewHolder extends RecyclerView.ViewHolder {

        CardView categoryBadge;
        TextView categoryText;
        TextView titleText;

        ActivityViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryBadge = itemView.findViewById(R.id.categoryBadge);
            categoryText = itemView.findViewById(R.id.categoryText);
            titleText = itemView.findViewById(R.id.titleText);
        }
    }
}
