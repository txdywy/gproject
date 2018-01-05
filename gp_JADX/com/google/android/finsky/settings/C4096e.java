package com.google.android.finsky.settings;

import android.app.backup.BackupManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.RadioButton;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.p111d.C2474c;
import com.google.wireless.android.a.a.a.a.an;

final class C4096e implements OnClickListener {
    public final /* synthetic */ RadioButton f20506a;
    public final /* synthetic */ RadioButton f20507b;
    public final /* synthetic */ int f20508c;
    public final /* synthetic */ C4092a f20509d;

    C4096e(C4092a c4092a, RadioButton radioButton, RadioButton radioButton2, int i) {
        this.f20509d = c4092a;
        this.f20506a = radioButton;
        this.f20507b = radioButton2;
        this.f20508c = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f20509d.m19039a(6333);
        int i2 = 2;
        if (this.f20506a.isChecked()) {
            i2 = 3;
        } else if (this.f20507b.isChecked()) {
            i2 = 1;
        }
        an anVar = new an();
        anVar.a(this.f20508c);
        anVar.b(i2);
        C2474c c2474c = new C2474c(2003);
        c2474c.m13219a(anVar);
        this.f20509d.f20502e.m13367a(c2474c);
        C1789d.f9315b.m5763a(Integer.valueOf(i2));
        if (!((Boolean) C1789d.f9316c.m5760a()).booleanValue()) {
            C1789d.f9316c.m5763a(Boolean.TRUE);
        }
        new BackupManager(this.f20509d.getActivity()).dataChanged();
        if (this.f20509d.f20501d != null) {
            this.f20509d.f20501d.mo3908a();
        }
    }
}
