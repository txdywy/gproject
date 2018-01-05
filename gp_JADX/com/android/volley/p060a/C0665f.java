package com.android.volley.p060a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class C0665f {
    public static final Comparator f4069e = new C0666g();
    public final List f4070a = new LinkedList();
    public final List f4071b = new ArrayList(64);
    public int f4072c = 0;
    public final int f4073d;

    public C0665f(int i) {
        this.f4073d = i;
    }

    public final synchronized byte[] m4428a(int i) {
        byte[] bArr;
        for (int i2 = 0; i2 < this.f4071b.size(); i2++) {
            bArr = (byte[]) this.f4071b.get(i2);
            if (bArr.length >= i) {
                this.f4072c -= bArr.length;
                this.f4071b.remove(i2);
                this.f4070a.remove(bArr);
                break;
            }
        }
        bArr = new byte[i];
        return bArr;
    }

    public final synchronized void m4427a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f4073d) {
                this.f4070a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f4071b, bArr, f4069e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f4071b.add(binarySearch, bArr);
                this.f4072c += bArr.length;
                m4426a();
            }
        }
    }

    private final synchronized void m4426a() {
        while (this.f4072c > this.f4073d) {
            byte[] bArr = (byte[]) this.f4070a.remove(0);
            this.f4071b.remove(bArr);
            this.f4072c -= bArr.length;
        }
    }
}
