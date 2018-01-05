package com.google.android.finsky.billing.storedvalue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1799o;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.lightpurchase.PurchaseActivity;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class StoredValueTopUpActivity extends aa implements OnItemClickListener, C0998m, C1087t, C1056b {
    public final C2471a f10667q = C1473m.f7980a.aR();
    public C2097a f10668r;
    public View f10669s;
    public ListView f10670t;
    public Document[] f10671u;
    public ButtonBar f10672v;
    public int f10673w = 0;
    public C2495w f10674x;
    public String f10675y;
    public String f10676z;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.billing_topup_chooser);
        this.f10669s = findViewById(C7582R.id.loading_indicator);
        this.f10670t = (ListView) findViewById(C7582R.id.choices);
        this.f10672v = (ButtonBar) findViewById(C7582R.id.button_bar);
        this.f10672v.setPositiveButtonTitle((int) C7582R.string.ok);
        this.f10672v.setNegativeButtonTitle((int) C7582R.string.cancel);
        this.f10672v.setClickListener(this);
        m10959k();
        this.f10676z = getIntent().getStringExtra("authAccount");
        if (bundle == null) {
            this.f10668r = C2097a.m10963a(this.f10676z, getIntent().getStringExtra("list_url"));
            H_().mo284a().mo328a(this.f10668r, "list_sidecar").mo334c();
        } else {
            this.f10675y = bundle.getString("selected_document_formatted_amount");
            this.f10673w = bundle.getInt("last_shown_error");
            this.f10668r = (C2097a) H_().mo283a("list_sidecar");
        }
        this.f10674x = this.f10667q.m13180a(bundle, getIntent());
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("last_shown_error", this.f10673w);
        bundle.putString("selected_document_formatted_amount", this.f10675y);
        this.f10674x.m13377a(bundle);
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        m10959k();
        this.f10674x = this.f10667q.m13179a(bundle);
    }

    protected void onStart() {
        super.onStart();
        this.f10668r.m6757a((C1087t) this);
        if (this.f10668r.f6948l == 0) {
            C1089s c1089s = this.f10668r;
            c1089s.f10677a.m14699n();
            c1089s.m6758b(1, 0);
        }
    }

    protected void onStop() {
        this.f10668r.m6757a(null);
        super.onStop();
    }

    public final void mo1423a(C1089s c1089s) {
        this.f10669s.setVisibility(8);
        this.f10670t.setVisibility(8);
        this.f10672v.setVisibility(4);
        int i = c1089s.f6948l;
        if (i == 2) {
            this.f10671u = this.f10668r.f10677a.f14908a.m14643b();
            List arrayList = new ArrayList(this.f10671u.length);
            for (Document document : this.f10671u) {
                arrayList.add(document.f14885a.f12100g);
            }
            this.f10670t.setAdapter(new ArrayAdapter(this, 17367055, arrayList));
            this.f10670t.setItemsCanFocus(false);
            this.f10670t.setChoiceMode(1);
            this.f10670t.setOnItemClickListener(this);
            this.f10670t.setVisibility(0);
            this.f10672v.setVisibility(0);
            m10959k();
        } else if (i == 1) {
            this.f10669s.setVisibility(0);
        } else if (c1089s.f6948l != 3) {
        } else {
            if (this.f10673w == c1089s.ag) {
                FinskyLog.m21659a("Already showed error %d, ignoring.", Integer.valueOf(this.f10673w));
                return;
            }
            String a;
            this.f10673w = c1089s.ag;
            if (c1089s.af == 0) {
                a = C1290m.m7702a(C1473m.f7980a.f7981b, this.f10668r.f10678b);
            } else if (c1089s.af == 1) {
                a = C1473m.f7980a.m8582a((int) C7582R.string.topup_not_available);
            } else {
                a = null;
            }
            if (a != null) {
                C1508k c1508k = new C1508k();
                c1508k.m8852a(a).m8860d((int) C7582R.string.ok).m8851a(null, 0, null);
                c1508k.mo2272a().m625a(H_(), "error_dialog");
                return;
            }
            FinskyLog.m21665c("Received error without error message.", new Object[0]);
            setResult(0);
            finish();
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m10959k();
    }

    private final void m10959k() {
        this.f10672v.setPositiveButtonEnabled(this.f10670t.getCheckedItemPosition() != -1);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            Intent intent2 = new Intent();
            if (i2 == -1) {
                intent2.putExtra("topUpResult", intent.getParcelableExtra("PurchaseActivity.topupResult"));
                this.f10674x.m13376a(intent2);
                Toast.makeText(this, getString(C7582R.string.topup_success, new Object[]{this.f10675y}), 0).show();
                C1473m.f7980a.cw().m9406a(this.f10676z);
            }
            setResult(i2, intent2);
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void u_() {
        Document document = this.f10671u[this.f10670t.getCheckedItemPosition()];
        bl e = document.m14649e(1);
        if (e == null) {
            FinskyLog.m21665c("Document selected without PURCHASE offer. Ignoring.", new Object[0]);
            return;
        }
        this.f10675y = e.f11917g;
        C1799o a = PurchaseParams.m9747b().m9790a(document);
        a.f9333d = 1;
        startActivityForResult(PurchaseActivity.m10038a(C1473m.f7980a.mo2041U().mo1183b(this.f10676z), a.m9786a(), document.f14885a.f12087D, null, this.f10674x), 1);
    }

    public final void v_() {
        setResult(0);
        finish();
    }

    public final void mo1202a(int i, Bundle bundle) {
        if (i == 0) {
            setResult(0);
            finish();
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
    }
}
