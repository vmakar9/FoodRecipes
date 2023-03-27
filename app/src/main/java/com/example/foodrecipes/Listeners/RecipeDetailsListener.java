package com.example.foodrecipes.Listeners;


import com.example.foodrecipes.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void dedFetch(RecipeDetailsResponse response,String message);
    void didError(String message);
}
