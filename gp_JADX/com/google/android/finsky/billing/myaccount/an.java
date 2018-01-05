package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.SwitchCompat;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.aj;
import com.google.wireless.android.finsky.dfe.nano.az;
import com.google.wireless.android.finsky.dfe.nano.ba;
import com.google.wireless.android.finsky.dfe.nano.cl;
import com.google.wireless.android.finsky.dfe.nano.dl;
import com.squareup.leakcanary.C7582R;

public final class an extends C1995d {
    public cl f10200c;
    public cl f10201d;
    public cl f10202e;
    public az f10203f;
    public C2910a f10204g;
    public C0988c f10205h;
    public final Resources f10206o;
    public final bb f10207p;
    public final bf f10208q;
    public final Handler f10209r = new Handler();

    public an(Context context, Bundle bundle, ad adVar, C2495w c2495w, ba baVar, bb bbVar, bf bfVar) {
        super(context, bundle, adVar, c2495w);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1752a(this);
        this.f10206o = context.getResources();
        this.f10200c = baVar.a;
        this.f10201d = baVar.b;
        this.f10203f = baVar.c;
        this.f10207p = bbVar;
        this.f10208q = bfVar;
        int i = bundle.getInt("EmailAdapter.mode");
        this.i.add(Integer.valueOf(0));
        this.i.add(Integer.valueOf(1));
        this.i.add(Integer.valueOf(2));
        this.i.add(Integer.valueOf(m10590g(i)));
    }

    protected final int mo2572e(int i) {
        switch (i) {
            case 0:
                return C7582R.layout.header_list_spacer;
            case 1:
                return C7582R.layout.email_marketing_preference;
            case 2:
                return C7582R.layout.contact_email_header;
            case 3:
                return C7582R.layout.contact_email_view;
            case 4:
                return C7582R.layout.contact_email_edit_view;
            default:
                throw new IllegalStateException("Unknown type for getLayoutForViewType " + i);
        }
    }

    protected final void mo2571a(View view, int i, int i2) {
        boolean z = true;
        int i3 = 8;
        switch (i) {
            case 0:
                m10558a(view);
                return;
            case 1:
                String str = (String) aj.m21700a(this.f10205h.cZ());
                SwitchCompat switchCompat = (SwitchCompat) view.findViewById(C7582R.id.email_marketing_toggle);
                dl e = this.f10204g.m15195e(str);
                if (e == null || !e.b) {
                    z = false;
                }
                switchCompat.setChecked(z);
                switchCompat.setOnCheckedChangeListener(new as(this, str, switchCompat, view));
                return;
            case 2:
                return;
            case 3:
                CharSequence string;
                int i4;
                SVGImageView sVGImageView = (SVGImageView) view.findViewById(C7582R.id.edit_contact_email_address);
                if (this.f10203f.b) {
                    sVGImageView.setVisibility(0);
                    sVGImageView.setOnClickListener(new ay(this));
                } else {
                    sVGImageView.setVisibility(8);
                }
                cl clVar = this.f10201d != null ? this.f10201d : this.f10200c;
                if (clVar == null) {
                    string = this.f10206o.getString(C7582R.string.contact_email_not_specified);
                } else {
                    Object obj = clVar.b;
                }
                ((TextView) view.findViewById(C7582R.id.contact_email_address)).setText(string);
                cl clVar2 = this.f10201d;
                cl clVar3 = this.f10200c;
                TextView textView = (TextView) view.findViewById(C7582R.id.contact_email_until_verification);
                if (clVar2 == null || clVar3 == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    ae.m9217a(textView, this.f10206o.getString(C7582R.string.contact_email_until_verification, new Object[]{clVar3.b, clVar2.b}));
                }
                textView = (TextView) view.findViewById(C7582R.id.pending_contact_email_verification);
                if (clVar2 != null) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                textView.setVisibility(i4);
                Button button = (Button) view.findViewById(C7582R.id.contact_email_resend_button);
                if (clVar2 != null) {
                    button.setVisibility(0);
                    button.setOnClickListener(new au(this, clVar2, button));
                } else {
                    button.setVisibility(8);
                }
                View findViewById = view.findViewById(C7582R.id.contact_email_footer_spacer);
                if (clVar2 == null) {
                    i3 = 4;
                }
                findViewById.setVisibility(i3);
                ae.m9217a((TextView) view.findViewById(C7582R.id.contact_email_description), this.f10206o.getString(C7582R.string.contact_email_description));
                return;
            case 4:
                String str2;
                EditText editText = (EditText) view.findViewById(C7582R.id.contact_email_address_edit_text);
                Button button2 = (Button) view.findViewById(C7582R.id.contact_email_save_button);
                cl b = m10592b();
                if (b == null) {
                    str2 = null;
                } else {
                    str2 = b.b;
                }
                CharSequence string2 = this.k.getString("EmailAdapter.editEmailText", str2);
                this.k.putString("EmailAdapter.editEmailText", string2);
                if (string2 != null) {
                    editText.setText(string2);
                } else {
                    editText.getText().clear();
                }
                editText.requestFocus();
                this.f10209r.post(new az(editText));
                editText.addTextChangedListener(new ao(this, button2));
                ((Button) view.findViewById(C7582R.id.contact_email_cancel_button)).setOnClickListener(new ap(this));
                button2.setEnabled(m10588a(editText.getText().toString()));
                button2.setOnClickListener(new aq(this, editText, button2, view));
                return;
            default:
                throw new IllegalStateException("Unknown type for bindView " + i);
        }
    }

    final cl m10592b() {
        return this.f10201d != null ? this.f10201d : this.f10200c;
    }

    static boolean m10588a(String str) {
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    private final void m10587a(String str, Button button, int i, C0660x c0660x) {
        String charSequence = button.getText().toString();
        button.setText(this.f10206o.getString(i));
        button.setEnabled(false);
        C0660x awVar = new aw(button, charSequence, c0660x);
        C0657w axVar = new ax(button, charSequence);
        cl clVar = new cl();
        if (str == null) {
            throw new NullPointerException();
        }
        clVar.a |= 1;
        clVar.b = str;
        this.f10202e = clVar;
        this.f10207p.m10608a(clVar, awVar, axVar);
    }

    final void m10595f(int i) {
        this.i.set(3, Integer.valueOf(m10590g(i)));
        this.k.putInt("EmailAdapter.mode", i);
        m3631c(3);
    }

    private static int m10590g(int i) {
        return i == 1 ? 4 : 3;
    }

    final int m10593c() {
        if (((Integer) this.i.get(3)).intValue() == 4) {
            return 1;
        }
        return 0;
    }

    static void m10589b(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
