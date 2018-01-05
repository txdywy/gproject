package com.google.android.finsky.stream.controllers.collectionassistcard;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.C2450w;
import com.google.android.finsky.cv.p177a.C2452y;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.dz;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.controllers.collectionassistcard.view.C4358a;
import com.google.android.finsky.stream.controllers.collectionassistcard.view.CollectionAssistCardView;
import com.google.android.finsky.stream.myapps.C4356r;
import com.google.android.finsky.stream.myapps.view.C4542a;
import com.squareup.leakcanary.C7582R;
import p002a.C0002a;

public final class C4357a extends C4356r {
    public C4542a f22025a;
    public C4542a f22026b;
    public C4542a[] f22027o;
    public C4542a f22028p;
    public C4358a f22029q;

    public C4357a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C0002a c0002a) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, c0002a);
    }

    public final void mo4050a(C2720j c2720j) {
        boolean z = false;
        super.mo4050a(c2720j);
        Document document = c2720j.f14908a;
        dz cu = document.cu();
        bd[] bdVarArr = new bd[cu.f12236e.length];
        String[] strArr = new String[cu.f12236e.length];
        this.f22027o = new C4542a[cu.f12236e.length];
        for (int i = 0; i < bdVarArr.length; i++) {
            C2452y c2452y = cu.f12236e[i];
            bdVarArr[i] = c2452y.f13225c;
            strArr[i] = c2452y.f13227e;
            this.f22027o[i] = this.s.m21155a(c2452y.f13226d, 2844);
        }
        String str = cu.f12234c;
        String str2 = cu.f12235d;
        String str3 = cu.f12237f.f13221c;
        String str4 = cu.f12237f.f13222d;
        String str5 = cu.f12233b.f13218e;
        if (cu.f12233b.f13216c != null) {
            z = true;
        }
        this.f22029q = new C4358a(str, str2, str3, str4, str5, bdVarArr, strArr, z, document.f14885a.f12087D);
        this.f22025a = this.s.m21155a(cu.f12237f.f13220b, 2833);
        this.f22026b = this.s.m21155a(cu.f12233b.f13217d, 2839);
        this.f22028p = this.s.m21154a();
    }

    public final int mo1509a(int i) {
        return C7582R.layout.collection_assist_card_view;
    }

    public final void mo1510a(View view, int i) {
        int i2;
        OnClickListener onClickListener = (CollectionAssistCardView) view;
        C4358a c4358a = this.f22029q;
        ad adVar = this.h;
        C4542a c4542a = this.f22025a;
        C4542a c4542a2 = this.f22026b;
        C4542a[] c4542aArr = this.f22027o;
        C4542a c4542a3 = this.f22028p;
        onClickListener.f22042m = adVar;
        onClickListener.f22036g = c4542a;
        onClickListener.f22037h = c4542a2;
        onClickListener.f22038i = c4542aArr;
        onClickListener.f22039j = c4542a3;
        onClickListener.f22034e.mo2588a(3, c4358a.f22046c, onClickListener);
        onClickListener.f22035f.setVisibility(c4358a.f22051h ? 0 : 4);
        onClickListener.f22032c.setText(c4358a.f22044a);
        onClickListener.f22033d.setText(c4358a.f22045b);
        if (!TextUtils.isEmpty(c4358a.f22048e)) {
            onClickListener.setContentDescription(c4358a.f22048e);
        }
        if (!TextUtils.isEmpty(c4358a.f22047d)) {
            onClickListener.f22034e.setContentDescription(c4358a.f22047d);
        }
        int length = c4358a.f22049f.length;
        TextView textView = (TextView) onClickListener.findViewById(C7582R.id.more_icon);
        if (length > 5) {
            textView.setVisibility(0);
            textView.setText(onClickListener.getResources().getString(C7582R.string.assist_card_hidden_icons_number, new Object[]{Integer.valueOf(c4358a.f22049f.length - 5)}));
            i2 = 5;
        } else {
            textView.setVisibility(8);
            i2 = length;
        }
        length = 0;
        while (length < 5) {
            if (length < i2) {
                onClickListener.f22040k[length].setVisibility(0);
                onClickListener.f22040k[length].a(c4358a.f22049f[length].f11860f, c4358a.f22049f[length].f11863i, onClickListener.f22030a);
                if (length < c4358a.f22050g.length && !TextUtils.isEmpty(c4358a.f22050g[length])) {
                    onClickListener.f22040k[length].setContentDescription(c4358a.f22050g[length]);
                }
            } else {
                onClickListener.f22040k[length].setVisibility(8);
            }
            length++;
        }
        C2482j.m13285a(onClickListener.f22043n, c4358a.f22052i);
        this.h.mo1219a(onClickListener);
    }

    public final void mo1511b(View view, int i) {
        ((CollectionAssistCardView) view).Z_();
    }

    protected final C2450w mo4180a(Document document) {
        return document.cu().f12233b;
    }
}
