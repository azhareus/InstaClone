package com.example.instaclone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.parse.ParseUser;

import org.parceler.Parcels;

public class DetailedPostsActivity extends AppCompatActivity {
    //the Post to Display
    Post post;
    //the view objects
    TextView tvUsername;
    ImageView ivImage;
    TextView tvDescription;
    TextView tvCreatedAt;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_posts);
        tvUsername = findViewById(R.id.tvUsername);
        ivImage = findViewById(R.id.ivImage);
        tvDescription = findViewById(R.id.tvDescription);
        tvCreatedAt = findViewById(R.id.tvCreatedAt);

        post = Parcels.unwrap(getIntent().getParcelableExtra(Post.class.getSimpleName()));
        tvUsername.setText(post.getUser().getUsername());
        tvDescription.setText(post.getDescription());
        tvCreatedAt.setText(post.getKeyCreatedKey());
        if (post.getImage()!=null){
            Glide.with(this).load(post.getImage().getUrl()).into(ivImage);
        }

        //set the information



    }

}
