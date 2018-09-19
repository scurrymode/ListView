package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SingerItemView extends LinearLayout{

    TextView name;
    TextView phone;
    TextView age;
    ImageView image;

    public SingerItemView(Context context) {
        super(context);
        init(context);
    }

    public void init(Context context) {
        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.singer_item, this, true);

        name = (TextView) findViewById(R.id.name);
        phone = (TextView) findViewById(R.id.phone);
        age = (TextView) findViewById(R.id.age);
        image = (ImageView) findViewById(R.id.image);
    }

    public void setName(String name) {
        this.name.setText(name);
    }

    public void setPhone(String phone) {
        this.phone.setText(phone);
    }

    public void setAge(int age) {
        this.age.setText(String.valueOf(age));
    }

    public void setImage(int image) {
        this.image.setImageResource(image);
    }
}











