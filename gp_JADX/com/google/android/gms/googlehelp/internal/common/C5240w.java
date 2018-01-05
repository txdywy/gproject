package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C5096b;
import com.google.android.gms.feedback.C5188a;
import com.google.android.gms.googlehelp.C5210a;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;

final class C5240w extends C5220c {
    public /* synthetic */ C5210a f26335a;
    public /* synthetic */ C5188a f26336b;
    public /* synthetic */ Context f26337c;
    public /* synthetic */ C5223f f26338d;
    public /* synthetic */ C5239v f26339e;

    C5240w(C5239v c5239v, C5210a c5210a, C5188a c5188a, Context context, C5223f c5223f) {
        this.f26339e = c5239v;
        this.f26335a = c5210a;
        this.f26336b = c5188a;
        this.f26337c = context;
        this.f26338d = c5223f;
    }

    public final void mo4642a(GoogleHelp googleHelp) {
        long nanoTime = System.nanoTime();
        this.f26339e.f26330a.putExtra("EXTRA_START_TICK", nanoTime);
        if (!(this.f26335a == null && this.f26336b == null)) {
            C5234q c5234q = this.f26339e.f26334x;
            Context context = this.f26337c;
            C5210a c5210a = this.f26335a;
            C5188a c5188a = this.f26336b;
            File file = this.f26339e.f26332v;
            if (c5210a != null) {
                googleHelp.f26257A = true;
                C5234q.m24052a(new C5233p(context, googleHelp, nanoTime));
            }
            if (c5188a != null) {
                googleHelp.f26258B = true;
                C5234q.m24052a(new C5221d(context, googleHelp, nanoTime));
                C5234q.m24052a(new C5232o(context, googleHelp, nanoTime));
            }
        }
        googleHelp.f26289z = C5096b.f25939b;
        if (googleHelp.f26286w != null) {
            TogglingData togglingData = googleHelp.f26286w;
            C5234q c5234q2 = this.f26339e.f26334x;
            togglingData.f26305c = C5234q.m24050a(this.f26339e.f26333w);
        }
        if (this.f26335a != null) {
            c5234q2 = this.f26339e.f26334x;
            C5223f c5223f = this.f26338d;
            Activity activity = this.f26339e.f26333w;
            Intent intent = this.f26339e.f26330a;
            c5234q2.f26320b = false;
            Handler handler = new Handler(Looper.getMainLooper());
            Runnable c5241x = new C5241x(c5234q2, googleHelp, c5223f, activity, intent);
            handler.postDelayed(c5241x, (long) googleHelp.f26259C);
            Thread b = C5234q.m24054b(new C5242y(c5234q2, handler, c5241x, googleHelp, c5223f, activity, intent));
            b.setPriority(10);
            b.start();
            return;
        }
        C5234q c5234q3 = this.f26339e.f26334x;
        C5234q.m24051a(this.f26338d, this.f26339e.f26333w, this.f26339e.f26330a, googleHelp);
    }
}
