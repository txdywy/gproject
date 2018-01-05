package com.google.android.wallet.ui.p397d;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.google.a.a.a.a.b.a.a.h.a.b;
import com.google.android.c.i;
import com.google.android.wallet.analytics.C6494b;
import com.google.android.wallet.analytics.C6495c;
import com.google.android.wallet.analytics.C6496d;
import com.google.android.wallet.analytics.C6502j;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.ui.common.C6528w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class C6674b extends aa implements C6504m, C6528w {
    public C6506n f32948q;
    public C6502j f32949r;
    public byte[] f32950s;
    public LogContext f32951t;
    public C6678c f32952u;
    public C6494b f32953v;
    public C6495c f32954w;
    public C6496d f32955x;

    public abstract C6678c mo5587a(b bVar, ArrayList arrayList, int i, LogContext logContext, byte[] bArr);

    public void onCreate(Bundle bundle) {
        i.a = getApplicationContext().getContentResolver();
        Intent intent = getIntent();
        setTheme(intent.getIntExtra("activityThemeResId", -1));
        super.onCreate(bundle);
        setContentView(C6623g.activity_popover_redirect);
        Bundle bundleExtra = intent.getBundleExtra("parcelableBundle");
        this.f32951t = (LogContext) bundleExtra.getParcelable("parentLogContext");
        b bVar = (b) ParcelableProto.m29887a(bundleExtra, "formProto");
        Toolbar toolbar = (Toolbar) findViewById(C6622f.popup_redirect_toolbar);
        a(toolbar);
        if (bVar.q != null) {
            if (bVar.q.b) {
                G_().a().e();
            }
            if (bVar.q.a) {
                toolbar.setNavigationIcon(null);
            } else {
                G_().a().a(true);
            }
            if (bVar.q.c) {
                toolbar.setBackgroundColor(bVar.q.d);
                if (VERSION.SDK_INT >= 21) {
                    getWindow().setStatusBarColor(bVar.q.e);
                }
            }
        }
        setTitle(intent.getStringExtra("title"));
        this.f32952u = (C6678c) H_().a(C6622f.fragment_holder);
        if (this.f32952u == null) {
            this.f32952u = mo5587a(bVar, ParcelableProto.m29891b(bundleExtra, "successfullyValidatedApps"), intent.getIntExtra("formThemeResId", -1), this.f32951t, this.f32950s);
            H_().a().a(C6622f.fragment_holder, this.f32952u).c();
        }
        this.f32950s = intent.getByteArrayExtra("logToken");
        this.f32948q = new C6506n(1746, this.f32950s);
        if (this.f32955x != null) {
            if (bundle != null) {
                this.f32949r = new C6502j(bundle.getBoolean("impressionForPageTracked"), this.f32955x);
            } else {
                this.f32949r = new C6502j(false, this.f32955x);
            }
        }
        C6589a.m29895a((Activity) this, false);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f32949r != null) {
            bundle.putBoolean("impressionForPageTracked", this.f32949r.f32557b);
        }
    }

    public void onBackPressed() {
        if (this.f32953v != null) {
            this.f32953v.mo5561a(this, 1622);
        }
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        setResult(0);
        finish();
        if (this.f32953v != null) {
            this.f32953v.mo5561a(this, 1632);
        }
        return true;
    }

    public final void mo5469a(int i, Bundle bundle) {
        Intent intent;
        switch (i) {
            case 1:
                return;
            case 4:
                if (this.f32949r != null) {
                    this.f32949r.m29545a(this);
                    return;
                }
                return;
            case 5:
                intent = new Intent();
                intent.putExtra("errorDetails", bundle);
                setResult(1, intent);
                finish();
                return;
            case 7:
                if (this.f32954w != null) {
                    this.f32954w.mo5548a(bundle, this.f32950s);
                    return;
                }
                return;
            case 8:
                if (this.f32952u.mo5534X()) {
                    intent = new Intent();
                    intent.putExtra("formValue", ParcelableProto.m29885a(this.f32952u.ac()));
                    setResult(-1, intent);
                    finish();
                    return;
                }
                return;
            case 10:
                setResult(2);
                finish();
                return;
            default:
                throw new IllegalArgumentException("Unsupported formEvent: " + i);
        }
    }

    public C6504m getParentUiNode() {
        return null;
    }

    public C6506n getUiElement() {
        return this.f32948q;
    }

    public List getChildren() {
        return Collections.singletonList(this.f32952u);
    }

    public void setParentUiNode(C6504m c6504m) {
        throw new UnsupportedOperationException("Top level UiNode doesn't support custom parents.");
    }
}
