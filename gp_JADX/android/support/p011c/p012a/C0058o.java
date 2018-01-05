package android.support.p011c.p012a;

import android.graphics.Matrix;
import android.support.v4.p037h.C0305a;
import java.util.ArrayList;

final class C0058o {
    public final Matrix f111a = new Matrix();
    public final ArrayList f112b = new ArrayList();
    public float f113c = 0.0f;
    public float f114d = 0.0f;
    public float f115e = 0.0f;
    public float f116f = 1.0f;
    public float f117g = 1.0f;
    public float f118h = 0.0f;
    public float f119i = 0.0f;
    public final Matrix f120j = new Matrix();
    public int f121k;
    public int[] f122l;
    public String f123m = null;

    public C0058o(C0058o c0058o, C0305a c0305a) {
        this.f113c = c0058o.f113c;
        this.f114d = c0058o.f114d;
        this.f115e = c0058o.f115e;
        this.f116f = c0058o.f116f;
        this.f117g = c0058o.f117g;
        this.f118h = c0058o.f118h;
        this.f119i = c0058o.f119i;
        this.f122l = c0058o.f122l;
        this.f123m = c0058o.f123m;
        this.f121k = c0058o.f121k;
        if (this.f123m != null) {
            c0305a.put(this.f123m, this);
        }
        this.f120j.set(c0058o.f120j);
        ArrayList arrayList = c0058o.f112b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0058o) {
                this.f112b.add(new C0058o((C0058o) obj, c0305a));
            } else {
                C0055p c0057n;
                if (obj instanceof C0057n) {
                    c0057n = new C0057n((C0057n) obj);
                } else if (obj instanceof C0056m) {
                    c0057n = new C0056m((C0056m) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f112b.add(c0057n);
                if (c0057n.f96o != null) {
                    c0305a.put(c0057n.f96o, c0057n);
                }
            }
        }
    }
}
