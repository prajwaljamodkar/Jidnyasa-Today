# XML Layout Files for Jidnyasa App

All these files go in: `app/src/main/res/layout/`

---

## 1. activity_login.xml
Login screen layout

```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F8F9FA"
    android:fillViewport="true">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="24dp"
        android:gravity="center">

        <!-- Logo -->
        <ImageView
            android:layout_width="120dp"
            android:layout_height="120dp"
            android:layout_marginTop="60dp"
            android:src="@drawable/ic_app_logo"
            android:contentDescription="Jidnyasa Logo" />

        <!-- Greeting -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="24dp"
            android:text="HELLO FRIEND! 👋"
            android:textColor="#7FA8A0"
            android:textSize="16sp"
            android:letterSpacing="0.1" />

        <!-- Welcome Title -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:text="Welcome to"
            android:textColor="#2C3E50"
            android:textSize="32sp"
            android:textStyle="bold" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Jidnyasa"
            android:textColor="#FF6B6B"
            android:textSize="36sp"
            android:textStyle="bold" />

        <!-- Subtitle -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="12dp"
            android:text="Let's explore the world of curiosity\ntogether. Ask your parent to help\nyou log in!"
            android:textColor="#7F8C8D"
            android:textSize="14sp"
            android:gravity="center"
            android:lineSpacingExtra="4dp" />

        <!-- Phone Number Label -->
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="60dp"
            android:text="PARENT'S PHONE NUMBER"
            android:textColor="#2C3E50"
            android:textSize="14sp"
            android:textStyle="bold"
            android:letterSpacing="0.05" />

        <!-- Phone Input Card -->
        <androidx.cardview.widget.CardView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="12dp"
            app:cardCornerRadius="30dp"
            app:cardElevation="0dp"
            android:backgroundTint="#FFFFFF">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:padding="16dp"
                android:gravity="center_vertical">

                <!-- Country Flag -->
                <ImageView
                    android:layout_width="32dp"
                    android:layout_height="24dp"
                    android:src="@drawable/ic_flag_india"
                    android:contentDescription="India Flag" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginStart="8dp"
                    android:text="+91"
                    android:textColor="#2C3E50"
                    android:textSize="18sp"
                    android:textStyle="bold" />

                <View
                    android:layout_width="1dp"
                    android:layout_height="match_parent"
                    android:layout_marginHorizontal="12dp"
                    android:background="#E0E0E0" />

                <!-- Phone Number Input -->
                <EditText
                    android:id="@+id/phoneNumberInput"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:background="@android:color/transparent"
                    android:hint="98765 43210"
                    android:textColorHint="#CCCCCC"
                    android:textColor="#2C3E50"
                    android:textSize="18sp"
                    android:inputType="phone"
                    android:maxLength="10" />

                <!-- Keyboard Icon -->
                <ImageView
                    android:layout_width="24dp"
                    android:layout_height="24dp"
                    android:src="@drawable/ic_keyboard"
                    android:tint="#FFD93D"
                    android:contentDescription="Keyboard" />
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <!-- Get OTP Button -->
        <Button
            android:id="@+id/getOtpButton"
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:layout_marginTop="24dp"
            android:text="Get OTP 🚀"
            android:textColor="#FFFFFF"
            android:textSize="18sp"
            android:textStyle="bold"
            android:background="@drawable/bg_rounded_button"
            android:backgroundTint="#FF6B6B" />

        <!-- Terms -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:text="By continuing, you agree to our Terms of Service"
            android:textColor="#95A5A6"
            android:textSize="12sp" />

        <!-- Privacy Badges -->
        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="32dp"
            android:orientation="horizontal">

            <androidx.cardview.widget.CardView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginEnd="8dp"
                app:cardCornerRadius="20dp"
                app:cardElevation="0dp"
                android:backgroundTint="#E8F5F4">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:padding="12dp"
                    android:text="✓ PRIVACY-FIRST"
                    android:textColor="#45B7A8"
                    android:textSize="12sp"
                    android:textStyle="bold" />
            </androidx.cardview.widget.CardView>

            <androidx.cardview.widget.CardView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:cardCornerRadius="20dp"
                app:cardElevation="0dp"
                android:backgroundTint="#E8F5F4">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:padding="12dp"
                    android:text="☺ CHILD-SAFE"
                    android:textColor="#45B7A8"
                    android:textSize="12sp"
                    android:textStyle="bold" />
            </androidx.cardview.widget.CardView>
        </LinearLayout>

    </LinearLayout>
</ScrollView>
```

