package com.google.android.finsky.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.api.c;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.by.c;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.layoutswitcher.e;
import com.google.android.finsky.m;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.pagesystem.j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.ce;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.activities.de extends com.google.android.finsky.pagesystem.j implements com.google.android.finsky.activities.ds, com.google.android.finsky.frameworkviews.b
{

    public Document a;
    public ViewGroup c;
    public com.google.android.finsky.dfemodel.i d;
    public int f;
    public RadioGroup g;
    public com.google.wireless.android.a.a.a.a.ce h;
    public com.google.android.finsky.activities.cu i_;
    public String j_;

    de() {
        com.google.android.finsky.pagesystem.j();
        this.h = com.google.android.finsky.d.j.a(301);
    }

    private final void aj() {
        this.bm.m();
        this.ao().a(this.bn, this.a, this.j_);
    }

    private final com.google.android.finsky.activities.dl ao() {
        v0 = 0;
        if (this.R != 0 && this.g.getCheckedRadioButtonId() != -1) {
            v1 = this.g.indexOfChild(this.R.findViewById(this.g.getCheckedRadioButtonId()));
            v2 = this.b(this.a.a.f);
            if (v1 < v2.size())
                v0 = (com.google.android.finsky.activities.dl)v2.get(v1);
        }
        return v0;
    }

    private final List b(int p0) {
        if (p0 == 3) {
            if (!com.google.android.finsky.m.a.ah().a(this.a.N().k).isEmpty())
                v1 = 1;
            else
                v1 = 0;
            v0 = new ArrayList();
            v0.add(new com.google.android.finsky.activities.di(1, 2131952218, -1));
            v0.add(new com.google.android.finsky.activities.di(3, 2131952205, -1));
            v0.add(new com.google.android.finsky.activities.di(4, 2131952208, -1));
            if (v1 != 0)
                v0.add(new com.google.android.finsky.activities.di(7, 2131952207, 2131952206));
            if (!((Boolean)com.google.android.finsky.aa.b.Z.b()).booleanValue())
                v0.add(new com.google.android.finsky.activities.di(5, 2131952209, -1));
            v0.add(new com.google.android.finsky.activities.di(11, 2131952217, -1));
            v0.add(new com.google.android.finsky.activities.di(12, 2131952204, -1));
            v0.add(new com.google.android.finsky.activities.di(8, 2131952213, 2131952212));
        }
        else {
            if (p0 != 2)
                throw new IllegalStateException("unsupported backend type");
            v0 = new ArrayList();
            v0.add(new com.google.android.finsky.activities.dm(5, 2131952210));
            v0.add(new com.google.android.finsky.activities.dm(1, 2131952218));
            v0.add(new com.google.android.finsky.activities.dm(4, 2131952208));
            v0.add(new com.google.android.finsky.activities.dm(6, 2131952219));
            v0.add(new com.google.android.finsky.activities.dm(2, 2131952211));
            v0.add(new com.google.android.finsky.activities.dm(8, 2131952213));
        }
        return v0;
    }

    protected final int Z() {
        return 2130968875;
    }

    public final void a(Document p0) {
        this.a = p0;
        com.google.android.finsky.d.j.a(this.h, this.a.a.D);
        if (this.i_ == 0) {
            this.i_ = com.google.android.finsky.activities.bl.a(this.k_, this.a.a.f, this.bo.b());
            this.i_.d(0);
            this.i_.r();
            this.i_.a(this.bn, this.bp, this.bD, this, 0, 0, 0, 0, this, this.bw.a(this.bo.b()));
        }
        this.g.removeAllViews();
        v3 = this.b(this.a.a.f).iterator();
        while (v3.hasNext()) {
            v0 = (com.google.android.finsky.activities.dl)v3.next();
            v1 = (RadioButton)LayoutInflater.from(this.bn).inflate(2130969319, this.g, 0);
            v1.setText(v0.b);
            v1.setTag(v0);
            this.g.addView(v1);
            if (this.f == -1)
                continue;
            if (this.f != v0.b)
                continue;
            this.g.check(v1.getId());
        }
        this.m_();
    }

    public final void a(String p0) {
        this.j_ = p0;
        this.aj();
    }

    protected final void aa() {
    }

    public final void ac() {
        this.bm.c(this.bn.getString(2131952220));
        this.bm.a(this.a.a.f, 0);
        this.bm.z();
    }

    public final void cg_() {
        if (this.a != 0) {
            if (this.a.a.f == 3)
                v1 = 2131952214;
            else
                v1 = 2131952215;
            ((TextView)this.bt.findViewById(2131755882)).setText(v1);
            if (this.a.a.f == 2) {
                v0 = (TextView)this.bt.findViewById(2131755884);
                v4 = new Object[1];
                v4[0] = com.google.android.finsky.aa.b.w.b();
                v0.setText(Html.fromHtml(this.a(2131952216, v4)));
                v0.setMovementMethod(LinkMovementMethod.getInstance());
                v0.setVisibility(0);
            }
            v7 = new View[1];
            v7[0] = this.c;
            this.i_.a(this.a, 0, 0, 0, 1, 0, v7);
            this.bt.findViewById(2131755881).setBackgroundColor(com.google.android.finsky.bg.h.a(this.bn, this.a.a.f));
            this.ac();
        }
    }

    public final void d() {
        if (this.i_ != 0)
            this.i_.a();
        super.d();
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.c = (ViewGroup)this.bt.findViewById(2131755468);
        this.g = (RadioGroup)this.bt.findViewById(2131755883);
        v0 = (ButtonBar)this.bt.findViewById(2131755403);
        v0.setPositiveButtonTitle(2131953205);
        v0.setPositiveButtonEnabled(0);
        v0.setClickListener(this);
        this.g.setOnCheckedChangeListener(new com.google.android.finsky.activities.df(v0));
        if (p0 != 0) {
            this.j_ = p0.getString("flag_free_text_message");
            if (p0.containsKey("flag_selected_button_id"))
                v0 = p0.getInt("flag_selected_button_id");
            else
                v0 = -1;
            this.f = v0;
        }
        if (p0 != 0 && p0.containsKey("doc"))
            this.a((Document)p0.getParcelable("doc"));
        else {
            this.bs.a(0, 0);
            this.d = new com.google.android.finsky.dfemodel.i(this.bo, this.bF);
            this.d.a(new com.google.android.finsky.activities.dg(this));
            this.d.a(new com.google.android.finsky.activities.dh(this));
        }
    }

    public final void e(Bundle p0) {
        super.e(p0);
        if (this.a != 0) {
            p0.putParcelable("doc", this.a);
            p0.putString("flag_free_text_message", this.j_);
            if (this.ao() != 0)
                p0.putInt("flag_selected_button_id", this.ao().b);
        }
    }

    public final void f_(int p0) {
        if (p0 == 10 && this.h() != 0) {
            if (this.h() instanceof com.google.android.finsky.pagesystem.e)
                ((com.google.android.finsky.pagesystem.e)this.h()).m();
            else
                FinskyLog.e("Dialog not hosted by PageFragmentHost. Cannot navigate back.", new Object[0]);
        }
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.h;
    }

    public final void u_() {
        v0 = this.ao();
        if (v0 != 0) {
            if (v0.c != -1) {
                if (this.B.a("flag_item_dialog") == 0) {
                    v2 = new com.google.android.finsky.activities.dp();
                    v3 = new Bundle();
                    v3.putInt("prompt_string_res_id", v0.c);
                    v2.f(v3);
                    v2.a(this, 0);
                    v2.a(this.B, "flag_item_dialog");
                }
            }
            else
                this.aj();
        }
    }

    public final void v_() {
        this.bm.m();
    }

}
