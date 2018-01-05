package com.google.android.wallet.common.p376a;

import android.text.TextUtils;
import com.google.p440g.p441a.p442a.C7147b;
import java.util.Comparator;

public final class C6551d {
    public static final char[] f32644a = new char[]{'R'};
    public static final String f32645b = null;
    public static final Comparator f32646c = new C6552e();
    public final String f32647d;
    public final C7147b f32648e;
    public final CharSequence f32649f;
    public final String f32650g;
    public final String f32651h;

    public C6551d(String str, String str2) {
        this(str, (CharSequence) str, str2, null);
    }

    public C6551d(String str, C7147b c7147b, CharSequence charSequence, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("source name should not be empty");
        }
        this.f32647d = str;
        this.f32648e = c7147b;
        this.f32649f = charSequence;
        this.f32650g = str2;
        this.f32651h = null;
    }

    public C6551d(String str, CharSequence charSequence, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("source name should not be empty");
        }
        this.f32647d = str;
        this.f32648e = null;
        this.f32649f = charSequence;
        this.f32650g = str2;
        this.f32651h = str3;
    }
}