---

## 2. activity_otp.xml
OTP verification screen

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#F8F9FA"
    android:padding="24dp">

    <!-- Back Button -->
    <ImageButton
        android:id="@+id/backButton"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:background="?attr/selectableItemBackgroundBorderless"
        android:src="@drawable/ic_back"
        android:contentDescription="Go back" />

    <!-- Title -->
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:text="Enter OTP"
        android:textColor="#2C3E50"
        android:textSize="32sp"
        android:textStyle="bold" />

    <!-- Subtitle -->
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="8dp"
        android:text="We've sent a 6-digit code to"
        android:textColor="#7F8C8D"
        android:textSize="14sp" />

    <TextView
        android:id="@+id/phoneNumberText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="4dp"
        android:text="+91 98765 43210"
        android:textColor="#2C3E50"
        android:textSize="16sp"
        android:textStyle="bold" />

    <!-- OTP Input -->
    <EditText
        android:id="@+id/otpInput"
        android:layout_width="match_parent"
        android:layout_height="70dp"
        android:layout_marginTop="32dp"
        android:background="@drawable/bg_input_field"
        android:hint="Enter 6-digit OTP"
        android:inputType="number"
        android:maxLength="6"
        android:padding="20dp"
        android:textColor="#2C3E50"
        android:textSize="24sp"
        android:textStyle="bold"
        android:gravity="center"
        android:letterSpacing="0.3" />

    <!-- Verify Button -->
    <Button
        android:id="@+id/verifyButton"
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:layout_marginTop="24dp"
        android:text="Verify OTP"
        android:textColor="#FFFFFF"
        android:textSize="18sp"
        android:textStyle="bold"
        android:background="@drawable/bg_rounded_button"
        android:backgroundTint="#4ECDC4" />

    <!-- Resend OTP -->
    <TextView
        android:id="@+id/resendOtpText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_marginTop="24dp"
        android:text="Didn't receive OTP? Resend"
        android:textColor="#4ECDC4"
        android:textSize="14sp"
        android:textStyle="bold"
        android:clickable="true"
        android:focusable="true" />

