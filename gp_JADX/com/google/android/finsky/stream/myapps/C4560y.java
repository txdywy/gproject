package com.google.android.finsky.stream.myapps;

import android.support.v7.p045f.C0447d;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3340g;
import java.util.List;
import java.util.Map;

public final class C4560y extends C0447d {
    public final int f23307a;
    public final List f23308b;
    public final Map f23309c;
    public final int f23310d;
    public final C3340g f23311e;
    public int f23312f;
    public List f23313g;
    public Map f23314h;
    public int f23315i;
    public boolean f23316j;

    C4560y(C3340g c3340g, int i, List list, Map map, int i2) {
        this.f23311e = c3340g;
        this.f23307a = i;
        this.f23308b = list;
        this.f23309c = map;
        this.f23310d = i2;
    }

    private final Integer m21182a(String str) {
        return (Integer) this.f23309c.get(str);
    }

    private final Integer m21183b(String str) {
        return (Integer) this.f23314h.get(str);
    }

    public final int mo3283a() {
        return this.f23307a;
    }

    public final int mo3285b() {
        return this.f23312f;
    }

    public final boolean mo3284a(int i, int i2) {
        if (i != 0 && i2 != 0 && i != this.f23307a - 1 && i2 != this.f23312f - 1) {
            return ((Document) this.f23308b.get((i + 0) - 1)).cf().equals(((Document) this.f23313g.get((i2 + 0) - 1)).cf());
        }
        if (i == 0 && i2 == 0) {
            return true;
        }
        if (i == this.f23307a - 1 && i2 == this.f23312f - 1) {
            return true;
        }
        return false;
    }

    public final boolean mo3286b(int i, int i2) {
        if (i == this.f23307a - 1 || i2 == this.f23312f - 1) {
            return true;
        }
        if (i != 0 && i2 != 0) {
            String cf = ((Document) this.f23313g.get((i2 + 0) - 1)).cf();
            if (this.f23316j) {
                return false;
            }
            return m21182a(cf) == null ? m21183b(cf) == null : this.f23311e.mo3482b(cf) != 2 && m21182a(cf).equals(m21183b(cf));
        } else if (this.f23308b.size() == 0 && this.f23307a == 2 && this.f23313g.size() == 0 && this.f23312f == 2) {
            return false;
        } else {
            return this.f23307a == this.f23312f && this.f23309c.size() == this.f23314h.size() && this.f23310d == this.f23315i;
        }
    }

    public final Object mo4264a(int i) {
        return i > 0 ? null : new Object();
    }
}
