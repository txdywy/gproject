package com.google.android.finsky.ratereview;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.app.C0254u;
import com.android.volley.C0660x;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.le;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;

final class C3965d implements C0660x {
    public final /* synthetic */ C0254u f20010a;
    public final /* synthetic */ C2651l f20011b;
    public final /* synthetic */ boolean f20012c;
    public final /* synthetic */ C3964c f20013d;

    C3965d(C3964c c3964c, C0254u c0254u, C2651l c2651l, boolean z) {
        this.f20013d = c3964c;
        this.f20010a = c0254u;
        this.f20011b = c2651l;
        this.f20012c = z;
    }

    public final /* synthetic */ void b_(Object obj) {
        int i = 0;
        le leVar = (le) obj;
        C3964c c3964c = this.f20013d;
        cv cvVar = leVar.f13004a;
        Context context = this.f20010a;
        C2651l c2651l = this.f20011b;
        boolean z = this.f20012c;
        if (!context.isFinishing()) {
            if (cvVar == null) {
                FinskyLog.m21669e("unexpected null user profile", new Object[0]);
                return;
            }
            if (z) {
                if (!c3964c.f20009g.m18672a()) {
                    Parcelable document = new Document(cvVar);
                    Intent intent = new Intent(context, PublicReviewsActivity.class);
                    intent.putExtra("author", document);
                    context.startActivity(intent);
                    i = 1;
                }
                if (i != 0) {
                    c2651l.mo3090a();
                    return;
                }
            }
            c2651l.mo3091a(new Document(cvVar));
        }
    }
}
