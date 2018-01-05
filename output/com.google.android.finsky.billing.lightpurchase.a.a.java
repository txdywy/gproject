package com.google.android.finsky.billing.lightpurchase.a;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.s;
import com.google.android.finsky.billing.common.g;
import com.google.android.finsky.billing.f;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.h;
import com.google.android.finsky.utils.n;
import com.google.wireless.android.finsky.a.a.aa;
import com.google.wireless.android.finsky.a.a.ab;
import com.google.wireless.android.finsky.a.a.ac;
import com.google.wireless.android.finsky.a.a.am;
import com.google.wireless.android.finsky.a.a.j;
import com.google.wireless.android.finsky.a.a.x;
import com.google.wireless.android.finsky.a.a.y;
import com.google.wireless.android.finsky.a.a.z;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class com.google.android.finsky.billing.lightpurchase.a.a extends com.google.android.finsky.billing.common.g implements DatePickerDialog$OnDateSetListener, View$OnClickListener
{

    public EditText af;
    public EditText ag;
    public Date ah;
    public RadioGroup ai;
    public EditText aj;
    public RadioGroup ak;
    public RadioButton al;
    public Spinner am;
    public CheckBox an;
    public TextView ao;
    public final CompoundButton$OnCheckedChangeListener ap;
    public final RadioGroup$OnCheckedChangeListener aq;
    public final CompoundButton$OnCheckedChangeListener ar;
    public final com.google.android.finsky.utils.n e;
    public int f;
    public com.google.wireless.android.finsky.a.a.j g;
    public ViewGroup h;
    public PlayActionButtonV2 i;

    a() {
        com.google.android.finsky.billing.common.g();
        this.e = com.google.android.finsky.m.a.bb();
        this.ap = new com.google.android.finsky.billing.lightpurchase.a.b(this);
        this.aq = new com.google.android.finsky.billing.lightpurchase.a.c(this);
        this.ar = new com.google.android.finsky.billing.lightpurchase.a.d(this);
    }

    protected final int W() {
        return 1401;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.h = (ViewGroup)p0.inflate(2130968630, p1, 0);
        if (!TextUtils.isEmpty(this.g.b))
            ((TextView)this.h.findViewById(2131755114)).setText(this.g.b);
        else
            FinskyLog.e("Title is not returned.", new Object[0]);
        ((TextView)this.h.findViewById(2131755339)).setText(com.google.android.finsky.m.a.U().d(this.b));
        v0 = (TextView)this.h.findViewById(2131755312);
        if (!TextUtils.isEmpty(this.g.c))
            com.google.android.finsky.bg.ae.a(v0, this.g.c);
        else
            v0.setVisibility(8);
        this.af = (EditText)this.h.findViewById(2131755341);
        if (this.g.d != 0) {
            if (!TextUtils.isEmpty(this.g.d.c))
                this.af.setText(this.g.d.c);
            if (!TextUtils.isEmpty(this.g.d.d))
                this.af.setHint(this.g.d.d);
        }
        else
            this.af.setVisibility(8);
        this.ag = (EditText)this.h.findViewById(2131755342);
        if (this.g.e != 0) {
            if (p2 != 0)
                this.ah = (Date)p2.getSerializable("AgeChallengeFragment.birthday_date");
            else if (!TextUtils.isEmpty(this.g.e.c))
                this.ah = com.google.android.finsky.utils.n.a(this.g.e.c, "yyyyMMdd");
            if (this.ah != 0)
                this.ag.setText(this.e.b(this.ah));
            if (!TextUtils.isEmpty(this.g.e.d))
                this.ag.setHint(this.g.e.d);
            this.ag.setKeyListener(0);
            this.ag.setOnClickListener(this);
        }
        else
            this.ag.setVisibility(8);
        this.ai = (RadioGroup)this.h.findViewById(2131755343);
        if (this.g.g != 0) {
            v1 = 0;
            v3 = 1;
            while (v1 < this.g.g.b.length) {
                v0 = (RadioButton)LayoutInflater.from(this.h()).inflate(2130968633, this.h, 0);
                v0.setText(this.g.g.b[v1].c);
                v0.setId(v3);
                v0.setChecked(this.g.g.b[v1].e);
                this.ai.addView(v0, v1);
                v1 = v1 + 1;
                v3 = v3 + 1;
            }
            if (this.ai.getCheckedRadioButtonId() == -1)
                this.ai.check(1);
        }
        else {
            this.ai.setVisibility(8);
            v3 = 1;
        }
        this.aj = (EditText)this.h.findViewById(2131755344);
        if (this.g.f != 0) {
            if (!TextUtils.isEmpty(this.g.f.c))
                this.aj.setText(this.g.f.c);
            if (!TextUtils.isEmpty(this.g.f.d))
                this.aj.setHint(this.g.f.d);
        }
        else
            this.aj.setVisibility(8);
        this.ak = (RadioGroup)this.h.findViewById(2131755345);
        if (this.g.h != 0) {
            v1 = 0;
            v4 = v3;
            while (v1 < this.g.h.b.length) {
                v0 = (RadioButton)LayoutInflater.from(this.h()).inflate(2130968633, this.h, 0);
                v0.setText(this.g.h.b[v1].c);
                v0.setId(v4);
                v0.setChecked(this.g.h.b[v1].e);
                this.ak.addView(v0, v1);
                v1 = v1 + 1;
                v4 = v4 + 1;
            }
            if (this.ak.getCheckedRadioButtonId() == -1)
                this.ak.check(v3);
            if (this.g.i != 0 && !TextUtils.isEmpty(this.g.i.b) && this.g.i.c != 0 && this.g.i.c.length > 0 && this.g.i.c[0] != 0 && !TextUtils.isEmpty(this.g.i.c[0].c)) {
                v1 = this.h.findViewById(2131755346);
                v1.setVisibility(0);
                this.ak.setOnCheckedChangeListener(this.aq);
                this.al = (RadioButton)v1.findViewById(2131755347);
                this.al.setText(this.g.i.b);
                this.al.setOnCheckedChangeListener(this.ar);
                this.am = (Spinner)v1.findViewById(2131755348);
                this.am.setEnabled(0);
                v1 = new ArrayAdapter(this.g(), 17367048);
                v1.setDropDownViewResource(17367049);
                v0 = 0;
                while (v0 < this.g.i.c.length) {
                    v1.add(this.g.i.c[v0].c);
                    v0 = v0 + 1;
                }
                this.am.setAdapter(v1);
            }
        }
        else
            this.ak.setVisibility(8);
        if (!TextUtils.isEmpty(this.g.j)) {
            v0 = (TextView)this.h.findViewById(2131755349);
            v0.setVisibility(0);
            com.google.android.finsky.bg.ae.a(v0, this.g.j);
        }
        this.an = (CheckBox)this.h.findViewById(2131755350);
        this.ao = (TextView)this.h.findViewById(2131755351);
        if (this.g.k != 0) {
            this.an.setText(this.g.k.c);
            this.an.setChecked(this.g.k.d);
            this.an.setOnCheckedChangeListener(this.ap);
        }
        else {
            this.an.setVisibility(8);
            this.ao.setVisibility(8);
        }
        v0 = (TextView)this.h.findViewById(2131755352);
        if (!TextUtils.isEmpty(this.g.l))
            v0.setText(Html.fromHtml(this.g.l));
        else
            v0.setVisibility(8);
        this.i = (PlayActionButtonV2)this.h.findViewById(2131755791);
        if (this.g.m != 0 && !TextUtils.isEmpty(this.g.m.b))
            this.i.a(this.f, this.g.m.b, this);
        else
            FinskyLog.e("Submit button is not returned", new Object[0]);
        return this.h;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.f = this.q.getInt("AgeChallengeFragment.backend");
        this.g = (com.google.wireless.android.finsky.a.a.j)ParcelableProto.a(this.q, "AgeChallengeFragment.challenge");
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putSerializable("AgeChallengeFragment.birthday_date", this.ah);
    }

    public final void onClick(View p0) {
        if (p0 == this.ag) {
            if (this.B.a("AgeChallengeFragment.date_picker") == 0) {
                v0 = Calendar.getInstance();
                if (this.ah != 0)
                    v0.setTime(this.ah);
                if (v0 == 0)
                    throw new IllegalStateException("Calendar is not set");
                v1 = new com.google.android.finsky.billing.lightpurchase.a.l();
                v2 = new Bundle();
                v2.putSerializable("DatePickerDialogFragment.calendar", v0);
                v1.f(v2);
                v1.a(this, 0);
                v1.a(this.B, "AgeChallengeFragment.date_picker");
            }
            return;
        }
        if (p0 != this.i)
            return;
        v0 = new ArrayList();
        if (this.af.getVisibility() == 0 && com.google.android.finsky.utils.h.a(this.af.getText()))
            v0.add(com.google.android.finsky.billing.f.a(1, this.c(2131952389)));
        if (this.ag.getVisibility() == 0 && this.ah == 0)
            v0.add(com.google.android.finsky.billing.f.a(2, this.c(2131952386)));
        if (this.aj.getVisibility() == 0 && com.google.android.finsky.utils.h.a(this.aj.getText()))
            v0.add(com.google.android.finsky.billing.f.a(4, this.c(2131952391)));
        if (this.an.getVisibility() == 0 && !this.an.isChecked() && this.g.k.e != 0)
            v0.add(com.google.android.finsky.billing.f.a(6, this.c(2131952386)));
        this.af.setError(0);
        this.ag.setError(0);
        this.aj.setError(0);
        this.ao.setError(0);
        if (!v0.isEmpty())
            new com.google.android.finsky.billing.lightpurchase.a.e(this, v0).run();
        if (!v0.isEmpty())
            return;
        this.a(1402);
        com.google.android.finsky.bg.s.a(this.h(), this.h);
        v1 = new HashMap();
        if (this.af.getVisibility() == 0)
            v1.put(this.g.d.f, this.af.getText().toString());
        if (this.ag.getVisibility() == 0)
            v1.put(this.g.e.f, com.google.android.finsky.utils.n.a(this.ah, "yyyyMMdd"));
        if (this.ai.getVisibility() == 0)
            v1.put(this.g.g.c, this.g.g.b[this.ai.indexOfChild(this.ai.findViewById(this.ai.getCheckedRadioButtonId()))].d);
        if (this.aj.getVisibility() == 0)
            v1.put(this.g.f.f, this.aj.getText().toString());
        if (this.ak.getVisibility() == 0) {
            v0 = this.ak.getCheckedRadioButtonId();
            if (v0 != -1)
                v0 = this.g.h.b[this.ak.indexOfChild(this.ak.findViewById(v0))].d;
            else
                v0 = this.g.i.c[this.am.getSelectedItemPosition()].d;
            v1.put(this.g.h.c, v0);
        }
        if (this.an.getVisibility() == 0 && this.an.isChecked())
            v1.put(this.g.k.g, this.g.k.f);
        if (this.r instanceof com.google.android.finsky.billing.lightpurchase.a.f)
            v0 = (com.google.android.finsky.billing.lightpurchase.a.f)this.r;
        else if (this.F instanceof com.google.android.finsky.billing.lightpurchase.a.f)
            v0 = (com.google.android.finsky.billing.lightpurchase.a.f)this.F;
        else {
            if (!(this.h() instanceof com.google.android.finsky.billing.lightpurchase.a.f))
                throw new IllegalStateException("No listener registered.");
            v0 = (com.google.android.finsky.billing.lightpurchase.a.f)this.h();
        }
        v0.a(this.g.m.c, v1);
    }

    public final void onDateSet(DatePicker p0, int p1, int p2, int p3) {
        this.ah = new GregorianCalendar(p1, p2, p3).getTime();
        this.ag.setText(this.e.b(this.ah));
        this.ag.setError(0);
    }

    public final void u() {
        super.u();
        com.google.android.finsky.bg.a.a(this.h.getContext(), this.g.b, this.h, 0);
    }

}
