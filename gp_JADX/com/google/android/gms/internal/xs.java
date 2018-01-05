package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.C5164d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.zzc;

@C5302b
public final class xs {
    public tr f27717a;
    public boolean f27718b;

    public xs(Context context, String str) {
        String str2;
        yu.m26016a(context);
        try {
            tr trVar;
            IBinder a = DynamiteModule.m23913a(context, DynamiteModule.f26114g, "com.google.android.gms.ads.dynamite").m23923a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
            if (a == null) {
                trVar = null;
            } else {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                trVar = queryLocalInterface instanceof tr ? (tr) queryLocalInterface : new ts(a);
            }
            this.f27717a = trVar;
            C5164d.m23906a((Object) context);
            this.f27717a.mo4882a(C5164d.m23906a((Object) context), str);
            this.f27718b = true;
        } catch (zzc e) {
            str2 = "Cannot dynamite load clearcut";
            if (!C5329o.m25250a()) {
                Log.v("Ads", str2);
            }
        } catch (RemoteException e2) {
            str2 = "Cannot dynamite load clearcut";
            if (!C5329o.m25250a()) {
                Log.v("Ads", str2);
            }
        } catch (NullPointerException e3) {
            str2 = "Cannot dynamite load clearcut";
            if (!C5329o.m25250a()) {
                Log.v("Ads", str2);
            }
        }
    }
}
