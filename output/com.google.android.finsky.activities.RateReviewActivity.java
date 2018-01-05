package com.google.android.finsky.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.cr;
import android.support.v7.app.aa;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.layout.RateReviewEditor;
import com.google.android.finsky.m;
import com.google.android.finsky.ratereview.c;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.ce;
import java.util.List;

public class RateReviewActivity extends android.support.v7.app.aa implements com.google.android.finsky.d.ad, com.google.android.finsky.layout.ay
{

    public Bundle A;
    public com.google.wireless.android.a.a.a.a.ce B;
    public com.google.android.finsky.d.w C;
    public long D;
    public boolean E;
    public ButtonBar F;
    public RateReviewEditor G;
    public final com.google.android.finsky.d.a q;
    public com.google.android.finsky.ratereview.c r;
    public String s;
    public int t;
    public String u;
    public String v;
    public int w;
    public Document x;
    public boolean y;
    public boolean z;

    RateReviewActivity() {
        android.support.v7.app.aa();
        this.q = com.google.android.finsky.m.a.aR();
        this.r = com.google.android.finsky.m.a.ac();
        this.B = com.google.android.finsky.d.j.a(1203);
        this.E = 0;
    }

    private final void m() {
        this.C.b(new com.google.android.finsky.d.d(this).a(1207));
        v0 = new Intent();
        v0.putExtra("doc_id", this.u);
        this.setResult(3, v0);
        this.finish();
    }

    private final void n() {
        v1 = 1;
        if (this.G.getUserRating() > 0)
            v0 = 1;
        else
            v0 = 0;
        if (this.w == 3) {
            if (!TextUtils.isEmpty(this.G.getUserTitle()))
                v3 = 1;
            else
                v3 = 0;
            if (!TextUtils.isEmpty(this.G.getUserComment()))
                v4 = 1;
            else
                v4 = 0;
            if (v3 == 0 || v4 == 0 || v0 == 0)
                v1 = 0;
        }
        else
            v1 = v0;
        this.F.setPositiveButtonEnabled(v1);
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        throw new IllegalStateException("unwanted children");
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.B;
    }

    public final void k() {
        this.n();
    }

    public final void l() {
        this.n();
    }

    public void onBackPressed() {
        this.C.b(new com.google.android.finsky.d.d(this).a(1207));
        v0 = new Intent();
        v0.putExtra("doc_id", this.u);
        this.setResult(3, v0);
        super.onBackPressed();
    }

    protected void onCreate(Bundle p0) {
        this.A = p0;
        super.onCreate(p0);
        this.setContentView(2130969320);
        v7 = this.getIntent();
        this.s = v7.getStringExtra("account_name");
        this.y = v7.getBooleanExtra("is_external_request", 1);
        this.z = v7.getBooleanExtra("is_anonymous_rating", 0);
        this.u = v7.getStringExtra("doc_id");
        this.v = v7.getStringExtra("doc_user_review_url");
        this.t = v7.getIntExtra("backend", 0);
        v0 = (com.google.android.finsky.cv.a.cv)ParcelableProto.a(v7, "previous_author");
        if (v0 != 0)
            v3 = new Document(v0);
        else
            v3 = 0;
        if (this.A != 0) {
            v6 = this.A.getInt("previous_rating");
            v5 = this.A.getString("previous_title");
            v4 = this.A.getString("previous_comment");
        }
        else {
            v6 = v7.getIntExtra("previous_rating", 0);
            v5 = v7.getStringExtra("previous_title");
            v4 = v7.getStringExtra("previous_comment");
        }
        com.google.android.finsky.d.j.a(this.B, v7.getByteArrayExtra("server_logs_cookie"));
        this.C = this.q.a(p0, v7);
        this.D = v7.getLongExtra("impression_id", 0);
        if (p0 == 0)
            this.C.a(new com.google.android.finsky.d.p().a(this.D).b(this));
        if (((Boolean)com.google.android.finsky.aa.b.cS.b()).booleanValue() && this.z == 0)
            v2 = 2;
        else
            v2 = 1;
        this.w = v2;
        this.G = (RateReviewEditor)this.findViewById(2131756578);
        this.G.f = this.t;
        this.G.b(v6);
        this.G.a(v6);
        v2 = (TextView)this.G.findViewById(2131756147);
        if (this.y != 0) {
            v2.setVisibility(0);
            v2.setText(v7.getStringExtra("doc_title"));
        }
        else
            v2.setVisibility(8);
        if (this.w == 1) {
            this.G.d.setVisibility(8);
            this.G.e.setVisibility(8);
        }
        else {
            this.G.d.setText(v5);
            this.G.e.setText(v4);
        }
        this.G.e.addTextChangedListener(this.G.h);
        this.G.setReviewChangeListener(this);
        if (v0 != 0 || this.z != 0)
            v2 = 1;
        else
            v2 = 0;
        this.F = (ButtonBar)this.findViewById(2131756577).findViewById(2131755403);
        this.F.setPositiveButtonEnabled(1);
        if (v2 != 0)
            v0 = 2131953088;
        else
            v0 = 2131953206;
        this.F.setPositiveButtonTitle(v0);
        this.F.setNegativeButtonVisible(v2);
        this.F.setNegativeButtonTitle(2131952040);
        this.F.setClickListener(new com.google.android.finsky.activities.fv(this, v2));
        if (v3 != 0)
            this.x = v3;
        else
            this.x = (Document)v7.getParcelableExtra("author");
        v0 = (TextView)this.findViewById(2131756642);
        if (this.x != 0) {
            v3 = new Object[1];
            v3[0] = this.x.a.g;
            v0.setText(this.getResources().getString(2131953029, v3));
            v1 = (com.google.android.finsky.cv.a.bd)this.x.c(4).get(0);
            com.google.android.finsky.m.a.ar().a((FifeImageView)this.findViewById(2131756614), v1.f, v1.i);
        }
        else {
            v0.setVisibility(8);
            ((FifeImageView)this.findViewById(2131756614)).setVisibility(8);
        }
    }

    public void onSaveInstanceState(Bundle p0) {
        p0.putInt("previous_rating", this.G.getUserRating());
        p0.putString("previous_title", this.G.getUserTitle());
        p0.putString("previous_comment", this.G.getUserComment());
    }

    public void onStart() {
        super.onStart();
        this.n();
    }

    public boolean onTouchEvent(MotionEvent p0) {
        v0 = 1;
        v1 = p0.getAction();
        v2 = (int)p0.getX();
        v3 = (int)p0.getY();
        v4 = this.getWindow().getDecorView();
        if (v1 == 0 && (v2 < 0 || v2 >= v4.getWidth() || v3 < 0 || v3 >= v4.getHeight()))
            this.m();
        else if (v1 == 4)
            this.m();
        else
            v0 = super.onTouchEvent(p0);
        return v0;
    }

}
