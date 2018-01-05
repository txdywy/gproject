package com.google.android.finsky.externalreferrer;

import android.text.TextUtils;
import com.google.android.finsky.externalreferrer.p197a.C3008a;

public final class C3017j {
    public final C3008a f15799a = new C3008a();

    final C3017j m15602a(String str) {
        C3008a c3008a = this.f15799a;
        if (str == null) {
            throw new NullPointerException();
        }
        c3008a.f15759a |= 1;
        c3008a.f15760b = str;
        return this;
    }

    final C3017j m15603b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C3008a c3008a = this.f15799a;
            if (str == null) {
                throw new NullPointerException();
            }
            c3008a.f15759a |= 2;
            c3008a.f15761c = str;
        }
        return this;
    }

    final C3017j m15601a(long j) {
        C3008a c3008a = this.f15799a;
        c3008a.f15759a |= 8;
        c3008a.f15763e = j;
        return this;
    }

    final ExternalReferrerStatus m15600a() {
        return new ExternalReferrerStatus(this.f15799a);
    }
}
