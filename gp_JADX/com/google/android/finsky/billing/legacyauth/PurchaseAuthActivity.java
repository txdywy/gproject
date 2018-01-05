package com.google.android.finsky.billing.legacyauth;

import android.os.Bundle;
import android.support.v7.app.aa;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import com.squareup.leakcanary.C7582R;

public class PurchaseAuthActivity extends aa implements OnClickListener {
    public int f9584q;
    public Button f9585r;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.purchase_auth_dialog);
        this.f9584q = getIntent().getIntExtra("purchase-auth-current", -1);
        m10009a(C7582R.id.always, 2);
        m10009a(C7582R.id.session, 1);
        m10009a(C7582R.id.never, 0);
        this.f9585r = (Button) findViewById(C7582R.id.cancel);
        this.f9585r.setOnClickListener(this);
    }

    private final void m10009a(int i, int i2) {
        RadioButton radioButton = (RadioButton) findViewById(i);
        radioButton.setChecked(i2 == this.f9584q);
        radioButton.setOnClickListener(new C1883k(this, i2));
    }

    public void onClick(View view) {
        if (view == this.f9585r) {
            finish();
        }
    }
}
