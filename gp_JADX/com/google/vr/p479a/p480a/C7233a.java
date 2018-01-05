package com.google.vr.p479a.p480a;

public abstract class C7233a {
    public abstract void mo6303a(Object obj, String str, Object obj2, String str2);

    public abstract long mo6304b();

    public abstract void mo6305b(Object obj);

    public abstract Object mo6306c(String str);

    public final void m33817a(C7233a c7233a) {
        Object c = mo6306c("lull::AddChildEvent");
        mo6303a(c, "child", Long.valueOf(c7233a.mo6304b()), "lull::Entity");
        m33814a(c);
    }

    public final void m33819a(String str) {
        Object c = mo6306c("lull::SetTextEvent");
        mo6303a(c, "text", str, "std::string");
        m33814a(c);
    }

    public final void m33816a(int i) {
        Object c = mo6306c("lull::SetSortOffsetEvent");
        mo6303a(c, "sort_offset", Integer.valueOf(i), "int32_t");
        m33814a(c);
    }

    public final void m33815a() {
        Object c = mo6306c("lull::SetRenderPassEvent");
        mo6303a(c, "render_pass", Integer.valueOf(2), "int32_t");
        m33814a(c);
    }

    public final void m33822b(String str) {
        m33814a(mo6306c(str));
    }

    private final void m33814a(Object obj) {
        mo6303a(obj, "entity", Long.valueOf(mo6304b()), "lull::Entity");
        mo6305b(obj);
    }
}
