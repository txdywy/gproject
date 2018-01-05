package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class wx implements Cloneable {
    public wv f27648a;
    public Object f27649b;
    public List f27650c = new ArrayList();

    wx() {
    }

    private final wx m25916c() {
        wx wxVar = new wx();
        try {
            wxVar.f27648a = this.f27648a;
            if (this.f27650c == null) {
                wxVar.f27650c = null;
            } else {
                wxVar.f27650c.addAll(this.f27650c);
            }
            if (this.f27649b != null) {
                if (this.f27649b instanceof wz) {
                    wxVar.f27649b = (wz) ((wz) this.f27649b).clone();
                } else if (this.f27649b instanceof byte[]) {
                    wxVar.f27649b = ((byte[]) this.f27649b).clone();
                } else if (this.f27649b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.f27649b;
                    r4 = new byte[bArr.length][];
                    wxVar.f27649b = r4;
                    for (r2 = 0; r2 < bArr.length; r2++) {
                        r4[r2] = (byte[]) bArr[r2].clone();
                    }
                } else if (this.f27649b instanceof boolean[]) {
                    wxVar.f27649b = ((boolean[]) this.f27649b).clone();
                } else if (this.f27649b instanceof int[]) {
                    wxVar.f27649b = ((int[]) this.f27649b).clone();
                } else if (this.f27649b instanceof long[]) {
                    wxVar.f27649b = ((long[]) this.f27649b).clone();
                } else if (this.f27649b instanceof float[]) {
                    wxVar.f27649b = ((float[]) this.f27649b).clone();
                } else if (this.f27649b instanceof double[]) {
                    wxVar.f27649b = ((double[]) this.f27649b).clone();
                } else if (this.f27649b instanceof wz[]) {
                    wz[] wzVarArr = (wz[]) this.f27649b;
                    r4 = new wz[wzVarArr.length];
                    wxVar.f27649b = r4;
                    for (r2 = 0; r2 < wzVarArr.length; r2++) {
                        r4[r2] = (wz) wzVarArr[r2].clone();
                    }
                }
            }
            return wxVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    final int m25917a() {
        int i;
        if (this.f27649b != null) {
            wv wvVar = this.f27648a;
            Object obj = this.f27649b;
            if (wvVar.f27643b) {
                int length = Array.getLength(obj);
                for (i = 0; i < length; i++) {
                    if (Array.get(obj, i) != null) {
                        Array.get(obj, i);
                        throw new NoSuchMethodError();
                    }
                }
                return 0;
            }
            throw new NoSuchMethodError();
        }
        i = 0;
        for (xb xbVar : this.f27650c) {
            i = (xbVar.f27654b.length + (wt.m25896c(xbVar.f27653a) + 0)) + i;
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        return m25916c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wx)) {
            return false;
        }
        wx wxVar = (wx) obj;
        if (this.f27649b != null && wxVar.f27649b != null) {
            return this.f27648a == wxVar.f27648a ? !this.f27648a.f27642a.isArray() ? this.f27649b.equals(wxVar.f27649b) : this.f27649b instanceof byte[] ? Arrays.equals((byte[]) this.f27649b, (byte[]) wxVar.f27649b) : this.f27649b instanceof int[] ? Arrays.equals((int[]) this.f27649b, (int[]) wxVar.f27649b) : this.f27649b instanceof long[] ? Arrays.equals((long[]) this.f27649b, (long[]) wxVar.f27649b) : this.f27649b instanceof float[] ? Arrays.equals((float[]) this.f27649b, (float[]) wxVar.f27649b) : this.f27649b instanceof double[] ? Arrays.equals((double[]) this.f27649b, (double[]) wxVar.f27649b) : this.f27649b instanceof boolean[] ? Arrays.equals((boolean[]) this.f27649b, (boolean[]) wxVar.f27649b) : Arrays.deepEquals((Object[]) this.f27649b, (Object[]) wxVar.f27649b) : false;
        } else {
            if (this.f27650c != null && wxVar.f27650c != null) {
                return this.f27650c.equals(wxVar.f27650c);
            }
            try {
                return Arrays.equals(m25915b(), wxVar.m25915b());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m25915b()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    final void m25918a(wt wtVar) {
        if (this.f27649b != null) {
            wv wvVar = this.f27648a;
            Object obj = this.f27649b;
            if (wvVar.f27643b) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    if (Array.get(obj, i) != null) {
                        throw new NoSuchMethodError();
                    }
                }
                return;
            }
            throw new NoSuchMethodError();
        }
        for (xb xbVar : this.f27650c) {
            wtVar.m25908b(xbVar.f27653a);
            wtVar.m25909b(xbVar.f27654b);
        }
    }

    private final byte[] m25915b() {
        byte[] bArr = new byte[m25917a()];
        m25918a(wt.m25887a(bArr, bArr.length));
        return bArr;
    }
}
