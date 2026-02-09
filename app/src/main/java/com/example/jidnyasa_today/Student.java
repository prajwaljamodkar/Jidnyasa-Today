package com.example.jidnyasa_today;

/**
 * Model class to represent a Student
 * This stores all information about a child
 */
public class Student {
    // Student details
    private String studentId;
    private String name;
    private String className;  // e.g., "KG1"
    private String section;     // e.g., "Section B"
    private String profileImage;
    
    // Daily status
    private String attendanceStatus;  // "Present" or "Absent"
    private String mood;              // "Happy", "Sad", "Neutral"
    
    // Constructor - used to create a new Student object
    public Student(String studentId, String name, String className, String section) {
        this.studentId = studentId;
        this.name = name;
        this.className = className;
        this.section = section;
        this.attendanceStatus = "Present"; // Default
        this.mood = "Happy";               // Default
    }
    
    // Empty constructor (needed for some operations)
    public Student() {
    }
    
    // Getter methods - to get values
    public String getStudentId() {
        return studentId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getClassName() {
        return className;
    }
    
    public String getSection() {
        return section;
    }
    
    public String getProfileImage() {
        return profileImage;
    }
    
    public String getAttendanceStatus() {
        return attendanceStatus;
    }
    
    public String getMood() {
        return mood;
    }
    
    // Setter methods - to set/change values
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }
    
    public void setSection(String section) {
        this.section = section;
    }
    
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
    
    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
    
    public void setMood(String mood) {
        this.mood = mood;
    }
    
    // Helper method to get full class name
    public String getFullClassName() {
        return className + " • " + section;
    }
}
