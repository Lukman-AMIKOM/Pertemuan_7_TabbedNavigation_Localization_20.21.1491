package com.pam.pertemuan_7_tabbednavigation_localization_20211491;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ListViewHolder> {
    
    private ArrayList<Movie> listMovie;
    
    public MovieAdapter(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }
    
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(view);
    }
    
    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Movie movie = listMovie.get(position);
        
        holder.txtTitle.setText(movie.getTitle());
        holder.txtYear.setText(movie.getYear());
        holder.checkBoxFavorite.setOnCheckedChangeListener(null);
        holder.checkBoxFavorite.setChecked(movie.isFavorite());
        
        holder.checkBoxFavorite.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                movie.setFavorite(isChecked);
            }
        });
    }
    
    @Override
    public int getItemCount() {
        return listMovie.size();
    }
    
    public class ListViewHolder extends RecyclerView.ViewHolder {
        
        TextView txtTitle;
        TextView txtYear;
        CheckBox checkBoxFavorite;
        
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtYear = itemView.findViewById(R.id.txtYear);
            checkBoxFavorite = itemView.findViewById(R.id.chk_favorite);
        }
    }
}
