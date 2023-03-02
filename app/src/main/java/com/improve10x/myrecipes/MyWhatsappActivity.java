package com.improve10x.myrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyWhatsappActivity extends AppCompatActivity {
    WhatsappItem[] whatsappItems;
    MyWhatsappAdapter whatsappAdapter;
    ListView whatsappLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_whatsapp);
        createdData();
        initViews();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
      whatsappLv = findViewById(R.id.whatsapp_lv);
    }

    public void createdData(){
        whatsappItems = new WhatsappItem[6];

        whatsappItems[0] = new WhatsappItem();
        whatsappItems[0].contactName = "Whitmans Chat";
        whatsappItems[0].message = "Ned: Yeah, I think i know what...";
        whatsappItems[0].notification = "3";
        whatsappItems[0].imageUrl = "https://i.pinimg.com/originals/51/25/2d/51252de54e05ccd22baf271b9bb312fa.jpg";
        whatsappItems[0].time = "11:45 AM";

        whatsappItems[1] = new WhatsappItem();
        whatsappItems[1].contactName = "Stewart Family";
        whatsappItems[1].message = "Steve: Great, thanks!";
        whatsappItems[1].notification = "1";
        whatsappItems[1].imageUrl = "https://members.newleafwellness.biz/wp-content/uploads/2018/04/the-family-freezer-150x126.jpg";
        whatsappItems[1].time = "11:39 AM";

        whatsappItems[2] = new WhatsappItem();
        whatsappItems[2].contactName = "Alice Whitman";
        whatsappItems[2].message = "Image";
        whatsappItems[2].imageUrl = "https://th.bing.com/th/id/OIP.izbiQ66FqqbK1L4hhDHrmwAAAA?w=100&h=125&c=7&r=0&o=5&dpr=1.3&pid=1.7";
        whatsappItems[2].time = "YESTERDAY";

        whatsappItems[3] = new WhatsappItem();
        whatsappItems[3].contactName = "Jack Whitman";
        whatsappItems[3].message = "Voice Massage : 0:07";
        whatsappItems[3].imageUrl = "https://th.bing.com/th/id/OIP._XetH1HebmoBEmmbgDT-0QHaKG?pid=ImgDet&w=136&h=185&c=7&dpr=1.3";
        whatsappItems[3].time = "FRIDAY";

        whatsappItems[4] = new WhatsappItem();
        whatsappItems[4].contactName = "Lunch Group";
        whatsappItems[4].message = "You: Sounds good!";
        whatsappItems[4].imageUrl = "https://cdn11.bigcommerce.com/s-7qbap3qo/products/22964/images/42478/apiydnxbl__82396.1622308057.380.380.jpg?c=2";
        whatsappItems[4].time = "YESTERDAY";

        whatsappItems[5] = new WhatsappItem();
        whatsappItems[5].contactName = "Jane Pearson";
        whatsappItems[5].message = "Fire Water";
        whatsappItems[5].imageUrl = "https://th.bing.com/th/id/OIP.GPhn5-vVn0tAMTl9iEY8BQAAAA?w=161&h=199&c=7&r=0&o=5&dpr=1.3&pid=1.7";
        whatsappItems[5].time = "FRIDAY";
    }

    public void createAdapter(){
        whatsappAdapter = new MyWhatsappAdapter(this,R.layout.whatsapp_item,whatsappItems);
    }

    public  void connectAdapter(){
    whatsappLv.setAdapter(whatsappAdapter);
    }
}