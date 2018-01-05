package com.google.android.finsky.activities.inlineappinstaller;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.aw;
import android.support.v7.app.aa;
import android.view.MotionEvent;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p111d.ah;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.p;
import com.squareup.leakcanary.C7582R;

public class InlineConsumptionAppInstallerActivity extends aa implements C1075b, ah {
    public final C2471a f6909q = C1473m.f7980a.aR();
    public final Rect f6910r = new Rect();
    public Account f6911s;
    public cv f6912t;
    public boolean f6913u;
    public C2495w f6914v;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutInflater().inflate(C7582R.layout.light_purchase_activity, null));
        Intent intent = getIntent();
        this.f6911s = (Account) intent.getParcelableExtra("account");
        C1473m.f7980a.mo2049a(this.f6911s);
        this.f6914v = this.f6909q.m13180a(bundle, intent).m13366a(this.f6911s);
        this.f6912t = (cv) ParcelableProto.m21672a(intent, "mediaDoc");
        p pVar = (p) ParcelableProto.m21672a(intent, "successInfo");
        if (bundle == null) {
            this.f6914v.m13370a(new C2488p().m13345b(this));
            aw a = H_().mo284a();
            a.mo325a((int) C7582R.id.content_frame, C1088a.m6747a(this.f6911s, this.f6912t, pVar));
            a.mo334c();
        }
    }

    public void onBackPressed() {
        m6684c(600);
        m6685k();
    }

    private final void m6685k() {
        setResult(0);
        finish();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getWindow().getDecorView().getHitRect(this.f6910r);
        if (motionEvent.getAction() == 0 && !this.f6910r.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            m6684c(601);
            m6685k();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void finish() {
        C1088a c1088a = (C1088a) H_().mo281a((int) C7582R.id.content_frame);
        if (c1088a != null) {
            if (this.f6913u) {
                setResult(-1);
            } else {
                if (c1088a.f6945f) {
                    startActivity(C1473m.f7980a.bo().mo2745a((Context) this, C1289l.m7694a(C1473m.f7980a.bn().mo2693a(this.f6912t.f12099f)), this.f6914v));
                }
                setResult(0);
            }
            this.f6914v.m13370a(new C2488p().m13340a(603).m13345b(this));
        }
        super.finish();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f6914v.m13377a(bundle);
    }

    public final void mo1404b(boolean z) {
        this.f6913u = z;
        if (this.f6913u) {
            C1473m.f7980a.bn().mo2700a(this, this.f6911s, new Document(this.f6912t), H_(), null, 2, null);
        }
        finish();
    }

    public ce getPlayStoreUiElement() {
        return C2482j.m13283a(5100);
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("Not using tree impressions.", new Object[0]);
    }

    public final void o_() {
        FinskyLog.m21669e("Not using impression id's.", new Object[0]);
    }

    public final void mo1222m() {
    }

    public final C2495w mo1224n() {
        return this.f6914v;
    }

    private final void m6684c(int i) {
        this.f6914v.m13379b(new C2475d(this).m13256a(i));
    }
}
