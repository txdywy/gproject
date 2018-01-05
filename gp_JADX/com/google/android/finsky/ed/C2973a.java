package com.google.android.finsky.ed;

import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.cv.p177a.ly;
import com.google.android.finsky.cv.p177a.ma;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;

public final class C2973a extends C1128e {
    public String af;

    public static C2973a m15395a(ly lyVar, String str, C2495w c2495w) {
        CharSequence charSequence;
        String str2;
        boolean z = (TextUtils.isEmpty(lyVar.f13085b) || ((TextUtils.isEmpty(lyVar.f13086c) && lyVar.f13090g == null) || TextUtils.isEmpty(lyVar.f13087d) || lyVar.f13088e == null || TextUtils.isEmpty(lyVar.f13088e.f12323c))) ? false : true;
        if (!z) {
            FinskyLog.m21669e("Found malformed WhyThisAd message %s.", lyVar);
        }
        C1508k c1508k = new C1508k();
        if (lyVar.f13090g != null) {
            charSequence = lyVar.f13090g.f13092b;
            ma[] maVarArr = lyVar.f13090g.f13093c;
            int length = maVarArr.length;
            int i = 0;
            while (i < length) {
                Object obj = maVarArr[i].f13148c;
                new SpannableString(obj).setSpan(new BulletSpan(25), 0, obj.length(), 0);
                i++;
                charSequence = TextUtils.concat(new CharSequence[]{charSequence, r8});
            }
        } else {
            charSequence = lyVar.f13086c;
        }
        c1508k.f8199a.putCharSequence("messageCharSeq", charSequence);
        C1508k a = c1508k.m8859c(lyVar.f13085b).m8863e(lyVar.f13087d).m8861d(str).m8853a(true).m8857b(false).m8849a(328, null, -1, 329, c2495w);
        C1128e c2973a = new C2973a();
        if (lyVar.f13088e == null) {
            str2 = "";
        } else {
            str2 = lyVar.f13088e.f12323c;
        }
        c2973a.af = str2;
        a.m8854a(c2973a);
        return c2973a;
    }

    protected final void mo968W() {
        if (this.af != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.af));
            intent.setFlags(524288);
            m580a(intent);
        }
    }
}
