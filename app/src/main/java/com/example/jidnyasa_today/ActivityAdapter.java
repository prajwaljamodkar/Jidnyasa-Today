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

import com.jidnyasa.app.models.Activity;

import java.util.List;

/**
 * ActivityAdapter - Adapter for displaying activities in RecyclerView
 * This connects your data (List of Activities) to the UI (RecyclerView)
 */
public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder> {
    
    private Context context;
    private List<Activity> activities;
    
    // Constructor
    public ActivityAdapter(Context context, List<Activity> activities) {
        this.context = context;
        this.activities = activities;
    }
    
    /**
     * Called when RecyclerView needs a new ViewHolder
     */
    @NonNull
    @Override
    public ActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item layout
        View view = LayoutInflater.from(context).inflate(R.layout.item_activity, parent, false);
        return new ActivityViewHolder(view);
    }
    
    /**
     * Called to display data at a specific position
     */
    @Override
    public void onBindViewHolder(@NonNull ActivityViewHolder holder, int position) {
        Activity activity = activities.get(position);
        
        // Set data to views
        holder.categoryText.setText(activity.getCategory());
        holder.titleText.setText(activity.getTitle());
        
        // Set category color
        try {
            holder.categoryBadge.setCardBackgroundColor(Color.parseColor(activity.getCategoryColor()));
        } catch (Exception e) {
            // Default color if parsing fails
            holder.categoryBadge.setCardBackgroundColor(Color.parseColor("#95A5A6"));
        }
    }
    
    /**
     * Returns total number of items
     */
    @Override
    public int getItemCount() {
        return activities.size();
    }
    
    /**
     * ViewHolder class - holds references to views in each item
     * This improves performance by not calling findViewById repeatedly
     */
    public static class ActivityViewHolder extends RecyclerView.ViewHolder {
        
        CardView categoryBadge;
        TextView categoryText;
        TextView titleText;
        
        public ActivityViewHolder(@NonNull View itemView) {
            super(itemView);
            
            // Find views in the item layout
            categoryBadge = itemView.findViewById(R.id.categoryBadge);
            categoryText = itemView.findViewById(R.id.categoryText);
            titleText = itemView.findViewById(R.id.titleText);
        }
    }
    
    /**
     * Method to update data
     */
    public void updateData(List<Activity> newActivities) {
        this.activities = newActivities;
        notifyDataSetChanged(); // Refresh the RecyclerView
    }
}
