package com.google.android.instantapps.common.p219f;

import android.support.v7.widget.fr;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.instantapps.p309a.C5699f;
import java.util.ArrayList;
import java.util.List;

public final class C5766c extends C3472a {
    public final List f29169c = new ArrayList();
    public final SparseArray f29170d = new SparseArray();

    C5766c() {
    }

    public final int mo1040a(int i) {
        C5768e c5768e = (C5768e) C5699f.m26959a(m27147e(i));
        int a = c5768e.f29173b.mo1040a(i - c5768e.f29175d);
        if (this.f29170d.indexOfKey(a) < 0 || this.f29170d.get(a) == c5768e.f29173b) {
            this.f29170d.put(a, c5768e.f29173b);
            return a;
        }
        throw new IllegalArgumentException("Child Adapter already exists with view type - " + a);
    }

    public final int mo1039a() {
        int size = this.f29169c.size();
        if (size <= 0) {
            return 0;
        }
        C5768e c5768e = (C5768e) this.f29169c.get(size - 1);
        return c5768e.f29176e + c5768e.f29175d;
    }

    public final void mo3535a(C3474b c3474b, int i) {
        C5768e c5768e = (C5768e) C5699f.m26959a(m27147e(i));
        c5768e.f29173b.m17037b(c3474b, i - c5768e.f29175d);
    }

    private final C5768e m27147e(int i) {
        int i2 = 0;
        C5699f.m26963b(i >= 0);
        int size = this.f29169c.size();
        while (i2 < size) {
            C5768e c5768e = (C5768e) this.f29169c.get(i2);
            if (i < c5768e.f29175d + c5768e.f29176e) {
                return c5768e;
            }
            i2++;
        }
        return null;
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return (C3474b) ((C3472a) C5699f.m26959a((C3472a) this.f29170d.get(i))).mo1041a(viewGroup, i);
    }
}
