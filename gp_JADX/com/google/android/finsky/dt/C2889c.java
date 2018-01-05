package com.google.android.finsky.dt;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p187g.C3151c;
import java.util.List;

public final class C2889c {
    public final C3300k f15386a;
    public final C3151c f15387b;
    public final Handler f15388c = new Handler(Looper.getMainLooper());

    public C2889c(C3300k c3300k, C3151c c3151c) {
        this.f15386a = c3300k;
        this.f15387b = c3151c;
    }

    public final void m15136a(List list) {
        int i;
        int i2 = 0;
        Document[] documentArr = (Document[]) list.toArray(new Document[0]);
        String[] strArr = new String[documentArr.length];
        for (i = 0; i < documentArr.length; i++) {
            strArr[i] = documentArr[i].cf();
        }
        this.f15387b.mo3332a(strArr, new C2891d(this));
        i = strArr.length;
        while (i2 < i) {
            this.f15388c.postDelayed(new C2892e(this, strArr[i2]), (long) ((Integer) C0955b.gh.m28964b()).intValue());
            i2++;
        }
    }
}
