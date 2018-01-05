package com.google.android.finsky.contentfilterui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bj.b;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.j;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters$ContentFilterSettingsResponse;
import com.google.wireless.android.finsky.dfe.nano.bf;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.contentfilterui.q extends com.google.android.finsky.pagesystem.b implements TextWatcher, View$OnClickListener, TextView$OnEditorActionListener, com.google.android.play.utils.m
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public ContentFilters$ContentFilterSettingsResponse ag;
    public EditText ah;
    public View ai;
    public View aj;
    public View ak;
    public View al;
    public Spinner am;
    public com.google.android.finsky.accounts.c c;
    public com.google.android.finsky.bj.b f;
    public boolean h;
    public com.google.android.finsky.d.a y_;

    q() {
        com.google.android.finsky.pagesystem.b();
        this.a = com.google.android.finsky.d.j.a(5237);
    }

    private static void a(View p0, int p1, String p2) {
        ((TextView)p0.findViewById(p1)).setText(p2);
    }

    private final void aj() {
        if (!TextUtils.isEmpty(this.ah.getText().toString()))
            v0 = 1;
        else
            v0 = 0;
        this.ai.setEnabled(v0);
    }

    private final void ao() {
        this.h = 1;
        this.ai();
        if (this.ag.i.length == 0)
            v0 = this.ag.h;
        else if (this.ag.i.length == 1)
            v0 = this.ag.i[0].d;
        else
            v0 = this.ag.i[this.am.getSelectedItemPosition()].d;
        com.google.android.finsky.utils.bb.a(new com.google.android.finsky.contentfilterui.r(this, this.c.cY(), this.ah.getText().toString(), v0), new Void[0]);
    }

    protected final int Z() {
        return 2130968706;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v2 = super.a(p0, p1, p2);
        this.ah = (EditText)v2.findViewById(2131755081);
        this.ah.addTextChangedListener(this);
        this.ah.setOnEditorActionListener(this);
        this.ak = v2.findViewById(2131755491);
        this.al = v2.findViewById(2131755492);
        this.aj = v2.findViewById(2131755404);
        this.ai = v2.findViewById(2131755405);
        this.aj.setOnClickListener(this);
        this.ai.setOnClickListener(this);
        this.h().setTitle(2131952741);
        com.google.android.finsky.bg.ae.a((TextView)v2.findViewById(2131755312), this.ag.m, this);
        if (this.ag.i.length == 0)
            com.google.android.finsky.contentfilterui.q.a(v2, 2131755373, this.ag.g);
        else if (this.ag.i.length == 1)
            com.google.android.finsky.contentfilterui.q.a(v2, 2131755373, this.ag.i[0].c);
        else {
            v3 = new ArrayList();
            v0 = 0;
            while (v0 < this.ag.i.length) {
                v3.add(this.ag.i[v0].c);
                v0 = v0 + 1;
            }
            v4 = new ArrayAdapter(this.g(), 17367048, v3);
            v4.setDropDownViewResource(17367049);
            this.am = (Spinner)v2.findViewById(2131755493);
            this.am.setAdapter(v4);
            v2.findViewById(2131755373).setVisibility(8);
            this.am.setVisibility(0);
        }
        com.google.android.finsky.contentfilterui.q.a(v2, 2131755405, this.c(2131951948));
        return v2;
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.contentfilterui.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.contentfilterui.d)).a(this);
        super.a(p0);
    }

    public final void a(View p0, String p1) {
        this.f.a(this.h(), "Play_parentalcontrols_under13_Android", 0);
    }

    protected final void aa() {
    }

    public final void afterTextChanged(Editable p0) {
    }

    final void ai() {
        if (this.h != 0) {
            this.al.setVisibility(8);
            this.ak.setVisibility(0);
            this.h().getWindow().setSoftInputMode(2);
        }
        else {
            this.al.setVisibility(0);
            this.ak.setVisibility(8);
            this.ah.requestFocus();
            this.h().getWindow().setSoftInputMode(4);
        }
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.L = 1;
        try {
            this.ag = ContentFilters$ContentFilterSettingsResponse.parseFrom(this.h().getIntent().getByteArrayExtra("content_filter_response"));
        }
        catch (InvalidProtocolBufferNanoException ex) {
            FinskyLog.c("Unable to parse the response proto", new Object[0]);
            this.h().finish();
        }
    }

    public final void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

    protected final void cg_() {
        this.aj();
        this.ai();
    }

    public final void d() {
        super.d();
        this.ah = 0;
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.cg_();
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void onClick(View p0) {
        if (p0 == this.ai)
            this.ao();
        else if (p0 == this.aj)
            this.h().finish();
    }

    public final boolean onEditorAction(TextView p0, int p1, KeyEvent p2) {
        if (p2 != 0 && (p2.getKeyCode() == 66 || p1 == 6))
            this.ao();
        return 0;
    }

    public final void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        this.aj();
    }

}
