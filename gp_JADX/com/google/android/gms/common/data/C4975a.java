package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class C4975a implements C4974b {
    public final DataHolder f25475a;

    public C4975a(DataHolder dataHolder) {
        this.f25475a = dataHolder;
    }

    public final void mo4500a() {
        if (this.f25475a != null) {
            this.f25475a.close();
        }
    }

    public int mo4501c() {
        if (this.f25475a == null) {
            return 0;
        }
        return this.f25475a.f25956h;
    }

    public Iterator iterator() {
        return new C5101f(this);
    }
}
