package com.google.android.finsky.billing.storedvalue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.api.m;
import com.google.android.finsky.at.k;
import com.google.android.finsky.billing.a.h;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.o;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.lightpurchase.PurchaseActivity;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public final class StoredValueTopUpActivity extends android.support.v7.app.aa implements AdapterView$OnItemClickListener, com.google.android.finsky.at.m, com.google.android.finsky.billing.common.t, com.google.android.finsky.frameworkviews.b
{

    public final com.google.android.finsky.d.a q;
    public com.google.android.finsky.billing.storedvalue.a r;
    public View s;
    public ListView t;
    public Document[] u;
    public ButtonBar v;
    public int w;
    public com.google.android.finsky.d.w x;
    public String y;
    public String z;

    StoredValueTopUpActivity() {
        android.support.v7.app.aa();
        this.q = com.google.android.finsky.m.a.aR();
        this.w = 0;
    }

    private final void k() {
        if (this.t.getCheckedItemPosition() != -1)
            v0 = 1;
        else
            v0 = 0;
        this.v.setPositiveButtonEnabled(v0);
    }

    public final void a(int p0, Bundle p1) {
        if (p0 == 0) {
            this.setResult(0);
            this.finish();
        }
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        this.v.setVisibility(4);
        if (p0.l == 2) {
            this.u = this.r.a.a.b();
            v1 = new ArrayList(this.u.length);
            v0 = 0;
            while (v0 < this.u.length) {
                v1.add(this.u[v0].a.g);
                v0 = v0 + 1;
            }
            this.t.setAdapter(new ArrayAdapter(this, 17367055, v1));
            this.t.setItemsCanFocus(0);
            this.t.setChoiceMode(1);
            this.t.setOnItemClickListener(this);
            this.t.setVisibility(0);
            this.v.setVisibility(0);
            this.k();
        }
        else if (p0.l == 1)
            this.s.setVisibility(0);
        else if (p0.l == 3) {
            if (this.w == p0.ag) {
                v1 = new Object[1];
                v1[0] = Integer.valueOf(this.w);
                FinskyLog.a("Already showed error %d, ignoring.", v1);
            }
            else {
                this.w = p0.ag;
                if (p0.af == 0)
                    v0 = com.google.android.finsky.api.m.a(com.google.android.finsky.m.a.b, this.r.b);
                else if (p0.af == 1)
                    v0 = com.google.android.finsky.m.a.a(2131953272);
                else
                    v0 = 0;
                if (v0 != 0) {
                    v3 = new com.google.android.finsky.at.k();
                    v3.a(v0).d(2131952688).a(0, 0, 0);
                    v3.a().a(this.H_(), "error_dialog");
                }
                else {
                    FinskyLog.c("Received error without error message.", new Object[0]);
                    this.setResult(0);
                    this.finish();
                }
            }
        }
    }

    public final void b(int p0, Bundle p1) {
    }

    public final void f_(int p0) {
    }

    protected void onActivityResult(int p0, int p1, Intent p2) {
        if (p0 == 1) {
            v0 = new Intent();
            if (p1 == -1) {
                v0.putExtra("topUpResult", p2.getParcelableExtra("PurchaseActivity.topupResult"));
                this.x.a(v0);
                v2 = new Object[1];
                v2[0] = this.y;
                Toast.makeText(this, this.getString(2131953273, v2), 0).show();
                com.google.android.finsky.m.a.cw().a(this.z);
            }
            this.setResult(p1, v0);
            this.finish();
        }
        else
            super.onActivityResult(p0, p1, p2);
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(2130968654);
        this.s = this.findViewById(2131755388);
        this.t = (ListView)this.findViewById(2131755382);
        this.v = (ButtonBar)this.findViewById(2131755403);
        this.v.setPositiveButtonTitle(2131952688);
        this.v.setNegativeButtonTitle(2131951799);
        this.v.setClickListener(this);
        this.k();
        this.z = this.getIntent().getStringExtra("authAccount");
        if (p0 == 0) {
            this.r = com.google.android.finsky.billing.storedvalue.a.a(this.z, this.getIntent().getStringExtra("list_url"));
            this.H_().a().a(this.r, "list_sidecar").c();
        }
        else {
            this.y = p0.getString("selected_document_formatted_amount");
            this.w = p0.getInt("last_shown_error");
            this.r = (com.google.android.finsky.billing.storedvalue.a)this.H_().a("list_sidecar");
        }
        this.x = this.q.a(p0, this.getIntent());
    }

    public void onItemClick(AdapterView p0, View p1, int p2, long p3) {
        this.k();
    }

    protected void onRestoreInstanceState(Bundle p0) {
        super.onRestoreInstanceState(p0);
        this.k();
        this.x = this.q.a(p0);
    }

    protected void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        p0.putInt("last_shown_error", this.w);
        p0.putString("selected_document_formatted_amount", this.y);
        this.x.a(p0);
    }

    protected void onStart() {
        super.onStart();
        this.r.a(this);
        if (this.r.l == 0) {
            this.r.a.n();
            this.r.b(1, 0);
        }
    }

    protected void onStop() {
        this.r.a(0);
        super.onStop();
    }

    public final void u_() {
        v0 = this.u[this.t.getCheckedItemPosition()];
        v1 = v0.e(1);
        if (v1 == 0)
            FinskyLog.c("Document selected without PURCHASE offer. Ignoring.", new Object[0]);
        else {
            this.y = v1.g;
            v1 = PurchaseParams.b().a(v0);
            v1.d = 1;
            this.startActivityForResult(PurchaseActivity.a(com.google.android.finsky.m.a.U().b(this.z), v1.a(), v0.a.D, 0, this.x), 1);
        }
    }

    public final void v_() {
        this.setResult(0);
        this.finish();
    }

}
