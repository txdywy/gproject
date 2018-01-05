package com.caverock.androidsvg;

import java.util.List;

public final class C0714i {
    public List f4583a = null;
    public int f4584b = 0;

    public final int m4773a() {
        return this.f4583a == null ? 0 : this.f4583a.size();
    }

    public final C0715j m4774a(int i) {
        return (C0715j) this.f4583a.get(i);
    }

    public final boolean m4775b() {
        return this.f4583a == null ? true : this.f4583a.isEmpty();
    }

    public final void m4776c() {
        this.f4584b += 100;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (C0715j append : this.f4583a) {
            stringBuilder.append(append).append(' ');
        }
        return stringBuilder.append('(').append(this.f4584b).append(')').toString();
    }
}
