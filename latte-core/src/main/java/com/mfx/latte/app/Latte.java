package com.mfx.latte.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * Created by mafuxin on 2018/5/6.
 */

public final class Latte {

    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static final WeakHashMap<String, Object>  getConfigurations(){
        return Configurator.getInstance().getLatteConfigs();
    }

    public static Context getApplication(){
        return (Context) getConfigurations().get(ConfigType.APPLICATION_CONTEXT.name());
//        return (Context)Configurator.getInstance().getConfiguration(ConfigType.APPLICATION_CONTEXT);
    }
}
