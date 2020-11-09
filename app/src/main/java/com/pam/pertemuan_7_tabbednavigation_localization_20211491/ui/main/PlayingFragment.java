package com.pam.pertemuan_7_tabbednavigation_localization_20211491.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pam.pertemuan_7_tabbednavigation_localization_20211491.Movie;
import com.pam.pertemuan_7_tabbednavigation_localization_20211491.MovieAdapter;
import com.pam.pertemuan_7_tabbednavigation_localization_20211491.R;

import java.util.ArrayList;

public class PlayingFragment extends Fragment {
    
    private String[] movie = {"Bad Boys for Life", "The Old Guard", "Raised by Wolves",
            "Elite", "The Walking Dead: World Beyond", "Artemis Fowl", "Black Box",
            "Riverdale", "Law & Order: Special Victims Unit", "Scary Movie 5",
            "Star Trek: Discovery", "Hubie Halloween", "District 9", "Star Heist",
            "Paddington 2", "Pride & Prejudice"};
    private String[] movieYear = {"2020", "2020", "2020", "2018", "2020", "2020",
            "2020", "2017", "1999", "2013", "2017", "2020", "2009", "N/A", "2017", "2005"};
    
    private ArrayList<Movie> listMovie;
    private RecyclerView rvMovie;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_playing, container, false);
        
        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length; i++) {
            listMovie.add(new Movie(movie[i], movieYear[i]));
        }
        
        rvMovie = view.findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);
        rvMovie.setLayoutManager(new LinearLayoutManager(getContext()));
    
        MovieAdapter movieAdapter = new MovieAdapter(listMovie);
        rvMovie.setAdapter(movieAdapter);
        
        return view;
    }
}