package android.support.v4.p037h;

public final class C0323s extends C0322r {
    public final Object f1766c = new Object();

    public C0323s(int i) {
        super(i);
    }

    public final Object mo381a() {
        Object a;
        synchronized (this.f1766c) {
            a = super.mo381a();
        }
        return a;
    }

    public final boolean mo382a(Object obj) {
        boolean a;
        synchronized (this.f1766c) {
            a = super.mo382a(obj);
        }
        return a;
    }
}
