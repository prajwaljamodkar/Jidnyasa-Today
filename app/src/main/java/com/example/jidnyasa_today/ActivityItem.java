package com.example.jidnyasa_today;

public class ActivityItem {

    private String category;
    private String title;
    private String categoryColor;

    public ActivityItem(String category, String title, String categoryColor) {
        this.category = category;
        this.title = title;
        this.categoryColor = categoryColor;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getCategoryColor() {
        return categoryColor;
    }
}
