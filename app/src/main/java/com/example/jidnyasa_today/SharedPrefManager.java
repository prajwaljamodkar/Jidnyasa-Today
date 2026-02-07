package com.jidnyasa.app.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharedPrefManager - Utility class to save and retrieve data locally
 * Used to remember login state, user details, etc.
 */
public class SharedPrefManager {
    
    // Shared preferences file name
    private static final String PREF_NAME = "JidnyasaPrefs";
    
    // Keys for storing data
    private static final String KEY_IS_LOGGED_IN = "isLoggedIn";
    private static final String KEY_PHONE_NUMBER = "phoneNumber";
    private static final String KEY_STUDENT_NAME = "studentName";
    private static final String KEY_STUDENT_CLASS = "studentClass";
    
    // Singleton instance
    private static SharedPrefManager instance;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    
    /**
     * Private constructor (Singleton pattern)
     */
    private SharedPrefManager(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
    
    /**
     * Get instance of SharedPrefManager
     * This ensures only one instance exists
     */
    public static synchronized SharedPrefManager getInstance(Context context) {
        if (instance == null) {
            instance = new SharedPrefManager(context.getApplicationContext());
        }
        return instance;
    }
    
    /**
     * Save login state
     */
    public void saveLoginState(boolean isLoggedIn) {
        editor.putBoolean(KEY_IS_LOGGED_IN, isLoggedIn);
        editor.apply(); // Save changes
    }
    
    /**
     * Check if user is logged in
     */
    public boolean isLoggedIn() {
        return sharedPreferences.getBoolean(KEY_IS_LOGGED_IN, false);
    }
    
    /**
     * Save phone number
     */
    public void savePhoneNumber(String phoneNumber) {
        editor.putString(KEY_PHONE_NUMBER, phoneNumber);
        editor.apply();
    }
    
    /**
     * Get saved phone number
     */
    public String getPhoneNumber() {
        return sharedPreferences.getString(KEY_PHONE_NUMBER, "");
    }
    
    /**
     * Save student details
     */
    public void saveStudentDetails(String name, String className) {
        editor.putString(KEY_STUDENT_NAME, name);
        editor.putString(KEY_STUDENT_CLASS, className);
        editor.apply();
    }
    
    /**
     * Get student name
     */
    public String getStudentName() {
        return sharedPreferences.getString(KEY_STUDENT_NAME, "");
    }
    
    /**
     * Get student class
     */
    public String getStudentClass() {
        return sharedPreferences.getString(KEY_STUDENT_CLASS, "");
    }
    
    /**
     * Clear all data (for logout)
     */
    public void logout() {
        editor.clear();
        editor.apply();
    }
}
