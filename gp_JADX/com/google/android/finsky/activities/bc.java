package com.google.android.finsky.activities;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.notification.C3779c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.wallet.ui.common.a;
import com.squareup.leakcanary.C7582R;

public final class bc extends DialogFragment {
    public C3779c f6477a;
    public Toast f6478b;

    private final boolean m6306a() {
        return this.f6477a != null;
    }

    final void m6307a(String str) {
        if (this.f6478b != null) {
            this.f6478b.cancel();
        }
        this.f6478b = Toast.makeText(getActivity(), str, 0);
        this.f6478b.show();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1702a(this);
        if (!m6306a()) {
            return new a(getActivity()).b("Notification Assist not available.").a(C7582R.string.ok, bd.f6479a).a();
        }
        View inflate = getActivity().getLayoutInflater().inflate(C7582R.layout.test_update_notification_dialog, null);
        ((RadioButton) inflate.findViewById(C7582R.id.delay_decision_ml)).setChecked(true);
        ((RadioButton) inflate.findViewById(C7582R.id.expiration_length_default)).setChecked(true);
        ((RadioButton) inflate.findViewById(C7582R.id.reschedule_deadline_default)).setChecked(true);
        ((RadioGroup) inflate.findViewById(C7582R.id.delay_decision)).setOnCheckedChangeListener(new bf(this));
        ((RadioGroup) inflate.findViewById(C7582R.id.expiration_length)).setOnCheckedChangeListener(new bg(this));
        ((RadioGroup) inflate.findViewById(C7582R.id.reschedule_deadline)).setOnCheckedChangeListener(new bh(this));
        ((Button) inflate.findViewById(C7582R.id.trigger_notification)).setOnClickListener(new bi());
        ((Button) inflate.findViewById(C7582R.id.trigger_reschedule)).setOnClickListener(new bj(this));
        ((Button) inflate.findViewById(C7582R.id.check_queue)).setOnClickListener(new bk(this));
        this.f6477a.mo3766a(false);
        return new a(getActivity()).a("Debug Notification Assist").a(inflate).b("Clear queue and close", be.f6480a).a();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (m6306a()) {
            this.f6477a.mo3769c();
            this.f6477a.mo3766a(true);
        }
    }
}
