package com.google.android.finsky.utils;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ac {
    public static final ac f24031a = new ac(Collections.emptyMap(), Bundle.EMPTY);
    public Map f24032b;
    public Bundle f24033c;

    private ac(Map map, Bundle bundle) {
        this.f24032b = map;
        this.f24033c = bundle;
    }

    public ac() {
        this(new HashMap(), new Bundle());
    }

    public final boolean m21689a(String str) {
        return this.f24032b.containsKey(str) || this.f24033c.containsKey(str);
    }

    public final void m21688a(String str, Object obj) {
        this.f24032b.put(str, obj);
    }

    public final Object m21690b(String str) {
        if (this.f24032b.containsKey(str)) {
            return this.f24032b.get(str);
        }
        return this.f24033c.get(str);
    }

    public final void putInt(String str, int i) {
        this.f24032b.put(str, Integer.valueOf(i));
    }

    public final int getInt(String str) {
        if (this.f24032b.containsKey(str)) {
            return ((Integer) this.f24032b.get(str)).intValue();
        }
        return this.f24033c.getInt(str);
    }

    public final List m21691c(String str) {
        if (this.f24032b.containsKey(str)) {
            return (List) this.f24032b.get(str);
        }
        return (List) this.f24033c.getParcelable(str);
    }

    public final void clear() {
        this.f24032b.clear();
        this.f24033c.clear();
    }
}
