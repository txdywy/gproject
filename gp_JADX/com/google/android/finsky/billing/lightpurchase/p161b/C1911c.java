package com.google.android.finsky.billing.lightpurchase.p161b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.cv.p177a.ac;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.h.a.a;
import com.google.wireless.android.finsky.dfe.h.a.b;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C1911c {
    public final Context f9826a;
    public final LayoutInflater f9827b;
    public final a f9828c;
    public final int f9829d;
    public final int f9830e;
    public final View f9831f;
    public final OnClickListener f9832g;
    public final C1612l f9833h = C1473m.f7980a.ar();
    public CheckBox f9834i;
    public TextView f9835j;
    public Spinner f9836k;

    public C1911c(Context context, a aVar, int i, int i2, View view, OnClickListener onClickListener) {
        this.f9826a = context;
        this.f9828c = aVar;
        this.f9829d = i;
        this.f9830e = i2;
        this.f9831f = view;
        this.f9827b = LayoutInflater.from(context);
        this.f9832g = onClickListener;
    }

    public final void m10259a() {
        TextView textView = (TextView) this.f9831f.findViewById(C7582R.id.title);
        if (TextUtils.isEmpty(this.f9828c.b)) {
            textView.setText(C7582R.string.ask_to_buy_dialog_title);
        } else {
            textView.setText(this.f9828c.b);
        }
        textView = (TextView) this.f9831f.findViewById(C7582R.id.instrument_display_title);
        CharSequence charSequence = this.f9828c.f;
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
        }
        ColorStateList c = C1608h.m9255c(this.f9826a, this.f9829d);
        textView = (TextView) this.f9831f.findViewById(C7582R.id.price);
        textView.setText(this.f9828c.e);
        textView.setTextColor(c);
        textView.setVisibility(0);
        if (!TextUtils.isEmpty(this.f9828c.u)) {
            textView = (TextView) this.f9831f.findViewById(C7582R.id.price_byline);
            textView.setText(this.f9828c.u);
            textView.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.f9828c.v)) {
            textView = (TextView) this.f9831f.findViewById(C7582R.id.price_byline_2);
            textView.setText(this.f9828c.v);
            textView.setVisibility(0);
        }
        this.f9833h.m9287a((FifeImageView) this.f9831f.findViewById(C7582R.id.application_icon), this.f9828c.d, this.f9830e);
        ((TextView) this.f9831f.findViewById(C7582R.id.document_title)).setText(this.f9828c.c);
        ViewGroup viewGroup = (ViewGroup) this.f9831f.findViewById(C7582R.id.document_description);
        for (CharSequence text : this.f9828c.h) {
            TextView textView2 = (TextView) this.f9827b.inflate(C7582R.layout.light_purchase_subtitle, viewGroup, false);
            textView2.setText(text);
            viewGroup.addView(textView2);
        }
        viewGroup = (ViewGroup) this.f9831f.findViewById(C7582R.id.badge_container);
        for (ac acVar : this.f9828c.i) {
            bd bdVar;
            ViewGroup viewGroup2 = (ViewGroup) this.f9827b.inflate(C7582R.layout.light_purchase_badge, viewGroup, false);
            viewGroup2.setContentDescription(acVar.f11762i);
            if (acVar.f11758e == null || acVar.f11758e.length <= 0) {
                bdVar = null;
            } else {
                bdVar = acVar.f11758e[0];
            }
            this.f9833h.m9287a((FifeImageView) viewGroup2.findViewById(C7582R.id.icon), bdVar, -1);
            if (!TextUtils.isEmpty(acVar.f11756c)) {
                textView2 = (TextView) viewGroup2.findViewById(C7582R.id.text);
                textView2.setText(acVar.f11756c);
                textView2.setVisibility(0);
            }
            viewGroup.addView(viewGroup2);
        }
        if (!TextUtils.isEmpty(this.f9828c.q)) {
            this.f9835j = (TextView) this.f9827b.inflate(C7582R.layout.light_purchase_view_permissions_button, viewGroup, false);
            this.f9835j.setText(this.f9828c.q);
            this.f9835j.setOnClickListener(this.f9832g);
            textView2 = this.f9835j;
            CharSequence spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(textView2.getText());
            spannableStringBuilder.setSpan(new URLSpan("#"), 0, spannableStringBuilder.length(), 33);
            textView2.setText(spannableStringBuilder, BufferType.SPANNABLE);
            viewGroup.addView(this.f9835j);
        }
        if (viewGroup.getChildCount() == 0) {
            viewGroup.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f9828c.n)) {
            this.f9831f.findViewById(C7582R.id.consumption_app_details).setVisibility(0);
            this.f9833h.m9287a((FifeImageView) this.f9831f.findViewById(C7582R.id.consumption_app_icon), this.f9828c.m, -1);
            ae.m9217a((TextView) this.f9831f.findViewById(C7582R.id.consumption_app_disclaimer), this.f9828c.n);
        }
        if ((this.f9828c.a & 32768) != 0) {
            textView = (TextView) this.f9831f.findViewById(C7582R.id.requester_info);
            textView.setVisibility(0);
            textView.setText(this.f9828c.w);
        }
        m10258b();
        if (!TextUtils.isEmpty(this.f9828c.t)) {
            textView = (TextView) this.f9831f.findViewById(C7582R.id.footer);
            ae.m9217a(textView, this.f9828c.t);
            textView.setVisibility(0);
            textView.requestFocus();
        }
        if (this.f9828c.s != null) {
            this.f9834i = (CheckBox) this.f9831f.findViewById(C7582R.id.approval_checkbox);
            this.f9834i.setChecked(this.f9828c.s.d);
            ae.m9217a(this.f9834i, this.f9828c.s.c);
            this.f9834i.setVisibility(0);
        }
    }

    private final void m10258b() {
        TextView textView = (TextView) this.f9831f.findViewById(C7582R.id.approver_email);
        this.f9836k = (Spinner) this.f9831f.findViewById(C7582R.id.approver_email_list);
        b[] bVarArr = this.f9828c.j;
        if (bVarArr == null || bVarArr.length == 0) {
            textView.setVisibility(8);
            this.f9836k.setVisibility(8);
        } else if (bVarArr.length > 1) {
            List arrayList = new ArrayList();
            for (b bVar : bVarArr) {
                arrayList.add(bVar.d);
            }
            SpinnerAdapter arrayAdapter = new ArrayAdapter(this.f9826a, 17367048, arrayList);
            arrayAdapter.setDropDownViewResource(17367049);
            this.f9836k.setAdapter(arrayAdapter);
            this.f9836k.setVisibility(0);
            textView.setVisibility(8);
        } else {
            textView.setText(bVarArr[0].d);
        }
    }
}
