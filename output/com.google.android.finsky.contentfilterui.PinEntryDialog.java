package com.google.android.finsky.contentfilterui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.providers.d;

public final class PinEntryDialog extends android.support.v7.app.aa implements TextView$OnEditorActionListener, com.google.android.finsky.frameworkviews.b
{

    public TextWatcher A;
    public com.google.android.finsky.d.a q;
    public com.google.android.finsky.d.g r;
    public TextView s;
    public EditText t;
    public ButtonBar u;
    public String v;
    public boolean w;
    public boolean x;
    public com.google.android.finsky.d.o y;
    public com.google.android.finsky.d.w z;

    PinEntryDialog() {
        android.support.v7.app.aa();
        this.y = new com.google.android.finsky.d.o(311);
        this.A = new com.google.android.finsky.contentfilterui.s(this);
    }

    private final String l() {
        return this.t.getText().toString().trim();
    }

    final void k() {
        if (this.l().length() >= 4)
            v0 = 1;
        else
            v0 = 0;
        this.u.setPositiveButtonEnabled(v0);
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        ((com.google.android.finsky.contentfilterui.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.contentfilterui.d)).a(this);
        this.setContentView(2130969198);
        v0 = this.getIntent();
        this.z = this.q.a(p0, v0);
        this.w = v0.getBooleanExtra("PinEntryDialog.isInEnterAndConfirmMode", 0);
        this.v = v0.getStringExtra("PinEntryDialog.pinToMatch");
        this.s = (TextView)this.findViewById(2131756426);
        this.t = (EditText)this.findViewById(2131756427);
        this.u = (ButtonBar)this.findViewById(2131755403);
        this.setTitle(v0.getIntExtra("PinEntryDialog.titleStringId", -1));
        this.s.setText(v0.getIntExtra("PinEntryDialog.promptStringId", -1));
        this.u.setPositiveButtonTitle(2131951939);
        this.u.setNegativeButtonTitle(2131951931);
        this.u.setClickListener(this);
        this.t.addTextChangedListener(this.A);
        this.t.setOnEditorActionListener(this);
        if (p0 == 0)
            this.z.a(new com.google.android.finsky.d.p().b(this.y));
        this.t.requestFocus();
    }

    public boolean onEditorAction(TextView p0, int p1, KeyEvent p2) {
        if (p2 != 0 && (p2.getKeyCode() == 66 || p1 == 6))
            this.u_();
        return 0;
    }

    protected void onRestoreInstanceState(Bundle p0) {
        super.onRestoreInstanceState(p0);
        if (this.w != 0 && p0 != 0) {
            this.x = p0.getBoolean("PinEntryDialog.keyIsInSetupConfirmStage", 0);
            if (this.x != 0) {
                this.v = p0.getString("PinEntryDialog.keyCurrentPin");
                v0 = this.getIntent();
                this.setTitle(v0.getIntExtra("PinEntryDialog.confirmTitleStringId", -1));
                this.s.setText(v0.getIntExtra("PinEntryDialog.confirmPromptStringId", -1));
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.k();
    }

    protected void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        p0.putBoolean("PinEntryDialog.keyIsInSetupConfirmStage", this.x);
        if (this.x != 0)
            p0.putString("PinEntryDialog.keyCurrentPin", this.v);
    }

    public final void u_() {
        this.z.b(new com.google.android.finsky.d.d(this.y).a(258));
        v0 = this.l();
        v1 = this.r.dc();
        if (this.v != 0 && !this.v.equals(v0)) {
            v1.a(501, 0);
            this.t.setText("");
            com.google.android.finsky.bg.ae.a(this.t, this.getString(2131952853), this.getString(2131952849));
        }
        else {
            v1.a(501, 1);
            if (this.w != 0 && this.x == 0) {
                this.v = v0;
                this.x = 1;
                v0 = this.getIntent();
                this.setTitle(v0.getIntExtra("PinEntryDialog.confirmTitleStringId", -1));
                this.s.setText(v0.getIntExtra("PinEntryDialog.confirmPromptStringId", -1));
                com.google.android.finsky.bg.a.a(this.getBaseContext(), this.s.getText(), this.s, 1);
                this.t.setText("");
                this.t.requestFocus();
            }
            else {
                v1 = new Intent();
                v1.putExtra("PinEntryDialog.resultPin", v0);
                v1.putExtra("PinEntryDialog.extraParams", this.getIntent().getBundleExtra("PinEntryDialog.extraParams"));
                this.setResult(-1, v1);
                this.finish();
            }
        }
    }

    public final void v_() {
        this.z.b(new com.google.android.finsky.d.d(this.y).a(259));
        this.setResult(0);
        this.finish();
    }

}
