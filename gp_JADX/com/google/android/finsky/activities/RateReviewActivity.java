package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.layout.RateReviewEditor;
import com.google.android.finsky.layout.ay;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.ratereview.C3964c;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class RateReviewActivity extends aa implements ad, ay {
    public Bundle f6405A;
    public ce f6406B = C2482j.m13283a(1203);
    public C2495w f6407C;
    public long f6408D;
    public boolean f6409E = false;
    public ButtonBar f6410F;
    public RateReviewEditor f6411G;
    public final C2471a f6412q = C1473m.f7980a.aR();
    public C3964c f6413r = C1473m.f7980a.ac();
    public String f6414s;
    public int f6415t;
    public String f6416u;
    public String f6417v;
    public int f6418w;
    public Document f6419x;
    public boolean f6420y;
    public boolean f6421z;

    protected void onCreate(Bundle bundle) {
        int i;
        int i2;
        this.f6405A = bundle;
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.rate_review_dialog);
        Intent intent = getIntent();
        this.f6414s = intent.getStringExtra("account_name");
        this.f6420y = intent.getBooleanExtra("is_external_request", true);
        this.f6421z = intent.getBooleanExtra("is_anonymous_rating", false);
        this.f6416u = intent.getStringExtra("doc_id");
        this.f6417v = intent.getStringExtra("doc_user_review_url");
        CharSequence stringExtra = intent.getStringExtra("doc_title");
        this.f6415t = intent.getIntExtra("backend", 0);
        cv cvVar = (cv) ParcelableProto.m21672a(intent, "previous_author");
        Document document = cvVar != null ? new Document(cvVar) : null;
        Document document2 = (Document) intent.getParcelableExtra("author");
        if (this.f6405A != null) {
            i = this.f6405A.getInt("previous_rating");
            CharSequence string = this.f6405A.getString("previous_title");
            CharSequence string2 = this.f6405A.getString("previous_comment");
        } else {
            i = intent.getIntExtra("previous_rating", 0);
            Object stringExtra2 = intent.getStringExtra("previous_title");
            Object stringExtra3 = intent.getStringExtra("previous_comment");
        }
        C2482j.m13285a(this.f6406B, intent.getByteArrayExtra("server_logs_cookie"));
        this.f6407C = this.f6412q.m13180a(bundle, intent);
        this.f6408D = intent.getLongExtra("impression_id", 0);
        if (bundle == null) {
            this.f6407C.m13370a(new C2488p().m13341a(this.f6408D).m13345b(this));
        }
        if (!((Boolean) C0955b.cS.m28964b()).booleanValue() || this.f6421z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f6418w = i2;
        View findViewById = findViewById(C7582R.id.rate_review_container);
        this.f6411G = (RateReviewEditor) findViewById(C7582R.id.review_editor);
        RateReviewEditor rateReviewEditor = this.f6411G;
        int i3 = this.f6418w;
        i2 = this.f6415t;
        boolean z = this.f6420y;
        rateReviewEditor.f18286f = i2;
        rateReviewEditor.mo3567b(i);
        rateReviewEditor.m17333a(i);
        TextView textView = (TextView) rateReviewEditor.findViewById(C7582R.id.item_title);
        if (z) {
            textView.setVisibility(0);
            textView.setText(stringExtra);
        } else {
            textView.setVisibility(8);
        }
        if (i3 == 1) {
            rateReviewEditor.f18284d.setVisibility(8);
            rateReviewEditor.f18285e.setVisibility(8);
        } else {
            rateReviewEditor.f18284d.setText(string);
            rateReviewEditor.f18285e.setText(string2);
        }
        rateReviewEditor.f18285e.addTextChangedListener(rateReviewEditor.f18288h);
        this.f6411G.setReviewChangeListener(this);
        boolean z2 = cvVar != null || this.f6421z;
        this.f6410F = (ButtonBar) findViewById.findViewById(C7582R.id.button_bar);
        this.f6410F.setPositiveButtonEnabled(true);
        this.f6410F.setPositiveButtonTitle(z2 ? C7582R.string.save_review : C7582R.string.submit_review);
        this.f6410F.setNegativeButtonVisible(z2);
        this.f6410F.setNegativeButtonTitle((int) C7582R.string.delete_review);
        this.f6410F.setClickListener(new fv(this, z2));
        if (document != null) {
            this.f6419x = document;
        } else {
            this.f6419x = document2;
        }
        TextView textView2 = (TextView) findViewById(C7582R.id.review_by);
        FifeImageView fifeImageView = (FifeImageView) findViewById(C7582R.id.user_profile_image);
        if (this.f6419x != null) {
            textView2.setText(getResources().getString(C7582R.string.review_by, new Object[]{this.f6419x.f14885a.f12100g}));
            bd bdVar = (bd) this.f6419x.m14644c(4).get(0);
            C1473m.f7980a.ar().m9288a((FifeImageView) findViewById(C7582R.id.user_profile_image), bdVar.f11860f, bdVar.f11863i);
            return;
        }
        textView2.setVisibility(8);
        fifeImageView.setVisibility(8);
    }

    public void onStart() {
        super.onStart();
        m6224n();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        View decorView = getWindow().getDecorView();
        if (action == 0 && (x < 0 || x >= decorView.getWidth() || y < 0 || y >= decorView.getHeight())) {
            m6223m();
            return true;
        } else if (action != 4) {
            return super.onTouchEvent(motionEvent);
        } else {
            m6223m();
            return true;
        }
    }

    private final void m6223m() {
        this.f6407C.m13379b(new C2475d(this).m13256a(1207));
        Intent intent = new Intent();
        intent.putExtra("doc_id", this.f6416u);
        setResult(3, intent);
        finish();
    }

    private final void m6224n() {
        boolean z = true;
        boolean z2 = this.f6411G.getUserRating() > 0;
        if (this.f6418w == 3) {
            boolean z3;
            if (TextUtils.isEmpty(this.f6411G.getUserTitle())) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z4;
            if (TextUtils.isEmpty(this.f6411G.getUserComment())) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!(z3 && r4 && z2)) {
                z = false;
            }
        } else {
            z = z2;
        }
        this.f6410F.setPositiveButtonEnabled(z);
    }

    public void onBackPressed() {
        this.f6407C.m13379b(new C2475d(this).m13256a(1207));
        Intent intent = new Intent();
        intent.putExtra("doc_id", this.f6416u);
        setResult(3, intent);
        super.onBackPressed();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("previous_rating", this.f6411G.getUserRating());
        bundle.putString("previous_title", this.f6411G.getUserTitle());
        bundle.putString("previous_comment", this.f6411G.getUserComment());
    }

    public ce getPlayStoreUiElement() {
        return this.f6406B;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }

    public final void mo1290k() {
        m6224n();
    }

    public final void mo1291l() {
        m6224n();
    }
}
