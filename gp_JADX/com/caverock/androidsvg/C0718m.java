package com.caverock.androidsvg;

public final class C0718m {
    public static final C0718m f4595c = new C0718m(C0719n.None, null);
    public static final C0718m f4596d = new C0718m(C0719n.XMidYMid, C0720o.Meet);
    public C0719n f4597a;
    public C0720o f4598b;

    public C0718m(C0719n c0719n, C0720o c0720o) {
        this.f4597a = c0719n;
        this.f4598b = c0720o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0718m c0718m = (C0718m) obj;
        if (this.f4597a != c0718m.f4597a) {
            return false;
        }
        if (this.f4598b != c0718m.f4598b) {
            return false;
        }
        return true;
    }

    static {
        C0718m c0718m = new C0718m(null, null);
        c0718m = new C0718m(C0719n.XMinYMin, C0720o.Meet);
        c0718m = new C0718m(C0719n.XMaxYMax, C0720o.Meet);
        c0718m = new C0718m(C0719n.XMidYMin, C0720o.Meet);
        c0718m = new C0718m(C0719n.XMidYMax, C0720o.Meet);
        c0718m = new C0718m(C0719n.XMidYMid, C0720o.Slice);
        c0718m = new C0718m(C0719n.XMinYMin, C0720o.Slice);
    }
}
