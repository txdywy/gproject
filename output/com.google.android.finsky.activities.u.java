package com.google.android.finsky.activities;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.finsky.m;
import com.google.android.finsky.scheduler.b.b;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.z.e;

public final class com.google.android.finsky.activities.u implements View$OnClickListener
{

    public final com.google.android.finsky.activities.t a;
    public final View b;

    u(com.google.android.finsky.activities.t p0, View p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void onClick(View p0) {
        v2 = com.google.android.finsky.m.a.bZ().a(17);
        v2.a(1).a(new com.google.android.finsky.activities.az(v2, new com.google.android.finsky.scheduler.b.b().a(Long.parseLong(((EditText)this.b.findViewById(2131756664)).getText().toString())).b(Long.parseLong(((EditText)this.b.findViewById(2131756665)).getText().toString())).a(((CheckBox)this.b.findViewById(2131756666)).isChecked()).b(((CheckBox)this.b.findViewById(2131756667)).isChecked()).a(((Spinner)this.b.findViewById(2131756668)).getSelectedItemPosition()).a(), this.a.getApplicationContext()));
    }

}
