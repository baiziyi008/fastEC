package com.mfx.fastec.example;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dianbin.latte.ec.icon.FontModule;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.mfx.latte.app.Latte;

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1/")
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontModule())
                .configure();
    }
}
