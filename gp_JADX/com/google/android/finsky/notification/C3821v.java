package com.google.android.finsky.notification;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class C3821v {
    public final String f19152a;
    public final Bundle f19153b;
    public final Map f19154c;
    public Uri f19155d;

    C3821v(String str) {
        this.f19152a = str;
        this.f19153b = new Bundle();
        this.f19154c = new HashMap();
    }

    C3821v(C3820u c3820u) {
        this.f19152a = c3820u.f19148a;
        this.f19153b = c3820u.f19149b;
        this.f19155d = c3820u.f19150c;
        this.f19154c = c3820u.f19151d;
    }

    public final C3821v m18267a(String str, String str2) {
        this.f19153b.putString(str, str2);
        this.f19154c.put(str, Integer.valueOf(0));
        return this;
    }

    public final C3821v m18270a(String str, byte[] bArr) {
        this.f19153b.putByteArray(str, bArr);
        this.f19154c.put(str, Integer.valueOf(1));
        return this;
    }

    public final C3821v m18266a(String str, long j) {
        this.f19153b.putLong(str, j);
        this.f19154c.put(str, Integer.valueOf(2));
        return this;
    }

    public final C3821v m18269a(String str, boolean z) {
        this.f19153b.putBoolean(str, z);
        this.f19154c.put(str, Integer.valueOf(3));
        return this;
    }

    public final C3821v m18268a(String str, ArrayList arrayList) {
        this.f19153b.putStringArrayList(str, arrayList);
        this.f19154c.put(str, Integer.valueOf(4));
        return this;
    }

    public final C3820u m18265a() {
        return new C3820u(this.f19152a, this.f19153b, this.f19154c, this.f19155d);
    }
}
