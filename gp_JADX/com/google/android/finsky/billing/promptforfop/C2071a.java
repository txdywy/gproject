package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.profile.C2063t;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public abstract class C2071a extends C1647h implements C2070e {
    public byte[] f10610C;
    public Account f10611n;

    protected abstract void mo2615a(int i, int i2);

    protected abstract int mo2616h();

    protected abstract Fragment mo1274i();

    protected abstract int mo2617j();

    protected abstract int mo2618k();

    protected abstract int mo2619l();

    public static void m10837a(Account account, byte[] bArr, Intent intent) {
        intent.putExtra("PromptForFopBaseActivity.account", account);
        C1647h.m9344a(intent, account.name);
        intent.putExtra("PromptForFopBaseActivity.server_logs_cookie", bArr);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3982a bK = C1473m.f7980a.bK();
        if (bK.mo3875b()) {
            bK.mo3879f();
            finish();
            return;
        }
        setContentView(mo2616h());
        this.f10611n = (Account) getIntent().getParcelableExtra("PromptForFopBaseActivity.account");
        if (this.f10611n == null) {
            this.f10611n = C1473m.f7980a.mo2041U().mo1183b(this.B);
        }
        this.f10610C = getIntent().getByteArrayExtra("PromptForFopBaseActivity.server_logs_cookie");
        if (bundle == null) {
            C0957n b = C0954a.f5825U.m5777b(this.f10611n.name);
            b.m5763a(Integer.valueOf(((Integer) b.m5760a()).intValue() + 1));
        }
    }

    protected void onResume() {
        super.onResume();
        if (H_().mo283a("PromptForFopBaseActivity.fragment") == null) {
            H_().mo284a().mo326a(C7582R.id.content_frame, mo1274i(), "PromptForFopBaseActivity.fragment").mo334c();
        }
    }

    public final void mo2611n() {
        C0954a.f5826V.m5777b(this.f10611n.name).m5763a(Boolean.valueOf(true));
        mo2615a(C7582R.string.setup_account_success, 1005);
    }

    public final void mo2612o() {
        this.E.m13367a(new C2474c(mo2617j()).m13240a(this.f10610C));
        C2063t.m10821a(this.f10611n.name);
        setResult(-1);
        finish();
    }

    public final void mo2613p() {
        this.E.m13367a(new C2474c(mo2618k()).m13240a(this.f10610C));
        mo2615a(C7582R.string.setup_account_fatal_error, 1004);
    }

    public final void mo2614q() {
        this.E.m13367a(new C2474c(mo2619l()).m13240a(this.f10610C));
        String str = this.f10611n.name;
        C0954a.f5821Q.m5777b(str).m5765c();
        FinskyLog.m21659a("Invalidated has_fop cache. (account=%s)", FinskyLog.m21655a(str));
        C2063t.m10821a(str);
        mo2615a(C7582R.string.setup_account_success, 1003);
    }
}
