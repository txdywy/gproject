package com.google.android.finsky.contentfilterui;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bj.C2104b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.play.utils.m;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters.ContentFilterSettingsResponse;
import com.google.wireless.android.finsky.dfe.nano.bf;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C2353q extends C1045b implements TextWatcher, OnClickListener, OnEditorActionListener, m {
    public final ce f11553a = C2482j.m13283a(5237);
    public ContentFilterSettingsResponse ag;
    public EditText ah;
    public View ai;
    public View aj;
    public View ak;
    public View al;
    public Spinner am;
    public C0988c f11554c;
    public C2104b f11555f;
    public boolean f11556h;
    public C2471a y_;

    public final void mo1292a(Activity activity) {
        ((C1367d) C3947d.m18649a(C1367d.class)).mo1790a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        try {
            this.ag = ContentFilterSettingsResponse.parseFrom(m603h().getIntent().getByteArrayExtra("content_filter_response"));
        } catch (InvalidProtocolBufferNanoException e) {
            FinskyLog.m21665c("Unable to parse the response proto", new Object[0]);
            m603h().finish();
        }
    }

    protected final int mo1298Z() {
        return C7582R.layout.content_filter_password_confirm_dialog;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.ah = (EditText) a.findViewById(C7582R.id.password);
        this.ah.addTextChangedListener(this);
        this.ah.setOnEditorActionListener(this);
        this.ak = a.findViewById(C7582R.id.password_loading_indicator);
        this.al = a.findViewById(C7582R.id.body);
        this.aj = a.findViewById(C7582R.id.negative_button);
        this.ai = a.findViewById(C7582R.id.positive_button);
        this.aj.setOnClickListener(this);
        this.ai.setOnClickListener(this);
        m603h().setTitle(C7582R.string.password_dialog_title);
        ae.m9218a((TextView) a.findViewById(C7582R.id.description), this.ag.m, (m) this);
        if (this.ag.i.length == 0) {
            C2353q.m11971a(a, (int) C7582R.id.email_address, this.ag.g);
        } else if (this.ag.i.length == 1) {
            C2353q.m11971a(a, (int) C7582R.id.email_address, this.ag.i[0].c);
        } else {
            List arrayList = new ArrayList();
            for (bf bfVar : this.ag.i) {
                arrayList.add(bfVar.c);
            }
            SpinnerAdapter arrayAdapter = new ArrayAdapter(m601g(), 17367048, arrayList);
            arrayAdapter.setDropDownViewResource(17367049);
            this.am = (Spinner) a.findViewById(C7582R.id.content_filter_owner_email_list);
            this.am.setAdapter(arrayAdapter);
            a.findViewById(C7582R.id.email_address).setVisibility(8);
            this.am.setVisibility(0);
        }
        C2353q.m11971a(a, (int) C7582R.id.positive_button, m592c((int) C7582R.string.continue_text));
        return a;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        cg_();
    }

    protected final void aa() {
    }

    protected final void cg_() {
        aj();
        ai();
    }

    public final void mo138d() {
        super.mo138d();
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.ak = null;
        this.al = null;
    }

    private static void m11971a(View view, int i, String str) {
        ((TextView) view.findViewById(i)).setText(str);
    }

    private final void aj() {
        this.ai.setEnabled(!TextUtils.isEmpty(this.ah.getText().toString()));
    }

    public final void onClick(View view) {
        if (view == this.ai) {
            ao();
        } else if (view == this.aj) {
            m603h().finish();
        }
    }

    private final void ao() {
        String str;
        this.f11556h = true;
        ai();
        String obj = this.ah.getText().toString();
        Account cY = this.f11554c.cY();
        if (this.ag.i.length == 0) {
            str = this.ag.h;
        } else if (this.ag.i.length == 1) {
            str = this.ag.i[0].d;
        } else {
            str = this.ag.i[this.am.getSelectedItemPosition()].d;
        }
        bb.m21792a(new C2354r(this, cY, obj, str), new Void[0]);
    }

    final void ai() {
        if (this.f11556h) {
            this.al.setVisibility(8);
            this.ak.setVisibility(0);
            m603h().getWindow().setSoftInputMode(2);
            return;
        }
        this.al.setVisibility(0);
        this.ak.setVisibility(8);
        this.ah.requestFocus();
        m603h().getWindow().setSoftInputMode(4);
    }

    public final ce getPlayStoreUiElement() {
        return this.f11553a;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aj();
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getKeyCode() == 66) || i == 6) {
            ao();
        }
        return false;
    }

    public final void m11975a(View view, String str) {
        this.f11555f.m10992a(m603h(), "Play_parentalcontrols_under13_Android", false);
    }
}
