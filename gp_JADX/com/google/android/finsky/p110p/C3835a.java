package com.google.android.finsky.p110p;

import android.util.SparseIntArray;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.a.a.a.a.cp;

public final class C3835a {
    public C3837c f19196a;
    public final SparseIntArray f19197b = new SparseIntArray();

    public C3835a(C3837c c3837c) {
        this.f19196a = c3837c;
        this.f19197b.put(5, 1);
        this.f19197b.put(6, 3);
        this.f19197b.put(8, 4);
        this.f19197b.put(7, 5);
        this.f19197b.put(9, 6);
    }

    public final void m18296a(C2495w c2495w, byte[] bArr) {
        if (this.f19196a != null && c2495w != null) {
            C2474c c2474c = new C2474c(558);
            int i = this.f19197b.get(this.f19196a.f19206b.f19198a, 0);
            if (i != 0) {
                int duration;
                C3837c c3837c = this.f19196a;
                switch (c3837c.f19206b.f19198a) {
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        duration = c3837c.f19206b.f19202e.getDuration();
                        break;
                    default:
                        duration = -1;
                        break;
                }
                int currentPosition = this.f19196a.f19206b.f19202e.getCurrentPosition();
                cp cpVar = new cp();
                cpVar.b = i;
                cpVar.a |= 1;
                if (duration >= 0) {
                    cpVar.a |= 4;
                    cpVar.d = duration;
                }
                if (currentPosition >= 0) {
                    cpVar.a |= 8;
                    cpVar.e = currentPosition;
                }
                cpVar.c = 1;
                cpVar.a |= 2;
                c2474c.f13342a.aw = cpVar;
                c2474c.m13240a(bArr);
                c2495w.m13367a(c2474c);
            }
        }
    }
}
