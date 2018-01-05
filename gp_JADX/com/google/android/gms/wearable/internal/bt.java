package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.bd;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class bt extends C4951c {
    public final av f28593C;
    public final av f28594D;
    public final av f28595E;
    public final av f28596F;
    public final av f28597G;
    public final av f28598H;
    public final av f28599I;
    public final bw f28600J;
    public final ExecutorService f28601a;
    public final av f28602b;

    public bt(Context context, Looper looper, C1632q c1632q, C1634r c1634r, bd bdVar) {
        this(context, looper, c1632q, c1634r, bdVar, Executors.newCachedThreadPool(), bw.m26784a(context));
    }

    private bt(Context context, Looper looper, C1632q c1632q, C1634r c1634r, bd bdVar, ExecutorService executorService, bw bwVar) {
        super(context, looper, 14, bdVar, c1632q, c1634r);
        this.f28602b = new av();
        this.f28593C = new av();
        this.f28594D = new av();
        this.f28595E = new av();
        this.f28596F = new av();
        this.f28597G = new av();
        this.f28598H = new av();
        this.f28599I = new av();
        this.f28601a = (ExecutorService) am.m23733a((Object) executorService);
        this.f28600J = bwVar;
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof at ? (at) queryLocalInterface : new au(iBinder);
    }

    protected final void mo5111a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.d("WearableClient", "onPostInitHandler: statusCode " + i);
        }
        if (i == 0) {
            this.f28602b.m26753a(iBinder);
            this.f28593C.m26753a(iBinder);
            this.f28594D.m26753a(iBinder);
            this.f28595E.m26753a(iBinder);
            this.f28596F.m26753a(iBinder);
            this.f28597G.m26753a(iBinder);
            this.f28598H.m26753a(iBinder);
            this.f28599I.m26753a(iBinder);
        }
        super.mo5111a(i, iBinder, bundle, i2);
    }

    public final void mo4509a(ax axVar) {
        int i = 0;
        if (!mo5112m()) {
            try {
                Bundle bundle = this.f25418k.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i = bundle.getInt("com.google.android.wearable.api.version", 0);
                }
                if (i < C5095d.f25936c) {
                    Log.w("WearableClient", "Android Wear out of date. Requires API version " + C5095d.f25936c + " but found " + i);
                    Context context = this.f25418k;
                    Context context2 = this.f25418k;
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context2.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    m23012a(axVar, 6, PendingIntent.getActivity(context, 0, intent, 0));
                    return;
                }
            } catch (NameNotFoundException e) {
                m23012a(axVar, 16, null);
                return;
            }
        }
        super.mo4509a(axVar);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    protected final String cu_() {
        return "com.google.android.gms.wearable.BIND";
    }

    public final boolean mo5112m() {
        return !this.f28600J.m26789a("com.google.android.wearable.app.cn");
    }

    protected final String mo5113r() {
        return this.f28600J.m26789a("com.google.android.wearable.app.cn") ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }
}
