package com.improve10x.myrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyRecipesActivity extends AppCompatActivity {

    public RecipeItem[] recipeItems;
    public RecipeItemAdapter adapter;
    public ListView recipeLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recipes);
        initViews();
        displayData();
        createAdapter();
        connectAdapter();
    }

    public void displayData(){
        recipeItems = new RecipeItem[6];

        recipeItems[0] = new RecipeItem();
        recipeItems[0].recipeName = "Crunchy Croissants";
        recipeItems[0].imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJIgdbzKGF_AT0In3EY8sBiAEFOapytpBOYg&usqp=CAU";
        recipeItems[0].description = "Buttery, flaky pastry named for its crescent shape";
        recipeItems[0].seNumber = "01";

        recipeItems[1] = new RecipeItem();
        recipeItems[1].recipeName = "Grilled Eggplant";
        recipeItems[1].imageUrl = "https://cookingontheweekends.com/wp-content/uploads/2014/06/June-1-Herb-Grilled-Elephant-Garlic-Recipe1.jpg";
        recipeItems[1].description = "Tender with a rich, complex flavor when cooked";
        recipeItems[1].seNumber = "02";

        recipeItems[2] = new RecipeItem();
        recipeItems[2].recipeName = "Tangerine Salad";
        recipeItems[2].imageUrl = "https://thedinnerbell.recipes/wp-content/uploads/2020/06/Spinach-Salad-with-Mandarin-Oranges-4.jpg";
        recipeItems[2].description = "Peak tangerine season lasts from autumn to spring";
        recipeItems[2].seNumber = "03";

        recipeItems[3] = new RecipeItem();
        recipeItems[3].recipeName = "Pomegranate Juice";
        recipeItems[3].imageUrl = "https://www.verywellhealth.com/thmb/ma6xLUqQNYhLJkn9ut40Z2madrM=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/pomegranate-2cb572289dc44d08a97e33b32df8b967.jpg";
        recipeItems[3].description = "A superfood for good skin, hair and health";
        recipeItems[3].seNumber = "04";

        recipeItems[4] = new RecipeItem();
        recipeItems[4].recipeName = "Chilli Salsa";
        recipeItems[4].imageUrl = "https://www.muydelish.com/wp-content/uploads/2022/01/easy-salsa-recipe-480x270.jpg";
        recipeItems[4].description = "Heat up any taco night with minimal preparation";
        recipeItems[4].seNumber = "05";

        recipeItems[5] = new RecipeItem();
        recipeItems[5].recipeName = "Flour from scratch";
        recipeItems[5].imageUrl = "https://www.sufficientself.com/attachments/immo-wegmann-8cyl4wgzsq4-unsplash-jpg.18697/";
        recipeItems[5].description = "Grind grains, nuts, or beans in your coffeegrinder";
        recipeItems[5].seNumber = "06";
    }

    public void initViews(){
       recipeLv = findViewById(R.id.recipe_lv);
    }

    public void createAdapter(){
        adapter = new RecipeItemAdapter(this, R.layout.recipe_item,recipeItems);
    }

    public void connectAdapter(){
        recipeLv.setAdapter(adapter);
    }
}