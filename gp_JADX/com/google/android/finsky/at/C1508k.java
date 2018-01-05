package com.google.android.finsky.at;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.p111d.C2495w;

public class C1508k {
    public Bundle f8199a = new Bundle();
    public Fragment f8200b = null;

    public final C1508k m8848a(int i) {
        this.f8199a.putInt("message_id", i);
        return this;
    }

    public final C1508k m8852a(String str) {
        this.f8199a.putString("message", str);
        return this;
    }

    public final C1508k m8856b(String str) {
        this.f8199a.putString("messageHtml", str);
        return this;
    }

    public final C1508k m8855b(int i) {
        this.f8199a.putInt("layoutId", i);
        return this;
    }

    public final C1508k m8858c(int i) {
        this.f8199a.putInt("title_id", i);
        return this;
    }

    public final C1508k m8859c(String str) {
        this.f8199a.putString("title", str);
        return this;
    }

    public final C1508k m8860d(int i) {
        if (this.f8199a.containsKey("positive_label")) {
            throw new IllegalStateException("Already set positive button label");
        }
        this.f8199a.putInt("positive_id", i);
        return this;
    }

    public final C1508k m8861d(String str) {
        if (this.f8199a.containsKey("positive_id")) {
            throw new IllegalStateException("Already set positive button label");
        }
        this.f8199a.putString("positive_label", str);
        return this;
    }

    public final C1508k m8862e(int i) {
        if (this.f8199a.containsKey("negative_label")) {
            throw new IllegalStateException("Already set negative button label");
        }
        this.f8199a.putInt("negative_id", i);
        return this;
    }

    public final C1508k m8863e(String str) {
        if (this.f8199a.containsKey("negative_id")) {
            throw new IllegalStateException("Already set negative button label");
        }
        this.f8199a.putString("negative_label", str);
        return this;
    }

    public final C1508k m8853a(boolean z) {
        this.f8199a.putBoolean("cancel_on_touch_outside", z);
        return this;
    }

    public final C1508k m8857b(boolean z) {
        this.f8199a.putBoolean("cancel_does_negative_action", z);
        return this;
    }

    public final C1508k m8850a(Bundle bundle) {
        this.f8199a.putBundle("config_arguments", bundle);
        return this;
    }

    public final C1508k m8849a(int i, byte[] bArr, int i2, int i3, C2495w c2495w) {
        this.f8199a.putInt("impression_type", i);
        this.f8199a.putByteArray("impression_cookie", bArr);
        this.f8199a.putInt("click_event_type_positive", i2);
        this.f8199a.putInt("click_event_type_negative", i3);
        c2495w.m13377a(this.f8199a);
        return this;
    }

    public final C1508k m8851a(Fragment fragment, int i, Bundle bundle) {
        this.f8200b = fragment;
        if (!(bundle == null && i == 0)) {
            this.f8199a.putBundle("extra_arguments", bundle);
            this.f8199a.putInt("target_request_code", i);
        }
        return this;
    }

    public C1128e mo2272a() {
        C1128e c1128e = new C1128e();
        m8854a(c1128e);
        return c1128e;
    }

    public final void m8854a(C1128e c1128e) {
        c1128e.m600f(this.f8199a);
        if (this.f8200b != null) {
            c1128e.m581a(this.f8200b, 0);
        }
    }
}
