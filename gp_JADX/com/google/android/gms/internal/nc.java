package com.google.android.gms.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C4966t;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.C5110o;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.ba;
import com.google.android.gms.common.internal.bd;
import com.google.android.gms.common.internal.zzbt;

public final class nc extends C4951c implements mt {
    public final Bundle f27206C;
    public Integer f27207D;
    public final boolean f27208a;
    public final bd f27209b;

    private nc(Context context, Looper looper, bd bdVar, Bundle bundle, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 44, bdVar, c1632q, c1634r);
        this.f27208a = true;
        this.f27209b = bdVar;
        this.f27206C = bundle;
        this.f27207D = bdVar.f26011h;
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof na ? (na) queryLocalInterface : new nb(iBinder);
    }

    public final void mo4824a(C5110o c5110o, boolean z) {
        try {
            ((na) m23032u()).mo4822a(c5110o, this.f27207D.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    protected final String mo4483b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected final String cu_() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void mo4511f() {
        try {
            ((na) m23032u()).mo4821a(this.f27207D.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void mo4512g() {
        mo4509a(new ba(this));
    }

    public final boolean mo4826l() {
        return this.f27208a;
    }

    public nc(Context context, Looper looper, bd bdVar, C1632q c1632q, C1634r c1634r) {
        mu muVar = bdVar.f26010g;
        Integer num = bdVar.f26011h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", bdVar.f26004a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (muVar != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", muVar.f27197b);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", muVar.f27198c);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", muVar.f27199d);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", muVar.f27200e);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", muVar.f27201f);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", muVar.f27202g);
            if (muVar.f27203h != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", muVar.f27203h.longValue());
            }
            if (muVar.f27204i != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", muVar.f27204i.longValue());
            }
        }
        this(context, looper, bdVar, bundle, c1632q, c1634r);
    }

    public final void mo4825a(my myVar) {
        am.m23734a((Object) myVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            bd bdVar = this.f27209b;
            Account account = bdVar.f26004a != null ? bdVar.f26004a : new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C4966t.m23100a(this.f25418k).m23105a();
            }
            ((na) m23032u()).mo4823a(new zzeda(new zzbt(account, this.f27207D.intValue(), googleSignInAccount)), myVar);
        } catch (Throwable e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                myVar.mo4589a(new zzedc());
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    protected final Bundle mo4514i() {
        if (!this.f25418k.getPackageName().equals(this.f27209b.f26008e)) {
            this.f27206C.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f27209b.f26008e);
        }
        return this.f27206C;
    }
}
