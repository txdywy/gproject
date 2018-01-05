package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class C0962h extends C0957n {
    C0962h(C0956c c0956c, String str, Integer num) {
        super(c0956c, str, num);
    }

    protected final /* synthetic */ void mo1165a(Editor editor, Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            throw new IllegalArgumentException("null cannot be written for <Integer>");
        }
        editor.putInt(this.b, num.intValue());
    }

    protected final /* synthetic */ Object mo1164a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.b) ? Integer.valueOf(sharedPreferences.getInt(this.b, 0)) : (Integer) this.c;
    }
}
