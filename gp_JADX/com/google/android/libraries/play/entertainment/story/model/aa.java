package com.google.android.libraries.play.entertainment.story.model;

import android.text.TextUtils;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.wireless.android.finsky.dfe.g.a.ag;
import com.google.wireless.android.finsky.dfe.g.a.f;
import com.google.wireless.android.finsky.dfe.g.a.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class aa extends av {
    public static final C6090b f30549a = C6090b.m28050a();
    public final List f30550b;
    public final int f30551c;
    public String f30552d;
    public int f30553e = Integer.MAX_VALUE;
    public boolean f30554f;

    static aa m28357a(aw awVar, f fVar, ag agVar, AtomicInteger atomicInteger) {
        int length = fVar.b.length;
        if (length == 0) {
            f30549a.m28054a("Empty cluster", new Object[0]);
            return null;
        }
        Object arrayList = new ArrayList(length);
        awVar.f30607e = null;
        awVar.f30612j = null;
        awVar.f30613k = 1;
        aa aaVar = new aa(awVar, Collections.unmodifiableList(arrayList), fVar.c);
        for (r rVar : fVar.b) {
            int i;
            if (!rVar.e()) {
                if (((rVar.c & 4) != 0 ? 1 : 0) != 0) {
                    rVar.a(rVar.f);
                }
            }
            if (!rVar.e()) {
                rVar.a(aaVar.k);
            }
            if ((rVar.c & 16) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            if (i == 0) {
                byte[] bArr = aaVar.m;
                if (bArr == null) {
                    throw new NullPointerException();
                }
                rVar.c |= 16;
                rVar.w = bArr;
            }
            if (rVar.x == null) {
                rVar.x = agVar;
            }
            av a = av.m28348a(aaVar.h, rVar, atomicInteger, aaVar);
            if (a != null) {
                Object obj = a.getClass();
                ay ayVar = aq.f30591n;
                C6116b.m28100a(obj);
                if ((ayVar.m28411a(obj) != null ? 1 : 0) == 0) {
                    av.f30525g.m28055a(null, "Ignored unsupported subpanel %s", obj.getSimpleName());
                } else {
                    arrayList.add(a);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return aaVar;
        }
        f30549a.m28054a("No panels survived", new Object[0]);
        return null;
    }

    private aa(aw awVar, List list, int i) {
        super(awVar);
        this.f30550b = list;
        this.f30551c = i;
    }

    final void m28358a() {
        if (!this.f30554f) {
            boolean z = true;
            Object obj = null;
            boolean z2 = true;
            int i = Integer.MAX_VALUE;
            int i2 = 2;
            for (av avVar : this.f30550b) {
                boolean z3;
                int i3;
                boolean z4;
                if (avVar instanceof bb) {
                    bb bbVar = (bb) avVar;
                    if (i2 != Integer.MAX_VALUE) {
                        i2 = Math.max(i2, bbVar.f30545y);
                    }
                    if (z2) {
                        if (i == Integer.MAX_VALUE) {
                            i = bbVar.f30545y;
                            z3 = z2;
                            i3 = i;
                            i = i2;
                        } else if (i != bbVar.f30545y) {
                            z2 = false;
                        }
                    }
                    z3 = z2;
                    i3 = i;
                    i = i2;
                } else {
                    z3 = false;
                    i3 = i;
                    i = Integer.MAX_VALUE;
                }
                if (z) {
                    if (obj == null) {
                        obj = avVar.f30532k;
                        i2 = i;
                        i = i3;
                        z2 = z3;
                    } else if (!obj.equals(avVar.f30532k)) {
                        z4 = false;
                        z = z4;
                        i2 = i;
                        i = i3;
                        z2 = z3;
                    }
                }
                z4 = z;
                z = z4;
                i2 = i;
                i = i3;
                z2 = z3;
            }
            if (z && !TextUtils.isEmpty(obj)) {
                this.f30552d = obj;
            }
            if (z2) {
                this.f30553e = i;
            } else if (i2 == 4) {
                this.f30553e = 3;
            } else {
                this.f30553e = i2;
            }
            this.f30554f = true;
        }
    }
}
