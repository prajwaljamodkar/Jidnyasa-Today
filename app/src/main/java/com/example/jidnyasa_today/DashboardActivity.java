package com.jidnyasa.app.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.jidnyasa.app.adapters.ActivityAdapter;
import com.jidnyasa.app.models.Activity;
import com.jidnyasa.app.models.Student;
import com.jidnyasa.app.models.TeacherNote;

import java.util.ArrayList;
import java.util.List;

/**
 * DashboardActivity - Main screen after login
 * Shows student info, attendance, mood, activities, and teacher notes
 */
public class DashboardActivity extends AppCompatActivity {
    
    // UI Elements
    private TextView greetingText;
    private TextView studentNameText;
    private TextView studentClassText;
    private TextView attendanceStatusText;
    private TextView moodText;
    private TextView teacherNoteText;
    private TextView teacherNameText;
    
    private RecyclerView activitiesRecyclerView;
    private ActivityAdapter activityAdapter;
    
    private CardView growthJournalCard;
    private CardView mediaGalleryCard;
    private CardView latestNewsCard;
    
    private BottomNavigationView bottomNavigationView;
    
    // Data
    private Student currentStudent;
    private List<Activity> todaysActivities;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        
        // Initialize UI elements
        initializeViews();
        
        // Load student data
        loadStudentData();
        
        // Setup activities list
        setupActivitiesList();
        
        // Setup card clicks
        setupCardClicks();
        
        // Setup bottom navigation
        setupBottomNavigation();
    }
    
    /**
     * Initialize all UI elements
     */
    private void initializeViews() {
        greetingText = findViewById(R.id.greetingText);
        studentNameText = findViewById(R.id.studentNameText);
        studentClassText = findViewById(R.id.studentClassText);
        attendanceStatusText = findViewById(R.id.attendanceStatusText);
        moodText = findViewById(R.id.moodText);
        teacherNoteText = findViewById(R.id.teacherNoteText);
        teacherNameText = findViewById(R.id.teacherNameText);
        activitiesRecyclerView = findViewById(R.id.activitiesRecyclerView);
        growthJournalCard = findViewById(R.id.growthJournalCard);
        mediaGalleryCard = findViewById(R.id.mediaGalleryCard);
        latestNewsCard = findViewById(R.id.latestNewsCard);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        
        // Set greeting based on time of day
        setGreeting();
    }
    
    /**
     * Set greeting text based on current time
     */
    private void setGreeting() {
        int hour = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY);
        String greeting;
        
        if (hour < 12) {
            greeting = "Good morning";
        } else if (hour < 17) {
            greeting = "Good afternoon";
        } else {
            greeting = "Good evening";
        }
        
        greetingText.setText(greeting + ", Parent 👋");
    }
    
    /**
     * Load student data (from API in real app)
     */
    private void loadStudentData() {
        // Demo data - In real app, fetch from API
        currentStudent = new Student("ST001", "Aarav", "KG1", "Section B");
        currentStudent.setAttendanceStatus("Present");
        currentStudent.setMood("Happy");
        
        // Update UI with student data
        studentNameText.setText(currentStudent.getName());
        studentClassText.setText(currentStudent.getFullClassName());
        attendanceStatusText.setText(currentStudent.getAttendanceStatus());
        moodText.setText(currentStudent.getMood());
        
        // Load teacher note
        loadTeacherNote();
    }
    
    /**
     * Load today's teacher note
     */
    private void loadTeacherNote() {
        // Demo data
        TeacherNote note = new TeacherNote(
            "N001",
            "Ms. Sarah",
            "Aarav was very helpful during cleanup time today! He helped organize all the art supplies.",
            "Today"
        );
        
        teacherNoteText.setText(note.getNoteText());
        teacherNameText.setText(note.getTeacherName());
    }
    
    /**
     * Setup activities RecyclerView
     */
    private void setupActivitiesList() {
        // Demo activities data
        todaysActivities = new ArrayList<>();
        todaysActivities.add(new Activity("A001", "Art", "Clay Modeling Basics", "Learning to shape clay"));
        todaysActivities.add(new Activity("A002", "Motor Skills", "Finger Painting Session", "Developing fine motor skills"));
        
        // Setup RecyclerView
        activityAdapter = new ActivityAdapter(this, todaysActivities);
        activitiesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        activitiesRecyclerView.setAdapter(activityAdapter);
    }
    
    /**
     * Setup card click listeners
     */
    private void setupCardClicks() {
        growthJournalCard.setOnClickListener(v -> {
            // Navigate to Growth Journal
            Toast.makeText(this, "Opening Growth Journal", Toast.LENGTH_SHORT).show();
            // Intent intent = new Intent(this, GrowthJournalActivity.class);
            // startActivity(intent);
        });
        
        mediaGalleryCard.setOnClickListener(v -> {
            // Navigate to Media Gallery
            Toast.makeText(this, "Opening Media Gallery", Toast.LENGTH_SHORT).show();
            // Intent intent = new Intent(this, MediaGalleryActivity.class);
            // startActivity(intent);
        });
        
        latestNewsCard.setOnClickListener(v -> {
            // Navigate to Announcements
            Toast.makeText(this, "Opening Latest News", Toast.LENGTH_SHORT).show();
            // Intent intent = new Intent(this, AnnouncementsActivity.class);
            // startActivity(intent);
        });
    }
    
    /**
     * Setup bottom navigation
     */
    private void setupBottomNavigation() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                
                if (itemId == R.id.nav_home) {
                    // Already on home
                    return true;
                } else if (itemId == R.id.nav_chat) {
                    Toast.makeText(DashboardActivity.this, "Chat feature coming soon", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.nav_events) {
                    Toast.makeText(DashboardActivity.this, "Events feature coming soon", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.nav_profile) {
                    Toast.makeText(DashboardActivity.this, "Profile feature coming soon", Toast.LENGTH_SHORT).show();
                    return true;
                }
                
                return false;
            }
        });
    }
}
