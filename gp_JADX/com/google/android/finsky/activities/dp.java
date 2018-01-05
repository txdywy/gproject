package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import android.support.v7.app.C0433y;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.wallet.ui.common.a;
import com.squareup.leakcanary.C7582R;

public final class dp extends C0141p {
    public String af;

    public final Dialog mo143a(Bundle bundle) {
        Context h = m603h();
        Bundle bundle2 = this.f760q;
        int i = bundle2.getInt("prompt_string_res_id");
        if (bundle == null) {
            bundle = bundle2;
        }
        this.af = bundle.getString("previous_message");
        View inflate = LayoutInflater.from(m603h()).inflate(C7582R.layout.flag_item_message, null, false);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.flag_message);
        textView.setText(this.af);
        a aVar = new a(h);
        aVar.a(i);
        aVar.a(inflate);
        if (aVar.b != null) {
            aVar.b.setCancelable(true);
        } else {
            aVar.a.m2642a(true);
        }
        aVar.a(17039370, new dq(this, textView));
        aVar.b(17039360, null);
        return aVar.a();
    }

    public final void g_() {
        super.g_();
        C0433y c0433y = (C0433y) this.f775f;
        Button a = c0433y.m2636a(-1);
        a.setEnabled(!TextUtils.isEmpty(this.af));
        ((TextView) c0433y.findViewById(C7582R.id.flag_message)).addTextChangedListener(new dr(this, a));
    }

    public final void mo140e(Bundle bundle) {
        if (!TextUtils.isEmpty(this.af)) {
            bundle.putString("previous_message", this.af);
        }
    }
}
