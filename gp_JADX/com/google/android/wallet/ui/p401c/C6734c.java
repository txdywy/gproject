package com.google.android.wallet.ui.p401c;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.wallet.a.a;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.C6665h;
import com.google.android.wallet.ui.common.C6760a;
import com.google.android.wallet.ui.common.FifeNetworkImageView;

public final class C6734c extends C6732a implements OnClickListener {
    public TextView ag;
    public FifeNetworkImageView ah;
    public View ai;
    public View aj;

    public static C6734c m30477a(int i, boolean z) {
        Fragment c6734c = new C6734c();
        Bundle b = C6665h.m30137b(i);
        b.putBoolean("nfcEnabled", z);
        c6734c.f(b);
        return c6734c;
    }

    protected final void mo5620a(C6733b c6733b) {
        c6733b.m30476a();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            String str;
            if (VERSION.SDK_INT >= 16) {
                str = "android.settings.NFC_SETTINGS";
            } else {
                str = "android.settings.WIRELESS_SETTINGS";
            }
            a(new Intent(str));
        }
    }

    public final void m30479Z() {
        this.aj.setVisibility(4);
        this.ai.setVisibility(0);
    }

    public final Dialog mo5575W() {
        View inflate = m30140Y().inflate(C6623g.view_nfc_instruction, null);
        this.ag = (TextView) inflate.findViewById(C6622f.nfc_popup_message);
        this.ah = (FifeNetworkImageView) inflate.findViewById(C6622f.nfc_instruction_image);
        this.aj = inflate.findViewById(C6622f.nfc_instruction_layout);
        this.ai = inflate.findViewById(C6622f.nfc_instruction_spinner);
        C6760a a = new C6760a(m30139X()).m30716a(inflate);
        if (this.q.getBoolean("nfcEnabled")) {
            a.m30714a(C6625i.wallet_uic_nfc_popup_title).m30722b(C6625i.wallet_uic_close, null);
            this.ag.setText(C6625i.wallet_uic_nfc_popup_enabled_information);
            String str = (String) a.m.a();
            if (!TextUtils.isEmpty(str)) {
                this.ah.m30606a(str, C6600l.m29933a(m30139X().getApplicationContext()), ((Boolean) C6489e.f32495a.a()).booleanValue());
                this.ah.setFadeIn(true);
                this.ah.setVisibility(0);
            }
        } else {
            a.m30714a(C6625i.wallet_uic_nfc_enable_title).m30715a(C6625i.wallet_uic_nfc_enable_button, (OnClickListener) this);
            this.ag.setText(C6625i.wallet_uic_nfc_popup_disabled_information);
            this.ah.setVisibility(8);
        }
        return a.m30713a();
    }
}
