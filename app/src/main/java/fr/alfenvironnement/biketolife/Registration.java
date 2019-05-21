package fr.alfenvironnement.biketolife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class Registration extends AppCompatActivity {

    CarouselPicker carouselPicker1 , carouselPicker2 , carouselPicker3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        carouselPicker1 = (CarouselPicker)findViewById(R.id.carouselPicker1);
        carouselPicker2 = (CarouselPicker)findViewById(R.id.carouselPicker2);
        carouselPicker3 = (CarouselPicker)findViewById(R.id.carouselPicker3);

        List<CarouselPicker.PickerItem> itemsImages = new ArrayList<>();
        itemsImages.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher));
        itemsImages.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher_round));
        itemsImages.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher));
        CarouselPicker.CarouselViewAdapter imageAdapter = new CarouselPicker.CarouselViewAdapter(this,itemsImages,0);
        carouselPicker1.setAdapter(imageAdapter);

        List<CarouselPicker.PickerItem> textItems = new ArrayList<>();
        textItems.add(new CarouselPicker.TextItem("one",20));
        textItems.add(new CarouselPicker.TextItem("two",20));
        textItems.add(new CarouselPicker.TextItem("three",20));
        CarouselPicker.CarouselViewAdapter textAdapter = new CarouselPicker.CarouselViewAdapter(this,itemsImages,0);
        carouselPicker2.setAdapter(textAdapter);

        List<CarouselPicker.PickerItem> mixItems = new ArrayList<>();
        mixItems.add(new CarouselPicker.TextItem("one",20));
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher_round));
        mixItems.add(new CarouselPicker.TextItem("three",20));
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher_round));
        CarouselPicker.CarouselViewAdapter mixAdapter = new CarouselPicker.CarouselViewAdapter(this,itemsImages,0);
        carouselPicker2.setAdapter(mixAdapter);



    }
}
