package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.volley.C0660x;
import com.google.android.wallet.ui.common.a;
import com.google.wireless.android.finsky.dfe.nano.br;
import com.squareup.leakcanary.C7582R;

final class C1134y implements C0660x {
    public final /* synthetic */ C1033t f7090a;

    C1134y(C1033t c1033t) {
        this.f7090a = c1033t;
    }

    public final /* synthetic */ void b_(Object obj) {
        br brVar = (br) obj;
        Context context = this.f7090a;
        CharSequence charSequence = brVar.b;
        View inflate = LayoutInflater.from(context).inflate(C7582R.layout.debug_play_country_dialog, null);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.current);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = context.getString(C7582R.string.debug_play_country_override_none);
        }
        textView.setText(context.getString(C7582R.string.debug_play_country_override_current, new Object[]{charSequence}));
        EditText editText = (EditText) inflate.findViewById(C7582R.id.edit);
        Dialog a = new a(context).a(context.getString(C7582R.string.debug_play_country_override_title)).a(inflate).a(context.getString(C7582R.string.ok), new ae(context, editText)).b(context.getString(C7582R.string.cancel), new ad()).a();
        a.setOnShowListener(new af(context, editText));
        a.show();
    }
}
