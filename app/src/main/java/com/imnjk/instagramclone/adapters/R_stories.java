package com.imnjk.instagramclone.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.imnjk.instagramclone.R;
import com.imnjk.instagramclone.modelClass.User;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class R_stories extends RecyclerView.Adapter<R_stories.ViewHolder>{
    private Context context;
    private List<User> object;

    public R_stories(Context context, List<User> object) {
        this.context = context;
        this.object = object;
    }

    @NonNull
    @Override
    public R_stories.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lay_story,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull R_stories.ViewHolder holder, int position) {
        holder.R_st_username.setText(object.get(position).getUsername());
        Glide.with(context).load(object.get(position).getUserimg()).into((ImageView) holder.R_st_dp);
    }

    @Override
    public int getItemCount() {
        return object.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        CircleImageView R_st_dp;
        TextView R_st_username;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            R_st_dp = itemView.findViewById(R.id.st_dp);
            R_st_username = itemView.findViewById(R.id.st_username);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
