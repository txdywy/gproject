package com.google.android.finsky.contentfilterui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.squareup.leakcanary.C7582R;

public class PinEntryDialog extends aa implements OnEditorActionListener, C1056b {
    public TextWatcher f11496A = new C2355s(this);
    public C2471a f11497q;
    public C1463g f11498r;
    public TextView f11499s;
    public EditText f11500t;
    public ButtonBar f11501u;
    public String f11502v;
    public boolean f11503w;
    public boolean f11504x;
    public C2473o f11505y = new C2473o(311);
    public C2495w f11506z;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1367d) C3947d.m18649a(C1367d.class)).mo1787a(this);
        setContentView((int) C7582R.layout.pin_entry_dialog);
        Intent intent = getIntent();
        this.f11506z = this.f11497q.m13180a(bundle, intent);
        this.f11503w = intent.getBooleanExtra("PinEntryDialog.isInEnterAndConfirmMode", false);
        int intExtra = intent.getIntExtra("PinEntryDialog.titleStringId", -1);
        int intExtra2 = intent.getIntExtra("PinEntryDialog.promptStringId", -1);
        this.f11502v = intent.getStringExtra("PinEntryDialog.pinToMatch");
        this.f11499s = (TextView) findViewById(C7582R.id.prompt);
        this.f11500t = (EditText) findViewById(C7582R.id.passcode);
        this.f11501u = (ButtonBar) findViewById(C7582R.id.button_bar);
        setTitle(intExtra);
        this.f11499s.setText(intExtra2);
        this.f11501u.setPositiveButtonTitle((int) C7582R.string.content_filter_ok);
        this.f11501u.setNegativeButtonTitle((int) C7582R.string.content_filter_cancel);
        this.f11501u.setClickListener(this);
        this.f11500t.addTextChangedListener(this.f11496A);
        this.f11500t.setOnEditorActionListener(this);
        if (bundle == null) {
            this.f11506z.m13370a(new C2488p().m13345b(this.f11505y));
        }
        this.f11500t.requestFocus();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("PinEntryDialog.keyIsInSetupConfirmStage", this.f11504x);
        if (this.f11504x) {
            bundle.putString("PinEntryDialog.keyCurrentPin", this.f11502v);
        }
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.f11503w && bundle != null) {
            this.f11504x = bundle.getBoolean("PinEntryDialog.keyIsInSetupConfirmStage", false);
            if (this.f11504x) {
                this.f11502v = bundle.getString("PinEntryDialog.keyCurrentPin");
                Intent intent = getIntent();
                setTitle(intent.getIntExtra("PinEntryDialog.confirmTitleStringId", -1));
                this.f11499s.setText(intent.getIntExtra("PinEntryDialog.confirmPromptStringId", -1));
            }
        }
    }

    public final void u_() {
        this.f11506z.m13379b(new C2475d(this.f11505y).m13256a(258));
        String l = m11914l();
        C2482j dc = this.f11498r.dc();
        if (this.f11502v == null || this.f11502v.equals(l)) {
            dc.m13318a(501, true);
            if (!this.f11503w || this.f11504x) {
                Intent intent = new Intent();
                intent.putExtra("PinEntryDialog.resultPin", l);
                intent.putExtra("PinEntryDialog.extraParams", getIntent().getBundleExtra("PinEntryDialog.extraParams"));
                setResult(-1, intent);
                finish();
                return;
            }
            this.f11502v = l;
            this.f11504x = true;
            Intent intent2 = getIntent();
            setTitle(intent2.getIntExtra("PinEntryDialog.confirmTitleStringId", -1));
            this.f11499s.setText(intent2.getIntExtra("PinEntryDialog.confirmPromptStringId", -1));
            C1601a.m9199a(getBaseContext(), this.f11499s.getText(), this.f11499s, true);
            this.f11500t.setText("");
            this.f11500t.requestFocus();
            return;
        }
        dc.m13318a(501, false);
        this.f11500t.setText("");
        ae.m9219a(this.f11500t, getString(C7582R.string.pin_label), getString(C7582R.string.pin_entry_hint_wrong_passcode));
    }

    public final void v_() {
        this.f11506z.m13379b(new C2475d(this.f11505y).m13256a(259));
        setResult(0);
        finish();
    }

    public void onResume() {
        super.onResume();
        m11915k();
    }

    private final String m11914l() {
        return this.f11500t.getText().toString().trim();
    }

    final void m11915k() {
        this.f11501u.setPositiveButtonEnabled(m11914l().length() >= 4);
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getKeyCode() == 66) || i == 6) {
            u_();
        }
        return false;
    }
}
