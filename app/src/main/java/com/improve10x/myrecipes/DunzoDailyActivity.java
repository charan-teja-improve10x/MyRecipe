package com.improve10x.myrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;

public class DunzoDailyActivity extends AppCompatActivity {
    DunzoItem[] dunzoItems;
    GridView resourceGv;
    ResourceAdapter resourceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dunzo_daily);
        initViews();
        createData();
        createResourceAdapter();
        connectResourceAdapter();
    }

    private void initViews() {
      resourceGv = findViewById(R.id.resources_gv);
      resourceGv.setNumColumns(4);
    }

    public void createData(){
        dunzoItems = new DunzoItem[14];

        dunzoItems[0] = new DunzoItem();
        dunzoItems[0].resourceName = "Breakfast & Dairy";
        dunzoItems[0].discount = "UP TO 30% OFF";
        dunzoItems[0].imageUrl = "https://www.modernfoods.co.in/wp-content/uploads/2021/04/bakers-loaf-milk-bread-main-product.png";

        dunzoItems[1] = new DunzoItem();
        dunzoItems[1].resourceName = "Vegetables & Herbs";
        dunzoItems[1].discount = "UP TO 30% OFF";
        dunzoItems[1].imageUrl = "https://cdn.shopify.com/s/files/1/0038/9405/0868/products/Artichoke_GreenGlobe_Fruit_512x.jpg?v=1584556992";

        dunzoItems[2] = new DunzoItem();
        dunzoItems[2].resourceName = "Fresh Fruits";
        dunzoItems[2].discount = "UP TO 30% OFF";
        dunzoItems[2].imageUrl = "https://cdn.shopify.com/s/files/1/0518/4618/5115/products/Fruit-box-square_6131w.jpg?v=1610341013";

        dunzoItems[3] = new DunzoItem();
        dunzoItems[3].resourceName = "Provisions";
        dunzoItems[3].discount = "UP TO 30% OFF";
        dunzoItems[3].imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPeNMkhbQswaTHBkko9Zhi4RqFdJJ28cMd-DsbjHRvd55GPa_vy7rvuexLrYTK88OCH5U&usqp=CAU";

        dunzoItems[4] = new DunzoItem();
        dunzoItems[4].resourceName = "Snakes & Bevarages";
        dunzoItems[4].discount = "UP TO 30% OFF";
        dunzoItems[4].imageUrl = "https://assets.production.decovostatic.com/cdn-cgi/image/format=auto,metadata=copyright,width=400/a0eb1b42-de07-43f6-a485-1c9c04c45740_family-favorites-stock-up.jpg";

        dunzoItems[5] = new DunzoItem();
        dunzoItems[5].resourceName = "Chocolates & Desserts";
        dunzoItems[5].discount = "UP TO 30% OFF";
        dunzoItems[5].imageUrl = "https://www.alsothecrumbsplease.com/wp-content/uploads/2020/11/Banana-Bundt-Cake-24.jpg";

        dunzoItems[6] = new DunzoItem();
        dunzoItems[6].resourceName = "Instant food";
        dunzoItems[6].discount = "UP TO 30% OFF";
        dunzoItems[6].imageUrl = "https://m.media-amazon.com/images/I/61HrvAWcstL._SX466_.jpg";

        dunzoItems[7] = new DunzoItem();
        dunzoItems[7].resourceName = "Baby & Self Care";
        dunzoItems[7].discount = "UP TO 30% OFF";
        dunzoItems[7].imageUrl = "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1586165388-10281920.jpg";

        dunzoItems[8] = new DunzoItem();
        dunzoItems[8].resourceName = "Home Care";
        dunzoItems[8].discount = "UP TO 30% OFF";
        dunzoItems[8].imageUrl = "https://cdn.shopaccino.com/refresh/categories/toilet-cleaner-179125_s.jpg";

        dunzoItems[9] = new DunzoItem();
        dunzoItems[9].resourceName = "Meat";
        dunzoItems[9].discount = "UP TO 30% OFF";
        dunzoItems[9].imageUrl = "https://hips.hearstapps.com/hmg-prod/images/gettyimages-645249428-1553633044.jpg?crop=0.699xw:1.00xh;0.260xw,0&resize=1200:*";

        dunzoItems[10] = new DunzoItem();
        dunzoItems[10].resourceName = "Pet Care";
        dunzoItems[10].discount = "UP TO 30% OFF";
        dunzoItems[10].imageUrl = "https://m.media-amazon.com/images/I/81vauCbU5tL._AC_SS450_.jpg";

        dunzoItems[11] = new DunzoItem();
        dunzoItems[11].resourceName = "Paan Corner";
        dunzoItems[11].discount = "UP TO 30% OFF";
        dunzoItems[11].imageUrl = "https://n4.sdlcdn.com/imgs/j/i/o/Rebel-Paan-Corner-Hard-Candies-SDL787389217-1-d3fba.png";

        dunzoItems[12] = new DunzoItem();
        dunzoItems[12].resourceName = "Fresh Vegetables";
        dunzoItems[12].discount = "UP TO 30% OFF";
        dunzoItems[12].imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR83oRRGxqvQHH2qe23zatZL7QTdz59FnusIjCD-EBLNDBDXfwR329XYRklWDyKD1nf-hA&usqp=CAU";

        dunzoItems[13] = new DunzoItem();
        dunzoItems[13].resourceName = "Snakes & Drinks";
        dunzoItems[13].discount = "UP TO 30% OFF";
        dunzoItems[13].imageUrl = "https://m.media-amazon.com/images/I/61r6MrDh0jL._SX522_.jpg";
    }
    public void createResourceAdapter(){
        resourceAdapter = new ResourceAdapter(this,R.layout.resource_item,dunzoItems);
    }

    public void connectResourceAdapter(){
        resourceGv.setAdapter(resourceAdapter);
    }
}