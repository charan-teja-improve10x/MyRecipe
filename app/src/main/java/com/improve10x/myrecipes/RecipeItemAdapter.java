package com.improve10x.myrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class RecipeItemAdapter extends ArrayAdapter<RecipeItem>{
    public RecipeItemAdapter(@NonNull Context context, int resource, @NonNull RecipeItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        RecipeItem item = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.recipe_item,parent,false);
        TextView recipeNameTxt = view.findViewById(R.id.recipe_name_txt);
        recipeNameTxt.setText(item.recipeName);
        TextView descriptionTxt = view.findViewById(R.id.description_txt);
        descriptionTxt.setText(item.description);
        TextView seNumberTxt = view.findViewById(R.id.se_number_txt);
        seNumberTxt.setText(item.seNumber);
        ImageView posterIv = view.findViewById(R.id.poster_iv);
        Picasso.get().load(item.imageUrl).into(posterIv);
        return view;
    }
}
//implementation 'com.squareup.picasso:picasso:2.8'
//        Picasso.get().load(item.imageUrl).into(posterIv);
//<uses-permission android:name="android.permission.INTERNET"/>




