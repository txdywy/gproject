package com.google.android.finsky.activities;

import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.support.v7.app.be;
import android.support.v7.app.y;
import android.support.v7.app.z;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.wallet.ui.common.a;

public final class com.google.android.finsky.activities.dp extends android.support.v4.app.p
{

    public String af;

    dp() {
        android.support.v4.app.p();
    }

    public final Dialog a(Bundle p0) {
        if (p0 == 0)
            p0 = this.q;
        this.af = p0.getString("previous_message");
        v3 = LayoutInflater.from(this.h()).inflate(2130968877, 0, 0);
        v0 = (TextView)v3.findViewById(2131755885);
        v0.setText(this.af);
        v4 = new com.google.android.wallet.ui.common.a(this.h());
        v4.a(this.q.getInt("prompt_string_res_id"));
        v4.a(v3);
        if (v4.b != 0)
            v4.b.setCancelable(1);
        else
            v4.a.a(1);
        v4.a(17039370, new com.google.android.finsky.activities.dq(this, v0));
        v4.b(17039360, 0);
        return v4.a();
    }

    public final void e(Bundle p0) {
        if (!TextUtils.isEmpty(this.af))
            p0.putString("previous_message", this.af);
    }

    public final void g_() {
        super.g_();
        v2 = ((android.support.v7.app.y)this.f).a(-1);
        if (!TextUtils.isEmpty(this.af))
            v1 = 1;
        else
            v1 = 0;
        v2.setEnabled(v1);
        ((TextView)((android.support.v7.app.y)this.f).findViewById(2131755885)).addTextChangedListener(new com.google.android.finsky.activities.dr(this, v2));
    }

}
