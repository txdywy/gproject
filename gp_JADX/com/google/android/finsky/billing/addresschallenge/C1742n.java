package com.google.android.finsky.billing.addresschallenge;

import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.billing.addresschallenge.p156a.C1704a;
import com.google.android.finsky.billing.addresschallenge.p156a.C1707b;
import com.google.android.finsky.billing.addresschallenge.p156a.C1709d;
import com.google.wireless.android.c.a.a.a;
import com.google.wireless.android.finsky.a.a.p;
import java.util.Collection;
import java.util.List;

public final class C1742n {
    public static View m9643a(ViewGroup viewGroup, Collection collection) {
        Pair pair = null;
        for (View view : collection) {
            Pair create;
            Rect rect = new Rect();
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            int i = rect.top;
            if (pair == null || i < ((Integer) pair.first).intValue()) {
                create = Pair.create(Integer.valueOf(i), view);
            } else {
                create = pair;
            }
            pair = create;
        }
        if (pair != null) {
            return (View) pair.second;
        }
        return null;
    }

    public static p m9645a(String str, List list) {
        if (!TextUtils.isEmpty(str)) {
            for (p pVar : list) {
                if (str.equals(pVar.c)) {
                    return pVar;
                }
            }
        }
        if (list.size() > 0) {
            return (p) list.get(0);
        }
        return null;
    }

    public static C1704a m9644a(a aVar) {
        C1707b c1707b = new C1707b();
        if (aVar.j != null) {
            c1707b.m9586a(aVar.j);
        }
        if (aVar.e != null) {
            c1707b.m9585a(C1709d.ADDRESS_LINE_1, aVar.e);
        }
        if (aVar.f != null) {
            c1707b.m9585a(C1709d.ADDRESS_LINE_2, aVar.f);
        }
        if (aVar.h != null) {
            c1707b.m9585a(C1709d.ADMIN_AREA, aVar.h);
        }
        if (aVar.g != null) {
            c1707b.m9585a(C1709d.LOCALITY, aVar.g);
        }
        if (aVar.k != null) {
            c1707b.m9585a(C1709d.DEPENDENT_LOCALITY, aVar.k);
        }
        if (aVar.i != null) {
            c1707b.m9585a(C1709d.POSTAL_CODE, aVar.i);
        }
        if (aVar.l != null) {
            c1707b.m9585a(C1709d.SORTING_CODE, aVar.l);
        }
        if (aVar.b != null) {
            c1707b.m9585a(C1709d.RECIPIENT, aVar.b);
        }
        if (aVar.m != null) {
            c1707b.f8915b = aVar.m;
        }
        return c1707b.m9584a();
    }
}
