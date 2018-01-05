package com.google.android.finsky.billing.lightpurchase.p159a;

import android.app.DatePickerDialog.OnDateSetListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1618s;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.C1833f;
import com.google.android.finsky.billing.common.C1792g;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.C4677h;
import com.google.android.finsky.utils.C4683n;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.aa;
import com.google.wireless.android.finsky.a.a.j;
import com.google.wireless.android.finsky.a.a.y;
import com.squareup.leakcanary.C7582R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C1887a extends C1792g implements OnDateSetListener, OnClickListener {
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
    public final OnCheckedChangeListener ap = new C1888b(this);
    public final RadioGroup.OnCheckedChangeListener aq = new C1889c(this);
    public final OnCheckedChangeListener ar = new C1890d(this);
    public final C4683n f9682e = C1473m.f7980a.bb();
    public int f9683f;
    public j f9684g;
    public ViewGroup f9685h;
    public PlayActionButtonV2 f9686i;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f9683f = this.f760q.getInt("AgeChallengeFragment.backend");
        this.f9684g = (j) ParcelableProto.m21673a(this.f760q, "AgeChallengeFragment.challenge");
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater from;
        aa[] aaVarArr;
        int i;
        int i2;
        this.f9685h = (ViewGroup) layoutInflater.inflate(C7582R.layout.age_verification_age_challenge, viewGroup, false);
        TextView textView = (TextView) this.f9685h.findViewById(C7582R.id.title);
        if (TextUtils.isEmpty(this.f9684g.b)) {
            FinskyLog.m21669e("Title is not returned.", new Object[0]);
        } else {
            textView.setText(this.f9684g.b);
        }
        ((TextView) this.f9685h.findViewById(C7582R.id.account_name)).setText(C1473m.f7980a.mo2041U().mo1187d(this.b));
        textView = (TextView) this.f9685h.findViewById(C7582R.id.description);
        if (TextUtils.isEmpty(this.f9684g.c)) {
            textView.setVisibility(8);
        } else {
            ae.m9217a(textView, this.f9684g.c);
        }
        this.af = (EditText) this.f9685h.findViewById(C7582R.id.name_entry);
        if (this.f9684g.d != null) {
            if (!TextUtils.isEmpty(this.f9684g.d.c)) {
                this.af.setText(this.f9684g.d.c);
            }
            if (!TextUtils.isEmpty(this.f9684g.d.d)) {
                this.af.setHint(this.f9684g.d.d);
            }
        } else {
            this.af.setVisibility(8);
        }
        this.ag = (EditText) this.f9685h.findViewById(C7582R.id.birthday);
        if (this.f9684g.e != null) {
            if (bundle != null) {
                this.ah = (Date) bundle.getSerializable("AgeChallengeFragment.birthday_date");
            } else if (!TextUtils.isEmpty(this.f9684g.e.c)) {
                this.ah = C4683n.m21825a(this.f9684g.e.c, "yyyyMMdd");
            }
            if (this.ah != null) {
                this.ag.setText(this.f9682e.m21829b(this.ah));
            }
            if (!TextUtils.isEmpty(this.f9684g.e.d)) {
                this.ag.setHint(this.f9684g.e.d);
            }
            this.ag.setKeyListener(null);
            this.ag.setOnClickListener(this);
        } else {
            this.ag.setVisibility(8);
        }
        this.ai = (RadioGroup) this.f9685h.findViewById(C7582R.id.genders);
        if (this.f9684g.g != null) {
            from = LayoutInflater.from(m603h());
            aaVarArr = this.f9684g.g.b;
            i = 0;
            i2 = 1;
            while (i < aaVarArr.length) {
                aa aaVar = aaVarArr[i];
                RadioButton radioButton = (RadioButton) from.inflate(C7582R.layout.age_verification_radiobutton, this.f9685h, false);
                radioButton.setText(aaVar.c);
                int i3 = i2 + 1;
                radioButton.setId(i2);
                radioButton.setChecked(aaVar.e);
                this.ai.addView(radioButton, i);
                i++;
                i2 = i3;
            }
            if (this.ai.getCheckedRadioButtonId() == -1) {
                this.ai.check(1);
            }
        } else {
            this.ai.setVisibility(8);
            i2 = 1;
        }
        this.aj = (EditText) this.f9685h.findViewById(C7582R.id.phone_number);
        if (this.f9684g.f != null) {
            if (!TextUtils.isEmpty(this.f9684g.f.c)) {
                this.aj.setText(this.f9684g.f.c);
            }
            if (!TextUtils.isEmpty(this.f9684g.f.d)) {
                this.aj.setHint(this.f9684g.f.d);
            }
        } else {
            this.aj.setVisibility(8);
        }
        this.ak = (RadioGroup) this.f9685h.findViewById(C7582R.id.carriers);
        if (this.f9684g.h != null) {
            from = LayoutInflater.from(m603h());
            aaVarArr = this.f9684g.h.b;
            i = 0;
            int i4 = i2;
            while (i < aaVarArr.length) {
                aaVar = aaVarArr[i];
                radioButton = (RadioButton) from.inflate(C7582R.layout.age_verification_radiobutton, this.f9685h, false);
                radioButton.setText(aaVar.c);
                i3 = i4 + 1;
                radioButton.setId(i4);
                radioButton.setChecked(aaVar.e);
                this.ak.addView(radioButton, i);
                i++;
                i4 = i3;
            }
            if (this.ak.getCheckedRadioButtonId() == -1) {
                this.ak.check(i2);
            }
            if (!(this.f9684g.i == null || TextUtils.isEmpty(this.f9684g.i.b) || this.f9684g.i.c == null || this.f9684g.i.c.length <= 0 || this.f9684g.i.c[0] == null || TextUtils.isEmpty(this.f9684g.i.c[0].c))) {
                View findViewById = this.f9685h.findViewById(C7582R.id.carriers_extension);
                findViewById.setVisibility(0);
                this.ak.setOnCheckedChangeListener(this.aq);
                this.al = (RadioButton) findViewById.findViewById(C7582R.id.carriers_extension_button);
                this.al.setText(this.f9684g.i.b);
                this.al.setOnCheckedChangeListener(this.ar);
                this.am = (Spinner) findViewById.findViewById(C7582R.id.carriers_extension_spinner);
                this.am.setEnabled(false);
                SpinnerAdapter arrayAdapter = new ArrayAdapter(m601g(), 17367048);
                arrayAdapter.setDropDownViewResource(17367049);
                for (y yVar : this.f9684g.i.c) {
                    arrayAdapter.add(yVar.c);
                }
                this.am.setAdapter(arrayAdapter);
            }
        } else {
            this.ak.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f9684g.j)) {
            textView = (TextView) this.f9685h.findViewById(C7582R.id.carriers_help);
            textView.setVisibility(0);
            ae.m9217a(textView, this.f9684g.j);
        }
        this.an = (CheckBox) this.f9685h.findViewById(C7582R.id.citizenship);
        this.ao = (TextView) this.f9685h.findViewById(C7582R.id.citizenship_error);
        if (this.f9684g.k != null) {
            this.an.setText(this.f9684g.k.c);
            this.an.setChecked(this.f9684g.k.d);
            this.an.setOnCheckedChangeListener(this.ap);
        } else {
            this.an.setVisibility(8);
            this.ao.setVisibility(8);
        }
        textView = (TextView) this.f9685h.findViewById(C7582R.id.footer);
        if (TextUtils.isEmpty(this.f9684g.l)) {
            textView.setVisibility(8);
        } else {
            textView.setText(Html.fromHtml(this.f9684g.l));
        }
        this.f9686i = (PlayActionButtonV2) this.f9685h.findViewById(C7582R.id.continue_button);
        if (this.f9684g.m == null || TextUtils.isEmpty(this.f9684g.m.b)) {
            FinskyLog.m21669e("Submit button is not returned", new Object[0]);
        } else {
            this.f9686i.mo2588a(this.f9683f, this.f9684g.m.b, (OnClickListener) this);
        }
        return this.f9685h;
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(this.f9685h.getContext(), this.f9684g.b, this.f9685h, false);
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putSerializable("AgeChallengeFragment.birthday_date", this.ah);
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.ah = new GregorianCalendar(i, i2, i3).getTime();
        this.ag.setText(this.f9682e.m21829b(this.ah));
        this.ag.setError(null);
    }

    public final void onClick(View view) {
        if (view == this.ag) {
            if (this.f730B.mo283a("AgeChallengeFragment.date_picker") == null) {
                Serializable instance = Calendar.getInstance();
                if (this.ah != null) {
                    instance.setTime(this.ah);
                }
                if (instance == null) {
                    throw new IllegalStateException("Calendar is not set");
                }
                Fragment c1898l = new C1898l();
                Bundle bundle = new Bundle();
                bundle.putSerializable("DatePickerDialogFragment.calendar", instance);
                c1898l.m600f(bundle);
                c1898l.m581a((Fragment) this, 0);
                c1898l.m625a(this.f730B, "AgeChallengeFragment.date_picker");
            }
        } else if (view == this.f9686i) {
            List arrayList = new ArrayList();
            if (this.af.getVisibility() == 0 && C4677h.m21811a(this.af.getText())) {
                arrayList.add(C1833f.m9859a(1, m592c((int) C7582R.string.invalid_name)));
            }
            if (this.ag.getVisibility() == 0 && this.ah == null) {
                arrayList.add(C1833f.m9859a(2, m592c((int) C7582R.string.invalid_entry)));
            }
            if (this.aj.getVisibility() == 0 && C4677h.m21811a(this.aj.getText())) {
                arrayList.add(C1833f.m9859a(4, m592c((int) C7582R.string.invalid_phone)));
            }
            if (this.an.getVisibility() == 0 && !this.an.isChecked() && this.f9684g.k.e) {
                arrayList.add(C1833f.m9859a(6, m592c((int) C7582R.string.invalid_entry)));
            }
            this.af.setError(null);
            this.ag.setError(null);
            this.aj.setError(null);
            this.ao.setError(null);
            if (!arrayList.isEmpty()) {
                new C1891e(this, arrayList).run();
            }
            if (arrayList.isEmpty()) {
                C1892f c1892f;
                m9758a(1402);
                C1618s.m9293a(m603h(), this.f9685h);
                Map hashMap = new HashMap();
                if (this.af.getVisibility() == 0) {
                    hashMap.put(this.f9684g.d.f, this.af.getText().toString());
                }
                if (this.ag.getVisibility() == 0) {
                    hashMap.put(this.f9684g.e.f, C4683n.m21824a(this.ah, "yyyyMMdd"));
                }
                if (this.ai.getVisibility() == 0) {
                    hashMap.put(this.f9684g.g.c, this.f9684g.g.b[this.ai.indexOfChild(this.ai.findViewById(this.ai.getCheckedRadioButtonId()))].d);
                }
                if (this.aj.getVisibility() == 0) {
                    hashMap.put(this.f9684g.f.f, this.aj.getText().toString());
                }
                if (this.ak.getVisibility() == 0) {
                    Object obj;
                    int checkedRadioButtonId = this.ak.getCheckedRadioButtonId();
                    if (checkedRadioButtonId != -1) {
                        obj = this.f9684g.h.b[this.ak.indexOfChild(this.ak.findViewById(checkedRadioButtonId))].d;
                    } else {
                        obj = this.f9684g.i.c[this.am.getSelectedItemPosition()].d;
                    }
                    hashMap.put(this.f9684g.h.c, obj);
                }
                if (this.an.getVisibility() == 0 && this.an.isChecked()) {
                    hashMap.put(this.f9684g.k.g, this.f9684g.k.f);
                }
                if (this.f761r instanceof C1892f) {
                    c1892f = (C1892f) this.f761r;
                } else if (this.f734F instanceof C1892f) {
                    c1892f = (C1892f) this.f734F;
                } else if (m603h() instanceof C1892f) {
                    c1892f = (C1892f) m603h();
                } else {
                    throw new IllegalStateException("No listener registered.");
                }
                c1892f.mo2508a(this.f9684g.m.c, hashMap);
            }
        }
    }

    protected final int mo968W() {
        return 1401;
    }
}
