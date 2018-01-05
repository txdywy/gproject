package com.google.android.play.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import com.google.android.play.C6282d;

public final class C6325i {
    public static boolean f31615a = false;

    public static ColorStateList m28969a(Context context, int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = C6282d.play_books_primary_text;
                break;
            case 2:
                i2 = C6282d.play_music_primary_text;
                break;
            case 3:
                if (!f31615a) {
                    i2 = C6282d.play_apps_primary_text;
                    break;
                }
                i2 = C6282d.play_apps_ent_primary_text;
                break;
            case 4:
                i2 = C6282d.play_movies_primary_text;
                break;
            case 6:
                i2 = C6282d.play_newsstand_primary_text;
                break;
            case 10:
                i2 = C6282d.play_commerce_primary_text;
                break;
            default:
                if (!f31615a) {
                    i2 = C6282d.play_multi_primary_text;
                    break;
                }
                i2 = C6282d.play_apps_ent_primary_text;
                break;
        }
        return context.getResources().getColorStateList(i2);
    }
}
