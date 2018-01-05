package com.google.android.finsky.instantappsquickinstall;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;

@TargetApi(21)
public class InstantAppsInstallEntryActivity extends C1036b {
    public C2495w f17924C;
    public QuickInstallState f17925G;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1396e) C3947d.m18649a(C1396e.class)).mo1858a(this);
        if (bundle != null) {
            this.f17925G = (QuickInstallState) bundle.getParcelable("quickInstallState");
        }
        Intent intent = getIntent();
        if (this.f17925G == null) {
            C1473m.f7980a.aJ();
            ValidatedQuickInstallRequest a = C3615o.m17220a(this, intent, C2744a.m14784a((Activity) this));
            if (a == null) {
                setResult(0);
                FinskyLog.m21665c("intent validation failed, exiting", new Object[0]);
                finish();
                return;
            }
            C3617q c3617q = new C3617q(a);
            c3617q.f17968a = 100;
            m17199a(c3617q.m17222a());
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("quickInstallState", this.f17925G);
    }

    private final void m17200c(int i) {
        setResult(i);
        FinskyLog.m21659a("quick install session for package '%s' cancelled with result=%d", this.f17925G.f17928b.f17930a, Integer.valueOf(i));
        finish();
    }

    private final void m17199a(QuickInstallState quickInstallState) {
        if (quickInstallState.equals(this.f17925G)) {
            FinskyLog.m21662b("Asked to change state to the current state, this should not happen.", new Object[0]);
            return;
        }
        this.f17925G = quickInstallState;
        Parcelable parcelable;
        Intent intent;
        switch (this.f17925G.f17929c) {
            case 33:
                if (this.f17925G == null || this.f17925G.f17927a == null) {
                    throw new IllegalStateException("Cannot start purchase path without a valid state and document");
                }
                C2171b bo = C1473m.f7980a.bo();
                Account b = C1473m.f7980a.ap().mo1620b();
                if (this.f17924C == null) {
                    this.f17924C = C1473m.f7980a.dd().m13365a();
                }
                startActivityForResult(bo.mo2732a(b, this.f17925G.f17927a, null, 1, null, null, null, false, 0, this.f17924C), 33);
                return;
            case 100:
                if (this.f17925G == null) {
                    throw new IllegalStateException("cannot show install permissions dialog without a valid state");
                }
                parcelable = this.f17925G.f17928b;
                int i = this.f17925G.f17929c;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Can only show install dialog if request has been validated");
                }
                intent = new Intent(this, InstantAppsInstallDialogActivity.class);
                intent.putExtra("validatedRequest", parcelable);
                startActivityForResult(intent, i);
                return;
            case 200:
                if (this.f17925G == null || this.f17925G.f17927a == null) {
                    throw new IllegalStateException("Cannot show install screen without a valid state and a valid document");
                }
                parcelable = this.f17925G;
                C2495w c2495w = this.f17924C;
                if (parcelable == null || c2495w == null) {
                    throw new IllegalArgumentException(String.format("One or more required arguments for startup was null, state=%s, loggingContext=%s", new Object[]{parcelable, c2495w}));
                } else if (parcelable.f17929c != 200) {
                    throw new IllegalArgumentException(String.format("Asked to start in the wrong quick install state. Given state is %s", new Object[]{Integer.valueOf(parcelable.f17929c)}));
                } else if (parcelable.f17927a == null) {
                    throw new IllegalArgumentException("Cannot start install progress activity without document in the provided state, but it was null");
                } else {
                    intent = new Intent(this, InstantAppsInstallProgressActivity.class);
                    intent.putExtra("quickInstallState", parcelable);
                    c2495w.m13376a(intent);
                    intent.addFlags(268435456);
                    startActivity(intent);
                    finish();
                    return;
                }
            default:
                throw new IllegalStateException(String.format("Failed changing into unknown state=%s", new Object[]{Integer.valueOf(this.f17925G.f17929c)}));
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 33:
                if (i2 == -1) {
                    C3617q a = C3617q.m17221a(this.f17925G);
                    a.f17968a = 200;
                    m17199a(a.m17222a());
                    return;
                }
                m17200c(i2);
                return;
            case 100:
                if (intent == null) {
                    m17200c(0);
                    return;
                }
                Document document = (Document) intent.getParcelableExtra("document");
                if (document == null) {
                    m17200c(0);
                    return;
                }
                C3617q a2 = C3617q.m17221a(this.f17925G);
                a2.f17968a = 33;
                a2.f17970c = document;
                m17199a(a2.m17222a());
                return;
            case 200:
                m17200c(i2);
                return;
            default:
                throw new IllegalStateException("Unknown result received, request code=" + i);
        }
    }
}
