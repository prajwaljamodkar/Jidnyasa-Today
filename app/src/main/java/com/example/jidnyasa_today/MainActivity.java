package com.example.jidnyasa_today;

/**
 * Model class for daily activities/focus areas
 * Represents what the child learned today
 */
public class MainActivity {
    private String activityId;
    private String category;    // "Art", "Motor Skills", "Music", etc.
    private String title;       // "Clay Modeling Basics"
    private String description;
    private String categoryColor; // Color for the category badge
    
    // Constructor
    public MainActivity(String activityId, String category, String title, String description) {
        this.activityId = activityId;
        this.category = category;
        this.title = title;
        this.description = description;
        this.categoryColor = getCategoryColor(category);
    }
    
    // Empty constructor
    public MainActivity() {
    }
    
    // Getters
    public String getActivityId() {
        return activityId;
    }
    
    public String getCategory() {
        return category;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getCategoryColor() {
        return categoryColor;
    }
    
    // Setters
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
    public void setCategory(String category) {
        this.category = category;
        this.categoryColor = getCategoryColor(category);
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    // Helper method to assign colors based on category
    private String getCategoryColor(String category) {
        switch (category) {
            case "Art":
                return "#FF6B9D"; // Pink
            case "Motor Skills":
                return "#4E9BDE"; // Blue
            case "Music":
                return "#9B59B6"; // Purple
            case "Language":
                return "#27AE60"; // Green
            case "Math":
                return "#E67E22"; // Orange
            default:
                return "#95A5A6"; // Gray
        }
    }
}
