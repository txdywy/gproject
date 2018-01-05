package com.google.android.finsky.settings;

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.RadioButton;
import com.google.android.finsky.billing.common.C1789d;

final class C4101j implements OnClickListener {
    public final /* synthetic */ RadioButton f20514a;
    public final /* synthetic */ RadioButton f20515b;
    public final /* synthetic */ Context f20516c;
    public final /* synthetic */ C4092a f20517d;

    C4101j(C4092a c4092a, RadioButton radioButton, RadioButton radioButton2, Context context) {
        this.f20517d = c4092a;
        this.f20514a = radioButton;
        this.f20515b = radioButton2;
        this.f20516c = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f20517d.m19039a(6333);
        int i2 = 1;
        if (this.f20514a.isChecked()) {
            i2 = 3;
        } else if (this.f20515b.isChecked()) {
            i2 = 4;
        }
        C1789d.f9315b.m5763a(Integer.valueOf(i2));
        new BackupManager(this.f20516c).dataChanged();
        if (this.f20517d.f20501d != null) {
            this.f20517d.f20501d.mo3908a();
        }
    }
}
