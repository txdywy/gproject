package com.google.android.wallet.ui.common;

import android.app.Activity;
import android.support.v4.app.ab;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.android.volley.a.q;
import com.google.a.a.a.a.a.b.d;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.util.C6594f;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.p366b.C6513c;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.date.DatePickerView;

public final class co {
    public final al f33648a;
    public final LayoutInflater f33649b;
    public final ViewGroup f33650c;
    public Activity f33651d;
    public ab f33652e;
    public LogContext f33653f;
    public bb f33654g;
    public cf f33655h;
    public C6513c f33656i;
    public at f33657j;

    public co(al alVar, LayoutInflater layoutInflater, bb bbVar, ViewGroup viewGroup) {
        if (bbVar == null) {
            throw new IllegalArgumentException("IdGenerator not set.");
        }
        this.f33648a = alVar;
        this.f33649b = layoutInflater;
        this.f33654g = bbVar;
        this.f33650c = viewGroup;
    }

    public final View m30899a() {
        View inflate;
        View view;
        boolean z = false;
        q a = this.f33651d == null ? null : C6600l.m29933a(this.f33651d.getApplicationContext());
        String str;
        String valueOf;
        if (this.f33648a.c() != null) {
            if (!cp.m30908a(this.f33648a)) {
                inflate = this.f33649b.inflate(C6623g.view_form_edit_text, this.f33650c, false);
                ((FormEditText) inflate).setLogContext(this.f33653f);
                ((FormEditText) inflate).aE = this.f33656i;
                cp.m30904a(this.f33648a, (FormEditText) inflate, this.f33651d);
                view = inflate;
            } else if (TextUtils.isEmpty(this.f33648a.c().h)) {
                str = "Read only text field without an initial value. Name=";
                valueOf = String.valueOf(this.f33648a.c);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            } else {
                inflate = this.f33649b.inflate(C6623g.view_form_non_editable_text, this.f33650c, false);
                ((TextView) inflate).setText(this.f33648a.c().h);
                view = inflate;
            }
            if (this.f33648a.c().m != 3) {
                inflate = view;
            } else if (this.f33648a.c().b != this.f33648a.c().c) {
                throw new IllegalArgumentException("Filling dots mask type requires that min_length == max_length.");
            } else if (this.f33648a.c().b <= 0) {
                throw new IllegalArgumentException("Text field min_length must be greater than 0.");
            } else {
                FormEditText formEditText = (FormEditText) view;
                formEditText.setId(this.f33654g.m30742a());
                inflate = (FillingDotsUiFieldView) this.f33649b.inflate(C6623g.view_tv_pin_challenge, this.f33650c, false);
                inflate.m30607a(formEditText, this.f33648a.c().b);
            }
        } else if (this.f33648a.g() != null) {
            if (cp.m30908a(this.f33648a)) {
                d dVar = this.f33648a.g().d;
                if (dVar == null) {
                    str = "Read only date field without an initial value. Name=";
                    valueOf = String.valueOf(this.f33648a.c);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
                CharSequence a2 = new C6594f(this.f33648a.g().h, this.f33648a.g().a, this.f33648a.g().i).m29921a(dVar.c, dVar.b, dVar.a);
                inflate = this.f33649b.inflate(C6623g.view_form_non_editable_text, this.f33650c, false);
                ((TextView) inflate).setText(a2);
            } else if (this.f33648a.g().e) {
                view = (DatePickerView) this.f33649b.inflate(C6623g.view_date_picker, this.f33650c, false);
                al alVar = this.f33648a;
                ab abVar = this.f33652e;
                bb bbVar = this.f33654g;
                view.f33732c = alVar;
                view.f33733d = alVar.g();
                view.f33735f = abVar;
                view.f33734e = new C6594f(view.f33733d.h, view.f33733d.a, view.f33733d.i);
                view.f33730a.setText(alVar.h);
                view.f33731b.setId(bbVar.m30742a());
                view.f33731b.setTextColor(ci.m30881c(view.getContext()));
                view.f33736g = new d();
                d dVar2 = view.f33733d.d;
                if (dVar2 != null) {
                    view.m30948a(dVar2.a, dVar2.b, dVar2.c);
                }
                if (alVar.g) {
                    view.setEnabled(false);
                }
                inflate = view;
            } else {
                int i;
                inflate = this.f33649b.inflate(C6623g.view_date_edit_text, this.f33650c, false);
                if (this.f33648a.g().a == 2 && TextUtils.isEmpty(this.f33648a.h)) {
                    i = 1;
                } else {
                    boolean z2 = false;
                }
                if (i != 0) {
                    boolean z3;
                    if (TextUtils.isEmpty(this.f33648a.g().i)) {
                        this.f33648a.g().i = "/";
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.f33648a.h = this.f33649b.getContext().getString(C6625i.wallet_uic_exp_date, new Object[]{this.f33648a.g().i});
                    z = z3;
                }
                ((FormEditText) inflate).setLogContext(this.f33653f);
                ((FormEditText) inflate).aE = this.f33656i;
                cp.m30904a(this.f33648a, (FormEditText) inflate, this.f33651d);
                if (i != 0) {
                    this.f33648a.h = "";
                }
                if (z) {
                    this.f33648a.g().i = "";
                }
            }
        } else if (this.f33648a.d() != null) {
            inflate = this.f33649b.inflate(C6623g.view_select_field, this.f33650c, false);
            ((SelectFieldView) inflate).m30684a(this.f33648a, this.f33653f, a);
        } else if (this.f33648a.e() != null) {
            if (cp.m30908a(this.f33648a) || this.f33648a.g) {
                throw new IllegalArgumentException("Checkbox field does not support disabled/read-only.");
            } else if (TextUtils.isEmpty(this.f33648a.h)) {
                throw new IllegalArgumentException("Checkbox field must have a label.");
            } else {
                inflate = this.f33649b.inflate(C6623g.view_checkbox, this.f33650c, false);
                ((CheckboxView) inflate).setCheckboxUiField(this.f33648a);
            }
        } else if (this.f33648a.f() == null) {
            String valueOf2 = String.valueOf(this.f33648a);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 26).append("UiField is not supported: ").append(valueOf2).toString());
        } else if (this.f33648a.f().b != null) {
            inflate = ci.m30846a(this.f33649b, this.f33648a.f().b, a, this.f33650c, this.f33654g, ((Boolean) C6489e.f32495a.a()).booleanValue(), this.f33657j);
        } else {
            inflate = this.f33649b.inflate(C6623g.view_form_non_editable_text, this.f33650c, false);
            ((TextView) inflate).setText(this.f33648a.f().a);
        }
        inflate.setId(this.f33654g.m30742a());
        m30898a(inflate);
        if (this.f33648a.j != null) {
            if (this.f33655h == null) {
                throw new IllegalArgumentException("An OnTooltipIconClickListener is required if the UI field has a tooltip.");
            }
            view = new ce(this.f33649b.getContext());
            view.m30834a(inflate, this.f33648a.j, a);
            view.setOnTooltipIconClickListener(this.f33655h);
            view.setId(this.f33654g.m30742a());
            m30898a(view);
            return view;
        } else if (this.f33648a.c() == null || this.f33648a.k.length <= 0 || this.f33648a.l != 2) {
            return inflate;
        } else {
            view = new bc(this.f33649b.getContext());
            view.m30746a(inflate, this.f33648a.k, a);
            m30898a(view);
            return view;
        }
    }

    private final void m30898a(View view) {
        if (this.f33648a.o) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LayoutParams(-2, -2);
            } else {
                layoutParams.width = -2;
            }
            view.setLayoutParams(layoutParams);
        }
    }
}
