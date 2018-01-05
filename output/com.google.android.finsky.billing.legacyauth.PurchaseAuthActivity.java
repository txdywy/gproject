package com.google.android.finsky.billing.legacyauth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class PurchaseAuthActivity extends android.support.v7.app.aa implements View$OnClickListener
{

    public int q;
    public Button r;

    PurchaseAuthActivity() {
        android.support.v7.app.aa();
    }

    private final void a(int p0, int p1) {
        v0 = (RadioButton)this.findViewById(p0);
        if (p1 == this.q)
            v1 = 1;
        else
            v1 = 0;
        v0.setChecked(v1);
        v0.setOnClickListener(new com.google.android.finsky.billing.legacyauth.k(this, p1));
    }

    public void onClick(View p0) {
        if (p0 == this.r)
            this.finish();
    }

    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(2130969315);
        this.q = this.getIntent().getIntExtra("purchase-auth-current", -1);
        this.a(2131755223, 2);
        this.a(2131756569, 1);
        this.a(2131755226, 0);
        this.r = (Button)this.findViewById(2131756570);
        this.r.setOnClickListener(this);
    }

}
