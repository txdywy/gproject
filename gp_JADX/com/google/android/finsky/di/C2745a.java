package com.google.android.finsky.di;

import android.os.Bundle;

public final class C2745a {
    public final Bundle f14976a = new Bundle();
    public final Bundle f14977b = new Bundle();

    public final C2745a m14795a(int i) {
        this.f14976a.putInt("status_code", i);
        return this;
    }

    public final C2745a m14796a(String str) {
        this.f14977b.putString("reason", str);
        return this;
    }

    public final C2745a m14797b(String str) {
        this.f14977b.putString("exception_type", str);
        return this;
    }

    public final Bundle m14794a() {
        if (this.f14977b.size() > 0) {
            this.f14976a.putBundle("error", this.f14977b);
        }
        return this.f14976a;
    }
}
