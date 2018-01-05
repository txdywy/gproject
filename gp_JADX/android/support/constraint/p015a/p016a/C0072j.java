package android.support.constraint.p015a.p016a;

import java.util.ArrayList;

public final class C0072j {
    public int f248a;
    public int f249b;
    public int f250c;
    public int f251d;
    public ArrayList f252e = new ArrayList();

    public C0072j(C0066e c0066e) {
        this.f248a = c0066e.f237w;
        this.f249b = c0066e.f238x;
        this.f250c = c0066e.m97c();
        this.f251d = c0066e.m103f();
        ArrayList l = c0066e.mo45l();
        int size = l.size();
        for (int i = 0; i < size; i++) {
            this.f252e.add(new C0073k((C0062a) l.get(i)));
        }
    }
}
