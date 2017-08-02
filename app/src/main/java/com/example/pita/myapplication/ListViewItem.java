package com.example.pita.myapplication;

import android.graphics.drawable.Drawable;

public class ListViewItem {
    private Drawable iconDrawable;
    private String titlestr;
    private String descstr;

    public Drawable getIconDrawable() {
        return iconDrawable;
    }

    public void setIconDrawable(Drawable iconDrawable) {
        this.iconDrawable = iconDrawable;
    }

    public String getTitlestr() {
        return titlestr;
    }

    public void setTitlestr(String titlestr) {
        this.titlestr = titlestr;
    }

    public String getDescstr() {
        return descstr;
    }

    public void setDescstr(String descstr) {
        this.descstr = descstr;
    }
}
