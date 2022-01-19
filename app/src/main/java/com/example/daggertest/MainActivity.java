package com.example.daggertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Engine engine = new Engine("Động cơ 4 mã lực");
        Wheel wheel = new Wheel(4);

        Car car = new Car(engine,wheel);

        car.showCarInfo();

    }
}