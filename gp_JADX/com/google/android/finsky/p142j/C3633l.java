package com.google.android.finsky.p142j;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import android.support.v4.app.Fragment;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.wallet.ui.common.a;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class C3633l extends C0141p {
    public C3635n af;
    public ArrayList ag;

    public static C3633l m17228a(C3632i[] c3632iArr, C3632i c3632i) {
        Fragment c3633l = new C3633l();
        Bundle bundle = new Bundle();
        bundle.putInt("sort_type", c3632i.f17997g);
        ArrayList arrayList = new ArrayList();
        for (C3632i c3632i2 : c3632iArr) {
            if (c3632i2.f18001k) {
                arrayList.add(Integer.valueOf(c3632i2.f17997g));
            }
        }
        bundle.putIntegerArrayList("sort_options", arrayList);
        c3633l.m600f(bundle);
        return c3633l;
    }

    public final Dialog mo143a(Bundle bundle) {
        int i;
        a aVar = new a(m603h());
        aVar.a(m605i().getString(C7582R.string.sort_dialog_title));
        this.ag = this.f760q.getIntegerArrayList("sort_options");
        int indexOf = this.ag.indexOf(Integer.valueOf(this.f760q.getInt("sort_type")));
        if (indexOf == -1) {
            FinskyLog.m21659a("Tried to set sort type of ordinal %d, but it isn't currently available in the dialog", Integer.valueOf(this.f760q.getInt("sort_type")));
            i = 0;
        } else {
            i = indexOf;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.ag;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(C3632i.values()[((Integer) obj).intValue()].m17227a(m601g()));
        }
        aVar.a((CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]), i, new C3634m(this));
        return aVar.a();
    }

    public final void m17230a(C3632i c3632i) {
        this.f760q.putInt("sort_type", c3632i.f17997g);
    }
}
