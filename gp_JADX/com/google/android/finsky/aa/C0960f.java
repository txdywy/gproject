package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

final class C0960f extends C0957n {
    C0960f(C0956c c0956c, String str, Set set) {
        super(c0956c, str, set);
    }

    protected final /* synthetic */ void mo1165a(Editor editor, Object obj) {
        editor.putStringSet(this.b, (Set) obj);
    }

    protected final /* synthetic */ Object mo1164a(SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains(this.b)) {
            Collection stringSet = sharedPreferences.getStringSet(this.b, null);
        } else {
            Object obj = (Set) this.c;
        }
        if (stringSet != null) {
            return new HashSet(stringSet);
        }
        return stringSet;
    }
}
