package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class C0961g extends C0957n {
    C0961g(C0956c c0956c, String str, Boolean bool) {
        super(c0956c, str, bool);
    }

    protected final /* synthetic */ void mo1165a(Editor editor, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            throw new IllegalArgumentException("null cannot be written for <Boolean>");
        }
        editor.putBoolean(this.b, bool.booleanValue());
    }

    protected final /* synthetic */ Object mo1164a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.b) ? Boolean.valueOf(sharedPreferences.getBoolean(this.b, false)) : (Boolean) this.c;
    }
}
