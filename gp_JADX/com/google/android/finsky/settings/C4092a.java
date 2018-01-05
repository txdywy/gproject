package com.google.android.finsky.settings;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.download.C2838a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.wallet.ui.common.a;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C4092a extends DialogFragment implements ad {
    public C2471a f20498a;
    public C2838a f20499b;
    public C1461c f20500c;
    public C4090k f20501d;
    public C2495w f20502e;

    public final ce getPlayStoreUiElement() {
        return C2482j.m13283a(6329);
    }

    public final ad getParentNode() {
        if (getActivity() instanceof ad) {
            return (ad) getActivity();
        }
        return null;
    }

    public final void mo1219a(ad adVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }

    public final void onAttach(Activity activity) {
        ((C1414v) C3947d.m18649a(C1414v.class)).mo1906a(this);
        super.onAttach(activity);
        if (activity instanceof C4090k) {
            this.f20501d = (C4090k) activity;
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        m19039a(6336);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z = true;
        boolean z2 = false;
        if (bundle == null) {
            this.f20502e = this.f20498a.m13179a(getArguments());
            this.f20502e.m13370a(new C2488p().m13345b(this));
        } else {
            this.f20502e = this.f20498a.m13179a(bundle);
        }
        Context activity = getActivity();
        a aVar = new a(activity, (byte) 0);
        aVar.a(C7582R.string.download_settings_label);
        View inflate = LayoutInflater.from(activity).inflate(C7582R.layout.download_settings_dialog, null);
        aVar.a(inflate);
        int a;
        if (this.f20500c.dj().mo2294a(12641184)) {
            int intValue;
            boolean z3;
            boolean z4;
            a = this.f20499b.m14996a(true);
            if (((Boolean) C1789d.f9316c.m5760a()).booleanValue()) {
                intValue = ((Integer) C1789d.f9315b.m5760a()).intValue();
            } else {
                intValue = 0;
            }
            RadioButton radioButton = (RadioButton) inflate.findViewById(C7582R.id.download_settings_wait_for_wifi);
            radioButton.setOnClickListener(new C4093b(this));
            radioButton.setVisibility(0);
            if (a == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            radioButton.setChecked(z3);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(C7582R.id.download_settings_now);
            radioButton2.setOnClickListener(new C4094c(this));
            if (a == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            radioButton2.setChecked(z4);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(C7582R.id.download_settings_ask_everytime);
            radioButton3.setVisibility(0);
            radioButton3.setOnClickListener(new C4095d(this));
            if (a != 2) {
                z = false;
            }
            radioButton3.setChecked(z);
            aVar.b(C7582R.string.cancel, new C4097f(this)).a(C7582R.string.network_dialog_ok_button, new C4096e(this, radioButton, radioButton2, intValue));
            return aVar.a();
        }
        boolean z5;
        Bundle arguments = getArguments();
        a = this.f20499b.m14996a(false);
        CharSequence string = arguments.getString("flex-time-window-offer-description");
        CharSequence string2 = arguments.getString("flex-time-window-time-frame-description");
        radioButton = (RadioButton) inflate.findViewById(C7582R.id.download_settings_wait_for_wifi);
        if (this.f20499b.m14997a()) {
            radioButton.setChecked(true);
            radioButton.setOnClickListener(new C4098g(this));
            radioButton.setVisibility(0);
            radioButton.setChecked(a == 3);
        }
        radioButton2 = (RadioButton) inflate.findViewById(C7582R.id.download_settings_offpeak_or_wifi);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.download_settings_offpeak_or_wifi_subtext);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            z5 = false;
        } else {
            z5 = true;
        }
        Context activity2 = getActivity();
        if (z5) {
            radioButton2.setText(activity2.getString(C7582R.string.download_settings_value_offpeak_or_wifi, new Object[]{string}));
            radioButton2.setOnClickListener(new C4099h(this));
            radioButton2.setVisibility(0);
            if (a == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            radioButton2.setChecked(z5);
            textView.setText(activity2.getString(C7582R.string.offpeak_or_wifi_radio_button_subtext, new Object[]{string2}));
            textView.setVisibility(0);
        }
        radioButton3 = (RadioButton) inflate.findViewById(C7582R.id.download_settings_now);
        radioButton3.setOnClickListener(new C4100i(this));
        if (a == 1 || a == 2) {
            z2 = true;
        }
        radioButton3.setChecked(z2);
        aVar.a(C7582R.string.network_dialog_ok_button, new C4101j(this, radioButton, radioButton2, activity2));
        return aVar.a();
    }

    final void m19039a(int i) {
        this.f20502e.m13379b(new C2475d(this).m13256a(i));
    }
}
