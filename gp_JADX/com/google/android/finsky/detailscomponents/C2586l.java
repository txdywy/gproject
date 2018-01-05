package com.google.android.finsky.detailscomponents;

import android.content.Context;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C2586l {
    public Context f13773a;
    public ImageView f13774b;
    public View f13775c;
    public C2577b f13776d;

    C2586l(Context context, ImageView imageView, View view, C2577b c2577b) {
        this.f13773a = context;
        this.f13774b = imageView;
        this.f13775c = view;
        this.f13776d = c2577b;
    }

    public final void m13644a() {
        this.f13774b.setVisibility(8);
        View view = C1601a.m9200a(this.f13773a) ? this.f13774b : this.f13775c;
        view.setOnClickListener(null);
        view.setClickable(false);
        this.f13775c.setFocusable(true);
    }

    public final void m13645a(String str, String str2, boolean z, boolean z2, int i, ad adVar, ad adVar2) {
        adVar2.mo1219a(adVar);
        this.f13774b.setVisibility(0);
        boolean a = C1601a.m9200a(this.f13773a);
        View view = a ? this.f13774b : this.f13775c;
        view.setClickable(true);
        view.setOnClickListener(this.f13776d.m13628a(this.f13773a, str, z, z2, i, adVar2));
        if (!TextUtils.isEmpty(str2) && a) {
            this.f13774b.setContentDescription(this.f13773a.getString(C7582R.string.content_description_generic_trailer, new Object[]{str2}));
        }
        if (a) {
            ai.m1838b(this.f13775c, 2);
            this.f13775c.setFocusable(false);
            return;
        }
        this.f13775c.setFocusable(true);
    }

    public static boolean m13642a(Document document) {
        return document.f14885a.f12098e == 6;
    }

    public static boolean m13643b(Document document) {
        if (document.af() == 12) {
            return false;
        }
        List c = document.m14644c(3);
        if (c == null || c.isEmpty()) {
            return false;
        }
        return true;
    }
}
