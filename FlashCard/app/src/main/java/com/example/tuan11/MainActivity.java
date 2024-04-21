package com.example.tuan11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Register all the ImageButtons with their appropriate IDs
        ImageButton backB = findViewById(R.id.backB);
        ImageButton logOutB = findViewById(R.id.logOutB);
        ImageButton profileB = findViewById(R.id.profileB);

        // Register all the Buttons with their appropriate IDs
        Button todoB = findViewById(R.id.todoB);
        Button editProfileB = findViewById(R.id.editProfileB);

        // Register all the card views with their appropriate IDs
        CardView contributeCard = findViewById(R.id.contributeCard);
        CardView practiceCard = findViewById(R.id.practiceCard);
        CardView learnCard = findViewById(R.id.learnCard);
        CardView interestsCard = findViewById(R.id.interestsCard);
        CardView helpCard = findViewById(R.id.helpCard);
        CardView settingsCard = findViewById(R.id.settingsCard);

        // Handle each of the image buttons with the OnClickListener
        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Back Button", Toast.LENGTH_SHORT).show();
            }
        });
        logOutB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Logout Button", Toast.LENGTH_SHORT).show();
            }
        });
        profileB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Profile Image", Toast.LENGTH_SHORT).show();
            }
        });

        // Handle each of the buttons with the OnClickListener
        todoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TODO LIST", Toast.LENGTH_SHORT).show();
            }
        });
        editProfileB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Editing Profile", Toast.LENGTH_SHORT).show();
            }
        });

        // Handle each of the cards with the OnClickListener
        contributeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Contribute Articles", Toast.LENGTH_SHORT).show();
            }
        });
        practiceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Practice Programming", Toast.LENGTH_SHORT).show();
            }
        });
        learnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Learn Programming", Toast.LENGTH_SHORT).show();
            }
        });
        interestsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Filter your Interests", Toast.LENGTH_SHORT).show();
            }
        });
        helpCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anything Help you want?", Toast.LENGTH_SHORT).show();
            }
        });
        settingsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Change the settings", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
