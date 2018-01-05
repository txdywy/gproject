package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C4952e;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.internal.bd;
import java.util.Collections;
import java.util.List;

final class C4934f extends C4931e {
    C4934f() {
    }

    public final /* synthetic */ C4949i mo4472a(Context context, Looper looper, bd bdVar, Object obj, C1632q c1632q, C1634r c1634r) {
        return new C4952e(context, looper, bdVar, (GoogleSignInOptions) obj, c1632q, c1634r);
    }

    public final /* synthetic */ List mo4473a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.m22964a();
    }
}
