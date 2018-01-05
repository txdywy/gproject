package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public abstract class C0957n {
    public C0956c f5914a;
    public final String f5915b;
    public final Object f5916c;

    protected C0957n(C0956c c0956c, String str, Object obj) {
        this.f5914a = c0956c;
        this.f5915b = str;
        this.f5916c = obj;
    }

    protected abstract Object mo1164a(SharedPreferences sharedPreferences);

    protected abstract void mo1165a(Editor editor, Object obj);

    public final Object m5760a() {
        return mo1164a(this.f5914a.m5749a());
    }

    public final boolean m5764b() {
        return this.f5914a.m5749a().contains(this.f5915b);
    }

    public final void m5763a(Object obj) {
        Editor edit = this.f5914a.m5749a().edit();
        mo1165a(edit, obj);
        edit.apply();
    }

    public final void m5765c() {
        this.f5914a.m5749a().edit().remove(this.f5915b).apply();
    }
}
