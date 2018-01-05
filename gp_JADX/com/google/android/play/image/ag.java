package com.google.android.play.image;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p037h.C0314i;
import android.text.TextUtils;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0700r;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.p354b.C6322j;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ag implements C1294w {
    public ab f7695c;
    public final C0700r f7696d;
    public final int f7697e;
    public final ae f7698f;
    public final HashMap f7699g = new HashMap();
    public final HashMap f7700h = new HashMap();
    public final Handler f7701i = new Handler(Looper.getMainLooper());
    public Runnable f7702j;
    public by f7703k;
    public boolean f7704l;
    public aa f7705m;
    public as f7706n;
    public C0314i f7707o;
    public C1279z f7708p;

    public ag(C0700r c0700r, int i, int i2, by byVar) {
        int max;
        this.f7696d = c0700r;
        this.f7706n = new as(this);
        this.f7706n.a();
        int intValue = ((Integer) C6322j.f31609w.m28964b()).intValue();
        if (intValue == -1) {
            max = Math.max(3145728, (int) (((Float) C6322j.f31610x.m28964b()).floatValue() * ((float) ((i * i2) * 4))));
        } else {
            max = (intValue * MemoryMappedFileBuffer.DEFAULT_PADDING) * MemoryMappedFileBuffer.DEFAULT_PADDING;
        }
        this.f7697e = Math.max(((Integer) C6322j.f31611y.m28964b()).intValue(), max / 6);
        this.f7698f = new ae(max);
        this.f7707o = new C0314i(50);
        this.f7703k = byVar;
    }

    public final void mo1676a(C1279z c1279z) {
        this.f7708p = c1279z;
    }

    public final void mo1674a(aa aaVar) {
        this.f7705m = aaVar;
    }

    public final void mo1675a(ab abVar) {
        this.f7695c = abVar;
    }

    public final void mo1673a(int i) {
        List arrayList = new ArrayList();
        for (String str : this.f7699g.keySet()) {
            if (((ar) this.f7699g.get(str)).a == null || ((ar) this.f7699g.get(str)).a.m4369c() < i) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            this.f7699g.remove((String) obj);
        }
    }

    public final void mo1678b() {
        this.f7698f.a();
    }

    private final void m7718a(String str, aq aqVar, an anVar) {
        ar arVar = (ar) this.f7699g.get(str);
        if (arVar != null) {
            arVar.c.add(anVar);
            return;
        }
        C0656n a = aqVar.a();
        this.f7696d.m4510a(a);
        this.f7699g.put(str, new ar(this, a, anVar));
    }

    private final void m7717a(an anVar, String str, ao aoVar, int i, int i2) {
        C0660x ahVar = new ah(anVar);
        anVar.g = ahVar;
        this.f7706n.a(str, aoVar, i, i2, ahVar);
    }

    public final x mo1672a(String str, int i, int i2, boolean z, y yVar, boolean z2) {
        String a;
        int i3 = -1;
        if (i > 0 || i2 > 0) {
            i3 = bp.m28936a().f31546b.a();
            a = bf.a(str, i, i2, i3);
        } else {
            a = str;
        }
        aq aiVar = new ai(this, i, i2, a, str, i3, z2);
        if (TextUtils.isEmpty(str)) {
            return new an(this, null, null, null, i, i2, null);
        }
        Bitmap bitmap = null;
        if (!(z2 || this.f7707o == null || this.f7707o.m1692a((Object) str) == null)) {
            bitmap = (Bitmap) ((WeakReference) this.f7707o.m1692a((Object) str)).get();
        }
        if (bitmap == null || (((double) bitmap.getWidth()) * 1.25d < ((double) i) && ((double) bitmap.getHeight()) * 1.25d < ((double) i2))) {
            an anVar;
            ao aoVar;
            if (bitmap == null || !z) {
                if (this.f7708p != null) {
                    this.f7708p.mo1668a(false);
                }
                anVar = new an(this, null, str, a, i, i2, yVar);
            } else {
                if (this.f7708p != null) {
                    this.f7708p.mo1668a(true);
                }
                anVar = new an(this, bitmap, str, a, i, i2, yVar);
            }
            if (z2) {
                aoVar = null;
            } else {
                aoVar = (ao) this.f7698f.a.m1692a((Object) str);
            }
            if (aoVar != null && aoVar.a == null) {
                PlayCommonLog.c("An invalid cache entry was loaded.", new Object[0]);
                aoVar = null;
            }
            if (aoVar != null) {
                if (i3 < aoVar.d || ((double) i) > ((double) aoVar.b) * 1.25d || ((double) i2) > ((double) aoVar.c) * 1.25d) {
                    if (z) {
                        m7717a(anVar, str, aoVar, i, i2);
                    }
                    m7718a(a, aiVar, anVar);
                    anVar.h = true;
                } else {
                    m7717a(anVar, str, aoVar, i, i2);
                }
                return anVar;
            }
            if (z && this.f7695c != null) {
                this.f7695c.mo2358a(anVar, this.f7698f);
            }
            m7718a(a, aiVar, anVar);
            anVar.h = true;
            return anVar;
        }
        if (this.f7708p != null) {
            this.f7708p.mo1666a();
        }
        return new an(this, bitmap, str, a, i, i2, yVar);
    }

    public ap mo1679a(String str, int i, int i2, int i3, C0660x c0660x, C0657w c0657w) {
        return new ap(str, c0660x, i, i2, i3, c0657w);
    }

    public final x mo1671a(String str, int i, int i2, y yVar) {
        return mo1672a(str, i, i2, true, yVar, false);
    }

    public final x mo1677b(String str, int i, int i2, y yVar) {
        return mo1672a(str, i, i2, false, yVar, false);
    }

    public final /* synthetic */ u mo1670a() {
        return this.f7698f;
    }
}
