package com.google.android.finsky.notification;

import com.google.android.finsky.utils.ad;
import java.util.Arrays;

public final class C3783g {
    public String f18989a;
    public String f18990b;
    public String f18991c;
    public String f18992d;
    public int f18993e;
    public C3816o f18994f;
    public long f18995g;
    public int f18996h;
    public C3820u f18997i;
    public C3820u f18998j;
    public C3778a f18999k;
    public C3778a f19000l;
    public Integer f19001m;
    public byte[] f19002n;

    public C3783g(C3783g c3783g) {
        C3820u c3820u;
        byte[] bArr = null;
        this.f18989a = c3783g.f18989a;
        this.f18990b = c3783g.f18990b;
        this.f18991c = c3783g.f18991c;
        this.f18992d = c3783g.f18992d;
        this.f18993e = c3783g.f18993e;
        this.f18994f = c3783g.f18994f;
        this.f18995g = c3783g.f18995g;
        this.f18996h = c3783g.f18996h;
        this.f18997i = c3783g.f18997i == null ? null : new C3820u(c3783g.f18997i);
        if (c3783g.f18998j == null) {
            c3820u = null;
        } else {
            c3820u = new C3820u(c3783g.f18998j);
        }
        this.f18998j = c3820u;
        this.f18999k = c3783g.f18999k == null ? null : new C3778a(c3783g.f18999k);
        this.f19000l = c3783g.f19000l == null ? null : new C3778a(c3783g.f19000l);
        this.f19001m = c3783g.f19001m;
        if (c3783g.f19002n != null) {
            bArr = (byte[]) c3783g.f19002n.clone();
        }
        this.f19002n = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3783g c3783g = (C3783g) obj;
        if (this.f18993e == c3783g.f18993e && this.f18995g == c3783g.f18995g && this.f18996h == c3783g.f18996h && ad.m21692a(this.f19001m, c3783g.f19001m) && ad.m21692a(this.f18989a, c3783g.f18989a) && ad.m21692a(this.f18990b, c3783g.f18990b) && ad.m21692a(this.f18991c, c3783g.f18991c) && ad.m21692a(this.f18992d, c3783g.f18992d) && ad.m21692a(this.f18994f, c3783g.f18994f) && ad.m21692a(this.f19002n, c3783g.f19002n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18989a, this.f18990b, this.f18991c, this.f18992d, Integer.valueOf(this.f18993e), this.f18994f, Long.valueOf(this.f18995g), Integer.valueOf(this.f18996h), this.f19001m, this.f19002n});
    }

    public final String toString() {
        String str = this.f18989a;
        String str2 = this.f18990b;
        String str3 = this.f18991c;
        String str4 = this.f18992d;
        int i = this.f18993e;
        String valueOf = String.valueOf(this.f18994f);
        long j = this.f18995g;
        int i2 = this.f18996h;
        String valueOf2 = String.valueOf(this.f18997i);
        String valueOf3 = String.valueOf(this.f18998j);
        String valueOf4 = String.valueOf(this.f18999k);
        String valueOf5 = String.valueOf(this.f19000l);
        String valueOf6 = String.valueOf(this.f19001m);
        String arrays = Arrays.toString(this.f19002n);
        return new StringBuilder(((((((((((String.valueOf(str).length() + 313) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(arrays).length()).append("NotificationContentData{notificationId='").append(str).append('\'').append(", accountName='").append(str2).append('\'').append(", title='").append(str3).append('\'').append(", messageHtml='").append(str4).append('\'').append(", smallIconResId=").append(i).append(", largeIcon=").append(valueOf).append(", notifiedTimestampMs=").append(j).append(", notificationCenterBehavior=").append(i2).append(", clickIntentData=").append(valueOf2).append(", dismissIntentData=").append(valueOf3).append(", primaryAction=").append(valueOf4).append(", secondaryAction=").append(valueOf5).append(", uiElementType=").append(valueOf6).append(", serverLogsCookie=").append(arrays).append('}').toString();
    }
}
