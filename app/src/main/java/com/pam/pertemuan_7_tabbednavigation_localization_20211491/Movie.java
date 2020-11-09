package com.pam.pertemuan_7_tabbednavigation_localization_20211491;

public class Movie {
    
    private String title;
    private String year;
    private boolean isFavorite;
    
    public Movie(String title, String year) {
        this.title = title;
        this.year = year;
        isFavorite = false;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getYear() {
        return year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }
    
    public boolean isFavorite() {
        return isFavorite;
    }
    
    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
