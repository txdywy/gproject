package com.google.android.finsky.at;

import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.support.v7.app.q;
import android.support.v7.app.z;
import android.text.Html;
import android.view.LayoutInflater;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.android.wallet.ui.common.a;

public class com.google.android.finsky.at.e extends android.support.v4.app.p
{

    public com.google.android.finsky.d.a ah;
    public com.google.android.finsky.d.w ai;
    public com.google.android.finsky.d.ad aj;
    public boolean ak;
    public com.google.android.finsky.at.l al;

    e() {
        android.support.v4.app.p();
        this.ak = 0;
        this.al = 0;
    }

    private final Bundle m(Bundle p0) {
        if (this.al != 0) {
            v0 = this.al.getResult();
            if (v0 != 0) {
                if (p0 == 0)
                    p0 = new Bundle();
                p0.putAll(v0);
            }
        }
        return p0;
    }

    public void W() {
    }

    protected final Bundle X() {
        return this.q.getBundle("extra_arguments");
    }

    protected final int Y() {
        return this.q.getInt("target_request_code");
    }

    public final void Z() {
        this.a(0);
        if (this.ak == 0) {
            this.ak = 1;
            v0 = this.q.getInt("click_event_type_positive", -1);
            if (v0 != -1)
                this.ai.b(new com.google.android.finsky.d.d(this.aj).a(v0));
            v0 = this.ac();
            if (v0 != 0)
                v0.a(this.Y(), this.m(this.X()));
            this.ab();
        }
    }

    public Dialog a(Bundle p0) {
        ((com.google.android.finsky.at.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.at.a)).a(this);
        this.ai = this.ah.a(this.q);
        this.aj = 0;
        if (this.q.containsKey("impression_type"))
            this.aj = new com.google.android.finsky.d.o(this.q.getInt("impression_type"), this.q.getByteArray("impression_cookie"), 0);
        if (p0 == 0 && this.aj != 0)
            this.ai.a(new com.google.android.finsky.d.p().b(this.aj));
        v2 = new com.google.android.wallet.ui.common.a(this.h());
        if (this.q.containsKey("title"))
            v2.a(this.q.getString("title"));
        else if (this.q.containsKey("title_id"))
            v2.a(this.q.getInt("title_id"));
        if (this.q.containsKey("icon_id")) {
            v0 = this.q.getInt("icon_id");
            if (v2.b != 0)
                v2.b.setIcon(v0);
            else
                v2.a.a.c = v0;
        }
        if (this.q.containsKey("message_id"))
            v2.b(this.q.getInt("message_id"));
        else if (this.q.containsKey("message"))
            v2.b(this.q.getString("message"));
        else if (this.q.containsKey("messageHtml"))
            v2.b(Html.fromHtml(this.q.getString("messageHtml")));
        else if (this.q.containsKey("messageCharSeq"))
            v2.b(this.q.getCharSequence("messageCharSeq"));
        if (this.q.containsKey("positive_id"))
            v2.a(this.q.getInt("positive_id"), new com.google.android.finsky.at.f(this));
        else if (this.q.containsKey("positive_label"))
            v2.a(this.q.getString("positive_label"), new com.google.android.finsky.at.g(this));
        if (this.q.containsKey("negative_id"))
            v2.b(this.q.getInt("negative_id"), new com.google.android.finsky.at.h(this));
        else if (this.q.containsKey("negative_label"))
            v2.b(this.q.getString("negative_label"), new com.google.android.finsky.at.i(this));
        if (!this.q.containsKey("force_inverse_background")) {
            if (this.q.containsKey("layoutId")) {
                v0 = LayoutInflater.from(this.h()).inflate(this.q.getInt("layoutId"), 0);
                v2.a(v0);
                if (v0 instanceof com.google.android.finsky.at.l) {
                    this.al = (com.google.android.finsky.at.l)v0;
                    if (this.q.containsKey("config_arguments"))
                        this.al.a(this.q.getBundle("config_arguments"));
                }
            }
            v0 = v2.a();
            if (!this.q.containsKey("layoutId"))
                v0.setOnShowListener(new com.google.android.finsky.at.j(v0));
            if (this.q.containsKey("cancel_on_touch_outside"))
                v0.setCanceledOnTouchOutside(this.q.getBoolean("cancel_on_touch_outside"));
            return v0;
        }
        if (v2.b != 0) {
            v2.b.setInverseBackgroundForced(this.q.getBoolean("force_inverse_background"));
            if (this.q.containsKey("layoutId")) {
                v0 = LayoutInflater.from(this.h()).inflate(this.q.getInt("layoutId"), 0);
                v2.a(v0);
                if (v0 instanceof com.google.android.finsky.at.l) {
                    this.al = (com.google.android.finsky.at.l)v0;
                    if (this.q.containsKey("config_arguments"))
                        this.al.a(this.q.getBundle("config_arguments"));
                }
            }
            v0 = v2.a();
            if (!this.q.containsKey("layoutId"))
                v0.setOnShowListener(new com.google.android.finsky.at.j(v0));
            if (this.q.containsKey("cancel_on_touch_outside"))
                v0.setCanceledOnTouchOutside(this.q.getBoolean("cancel_on_touch_outside"));
            return v0;
        }
        if (v2.a != 0) {
            if (this.q.containsKey("layoutId")) {
                v0 = LayoutInflater.from(this.h()).inflate(this.q.getInt("layoutId"), 0);
                v2.a(v0);
                if (v0 instanceof com.google.android.finsky.at.l) {
                    this.al = (com.google.android.finsky.at.l)v0;
                    if (this.q.containsKey("config_arguments"))
                        this.al.a(this.q.getBundle("config_arguments"));
                }
            }
            v0 = v2.a();
            if (!this.q.containsKey("layoutId"))
                v0.setOnShowListener(new com.google.android.finsky.at.j(v0));
            if (this.q.containsKey("cancel_on_touch_outside"))
                v0.setCanceledOnTouchOutside(this.q.getBoolean("cancel_on_touch_outside"));
            return v0;
        }
        throw 0;
    }

    public final void aa() {
        this.a(0);
        if (this.ak == 0) {
            this.ak = 1;
            v0 = this.q.getInt("click_event_type_negative", -1);
            if (v0 != -1)
                this.ai.b(new com.google.android.finsky.d.d(this.aj).a(v0));
            v0 = this.ac();
            if (v0 != 0)
                v0.b(this.Y(), this.m(this.X()));
            this.W();
        }
    }

    public void ab() {
    }

    protected final com.google.android.finsky.at.m ac() {
        if (this.r instanceof com.google.android.finsky.at.m)
            v0 = (com.google.android.finsky.at.m)this.r;
        else {
            v0 = this.h();
            if (v0 instanceof com.google.android.finsky.at.m)
                v0 = (com.google.android.finsky.at.m)v0;
            else
                v0 = 0;
        }
        return v0;
    }

    public void onCancel(DialogInterface p0) {
        super.onCancel(p0);
        if (this.q.getBoolean("cancel_does_negative_action", 1))
            this.aa();
    }

}
