package com.google.android.finsky.at;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.at.k
{

    public Bundle a;
    public Fragment b;

    k() {
        this.a = new Bundle();
        this.b = 0;
    }

    public com.google.android.finsky.at.e a() {
        v0 = new com.google.android.finsky.at.e();
        this.a(v0);
        return v0;
    }

    public final com.google.android.finsky.at.k a(int p0) {
        this.a.putInt("message_id", p0);
        return this;
    }

    public final com.google.android.finsky.at.k a(int p0, byte[] p1, int p2, int p3, com.google.android.finsky.d.w p4) {
        this.a.putInt("impression_type", p0);
        this.a.putByteArray("impression_cookie", p1);
        this.a.putInt("click_event_type_positive", p2);
        this.a.putInt("click_event_type_negative", p3);
        p4.a(this.a);
        return this;
    }

    public final com.google.android.finsky.at.k a(Bundle p0) {
        this.a.putBundle("config_arguments", p0);
        return this;
    }

    public final com.google.android.finsky.at.k a(Fragment p0, int p1, Bundle p2) {
        this.b = p0;
        if (p2 != 0 || p1 != 0) {
            this.a.putBundle("extra_arguments", p2);
            this.a.putInt("target_request_code", p1);
        }
        return this;
    }

    public final com.google.android.finsky.at.k a(String p0) {
        this.a.putString("message", p0);
        return this;
    }

    public final com.google.android.finsky.at.k a(boolean p0) {
        this.a.putBoolean("cancel_on_touch_outside", p0);
        return this;
    }

    public final void a(com.google.android.finsky.at.e p0) {
        p0.f(this.a);
        if (this.b != 0)
            p0.a(this.b, 0);
    }

    public final com.google.android.finsky.at.k b(int p0) {
        this.a.putInt("layoutId", p0);
        return this;
    }

    public final com.google.android.finsky.at.k b(String p0) {
        this.a.putString("messageHtml", p0);
        return this;
    }

    public final com.google.android.finsky.at.k b(boolean p0) {
        this.a.putBoolean("cancel_does_negative_action", p0);
        return this;
    }

    public final com.google.android.finsky.at.k c(int p0) {
        this.a.putInt("title_id", p0);
        return this;
    }

    public final com.google.android.finsky.at.k c(String p0) {
        this.a.putString("title", p0);
        return this;
    }

    public final com.google.android.finsky.at.k d(int p0) {
        if (this.a.containsKey("positive_label"))
            throw new IllegalStateException("Already set positive button label");
        this.a.putInt("positive_id", p0);
        return this;
    }

    public final com.google.android.finsky.at.k d(String p0) {
        if (this.a.containsKey("positive_id"))
            throw new IllegalStateException("Already set positive button label");
        this.a.putString("positive_label", p0);
        return this;
    }

    public final com.google.android.finsky.at.k e(int p0) {
        if (this.a.containsKey("negative_label"))
            throw new IllegalStateException("Already set negative button label");
        this.a.putInt("negative_id", p0);
        return this;
    }

    public final com.google.android.finsky.at.k e(String p0) {
        if (this.a.containsKey("negative_id"))
            throw new IllegalStateException("Already set negative button label");
        this.a.putString("negative_label", p0);
        return this;
    }

}
