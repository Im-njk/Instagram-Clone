package com.imnjk.instagramclone.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.imnjk.instagramclone.R;
import com.imnjk.instagramclone.modelClass.Post;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class R_post extends RecyclerView.Adapter<R_post.ViewHolder>{

    Context context;
    List<Post> object;

    public R_post(Context context, List<Post> object) {
        this.context = context;
        this.object = object;
    }

    @NonNull
    @Override
    public R_post.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lay_feed,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post p = object.get(position);
        Glide.with(context).load(object.get(position).getUserImg()).into(holder.userimg);
        holder.username_top.setText(p.getUsername());
        holder.username_below.setText(p.getUsername());
        Glide.with(context).load(p.getPostImg()).into(holder.postImg);
        holder.likes_count.setText(p.getLikes()+" likes");
        holder.comment_count.setText("View all "+p.getComments()+" comments");
        holder.caption.setText(p.getCaption());
        holder.time.setText(p.getTime());

    }

    @Override
    public int getItemCount() {
        return object.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView userimg;
        TextView username_top,likes_count,comment_count,caption,username_below,time;
        ImageView postImg,option_btn,like_btn,comment_btn,share_btn,save_btn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userimg = itemView.findViewById(R.id.feed_userImg);
            username_top = itemView.findViewById(R.id.feed_username_top);
            username_below = itemView.findViewById(R.id.feed_username_below);
            likes_count = itemView.findViewById(R.id.feed_like_count);
            comment_count = itemView.findViewById(R.id.feed_comment_count);
            caption = itemView.findViewById(R.id.feed_caption);
            time = itemView.findViewById(R.id.feed_time);
            postImg = itemView.findViewById(R.id.feed_post_img);
            option_btn = itemView.findViewById(R.id.feed_option);
            like_btn = itemView.findViewById(R.id.feed_like);
            comment_btn = itemView.findViewById(R.id.feed_comment);
            share_btn = itemView.findViewById(R.id.feed_share);
            save_btn = itemView.findViewById(R.id.feed_save);
        }
    }
}
