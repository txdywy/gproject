package com.google.android.finsky.activities;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.google.android.finsky.notification.c;
import com.google.android.finsky.o;
import com.google.android.finsky.providers.d;
import com.google.android.wallet.ui.common.a;

public final class com.google.android.finsky.activities.bc extends DialogFragment
{

    public com.google.android.finsky.notification.c a;
    public Toast b;

    bc() {
        DialogFragment();
    }

    private final boolean a() {
        if (this.a != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    final void a(String p0) {
        if (this.b != 0)
            this.b.cancel();
        this.b = Toast.makeText(this.getActivity(), p0, 0);
        this.b.show();
    }

    public final Dialog onCreateDialog(Bundle p0) {
        ((com.google.android.finsky.o)com.google.android.finsky.providers.d.a(com.google.android.finsky.o)).a(this);
        if (!this.a())
            v0 = new com.google.android.wallet.ui.common.a(this.getActivity()).b("Notification Assist not available.").a(2131952688, com.google.android.finsky.activities.bd.a).a();
        else {
            v1 = this.getActivity().getLayoutInflater().inflate(2130969453, 0);
            ((RadioButton)v1.findViewById(2131756794)).setChecked(1);
            ((RadioButton)v1.findViewById(2131756798)).setChecked(1);
            ((RadioButton)v1.findViewById(2131756801)).setChecked(1);
            ((RadioGroup)v1.findViewById(2131756793)).setOnCheckedChangeListener(new com.google.android.finsky.activities.bf(this));
            ((RadioGroup)v1.findViewById(2131756797)).setOnCheckedChangeListener(new com.google.android.finsky.activities.bg(this));
            ((RadioGroup)v1.findViewById(2131756800)).setOnCheckedChangeListener(new com.google.android.finsky.activities.bh(this));
            ((Button)v1.findViewById(2131756803)).setOnClickListener(new com.google.android.finsky.activities.bi());
            ((Button)v1.findViewById(2131756804)).setOnClickListener(new com.google.android.finsky.activities.bj(this));
            ((Button)v1.findViewById(2131756805)).setOnClickListener(new com.google.android.finsky.activities.bk(this));
            this.a.a(0);
            v0 = new com.google.android.wallet.ui.common.a(this.getActivity()).a("Debug Notification Assist").a(v1).b("Clear queue and close", com.google.android.finsky.activities.be.a).a();
        }
        return v0;
    }

    public final void onDismiss(DialogInterface p0) {
        super.onDismiss(p0);
        if (this.a()) {
            this.a.c();
            this.a.a(1);
        }
    }

}
