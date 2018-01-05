package com.google.android.finsky.by.p132a;

import android.text.TextUtils;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.w;
import com.google.wireless.android.finsky.dfe.nano.cv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class C2225x implements Runnable {
    public final /* synthetic */ cv f11097a;
    public final /* synthetic */ C2224w f11098b;

    C2225x(C2224w c2224w, cv cvVar) {
        this.f11098b = c2224w;
        this.f11097a = cvVar;
    }

    public final void run() {
        if (this.f11098b.f11096b.f11080j == null) {
            FinskyLog.m21669e("Expected pending replication request.", new Object[0]);
            return;
        }
        List arrayList = new ArrayList();
        for (w wVar : this.f11097a.a) {
            String a;
            if (TextUtils.isEmpty(wVar.e)) {
                a = C2229h.m11636a(wVar.d);
            } else {
                a = wVar.e;
            }
            if (!Arrays.equals((byte[]) this.f11098b.f11095a.get(a), this.f11098b.f11096b.f11077g.mo2791f(a))) {
                if (this.f11098b.f11096b.f11081k) {
                    this.f11098b.f11096b.m11621a(4, null, null, null);
                }
                FinskyLog.m21665c("Tokens changed, not applying library update for libraryId=%s", a);
            } else if (this.f11098b.f11096b.m11629a(wVar, this.f11098b.f11096b.f11080j.f10995c)) {
                arrayList.add(a);
            }
        }
        if (!arrayList.isEmpty()) {
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                strArr[i] = (String) arrayList.get(i);
            }
            this.f11098b.f11096b.m11626a(new aa(strArr, this.f11098b.f11096b.f11080j.f10994b, String.valueOf(this.f11098b.f11096b.f11080j.f10995c).concat("[c]")));
        } else if (this.f11098b.f11096b.f11080j.f10994b != null) {
            this.f11098b.f11096b.f11074d.post(this.f11098b.f11096b.f11080j.f10994b);
        }
        this.f11098b.f11096b.f11080j = null;
        this.f11098b.f11096b.m11625a(C2219r.f11071a);
    }
}
