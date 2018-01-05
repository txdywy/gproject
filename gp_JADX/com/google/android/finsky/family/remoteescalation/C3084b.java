package com.google.android.finsky.family.remoteescalation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.p028a.p029a.C0206f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.billing.lightpurchase.p161b.C1911c;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.h.a.ac;
import com.squareup.leakcanary.C7582R;

public final class C3084b extends C1045b implements OnClickListener, C0660x {
    public final ce f16006a = C2482j.m13283a(5240);
    public Button ag;
    public Button ah;
    public View ai;
    public View aj;
    public C1911c ak;
    public boolean f16007c;
    public Document f16008f;
    public ac f16009h;
    public final C2471a y_ = C1473m.f7980a.aR();

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        Intent intent = m603h().getIntent();
        this.f16009h = (ac) ParcelableProto.m21672a(intent, "approval");
        this.f16008f = (Document) intent.getParcelableExtra("doc");
    }

    protected final int mo1298Z() {
        return C1592a.f8463l.intValue();
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.ai = a.findViewById(C1592a.f8464m.intValue());
        this.aj = a.findViewById(C7582R.id.body);
        this.ag = (Button) a.findViewById(C7582R.id.positive_button);
        this.ah = (Button) a.findViewById(C7582R.id.negative_button);
        this.ag.setOnClickListener(this);
        this.ah.setOnClickListener(this);
        this.ag.setText(C1592a.f8457f.intValue());
        this.ah.setText(C1592a.f8458g.intValue());
        this.ak = new C1911c(m603h(), this.f16009h.i, 3, 1, a.findViewById(C1592a.f8465n.intValue()), this);
        C1911c c1911c = this.ak;
        ForegroundLinearLayout foregroundLinearLayout = (ForegroundLinearLayout) c1911c.f9831f.findViewById(C7582R.id.document_header);
        foregroundLinearLayout.setOnClickListener(new C3085c(this));
        foregroundLinearLayout.setForeground(C0206f.m1065a(c1911c.f9831f.getContext().getResources(), C7582R.drawable.play_highlight_overlay_light, null));
        this.ak.m10259a();
        return a;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        cg_();
    }

    protected final void aa() {
    }

    protected final void cg_() {
        if (this.f16007c) {
            this.aj.setVisibility(4);
            this.ai.setVisibility(0);
            return;
        }
        this.aj.setVisibility(0);
        this.ai.setVisibility(4);
    }

    public final void mo138d() {
        super.mo138d();
        this.ag = null;
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.ak = null;
    }

    public final void onClick(View view) {
        if (view == this.ag) {
            m15808a(true);
        } else if (view == this.ah) {
            m15808a(false);
        } else if (view == this.ak.f9835j) {
            this.bw.m13379b(new C2475d(getParentNode()).m13256a(130));
            m580a(C1473m.f7980a.bo().mo2749a(m601g(), C1473m.f7980a.cZ(), this.f16008f.f14885a.f12096c, this.f16008f, false, true, this.f16009h.i.r, this.y_.m13184a(null)));
        }
    }

    private final void m15808a(boolean z) {
        if (!this.f16007c) {
            int i;
            C2495w c2495w = this.bw;
            C2475d c2475d = new C2475d(getParentNode());
            if (z) {
                i = 5241;
            } else {
                i = 5242;
            }
            c2495w.m13379b(c2475d.m13256a(i));
            this.f16007c = true;
            C3098p.m15867a(this.bo, this.f16009h, z, this, this);
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f16006a;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f16007c = false;
        if (at()) {
            Toast.makeText(m603h(), C1290m.m7704c(this.bn, volleyError), 1).show();
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        if (at()) {
            m603h().setResult(-1, new Intent().putExtra("approval", ParcelableProto.m21671a(this.f16009h)));
            m603h().finish();
        }
    }
}
