package com.google.android.finsky.contentfilterui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.caverock.androidsvg.cs;
import com.google.android.finsky.ab.C0969a;
import com.google.android.finsky.ab.C0970b;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.bh;
import com.google.wireless.android.finsky.dfe.nano.bi;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C2339e extends C1045b implements AnimatorUpdateListener, OnClickListener, C0998m {
    public final ce f11516a = C2482j.m13283a(5236);
    public bi ag;
    public boolean ah;
    public ViewGroup ai;
    public CheckBox aj;
    public Button ak;
    public C2350n f11517c;
    public int f11518e;
    public int f11519f = -1;
    public int f11520h = 0;
    public C2471a y_;

    public final void mo1292a(Activity activity) {
        ((C1367d) C3947d.m18649a(C1367d.class)).mo1788a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        s_();
        this.f740L = true;
        if (this.ag == null) {
            this.ag = this.f11517c.f11536b.b[this.f11518e];
            C2350n c2350n = this.f11517c;
            int i = this.f11518e;
            bh[] bhVarArr = c2350n.f11536b.b[i].e;
            i = ((C0970b) c2350n.f11539e.get(i)).f5940c;
            int i2 = 0;
            while (i2 < bhVarArr.length) {
                if (C0969a.m5785a(bhVarArr[i2]) == i) {
                    break;
                }
                i2++;
            }
            i2 = bhVarArr.length - 1;
            this.f11519f = i2;
        }
    }

    protected final int mo1298Z() {
        return C7582R.layout.content_filters_choice_fragment;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = true;
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        TextView textView = (TextView) a.findViewById(C7582R.id.top_title);
        this.ai = (ViewGroup) a.findViewById(C7582R.id.vertical_rating_filters_list);
        this.ak = (Button) a.findViewById(C7582R.id.vertical_ratings_save_button);
        this.ak.setText(this.f11517c.f11536b.j);
        this.ak.setOnClickListener(this);
        this.ak.setEnabled(!this.ah);
        if (this.ag == null) {
            return a;
        }
        ContentFilterChoiceItemView contentFilterChoiceItemView;
        CharSequence charSequence;
        if (this.ag.k) {
            textView.setVisibility(8);
            contentFilterChoiceItemView = (ContentFilterChoiceItemView) layoutInflater.inflate(C7582R.layout.content_filters_choice_item3, this.ai, false);
            charSequence = this.ag.e[0].e;
            if (this.f11519f != 0) {
                z = false;
            }
            contentFilterChoiceItemView.f11481h.setText(charSequence);
            contentFilterChoiceItemView.f11476c.setVisibility(8);
            contentFilterChoiceItemView.f11483j.setVisibility(0);
            contentFilterChoiceItemView.f11483j.setChecked(z);
            contentFilterChoiceItemView.f11484k.setVisibility(8);
            contentFilterChoiceItemView.f11482i.setVisibility(8);
            this.aj = contentFilterChoiceItemView.getCheckBox();
            contentFilterChoiceItemView.setOnClickListener(m11936b(0));
            this.ai.addView(contentFilterChoiceItemView);
        } else {
            textView.setText(this.ag.h);
            int length = this.ag.e.length;
            for (int i = 0; i < length; i++) {
                contentFilterChoiceItemView = (ContentFilterChoiceItemView) layoutInflater.inflate(C7582R.layout.content_filters_choice_item3, this.ai, false);
                contentFilterChoiceItemView.setOnClickListener(m11936b(i));
                bh bhVar = this.ag.e[i];
                charSequence = null;
                if (i == 0) {
                    charSequence = m592c((int) C7582R.string.content_filter_most_restrictive);
                } else if (i == length - 1) {
                    charSequence = m592c((int) C7582R.string.content_filter_least_restrictive);
                }
                CharSequence charSequence2 = bhVar.e;
                bd bdVar = bhVar.d;
                contentFilterChoiceItemView.f11481h.setText(charSequence2);
                if (charSequence != null) {
                    contentFilterChoiceItemView.f11482i.setText(charSequence);
                } else {
                    contentFilterChoiceItemView.f11482i.setVisibility(8);
                }
                if (bdVar != null) {
                    af.m9224a(contentFilterChoiceItemView.f11484k, bdVar);
                    contentFilterChoiceItemView.f11474a.m9288a(contentFilterChoiceItemView.f11484k, bdVar.f11860f, bdVar.f11863i);
                }
                this.ai.addView(contentFilterChoiceItemView);
            }
            aj();
        }
        return a;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        this.bm.mo1241c(this.ag.f);
    }

    public final void mo1202a(int i, Bundle bundle) {
        if (i == 1) {
            ai();
        }
    }

    protected final void aa() {
    }

    protected final void cg_() {
    }

    public final ce getPlayStoreUiElement() {
        return this.f11516a;
    }

    public final void onClick(View view) {
        if (view == this.ak) {
            this.ah = true;
            this.ak.setEnabled(false);
            au();
            if (this.ag.k) {
                this.f11519f = this.aj.isChecked() ? 0 : 1;
            }
            Runnable c2340f = new C2340f(this);
            Runnable c2341g = new C2341g(this);
            bh bhVar = this.ag.e[this.f11519f];
            C2350n c2350n = this.f11517c;
            Context h = m603h();
            int i = this.f11518e;
            List arrayList = new ArrayList(c2350n.f11539e);
            C0970b c0970b = (C0970b) c2350n.f11539e.get(i);
            arrayList.set(i, new C0970b(c0970b.f5938a, c0970b.f5939b, C0969a.m5785a(bhVar)));
            int a = C0969a.m5785a(bhVar);
            C2351o c2351o = new C2351o(c2350n, h, arrayList, true, c2340f, c2341g);
            bi biVar = c2350n.f11536b.b[i];
            if (a == -1) {
                c2350n.f11544j.mo2015a().mo1601a(c2350n.f11538d, null, biVar.c, false, (C0660x) c2351o, (C0657w) c2351o);
                return;
            }
            C0970b c0970b2 = new C0970b(biVar.c, biVar.d, a);
            c2350n.f11544j.mo2015a().mo1601a(c2350n.f11538d, C2350n.m11962a(Arrays.asList(new C0970b[]{c0970b2})), null, false, (C0660x) c2351o, (C0657w) c2351o);
        }
    }

    public final void mo138d() {
        super.mo138d();
        this.ai = null;
        this.aj = null;
        this.ak = null;
    }

    protected final void O_() {
        super.O_();
        this.ah = false;
        this.ak.setEnabled(true);
    }

    private final OnClickListener m11936b(int i) {
        return new C2342h(this, i);
    }

    final void ai() {
        if (this.ag.k) {
            this.aj.performClick();
        } else {
            aj();
        }
    }

    private final void aj() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f11520h, this.f11519f});
        ofInt.addListener(new C2344i(this));
        ofInt.addUpdateListener(this);
        ofInt.setDuration(150);
        ofInt.start();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (m610k()) {
            int i = 0;
            while (i < this.ai.getChildCount()) {
                ContentFilterChoiceItemView contentFilterChoiceItemView = (ContentFilterChoiceItemView) this.ai.getChildAt(i);
                Object obj = (i <= 0 || i > intValue) ? null : 1;
                Object obj2 = i < intValue ? 1 : null;
                Object obj3 = i == intValue ? 1 : null;
                Object obj4 = i > intValue ? 1 : null;
                contentFilterChoiceItemView.f11477d.setVisibility(obj != null ? 0 : 4);
                contentFilterChoiceItemView.f11478e.setVisibility(obj2 != null ? 0 : 4);
                contentFilterChoiceItemView.f11480g.setVisibility(obj3 != null ? 0 : 8);
                if (obj3 != null) {
                    ImageView imageView = contentFilterChoiceItemView.f11480g;
                    int color = contentFilterChoiceItemView.getResources().getColor(C7582R.color.content_filter_v3_primary_color);
                    int dimensionPixelSize = contentFilterChoiceItemView.getResources().getDimensionPixelSize(C7582R.dimen.content_filter_selection_indicator_size);
                    C0722q a = C0722q.m4784a(contentFilterChoiceItemView.getContext(), (int) C7582R.raw.ic_check_circle_black_24dp);
                    a.m4792a((((float) dimensionPixelSize) * 1.0f) / a.m4790a());
                    Drawable csVar = new cs(a, new as().m4593b(color));
                    csVar.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    imageView.setImageDrawable(csVar);
                }
                contentFilterChoiceItemView.f11479f.setVisibility(obj3 != null ? 8 : 0);
                contentFilterChoiceItemView.f11479f.setEnabled(obj4 == null);
                i++;
            }
        }
    }
}
