package com.google.android.finsky.stream.controllers.dataassistcard.view;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;

public final class C4377a {
    public final String f22209a;
    public final String f22210b;
    public final int f22211c;
    public final int f22212d;
    public final String f22213e;
    public final String f22214f;
    public final String f22215g;
    public final String f22216h;
    public final String f22217i;
    public final boolean f22218j;
    public final byte[] f22219k;

    public C4377a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, byte[] bArr) {
        int parseColor;
        this.f22209a = str;
        this.f22210b = str2;
        this.f22211c = i;
        if (TextUtils.isEmpty(str3)) {
            FinskyLog.m21669e("Missing arc color for data card.", new Object[0]);
            str3 = "#000000";
        }
        try {
            parseColor = Color.parseColor(str3);
        } catch (IllegalArgumentException e) {
            String str9 = "Bad arc color format for data card: ";
            String valueOf = String.valueOf(str3);
            FinskyLog.m21669e(valueOf.length() != 0 ? str9.concat(valueOf) : new String(str9), new Object[0]);
            parseColor = -16777216;
        }
        this.f22212d = parseColor;
        this.f22213e = str4;
        this.f22214f = str5;
        this.f22215g = str6;
        this.f22216h = str7;
        this.f22217i = str8;
        this.f22218j = z;
        this.f22219k = bArr;
    }
}
