package com.google.android.finsky.detailscomponents;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.bm.C1040f;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;

final class C2587m implements OnClickListener {
    public final /* synthetic */ String f13777a;
    public final /* synthetic */ Activity f13778b;
    public final /* synthetic */ ad f13779c;
    public final /* synthetic */ byte[] f13780d;
    public final /* synthetic */ C2586l f13781e;

    C2587m(C2586l c2586l, String str, Activity activity, ad adVar, byte[] bArr) {
        this.f13781e = c2586l;
        this.f13777a = str;
        this.f13778b = activity;
        this.f13779c = adVar;
        this.f13780d = bArr;
    }

    public final void onClick(View view) {
        String str;
        Object obj = this.f13777a;
        if (TextUtils.isEmpty(obj)) {
            str = null;
        } else {
            Uri parse = Uri.parse(obj);
            String host = parse.getHost();
            if ("youtu.be".equals(host)) {
                str = parse.getLastPathSegment();
            } else if ("www.youtube.com".equals(host) && "/watch".equals(parse.getPath())) {
                str = parse.getQueryParameter("v");
            } else {
                FinskyLog.m21665c("Get youtube id fail with url: %s", obj);
                str = null;
            }
        }
        ((C1040f) this.f13778b).mo1265a(str, this.f13781e.f13775c, this.f13779c, this.f13780d);
    }
}
