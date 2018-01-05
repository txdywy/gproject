package com.google.android.finsky.stream.controllers.dataassistcard;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.C2450w;
import com.google.android.finsky.cv.p177a.ed;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.controllers.dataassistcard.view.C4377a;
import com.google.android.finsky.stream.controllers.dataassistcard.view.DataAssistCardView;
import com.google.android.finsky.stream.myapps.C4356r;
import com.google.android.finsky.stream.myapps.view.C4542a;
import com.squareup.leakcanary.C7582R;
import p002a.C0002a;

public final class C4376a extends C4356r {
    public C4542a f22192a;
    public C4542a f22193b;
    public C4542a f22194o;
    public C4377a f22195p;

    public C4376a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C0002a c0002a) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, c0002a);
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        Document document = c2720j.f14908a;
        ed cq = document.cq();
        this.f22195p = new C4377a(cq.f12261c, cq.f12262d, cq.f12263e, cq.f12264f, cq.f12267i, cq.f12265g, cq.f12266h.f13221c, cq.f12266h.f13222d, cq.f12260b.f13218e, cq.f12260b.f13216c != null, document.f14885a.f12087D);
        this.f22192a = this.s.m21155a(cq.f12266h.f13220b, 2833);
        this.f22193b = this.s.m21155a(cq.f12260b.f13217d, 2836);
        this.f22194o = this.s.m21154a();
    }

    public final int mo1509a(int i) {
        return C7582R.layout.data_assist_card_view;
    }

    public final void mo1510a(View view, int i) {
        OnClickListener onClickListener = (DataAssistCardView) view;
        C4377a c4377a = this.f22195p;
        ad adVar = this.h;
        C4542a c4542a = this.f22192a;
        C4542a c4542a2 = this.f22193b;
        C4542a c4542a3 = this.f22194o;
        onClickListener.f22204i = c4542a;
        onClickListener.f22205j = c4542a2;
        onClickListener.f22206k = c4542a3;
        onClickListener.f22202g.mo2588a(3, c4377a.f22215g, onClickListener);
        onClickListener.f22203h.setVisibility(c4377a.f22218j ? 0 : 4);
        onClickListener.f22197b.setText(c4377a.f22209a);
        onClickListener.f22198c.setText(c4377a.f22210b);
        onClickListener.f22199d.setText(c4377a.f22213e);
        onClickListener.f22200e.setText(c4377a.f22214f);
        if (!TextUtils.isEmpty(c4377a.f22217i)) {
            onClickListener.setContentDescription(c4377a.f22217i);
        }
        if (!TextUtils.isEmpty(c4377a.f22216h)) {
            onClickListener.f22202g.setContentDescription(c4377a.f22216h);
        }
        ((RotateDrawable) ((LayerDrawable) onClickListener.f22201f.getProgressDrawable()).findDrawableByLayerId(C7582R.id.progress)).getDrawable().setColorFilter(c4377a.f22212d, Mode.SRC_IN);
        onClickListener.f22201f.setProgress(c4377a.f22211c);
        C2482j.m13285a(onClickListener.f22208m, c4377a.f22219k);
        onClickListener.f22207l = adVar;
        this.h.mo1219a(onClickListener);
    }

    public final void mo1511b(View view, int i) {
        ((DataAssistCardView) view).Z_();
    }

    protected final C2450w mo4180a(Document document) {
        return document.cq().f12260b;
    }
}
