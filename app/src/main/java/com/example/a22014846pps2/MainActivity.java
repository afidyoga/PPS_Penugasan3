package com.example.a22014846pps2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.emailInfo), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Fungsi untuk membuka Instagram
    public void openInstagram(View view) {
        Intent instagramIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/afid_yoga/"));
        startActivity(instagramIntent);
    }

    // Fungsi untuk membuka Website
    public void openWebsite(View view) {
        Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pratamaputra010.blogspot.com/"));
        startActivity(websiteIntent);
    }

    // Fungsi untuk membuka Linkedin
    public void openLinkedin(View view) {
        Intent linkedinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/mohamad-afid-yoga-pratama-putra-a446271a6?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3Bf4uQN5PSQ7qsZzvMonYZjQ%3D%3D"));
        startActivity(linkedinIntent);
    }
}
