package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.c.a.ak;
import com.google.wireless.android.finsky.dfe.c.a.an;
import com.google.wireless.android.finsky.dfe.nano.gq;
import com.squareup.leakcanary.C7582R;

public class AddRecoveryOptionActivity extends C1647h implements OnClickListener {
    public final C2910a f9612n = C1473m.f7980a.au();
    public PlayActionButtonV2 f9613o;
    public PlayActionButtonV2 f9614p;
    public Account f9615q;
    public String f9616r;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f9615q = (Account) intent.getParcelableExtra("AddRecoveryOptionPromptDialog.account");
        this.f9616r = intent.getStringExtra("AddRecoveryOptionPromptDialog.initialUrl");
        setContentView((int) C7582R.layout.add_recovery_option_activity);
        this.f9613o = (PlayActionButtonV2) findViewById(C7582R.id.continue_button);
        this.f9614p = (PlayActionButtonV2) findViewById(C7582R.id.secondary_button);
    }

    protected void onStart() {
        super.onStart();
        this.f9613o.m6000a(3, (int) C7582R.string.continue_text, (OnClickListener) this);
        this.f9613o.setVisibility(0);
        this.f9614p.m6000a(3, (int) C7582R.string.skip, (OnClickListener) this);
        this.f9614p.setVisibility(0);
        ae.m9217a((TextView) findViewById(C7582R.id.message), getString(C7582R.string.prompt_for_recovery_phone_text, new Object[]{this.B}));
    }

    protected void onResume() {
        super.onResume();
        C1601a.m9199a(this, getString(C7582R.string.prompt_for_recovery_phone_title), findViewById(C7582R.id.title), false);
    }

    public void onBackPressed() {
        super.onBackPressed();
        m10027h();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            FinskyLog.m21669e("The request code is not correct. This should never happen!", new Object[0]);
            finish();
        }
        if (i2 == 0) {
            m10027h();
        } else {
            this.f9612n.m15200j(this.f9615q.name);
            setResult(-1);
        }
        finish();
    }

    private final void m10027h() {
        int min;
        C2910a c2910a = this.f9612n;
        String str = this.f9615q.name;
        ak h = c2910a.m15198h(str);
        if (h != null) {
            min = Math.min(h.c + 1, c2910a.m15199i(str));
        } else {
            min = 1;
        }
        gq gqVar = new gq();
        gqVar.f = new an();
        ak akVar = new ak();
        akVar.a(false);
        akVar.a(System.currentTimeMillis());
        akVar.a(min);
        gqVar.f.c = akVar;
        c2910a.m15187a(str, gqVar, 11, null, null);
        setResult(0);
    }

    protected final int mo2368f() {
        return 6340;
    }

    public void onClick(View view) {
        if (view == this.f9613o) {
            this.E.m13379b(new C2475d(this).m13256a(6342));
            startActivityForResult(AuthenticatedWebViewActivity.m10032a(this.f9615q, this.f9616r, (String) C0955b.da.m28964b(), this.E), 1);
        } else if (view == this.f9614p) {
            this.E.m13379b(new C2475d(this).m13256a(6343));
            m10027h();
            finish();
        }
    }
}
