package com.google.android.finsky.billing;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.p028a.p029a.C0206f;
import android.support.v4.widget.bg;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.wallet.ui.common.a;
import com.squareup.leakcanary.C7582R;

public final class C1873l extends C1834t {
    public final Dialog mo143a(Bundle bundle) {
        Context h = m603h();
        a aVar = new a(h, (byte) 0);
        View inflate = LayoutInflater.from(h).inflate(C7582R.layout.download_network_settings_dialog, null);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.beta_label);
        textView.setOnClickListener(new C1994m((TextView) inflate.findViewById(C7582R.id.beta_notice)));
        bg.m2222a(textView, null, null, C0722q.m4782a(m605i(), (int) C7582R.raw.ic_info_outline_black_24dp, new as().m4593b(C0206f.m1066b(m605i(), C7582R.color.detail_primary_text, m601g().getTheme()))), null);
        aVar.a(inflate).a(C7582R.string.network_dialog_settings_ok_button, new C2038o(this)).b(C7582R.string.settings, new C2037n(this));
        return aVar.a();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo968W().W_();
        super.onCancel(dialogInterface);
    }

    final C1886u mo968W() {
        if (this.f761r != null) {
            return (C1886u) this.f761r;
        }
        return (C1886u) m603h();
    }

    protected final int mo2460X() {
        return 6321;
    }
}