</LinearLayout>
```

---

## 3. activity_dashboard.xml
Main dashboard screen

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.coordinatorlayout.widget.CoordinatorLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F8F9FA">

    <!-- Main Content -->
    <androidx.core.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginBottom="56dp">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:padding="20dp">

            <!-- Header -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:gravity="center_vertical">

                <ImageButton
                    android:id="@+id/menuButton"
                    android:layout_width="48dp"
                    android:layout_height="48dp"
                    android:background="?attr/selectableItemBackgroundBorderless"
                    android:src="@drawable/ic_menu"
                    android:contentDescription="Menu" />

                <View
                    android:layout_width="0dp"
                    android:layout_height="1dp"
                    android:layout_weight="1" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Profile"
                    android:textColor="#2C3E50"
                    android:textSize="16sp"
                    android:textStyle="bold"
                    android:drawableStart="@drawable/ic_profile"
                    android:drawablePadding="8dp" />
            </LinearLayout>

            <!-- Greeting -->
            <TextView
                android:id="@+id/greetingText"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:text="Good evening,\nParent 👋"
                android:textColor="#2C3E50"
                android:textSize="28sp"
                android:textStyle="bold"
                android:lineSpacingExtra="4dp" />

            <!-- Student Card -->
            <androidx.cardview.widget.CardView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                app:cardCornerRadius="20dp"
                app:cardElevation="2dp"
                android:backgroundTint="#FFFFFF">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="horizontal"
                    android:padding="20dp"
                    android:gravity="center_vertical">

                    <!-- Student Avatar -->
                    <ImageView
                        android:id="@+id/studentAvatar"
                        android:layout_width="60dp"
                        android:layout_height="60dp"
                        android:src="@drawable/ic_student_avatar"
                        android:contentDescription="Student photo" />

                    <!-- Student Info -->
                    <LinearLayout
                        android:layout_width="0dp"
                        android:layout_height="wrap_content"
                        android:layout_weight="1"
                        android:layout_marginStart="16dp"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/studentNameText"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:text="Aarav"
                            android:textColor="#2C3E50"
                            android:textSize="20sp"
                            android:textStyle="bold" />

                        <TextView
                            android:id="@+id/studentClassText"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="4dp"
                            android:text="KG1 • Section B"
                            android:textColor="#7F8C8D"
                            android:textSize="14sp" />
                    </LinearLayout>

                    <!-- Dropdown Icon -->
                    <ImageView
                        android:layout_width="24dp"
                        android:layout_height="24dp"
                        android:src="@drawable/ic_dropdown"
                        android:tint="#CCCCCC"
                        android:contentDescription="More" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <!-- Attendance & Mood -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:orientation="horizontal">

                <!-- Attendance Card -->
                <androidx.cardview.widget.CardView
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:layout_marginEnd="8dp"
                    app:cardCornerRadius="20dp"
                    app:cardElevation="2dp"
                    android:backgroundTint="#FFFFFF">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="vertical"
                        android:padding="20dp"
                        android:gravity="center">

                        <!-- Check Icon -->
                        <ImageView
                            android:layout_width="40dp"
                            android:layout_height="40dp"
                            android:src="@drawable/ic_check"
                            android:background="@drawable/bg_circle"
                            android:backgroundTint="#C8E6C9"
                            android:padding="8dp"
                            android:tint="#45B7A8"
                            android:contentDescription="Check" />

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="12dp"
                            android:text="ATTENDANCE"
                            android:textColor="#7F8C8D"
                            android:textSize="11sp"
                            android:letterSpacing="0.1" />

                        <TextView
                            android:id="@+id/attendanceStatusText"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="4dp"
                            android:text="Present"
                            android:textColor="#2C3E50"
                            android:textSize="18sp"
                            android:textStyle="bold" />
                    </LinearLayout>
                </androidx.cardview.widget.CardView>

                <!-- Mood Card -->
                <androidx.cardview.widget.CardView
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:layout_marginStart="8dp"
                    app:cardCornerRadius="20dp"
                    app:cardElevation="2dp"
                    android:backgroundTint="#FFFFFF">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="vertical"
                        android:padding="20dp"
                        android:gravity="center">

                        <!-- Smile Icon -->
                        <ImageView
                            android:layout_width="40dp"
                            android:layout_height="40dp"
                            android:src="@drawable/ic_smile"
                            android:background="@drawable/bg_circle"
                            android:backgroundTint="#FFF9C4"
                            android:padding="8dp"
                            android:tint="#FFD93D"
                            android:contentDescription="Happy" />

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="12dp"
                            android:text="MOOD"
                            android:textColor="#7F8C8D"
                            android:textSize="11sp"
                            android:letterSpacing="0.1" />

                        <TextView
                            android:id="@+id/moodText"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="4dp"
                            android:text="Happy"
                            android:textColor="#2C3E50"
                            android:textSize="18sp"
                            android:textStyle="bold" />
                    </LinearLayout>
                </androidx.cardview.widget.CardView>
            </LinearLayout>

            <!-- Today's Focus -->
            <androidx.cardview.widget.CardView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                app:cardCornerRadius="20dp"
                app:cardElevation="2dp"
                android:backgroundTint="#FFD93D">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:padding="20dp">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="horizontal"
                        android:gravity="center_vertical">

                        <TextView
                            android:layout_width="0dp"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:text="Today's Focus"
                            android:textColor="#2C3E50"
                            android:textSize="20sp"
                            android:textStyle="bold" />

                        <ImageView
                            android:layout_width="24dp"
                            android:layout_height="24dp"
                            android:src="@drawable/ic_bulb"
                            android:contentDescription="Idea" />
                    </LinearLayout>

                    <!-- Activities RecyclerView -->
                    <androidx.recyclerview.widget.RecyclerView
                        android:id="@+id/activitiesRecyclerView"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="16dp"
                        android:nestedScrollingEnabled="false" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <!-- Teacher's Note -->
            <androidx.cardview.widget.CardView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                app:cardCornerRadius="20dp"
                app:cardElevation="2dp"
                android:backgroundTint="#E0F7FA">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:padding="20dp">

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="💬 TEACHER'S NOTE"
                        android:textColor="#4ECDC4"
                        android:textSize="12sp"
                        android:textStyle="bold"
                        android:letterSpacing="0.1" />

                    <TextView
                        android:id="@+id/teacherNoteText"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="12dp"
                        android:text="Aarav was very helpful during cleanup time today! He helped organize all the art supplies."
                        android:textColor="#2C3E50"
                        android:textSize="16sp"
                        android:lineSpacingExtra="4dp" />

                    <LinearLayout
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="16dp"
                        android:orientation="horizontal"
                        android:gravity="center_vertical">

                        <ImageView
                            android:layout_width="32dp"
                            android:layout_height="32dp"
                            android:src="@drawable/ic_teacher"
                            android:contentDescription="Teacher" />

                        <TextView
                            android:id="@+id/teacherNameText"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginStart="8dp"
                            android:text="Ms. Sarah"
                            android:textColor="#7F8C8D"
                            android:textSize="14sp" />
                    </LinearLayout>
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <!-- Quick Actions -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:orientation="horizontal">

                <!-- Growth Journal -->
                <androidx.cardview.widget.CardView
                    android:id="@+id/growthJournalCard"
                    android:layout_width="0dp"
                    android:layout_height="120dp"
                    android:layout_weight="1"
                    android:layout_marginEnd="8dp"
                    app:cardCornerRadius="20dp"
                    app:cardElevation="2dp"
                    android:backgroundTint="#FF9E9E"
                    android:clickable="true"
                    android:focusable="true"
                    android:foreground="?attr/selectableItemBackground">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:orientation="vertical"
                        android:padding="16dp"
                        android:gravity="center">

                        <ImageView
                            android:layout_width="40dp"
                            android:layout_height="40dp"
                            android:src="@drawable/ic_journal"
                            android:tint="#FFFFFF"
                            android:contentDescription="Journal" />

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="8dp"
                            android:text="Growth\nJournal"
                            android:textColor="#FFFFFF"
                            android:textSize="14sp"
                            android:textStyle="bold"
                            android:gravity="center" />
                    </LinearLayout>
                </androidx.cardview.widget.CardView>

                <!-- Media Gallery -->
                <androidx.cardview.widget.CardView
                    android:id="@+id/mediaGalleryCard"
                    android:layout_width="0dp"
                    android:layout_height="120dp"
                    android:layout_weight="1"
                    android:layout_marginHorizontal="8dp"
                    app:cardCornerRadius="20dp"
                    app:cardElevation="2dp"
                    android:backgroundTint="#4ECDC4"
                    android:clickable="true"
                    android:focusable="true"
                    android:foreground="?attr/selectableItemBackground">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:orientation="vertical"
                        android:padding="16dp"
                        android:gravity="center">

                        <ImageView
                            android:layout_width="40dp"
                            android:layout_height="40dp"
                            android:src="@drawable/ic_gallery"
                            android:tint="#FFFFFF"
                            android:contentDescription="Gallery" />

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="8dp"
                            android:text="Media\nGallery"
                            android:textColor="#FFFFFF"
                            android:textSize="14sp"
                            android:textStyle="bold"
                            android:gravity="center" />
                    </LinearLayout>
                </androidx.cardview.widget.CardView>

                <!-- Latest News -->
                <androidx.cardview.widget.CardView
                    android:id="@+id/latestNewsCard"
                    android:layout_width="0dp"
                    android:layout_height="120dp"
                    android:layout_weight="1"
                    android:layout_marginStart="8dp"
                    app:cardCornerRadius="20dp"
                    app:cardElevation="2dp"
                    android:backgroundTint="#2C5C5A"
                    android:clickable="true"
                    android:focusable="true"
                    android:foreground="?attr/selectableItemBackground">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:orientation="vertical"
                        android:padding="16dp"
                        android:gravity="center">

                        <ImageView
                            android:layout_width="40dp"
                            android:layout_height="40dp"
                            android:src="@drawable/ic_megaphone"
                            android:tint="#FFFFFF"
                            android:contentDescription="News" />

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="8dp"
                            android:text="Latest\nNews"
                            android:textColor="#FFFFFF"
                            android:textSize="14sp"
                            android:textStyle="bold"
                            android:gravity="center" />
                    </LinearLayout>
                </androidx.cardview.widget.CardView>
            </LinearLayout>

        </LinearLayout>
    </androidx.core.widget.NestedScrollView>

    <!-- Bottom Navigation -->
    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNavigationView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom"
        android:background="#FFFFFF"
        app:menu="@menu/bottom_nav_menu"
        app:itemIconTint="@color/bottom_nav_color"
        app:itemTextColor="@color/bottom_nav_color"
        app:labelVisibilityMode="labeled" />

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

---

## 4. item_activity.xml
Layout for each activity item in RecyclerView

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginBottom="12dp"
    android:orientation="horizontal"
    android:gravity="center_vertical">

    <!-- Star Icon -->
    <ImageView
        android:layout_width="20dp"
        android:layout_height="20dp"
        android:src="@drawable/ic_star"
        android:tint="#E67E22"
        android:contentDescription="Activity" />

    <!-- Activity Title -->
    <TextView
        android:id="@+id/titleText"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:layout_marginStart="12dp"
        android:text="Clay Modeling Basics"
        android:textColor="#2C3E50"
        android:textSize="15sp" />

    <!-- Category Badge -->
    <androidx.cardview.widget.CardView
        android:id="@+id/categoryBadge"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:cardCornerRadius="12dp"
        app:cardElevation="0dp"
        android:backgroundTint="#FF6B9D">

        <TextView
            android:id="@+id/categoryText"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:padding="6dp"
            android:paddingHorizontal="12dp"
            android:text="Art"
            android:textColor="#FFFFFF"
            android:textSize="11sp"
            android:textStyle="bold" />
    </androidx.cardview.widget.CardView>

</LinearLayout>
```

