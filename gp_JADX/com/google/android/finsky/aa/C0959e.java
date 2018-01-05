package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class C0959e extends C0957n {
    C0959e(C0956c c0956c, String str, String str2) {
        super(c0956c, str, str2);
    }

    protected final /* synthetic */ void mo1165a(Editor editor, Object obj) {
        editor.putString(this.b, (String) obj);
    }

    protected final /* synthetic */ Object mo1164a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.b) ? sharedPreferences.getString(this.b, null) : (String) this.c;
    }
}
