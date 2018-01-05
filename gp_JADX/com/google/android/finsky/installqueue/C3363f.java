package com.google.android.finsky.installqueue;

import android.support.v4.p037h.C0308c;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public final class C3363f {
    public Set f17261a = Collections.emptySet();
    public Set f17262b = Collections.emptySet();
    public Set f17263c = Collections.emptySet();

    public final C3363f m16801a(String str) {
        this.f17261a = Collections.singleton(str);
        return this;
    }

    public final C3363f m16802a(Collection collection) {
        this.f17261a = Collections.unmodifiableSet(new C0308c(collection));
        return this;
    }

    public final C3363f m16804b(Collection collection) {
        this.f17262b = Collections.unmodifiableSet(new C0308c(collection));
        return this;
    }

    public final C3363f m16803b(String str) {
        this.f17263c = Collections.singleton(str);
        return this;
    }

    public final C3362e m16800a() {
        return new C3362e(this.f17261a, this.f17262b, this.f17263c);
    }
}
