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

public class MyWhatsappAdapter extends ArrayAdapter<WhatsappItem> {
    public MyWhatsappAdapter(@NonNull Context context, int resource, @NonNull WhatsappItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        WhatsappItem item = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.whatsapp_item,parent,false);
        TextView contactNameTxt = view.findViewById(R.id.contact_name_txt);
        contactNameTxt.setText(item.contactName);
        TextView messageTxt = view.findViewById(R.id.message_txt);
        messageTxt.setText(item.message);
        TextView timingTxt = view.findViewById(R.id.timing_txt);
        timingTxt.setText(item.time);
        TextView notificationTxt = view.findViewById(R.id.notification_txt);
        notificationTxt.setText(item.notification);
        ImageView dpIv = view.findViewById(R.id.dp_iv);
        Picasso.get().load(item.imageUrl).into(dpIv);
        return view;
    }
}
