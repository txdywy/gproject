package com.google.android.wallet.analytics.p365a;

import com.google.android.wallet.analytics.AppValidationResult;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.analytics.GetAttestationResult;
import com.google.android.wallet.analytics.GetPropertiesResult;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;
import com.google.p443h.p451c.p455b.p456a.C7156e;

public final class C6492a {
    public final int f32545a;
    public final int f32546b;
    public final String f32547c;
    public final long f32548d;
    public final long f32549e;
    public final String f32550f;
    public final int f32551g;
    public final CreditCardEntryAction f32552h;
    public final C7156e f32553i;
    public final WebViewPageLoadEvent f32554j;
    public final byte[] f32555k;

    public C6492a(int i, int i2, String str, long j, long j2, int i3, byte[] bArr) {
        this.f32545a = i;
        this.f32546b = i2;
        this.f32547c = str;
        this.f32548d = j;
        this.f32549e = j2;
        this.f32551g = i3;
        this.f32555k = bArr;
        this.f32552h = null;
        this.f32553i = null;
        this.f32554j = null;
        this.f32550f = null;
    }

    public C6492a(byte[] bArr) {
        this.f32545a = 781;
        this.f32546b = -1;
        this.f32547c = null;
        this.f32548d = -1;
        this.f32549e = -1;
        this.f32551g = 0;
        this.f32555k = bArr;
        this.f32552h = null;
        this.f32553i = null;
        this.f32554j = null;
        this.f32550f = null;
    }

    public C6492a(CreditCardEntryAction creditCardEntryAction, byte[] bArr) {
        this.f32545a = 770;
        this.f32546b = 0;
        this.f32547c = null;
        this.f32548d = -1;
        this.f32549e = -1;
        this.f32555k = bArr;
        this.f32552h = creditCardEntryAction;
        this.f32551g = 0;
        this.f32553i = null;
        this.f32554j = null;
        this.f32550f = null;
    }

    public C6492a(int i, WebViewPageLoadEvent webViewPageLoadEvent, byte[] bArr) {
        this.f32545a = 772;
        this.f32546b = i;
        this.f32547c = null;
        this.f32548d = -1;
        this.f32549e = -1;
        this.f32555k = bArr;
        this.f32552h = null;
        this.f32551g = 0;
        this.f32553i = null;
        this.f32554j = webViewPageLoadEvent;
        this.f32550f = null;
    }

    public C6492a(int i, AppValidationResult appValidationResult, byte[] bArr) {
        this.f32545a = 777;
        this.f32546b = i;
        this.f32550f = appValidationResult.f32502a.c;
        this.f32548d = appValidationResult.f32504c;
        this.f32547c = null;
        this.f32549e = -1;
        this.f32551g = 0;
        this.f32555k = bArr;
        this.f32552h = null;
        this.f32553i = null;
        this.f32554j = null;
    }

    public C6492a(int i, GetAttestationResult getAttestationResult, byte[] bArr) {
        this.f32545a = 779;
        this.f32546b = i;
        this.f32547c = null;
        this.f32548d = getAttestationResult.f32530a;
        this.f32549e = getAttestationResult.f32531b;
        this.f32555k = bArr;
        this.f32552h = null;
        this.f32551g = 0;
        this.f32553i = null;
        this.f32554j = null;
        this.f32550f = null;
    }

    public C6492a(int i, GetPropertiesResult getPropertiesResult, byte[] bArr) {
        this.f32545a = 780;
        this.f32546b = i;
        this.f32547c = null;
        this.f32548d = getPropertiesResult.f32533b;
        this.f32549e = getPropertiesResult.f32534c;
        this.f32555k = bArr;
        this.f32552h = null;
        this.f32551g = 0;
        this.f32553i = null;
        this.f32554j = null;
        this.f32550f = getPropertiesResult.f32532a;
    }

    public C6492a(C7156e c7156e, byte[] bArr) {
        this.f32545a = 782;
        this.f32546b = -1;
        this.f32553i = c7156e;
        this.f32547c = null;
        this.f32548d = -1;
        this.f32549e = -1;
        this.f32551g = 0;
        this.f32555k = bArr;
        this.f32552h = null;
        this.f32554j = null;
        this.f32550f = null;
    }
}
