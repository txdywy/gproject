package com.google.android.finsky.phenotypedebug;

public abstract class C3880a {
    public final String f19304a;
    public final Object f19305b;
    public Object f19306c;

    public C3880a(String str, Object obj) {
        this.f19304a = str;
        this.f19305b = obj;
    }

    protected abstract Object mo3830a(String str);

    public boolean mo3831a() {
        return (this.f19306c == null || this.f19306c.equals(this.f19305b)) ? false : true;
    }

    public final Object m18373b() {
        return this.f19306c == null ? this.f19305b : this.f19306c;
    }

    public String mo3832c() {
        return String.valueOf(m18373b());
    }
}
