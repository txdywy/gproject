package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class C0958d extends C0957n {
    C0958d(C0956c c0956c, String str, Long l) {
        super(c0956c, str, l);
    }

    protected final /* synthetic */ void mo1165a(Editor editor, Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            throw new IllegalArgumentException("null cannot be written for <Long>");
        }
        editor.putLong(this.b, l.longValue());
    }

    protected final /* synthetic */ Object mo1164a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.b) ? Long.valueOf(sharedPreferences.getLong(this.b, 0)) : (Long) this.c;
    }
}
