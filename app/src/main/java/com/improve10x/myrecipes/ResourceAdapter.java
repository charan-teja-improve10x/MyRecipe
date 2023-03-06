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

public class ResourceAdapter extends ArrayAdapter<DunzoItem> {
    public ResourceAdapter(@NonNull Context context, int resource, @NonNull DunzoItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DunzoItem item = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.resource_item,parent,false);
        TextView discountTxt = view.findViewById(R.id.discount_txt);
        discountTxt.setText(item.discount);
        TextView resourceNameTxt = view.findViewById(R.id.resource_name_txt);
        resourceNameTxt.setText(item.resourceName);
        ImageView resourcePosterIv = view.findViewById(R.id.resource_image_iv);
        Picasso.get().load(item.imageUrl).into(resourcePosterIv);
        return view;
    }
}
