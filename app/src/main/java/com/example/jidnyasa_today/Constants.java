package com.example.jidnyasa_today;

/**
 * Constants - Store all constant values used in the app
 * This makes it easy to change values in one place
 */
public class Constants {
    
    // API Base URL (when you connect to backend)
    public static final String BASE_URL = "https://api.jidnyasa.com/";
    
    // Demo OTP for testing
    public static final String DEMO_OTP = "123456";
    
    // SharedPreferences Keys
    public static final String PREF_NAME = "JidnyasaPrefs";
    public static final String KEY_IS_LOGGED_IN = "isLoggedIn";
    public static final String KEY_PHONE_NUMBER = "phoneNumber";
    public static final String KEY_USER_TOKEN = "userToken";
    public static final String KEY_STUDENT_ID = "studentId";
    
    // Request Codes for Intents
    public static final int REQUEST_CODE_CAMERA = 100;
    public static final int REQUEST_CODE_GALLERY = 101;
    
    // Date Formats
    public static final String DATE_FORMAT = "dd MMM yyyy";
    public static final String TIME_FORMAT = "hh:mm a";
    public static final String DATE_TIME_FORMAT = "dd MMM yyyy, hh:mm a";
    
    // Item Limits
    public static final int MAX_IMAGES_UPLOAD = 10;
    public static final int PAGE_SIZE = 20; // For pagination
    
    // Activity Categories
    public static final String CATEGORY_ART = "Art";
    public static final String CATEGORY_MOTOR_SKILLS = "Motor Skills";
    public static final String CATEGORY_MUSIC = "Music";
    public static final String CATEGORY_LANGUAGE = "Language";
    public static final String CATEGORY_MATH = "Math";
    public static final String CATEGORY_SCIENCE = "Science";
    
    // Mood Types
    public static final String MOOD_HAPPY = "Happy";
    public static final String MOOD_SAD = "Sad";
    public static final String MOOD_NEUTRAL = "Neutral";
    public static final String MOOD_EXCITED = "Excited";
    
    // Attendance Status
    public static final String ATTENDANCE_PRESENT = "Present";
    public static final String ATTENDANCE_ABSENT = "Absent";
    public static final String ATTENDANCE_HALF_DAY = "Half Day";
    
    // Error Messages
    public static final String ERROR_NETWORK = "Please check your internet connection";
    public static final String ERROR_SERVER = "Server error. Please try again later";
    public static final String ERROR_INVALID_PHONE = "Please enter a valid phone number";
    public static final String ERROR_INVALID_OTP = "Invalid OTP. Please try again";
    public static final String ERROR_SESSION_EXPIRED = "Your session has expired. Please login again";
    
    // Success Messages
    public static final String SUCCESS_LOGIN = "Login successful!";
    public static final String SUCCESS_OTP_SENT = "OTP sent successfully";
    public static final String SUCCESS_DATA_SAVED = "Data saved successfully";
    
    // Private constructor to prevent instantiation
    private Constants() {
        // This class is not meant to be instantiated
    }
}