---

## 5. Drawable Resources

Create these files in `app/src/main/res/drawable/`

### bg_rounded_button.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <corners android:radius="30dp" />
    <solid android:color="#FF6B6B" />
</shape>
```

### bg_input_field.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <corners android:radius="16dp" />
    <solid android:color="#FFFFFF" />
    <stroke
        android:width="2dp"
        android:color="#E0E0E0" />
</shape>
```

### bg_circle.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="oval">
    <solid android:color="#C8E6C9" />
</shape>
```

---

## 6. Menu Resource

Create `app/src/main/res/menu/bottom_nav_menu.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/nav_home"
        android:icon="@drawable/ic_home"
        android:title="Home" />
    
    <item
        android:id="@+id/nav_chat"
        android:icon="@drawable/ic_chat"
        android:title="Chat" />
    
    <item
        android:id="@+id/nav_events"
        android:icon="@drawable/ic_calendar"
        android:title="Events" />
    
    <item
        android:id="@+id/nav_profile"
        android:icon="@drawable/ic_profile"
        android:title="Profile" />
</menu>
```

---

## 7. Colors Resource

Update `app/src/main/res/values/colors.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="colorPrimary">#FF6B6B</color>
    <color name="colorPrimaryDark">#E55555</color>
    <color name="colorAccent">#4ECDC4</color>
    <color name="colorBackground">#F8F9FA</color>
    <color name="colorTextPrimary">#2C3E50</color>
    <color name="colorTextSecondary">#7F8C8D</color>
    <color name="colorYellow">#FFD93D</color>
    <color name="white">#FFFFFF</color>
    <color name="black">#000000</color>
</resources>
```

---

## 8. Strings Resource

Update `app/src/main/res/values/strings.xml`

```xml
<resources>
    <string name="app_name">Jidnyasa</string>
    <string name="hello_friend">HELLO FRIEND! 👋</string>
    <string name="welcome_to">Welcome to</string>
    <string name="jidnyasa">Jidnyasa</string>
    <string name="subtitle">Let\'s explore the world of curiosity together. Ask your parent to help you log in!</string>
    <string name="parent_phone_number">PARENT\'S PHONE NUMBER</string>
    <string name="get_otp">Get OTP 🚀</string>
    <string name="terms">By continuing, you agree to our Terms of Service</string>
</resources>
```

---

These are the main XML files you'll need. Place them in the correct folders and they'll work with the Java code I provided!
