package com.google.android.finsky.contentfilterui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.widget.SwitchCompat;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ab.a;
import com.google.android.finsky.ab.b;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.volley.e;
import com.google.android.play.utils.b.a;
import com.google.protobuf.nano.i;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters$ContentFilterSettingsResponse;
import com.google.wireless.android.finsky.dfe.nano.bh;
import com.google.wireless.android.finsky.dfe.nano.bi;
import java.util.List;

public final class com.google.android.finsky.contentfilterui.j extends com.google.android.finsky.pagesystem.b implements View$OnClickListener, com.android.volley.x, com.google.android.finsky.contentfilterui.t
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public com.google.android.finsky.br.a ag;
    public com.google.android.finsky.contentfilterui.n ah;
    public View ai;
    public TextView aj;
    public SwitchCompat ak;
    public ViewGroup al;
    public TextView am;
    public TextView an;
    public boolean ao;
    public com.google.android.finsky.accounts.c c;
    public com.google.android.finsky.cn.a f;
    public com.google.android.finsky.volley.e h;
    public com.google.android.finsky.api.h r_;
    public com.google.android.finsky.d.a y_;

    j() {
        com.google.android.finsky.pagesystem.b();
        this.a = com.google.android.finsky.d.j.a(5235);
    }

    private final void a(Intent p0, String p1) {
        this.ah.g = 1;
        if (p0 == 0)
            v0 = 0;
        else
            v0 = p0.getBundleExtra(p1);
        if (v0 != 0) {
            switch (v0.getInt("authSuccess")) {
                case 1:
                    this.e(1);
                    break;
                case 2:
                    this.e(0);
                    break;
                case 3:
                    this.b(v0.getInt("filterRangeIndex"));
                    break;
                default:
                    break;
            }
        }
    }

    private final boolean aj() {
        v2 = 1;
        if (!TextUtils.isEmpty((CharSequence)com.google.android.finsky.aa.a.d.a()))
            v1 = 1;
        else
            v1 = 0;
        if (!TextUtils.isEmpty((CharSequence)com.google.android.finsky.aa.a.i.a()))
            v0 = 1;
        else
            v0 = 0;
        if (v1 == 0 || v0 != 0 || this.ao != 0)
            v2 = 0;
        return v2;
    }

    private final void b(Bundle p0, boolean p1) {
        v0 = (String)com.google.android.finsky.aa.a.i.a();
        v1 = this.y_.a(0);
        if ((TextUtils.isEmpty(v0)) || p1 != 0) {
            v2 = new Intent(this.h(), PinEntryDialog);
            v2.putExtra("PinEntryDialog.isInEnterAndConfirmMode", 1);
            v2.putExtra("PinEntryDialog.titleStringId", 2131952855);
            v2.putExtra("PinEntryDialog.promptStringId", 2131952856);
            v2.putExtra("PinEntryDialog.confirmTitleStringId", 2131952846);
            v2.putExtra("PinEntryDialog.confirmPromptStringId", 2131952847);
            v1.a(v2);
            v2.putExtra("PinEntryDialog.extraParams", p0);
            this.startActivityForResult(v2, 1);
        }
        else {
            v3 = new Intent(this.h(), PinEntryDialog);
            v3.putExtra("PinEntryDialog.isInEnterAndConfirmMode", 0);
            v3.putExtra("PinEntryDialog.titleStringId", 2131952850);
            v3.putExtra("PinEntryDialog.promptStringId", 2131952851);
            v3.putExtra("PinEntryDialog.pinToMatch", v0);
            v1.a(v3);
            v3.putExtra("PinEntryDialog.extraParams", p0);
            this.startActivityForResult(v3, 2);
        }
    }

    private final void e(boolean p0) {
        v5 = new com.google.android.finsky.contentfilterui.k(this, p0);
        v2 = this.h();
        if (p0 != 0) {
            v0 = new com.google.android.finsky.contentfilterui.o(this.ah, v2, this.ah.e, 1, v5, 0);
            this.ah.j.a().a(this.ah.d, com.google.android.finsky.contentfilterui.n.a(this.ah.e), 0, 0, v0, v0);
        }
        else {
            this.ah.d().a(com.google.android.finsky.ab.a.a((b[])this.ah.e.toArray(new b[this.ah.e.size()])));
            v0 = new com.google.android.finsky.contentfilterui.o(this.ah, v2, this.ah.e, 0, v5, 0);
            this.ah.j.a().a(this.ah.d, 0, 0, 1, v0, v0);
        }
    }

    protected final int Z() {
        return 2130968710;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v1 = super.a(p0, p1, p2);
        this.ai = v1.findViewById(2131755508);
        this.aj = (TextView)v1.findViewById(2131755509);
        this.ak = (SwitchCompat)v1.findViewById(2131755510);
        this.am = (TextView)v1.findViewById(2131755512);
        this.an = (TextView)v1.findViewById(2131755513);
        this.al = (ViewGroup)v1.findViewById(2131755514);
        return v1;
    }

    public final void a(int p0, int p1, Intent p2) {
        super.a(p0, p1, p2);
        if (p1 == -1) {
            if (p0 == 2 || p0 == 1) {
                v0 = p2.getStringExtra("PinEntryDialog.resultPin");
                if (TextUtils.isEmpty(v0))
                    FinskyLog.c("Create / confirm PIN result OK but no PIN sent back.", new Object[0]);
                else {
                    com.google.android.finsky.aa.a.i.a(v0);
                    this.a(p2, "PinEntryDialog.extraParams");
                }
            }
            else if (!this.aj())
                this.a(p2, "result_key_extra_params");
            else
                this.b(p2.getExtras(), 1);
        }
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.contentfilterui.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.contentfilterui.d)).a(this);
        super.a(p0);
    }

    final void a(Bundle p0, boolean p1) {
        v0 = 1;
        if (this.ah.b.i.length <= 0 && ((TextUtils.isEmpty(this.ah.b.g)) || this.ah.i.cZ().equals(this.ah.b.g)))
            v0 = 0;
        if (v0 != 0 && (this.ao != 0 || this.ao == 0 && this.aj()))
            this.startActivityForResult(new Intent(this.h(), GaiaPasswordVerificationDialog).putExtra("content_filter_response", com.google.protobuf.nano.i.a(this.ah.b)).putExtra("result_key_extra_params", p0), 3);
        else
            this.b(p0, p1);
    }

    public final void a(Menu p0, MenuInflater p1) {
        p1.inflate(2132082689, p0);
        super.a(p0, p1);
    }

    final void a(boolean p0) {
        this.ak.setChecked(p0);
        if (p0 != 0) {
            this.am.setEnabled(1);
            this.an.setEnabled(1);
            this.aj.setText(this.ah.b.k);
        }
        else {
            this.am.setEnabled(0);
            this.an.setEnabled(0);
            this.aj.setText(this.ah.b.l);
        }
        v1 = 0;
        while (v1 < this.al.getChildCount()) {
            ((ContentFilterLineView)this.al.getChildAt(v1)).setEnabled(p0);
            v1 = v1 + 1;
        }
    }

    public final boolean a(MenuItem p0) {
        if (p0.getItemId() == 2131756982) {
            this.ag.a(this.h(), this.ag.a(Uri.parse((String)com.google.android.finsky.aa.b.v.b())));
            v0 = 1;
        }
        else
            v0 = super.a(p0);
        return v0;
    }

    protected final void aa() {
        this.bs.a(0, 0);
        v0 = new t[1];
        v0[0] = this;
        com.google.android.finsky.utils.bb.a(new com.google.android.finsky.contentfilterui.v(this.h(), this.c.cY()), v0);
    }

    final void b(int p0) {
        v1 = new com.google.android.finsky.contentfilterui.e();
        v1.c = this.ah;
        v1.e = p0;
        this.B.a().b(16908290, v1).a(0).c();
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.s_();
        this.L = 1;
        if (this.c.cY() == 0)
            this.bm.m();
        else if (p0 == 0)
            this.bw.a(new com.google.android.finsky.d.p().b(this));
    }

    public final void b(boolean p0) {
        this.ao = p0;
        this.bo.a(this, this, 0, this.aj());
    }

    public final void b_(Object p0) {
        this.ah = new com.google.android.finsky.contentfilterui.n((ContentFilters$ContentFilterSettingsResponse)p0, 0, this.c, this.r_, this.h);
        this.m_();
    }

    protected final void cg_() {
  3:    v3 = 0;
  6:    this.al.removeAllViews();
  9:    v2 = 0;
 17:    if (v2 >= this.ah.b.b.length) goto 194;
 31:    if (!this.ah.b.b[v2].e()) goto 158;
 35:    if (this.ah.b.b[v2].e == 0) goto 158;
 45:    if ((TextUtils.isEmpty(this.ah.b.b[v2].l)) || this.ah.c())
 55:        v0 = 1;
        else {
165:        v0 = this.f.g(this.ah.b.b[v2].l);
170:        if (v0 == -1 || v0 >= this.ah.b.b[v2].m)
174:            v0 = 1;
            else
176:            v0 = 0;
        }
 56:    if (v0 == 0) goto 158;
 75:    v0 = (ContentFilterLineView)this.h().getLayoutInflater().inflate(2130968711, this.al, 0);
100:    v5 = 0;
101:    if (v5 >= this.ah.b.b[v2].e.length) goto 182;
103:    v1 = this.ah.b.b[v2].e[v5];
109:    if (com.google.android.finsky.ab.a.a(v1) != ((com.google.android.finsky.ab.b)this.ah.e.get(v2)).c) goto 178;
117:    v0.c.setText(this.ah.b.b[v2].f);
120:    if (v1.h != 0)
124:        v0.e.setText(v1.h);
        else
190:        v0.e.setVisibility(8);
127:    if (this.ah.b.b[v2].g != 0) {
131:        com.google.android.finsky.bg.af.a(v0.d, this.ah.b.b[v2].g);
142:        v0.a.a(v0.d, this.ah.b.b[v2].g.f, this.ah.b.b[v2].g.i);
        }
150:    v0.setOnClickListener(new com.google.android.finsky.contentfilterui.l(this, v2));
155:    this.al.addView(v0);
160:    v2 = v2 + 1;
161:    goto 10;
180:    v5 = v5 + 1;
181:    goto 101;
184:    v1 = new com.google.wireless.android.finsky.dfe.nano.bh();
187:    goto 111;
202:    if (this.ah.b.a & 2)
204:        v0 = 1;
        else
253:        v0 = 0;
205:    if (v0 == 0) goto 255;
211:    if (this.ah.b.a & 4)
213:        v3 = 1;
214:    if (v3 == 0) goto 255;
224:    this.am.setText(Html.fromHtml(this.ah.b.e));
235:    this.an.setText(Html.fromHtml(this.ah.b.f));
244:    this.a(this.ah.a());
249:    this.ai.setOnClickListener(this);
252:    return;
257:    this.am.setVisibility(8);
262:    this.an.setVisibility(8);
265:    goto 238;
    }

    public final void d() {
        super.d();
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.an = 0;
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.bm.c(this.c(2131951943));
        if (this.ah != 0)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            this.cg_();
        else
            this.aa();
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void onClick(View p0) {
        v1 = 1;
        if (p0 == this.ai) {
            if (!this.ak.isChecked())
                v0 = 1;
            else
                v0 = 0;
            if (this.ah.b())
                this.e(v0);
            else {
                v2 = new Bundle();
                if (v0 == 0)
                    v1 = 2;
                v2.putInt("authSuccess", v1);
                this.a(v2, v0);
            }
        }
    }

}
