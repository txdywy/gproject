package com.google.android.finsky.aa;

public abstract class C0963m {
    public C0956c f5917b;
    public final String f5918c;
    public final Object f5919d;

    protected C0963m(C0956c c0956c, String str, Object obj) {
        this.f5917b = c0956c;
        this.f5918c = str;
        this.f5919d = obj;
    }

    protected abstract C0957n mo1166a(String str);

    public final C0957n m5777b(String str) {
        String valueOf = String.valueOf(this.f5918c);
        String valueOf2 = String.valueOf(str);
        C0957n a = mo1166a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        a.f5914a = this.f5917b;
        return a;
    }
}
