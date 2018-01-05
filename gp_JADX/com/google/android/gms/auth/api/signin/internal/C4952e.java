package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.C4936b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.bd;

public final class C4952e extends C4951c {
    public final GoogleSignInOptions f25436a;

    public C4952e(Context context, Looper looper, bd bdVar, GoogleSignInOptions googleSignInOptions, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 91, bdVar, c1632q, c1634r);
        if (googleSignInOptions == null) {
            googleSignInOptions = new C4936b().m22969b();
        }
        if (!bdVar.f26006c.isEmpty()) {
            C4936b c4936b = new C4936b(googleSignInOptions);
            for (Scope a : bdVar.f26006c) {
                c4936b.m22968a(a, new Scope[0]);
            }
            googleSignInOptions = c4936b.m22969b();
        }
        this.f25436a = googleSignInOptions;
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof C4962p ? (C4962p) queryLocalInterface : new C4963q(iBinder);
    }

    protected final String mo4483b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final boolean mo4484c() {
        return true;
    }

    protected final String cu_() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final Intent mo4486d() {
        Context context = this.f25418k;
        GoogleSignInOptions googleSignInOptions = this.f25436a;
        C4953f.f25437a.m24290a("GoogleSignInCommon", "getSignInIntent()");
        Parcelable signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setClass(context, SignInHubActivity.class);
        intent.putExtra("config", signInConfiguration);
        return intent;
    }
}
