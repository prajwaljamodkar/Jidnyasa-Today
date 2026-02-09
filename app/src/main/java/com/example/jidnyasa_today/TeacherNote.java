package com.example.jidnyasa_today;

/**
 * Model class for teacher notes/feedback
 * Represents daily observations from teachers
 */
public class TeacherNote {
    private String noteId;
    private String teacherName;
    private String teacherImage;
    private String noteText;
    private String date;
    private String time;
    
    // Constructor
    public TeacherNote(String noteId, String teacherName, String noteText, String date) {
        this.noteId = noteId;
        this.teacherName = teacherName;
        this.noteText = noteText;
        this.date = date;
    }
    
    // Empty constructor
    public TeacherNote() {
    }
    
    // Getters
    public String getNoteId() {
        return noteId;
    }
    
    public String getTeacherName() {
        return teacherName;
    }
    
    public String getTeacherImage() {
        return teacherImage;
    }
    
    public String getNoteText() {
        return noteText;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getTime() {
        return time;
    }
    
    // Setters
    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
    
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    public void setTeacherImage(String teacherImage) {
        this.teacherImage = teacherImage;
    }
    
    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
}
