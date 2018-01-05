package io.reactivex.internal.util;

public final class C7863a {
    public final float f40463a;
    public int f40464b;
    public int f40465c;
    public int f40466d;
    public Object[] f40467e;

    public C7863a() {
        this((byte) 0);
    }

    private C7863a(byte b) {
        this.f40463a = 0.75f;
        int a = C7864b.m37738a(16);
        this.f40464b = a - 1;
        this.f40466d = (int) (((float) a) * 0.75f);
        this.f40467e = new Object[a];
    }

    public final boolean m37737a(int i, Object[] objArr, int i2) {
        this.f40465c--;
        while (true) {
            Object obj;
            int i3 = (i + 1) & i2;
            while (true) {
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return true;
                }
                int a = C7863a.m37736a(obj.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i2;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i2;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    public static int m37736a(int i) {
        int i2 = -1640531527 * i;
        return i2 ^ (i2 >>> 16);
    }
}
