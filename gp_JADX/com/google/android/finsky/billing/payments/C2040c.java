package com.google.android.finsky.billing.payments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.volley.C0700r;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.providers.C3947d;
import com.google.android.wallet.common.pub.a.a;
import com.google.android.wallet.common.pub.d;
import com.google.android.wallet.common.pub.e;
import com.google.android.wallet.common.pub.i;
import com.google.android.wallet.nfc.b;
import com.squareup.leakcanary.C7582R;
import p002a.C0002a;

public abstract class C2040c extends C1647h implements d {
    public C0002a f10505n;
    public C0002a f10506o;
    public C0986a f10507p;
    public int f10508q;

    public C2040c() {
        e eVar = new e();
    }

    public static void m10729a(String str, byte[] bArr, byte[] bArr2, Bundle bundle, Intent intent, int i) {
        C1647h.m9344a(intent, str);
        intent.putExtra("common_token", bArr);
        intent.putExtra("action_token", bArr2);
        intent.putExtra("instrument_manager_args", bundle);
        intent.putExtra("InstrumentManagerBaseActivitybackendId", i);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.instrument_manager_activity);
        ((C1357b) C3947d.m18649a(C1357b.class)).mo1767a(this);
        a.a = new C2044g(this, this.E);
        com.google.android.wallet.common.c.a.a((C0700r) this.f10505n.mo1a());
        com.google.android.wallet.common.c.a.b((C0700r) this.f10506o.mo1a());
        if (m10731i() == null) {
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("common_token");
            byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("action_token");
            Bundle bundle2 = (Bundle) getIntent().getParcelableExtra("instrument_manager_args");
            this.f10508q = getIntent().getIntExtra("InstrumentManagerBaseActivitybackendId", 0);
            H_().mo284a().mo325a((int) C7582R.id.content_frame, com.google.android.wallet.instrumentmanager.c.a.a(this.f10507p.mo1183b(this.B), byteArrayExtra, byteArrayExtra2, new i(mo2592h()).a(), bundle2)).mo334c();
        }
    }

    protected void onDestroy() {
        a.a = null;
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Fragment i = m10731i();
        if (i instanceof b) {
            e.a((b) i, intent);
        }
    }

    public final void m10732a(int i, Bundle bundle) {
        m10730c(i, bundle);
        finish();
    }

    public final void m10733b(int i, Bundle bundle) {
        m10730c(i, bundle);
    }

    private final Fragment m10731i() {
        return H_().mo281a((int) C7582R.id.content_frame);
    }

    private final void m10730c(int i, Bundle bundle) {
        switch (i) {
            case 50:
                Intent intent = new Intent();
                intent.putExtra("instrument_id", bundle.getString("com.google.android.wallet.instrumentmanager.INSTRUMENT_ID"));
                intent.putExtra("instrument_token", bundle.getByteArray("com.google.android.wallet.instrumentmanager.INSTRUMENT_TOKEN"));
                intent.putExtra("callback_data", bundle.getByteArray("com.google.android.wallet.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN"));
                this.E.m13376a(intent);
                setResult(-1, intent);
                return;
            case 51:
            case 52:
                setResult(0);
                return;
            default:
                throw new IllegalStateException("Unexpected InstrumentManager resultCode: " + i);
        }
    }

    protected int mo2592h() {
        return C2043f.m10742a(this.f10508q);
    }
}
