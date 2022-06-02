package com.imnjk.instagramclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

import com.imnjk.instagramclone.adapters.R_stories;
import com.imnjk.instagramclone.fragments.activityFragment;
import com.imnjk.instagramclone.fragments.feedFragment;
import com.imnjk.instagramclone.fragments.profileFragment;
import com.imnjk.instagramclone.fragments.reelFragment;
import com.imnjk.instagramclone.fragments.searchFragment;
import com.imnjk.instagramclone.modelClass.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    ImageView home_btn,search_btn,reel_btn,activity_btn,profile_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home_btn = findViewById(R.id.main_home_btn);
        search_btn = findViewById(R.id.main_search_btn);
        reel_btn = findViewById(R.id.main_reel_btn);
        activity_btn = findViewById(R.id.main_activity_btn);
        profile_btn = findViewById(R.id.main_profile_btn);
        replace_fragment(new feedFragment());

        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replace_fragment(new feedFragment());
                home_btn.setImageResource(R.drawable.ic_home_selected);
                search_btn.setImageResource(R.drawable.ic_search_unselected);
                activity_btn.setImageResource(R.drawable.ic_heart_outline);
            }
        });

        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replace_fragment(new searchFragment());
                home_btn.setImageResource(R.drawable.ic_home_unselected);
                search_btn.setImageResource(R.drawable.ic_search_selected);
                activity_btn.setImageResource(R.drawable.ic_heart_outline);
            }
        });

        reel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replace_fragment(new reelFragment());
                home_btn.setImageResource(R.drawable.ic_home_unselected);
                search_btn.setImageResource(R.drawable.ic_search_unselected);
                activity_btn.setImageResource(R.drawable.ic_heart_outline);

            }
        });

        activity_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replace_fragment(new activityFragment());
                home_btn.setImageResource(R.drawable.ic_home_unselected);
                search_btn.setImageResource(R.drawable.ic_search_unselected);
                activity_btn.setImageResource(R.drawable.ic_heart_fill);
            }
        });

        profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replace_fragment(new profileFragment());
                home_btn.setImageResource(R.drawable.ic_home_unselected);
                search_btn.setImageResource(R.drawable.ic_search_unselected);
                activity_btn.setImageResource(R.drawable.ic_heart_outline);
            }
        });

    }
    void replace_fragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_frame,fragment);
        transaction.commit();
    }


}