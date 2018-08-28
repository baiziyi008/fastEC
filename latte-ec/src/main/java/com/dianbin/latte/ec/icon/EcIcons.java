package com.dianbin.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by mfx on 2018/8/27.
 */

public enum  EcIcons implements Icon{
    icon_scan('\ue601'),
    icon_ali_pay('\ue60f');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
