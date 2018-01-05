package com.google.android.finsky.ratereview;

import android.os.Bundle;
import android.support.v7.app.aa;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class PublicReviewsActivity extends aa {
    public C1612l f19995q;
    public C0988c f19996r;
    public C1461c f19997s;
    public boolean f19998t = false;
    public ButtonBar f19999u;

    protected void onCreate(Bundle bundle) {
        ((C1411n) C3947d.m18649a(C1411n.class)).mo1896a(this);
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.public_reviews_dialog);
        Document document = (Document) getIntent().getParcelableExtra("author");
        View findViewById = findViewById(C7582R.id.public_reviews_container);
        ((TextView) findViewById.findViewById(C7582R.id.public_reviews_text)).setText(C7582R.string.public_reviews_message);
        this.f19999u = (ButtonBar) findViewById.findViewById(C7582R.id.button_bar);
        this.f19999u.setPositiveButtonTitle((int) C7582R.string.ok);
        this.f19999u.setNegativeButtonTitle((int) C7582R.string.cancel);
        this.f19999u.setClickListener(new C3962a(this));
        ((TextView) findViewById(C7582R.id.review_by)).setText(document.f14885a.f12100g);
        bd bdVar = (bd) document.m14644c(4).get(0);
        this.f19995q.m9288a((FifeImageView) findViewById(C7582R.id.user_profile_image), bdVar.f11860f, bdVar.f11863i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        View decorView = getWindow().getDecorView();
        if (action == 0 && (x < 0 || x >= decorView.getWidth() || y < 0 || y >= decorView.getHeight())) {
            m18671k();
            return true;
        } else if (action != 4) {
            return super.onTouchEvent(motionEvent);
        } else {
            m18671k();
            return true;
        }
    }

    private final void m18671k() {
        setResult(0);
        finish();
    }

    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }
}
