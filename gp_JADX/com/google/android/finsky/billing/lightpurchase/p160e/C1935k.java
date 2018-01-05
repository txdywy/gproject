package com.google.android.finsky.billing.lightpurchase.p160e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.p028a.C0216d;
import android.support.v4.widget.bg;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.C1833f;
import com.google.android.finsky.billing.lightpurchase.GiftEmailParams;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.nano.ep;
import com.google.wireless.android.finsky.dfe.nano.er;
import com.squareup.leakcanary.C7582R;

public final class C1935k extends C1076h implements OnClickListener, OnCheckedChangeListener, ad {
    public final C2492t f9890a = C1473m.f7980a.aP();
    public TextView af;
    public View ag;
    public CheckBox ah;
    public View aj;
    public TextView ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public GiftEmailParams ap;
    public final ce aq = C2482j.m13283a(710);
    public int f9891b;
    public int f9892c;
    public er f9893d;
    public View f9894e;
    public View f9895f;
    public TextView f9896g;
    public TextView f9897h;
    public TextView f9898i;

    public final String mo1406a(Resources resources) {
        return this.f9893d.r;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f9891b = bundle2.getInt("CartDetailsStep.backend");
        this.f9892c = bundle2.getInt("CartDetailsStep.documentType");
        this.f9893d = (er) ParcelableProto.m21673a(bundle2, "CartDetailsStep.cart");
        this.an = bundle2.getBoolean("CartDetailsStep.continueToInstrumentManager");
        this.ap = (GiftEmailParams) bundle2.getParcelable("CartDetailsStep.giftEmailParams");
        if (bundle != null) {
            this.al = bundle.getBoolean("CartDetailsStep.expanded");
            this.ao = bundle.getBoolean("CartDetailsStep.stepFragmentReadyLogged");
        }
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putBoolean("CartDetailsStep.expanded", this.al);
        bundle.putBoolean("CartDetailsStep.stepFragmentReadyLogged", this.ao);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ColorStateList c = C1608h.m9255c(m603h(), this.f9891b);
        int defaultColor = c.getDefaultColor();
        C1473m.f7980a.mo2249j(((aq) aa()).ai().name);
        View inflate = layoutInflater.inflate(C7582R.layout.light_purchase_cart, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.item_title);
        TextView textView2 = (TextView) inflate.findViewById(C7582R.id.item_subtitle);
        TextView textView3 = (TextView) inflate.findViewById(C7582R.id.item_subtitle2);
        this.f9898i = (TextView) inflate.findViewById(C7582R.id.item_price);
        this.af = (TextView) inflate.findViewById(C7582R.id.instrument);
        TextView textView4 = (TextView) inflate.findViewById(C7582R.id.instrument_setup_message);
        TextView textView5 = (TextView) inflate.findViewById(C7582R.id.account);
        textView5.setVisibility(0);
        textView5.setText(((aq) aa()).ai().name);
        this.f9895f = inflate.findViewById(C7582R.id.purchase_details);
        TextView textView6 = (TextView) inflate.findViewById(C7582R.id.footer);
        this.f9894e = inflate.findViewById(C7582R.id.header);
        textView.setText(this.f9893d.b);
        if (((this.f9893d.a & 2) != 0 ? 1 : null) != null) {
            textView2.setText(this.f9893d.c);
            textView2.setVisibility(0);
        }
        if (((this.f9893d.a & 4) != 0 ? 1 : null) != null) {
            textView3.setText(this.f9893d.d);
            textView3.setVisibility(0);
        }
        this.f9898i.setText(this.f9893d.e);
        this.f9898i.setTextColor(c);
        textView2 = (TextView) inflate.findViewById(C7582R.id.price_byline);
        if (((this.f9893d.a & 32) != 0 ? 1 : null) != null) {
            textView2.setText(this.f9893d.i);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        textView2 = (TextView) inflate.findViewById(C7582R.id.price_byline_2);
        if (((this.f9893d.a & 64) != 0 ? 1 : null) != null) {
            textView2.setText(this.f9893d.j);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        ao aoVar = this.f9893d.l;
        if (aoVar != null) {
            if (!TextUtils.isEmpty(aoVar.d)) {
                this.af.setText(aoVar.d);
                this.af.setVisibility(0);
            }
            if (aoVar.r.length > 0) {
                textView2 = (TextView) inflate.findViewById(C7582R.id.instrument_error_message);
                ae.m9217a(textView2, aoVar.r[0].d);
                textView2.setVisibility(0);
            } else {
                m10339a(layoutInflater, (ViewGroup) inflate.findViewById(C7582R.id.extended_detail_messages), C7582R.layout.light_purchase_cart_extended_detail_message, this.f9893d.o, defaultColor);
                textView5.setText(((aq) aa()).ai().name);
                this.am = !this.an;
            }
        } else {
            this.af.setVisibility(8);
            ae.m9217a(textView4, C1833f.m9861a(this.f9893d.q, defaultColor));
            textView4.setVisibility(0);
        }
        if ((!C2726q.m14753b(this.f9892c) ? 1 : null) != null) {
            C1473m.f7980a.ar().m9287a((FifeImageView) inflate.findViewById(C7582R.id.application_icon), this.f9893d.w, this.f9892c);
        }
        m10339a(layoutInflater, (ViewGroup) inflate.findViewById(C7582R.id.detail_messages), C7582R.layout.light_purchase_cart_detail_message, this.f9893d.m, defaultColor);
        if (((this.f9893d.a & 256) != 0 ? 1 : null) != null) {
            textView6.setVisibility(0);
            ae.m9217a(textView6, C1833f.m9861a(this.f9893d.p, defaultColor));
        } else {
            textView6.setVisibility(8);
        }
        if (this.f9893d.x != null) {
            this.ah = (CheckBox) inflate.findViewById(C7582R.id.split_tender_checkbox);
            this.ah.setText(this.f9893d.x.b);
            this.ah.setChecked(this.f9893d.x.c);
            this.ah.setOnCheckedChangeListener(this);
            this.ah.setVisibility(0);
        }
        if (this.f9893d.v != null && this.f9893d.v.length > 0) {
            int i;
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C7582R.id.vouchers);
            viewGroup2.setVisibility(0);
            ep epVar = null;
            ep[] epVarArr = this.f9893d.v;
            int length = epVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                ep epVar2;
                ep epVar3 = epVarArr[i2];
                View inflate2 = layoutInflater.inflate(C7582R.layout.light_purchase_cart_voucher_entry, viewGroup2, false);
                textView3 = (TextView) inflate2.findViewById(C7582R.id.title);
                textView3.setText(epVar3.c.f12100g);
                if (!epVar3.e) {
                    inflate2.setOnClickListener(new C1937m(this, epVar3.c.f12096c));
                    epVar2 = epVar;
                } else if (epVar != null) {
                    throw new IllegalArgumentException("Multiple applied vouchers is not supported");
                } else {
                    textView3.setTypeface(textView3.getTypeface(), 1);
                    inflate2.findViewById(C7582R.id.checkmark).setVisibility(0);
                    inflate2.setOnClickListener(new C1936l(this));
                    epVar2 = epVar3;
                }
                viewGroup2.addView(inflate2);
                i2++;
                epVar = epVar2;
            }
            textView2 = (TextView) inflate.findViewById(C7582R.id.voucher_header);
            textView2.setVisibility(0);
            textView2.setTextColor(defaultColor);
            if (epVar == null) {
                i = C7582R.string.voucher_section_none_selected;
            } else {
                i = C7582R.string.voucher_section_has_selected;
            }
            textView2.setText(i);
            inflate.findViewById(C7582R.id.voucher_separator).setVisibility(0);
            if (epVar != null) {
                this.ag = inflate.findViewById(C7582R.id.selected_voucher_container);
                this.ag.setVisibility(0);
                this.ag.setOnClickListener(this);
                ((TextView) this.ag.findViewById(C7582R.id.selected_voucher_title)).setText(epVar.c.f12100g);
                textView2 = (TextView) this.ag.findViewById(C7582R.id.selected_voucher_discount_price);
                if (TextUtils.isEmpty(epVar.d)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(m572a((int) C7582R.string.cart_discounted_price, epVar.d));
                }
                if (!TextUtils.isEmpty(epVar.f)) {
                    textView2.setContentDescription(epVar.f);
                }
                textView2 = (TextView) this.ag.findViewById(C7582R.id.selected_voucher_original_price);
                if (TextUtils.isEmpty(this.f9893d.g)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(m572a((int) C7582R.string.cart_original_price, this.f9893d.g));
                }
            }
        }
        if (this.ap != null) {
            ((TextView) inflate.findViewById(C7582R.id.gift_to_email)).setText(m572a((int) C7582R.string.to_email_output, this.ap.f9634b));
            ((TextView) inflate.findViewById(C7582R.id.gift_from_name)).setText(m572a((int) C7582R.string.from_name_output, this.ap.f9633a));
            textView2 = (TextView) inflate.findViewById(C7582R.id.gift_message);
            if (!TextUtils.isEmpty(this.ap.f9635c)) {
                textView2.setText(m572a((int) C7582R.string.message_output, this.ap.f9635c));
                textView2.setVisibility(0);
            }
            this.aj = inflate.findViewById(C7582R.id.gift_contents);
        }
        this.f9896g = (TextView) inflate.findViewById(C7582R.id.payment_settings);
        this.f9897h = (TextView) inflate.findViewById(C7582R.id.redeem);
        View findViewById = inflate.findViewById(C7582R.id.redeem_separator);
        if (((this.f9893d.a & eq.FLAG_MOVED) != 0 ? 1 : null) != null) {
            this.f9896g.setText(this.f9893d.y);
            this.f9896g.setOnClickListener(this);
            this.f9896g.setTextColor(defaultColor);
        } else {
            this.f9896g.setVisibility(8);
            findViewById.setVisibility(8);
        }
        if (((this.f9893d.a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 1 : null) != null) {
            this.f9897h.setText(this.f9893d.z);
            this.f9897h.setOnClickListener(this);
            this.f9897h.setTextColor(defaultColor);
        } else {
            this.f9897h.setVisibility(8);
            findViewById.setVisibility(8);
        }
        this.f9894e.setOnClickListener(this);
        ab();
        C1473m.f7980a.aH().m9782a(this.f760q, inflate, textView, this.ak, this.f9898i, this.af, textView6, ((aq) aa()).ao());
        return inflate;
    }

    public final void mo979u() {
        super.mo979u();
        String a = m572a((int) C7582R.string.content_description_current_price, this.f9893d.e);
        C1601a.m9199a(this.f9894e.getContext(), m572a((int) C7582R.string.purchase_flow_start_description, this.f9893d.b, a), this.f9894e, false);
        if (this.ag != null) {
            C1601a.m9199a(this.ag.getContext(), ((TextView) this.ag.findViewById(C7582R.id.selected_voucher_title)).getText(), this.ag, false);
        }
        if (!this.ao) {
            this.f9890a.m13358c(m10341Y(), "purchase_fragment_cart_details");
            this.ao = true;
        }
    }

    private final void m10339a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, String[] strArr, int i2) {
        for (String str : strArr) {
            this.ak = (TextView) layoutInflater.inflate(i, viewGroup, false);
            ae.m9217a(this.ak, C1833f.m9861a(str, i2));
            viewGroup.addView(this.ak);
        }
        viewGroup.setVisibility(strArr.length > 0 ? 0 : 8);
    }

    private final void ab() {
        int i;
        int i2 = C7582R.drawable.ic_expand_less_18px;
        int i3 = 8;
        this.f9895f.setVisibility(this.al ? 0 : 8);
        if (this.af.getVisibility() == 0) {
            bg.f2112a.mo477a(this.af, this.al ? C7582R.drawable.ic_expand_less_18px : C7582R.drawable.ic_expand_more_18px);
        } else {
            Drawable a;
            Context context = this.f9898i.getContext();
            if (this.al) {
                a = C1608h.m9246a(context, (int) C7582R.drawable.ic_menu_expander_maximized_light, this.f9891b);
            } else {
                a = C1608h.m9246a(context, (int) C7582R.drawable.ic_menu_expander_minimized_light, this.f9891b);
            }
            if (this.f760q.getBoolean("CartDetailsStep.isPriceColorOverridden")) {
                if (!this.al) {
                    i2 = C7582R.drawable.ic_expand_more_18px;
                }
                a = C0216d.m1112a(context, i2);
            }
            bg.m2222a(this.f9898i, null, null, a, null);
        }
        if (this.ag != null) {
            View view = this.ag;
            if (this.al) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
        if (this.aj != null) {
            View view2 = this.aj;
            if (!this.al) {
                i3 = 0;
            }
            view2.setVisibility(i3);
        }
        if (this.al) {
            if (this.f9896g.getVisibility() == 0) {
                m10341Y().m13370a(new C2488p().m13340a(714).m13345b(this));
            }
            if (this.f9897h.getVisibility() == 0) {
                m10341Y().m13370a(new C2488p().m13340a(716).m13345b(this));
            }
        }
        if (this.al) {
            i = C7582R.string.content_description_current_price_toggle_collapse;
        } else {
            i = C7582R.string.content_description_current_price_toggle_expand;
        }
        this.f9898i.setContentDescription(m572a(i, this.f9893d.e));
    }

    private final void ac() {
        this.al = !this.al;
        if (this.al) {
            m10341Y().m13370a(new C2488p().m13340a(715).m13345b(this));
        }
        ab();
    }

    final C2495w m10341Y() {
        return ((aq) aa()).am();
    }

    public final void onClick(View view) {
        if (view == this.f9894e) {
            m6694a(713, null);
            C1601a.m9199a(view.getContext(), this.f9893d.y, view, false);
            ac();
        } else if (view == this.f9896g) {
            m6694a(714, null);
            ((aq) aa()).ad();
        } else if (view == this.f9897h) {
            m6694a(716, null);
            ((aq) aa()).ae();
        } else if (view == this.ag) {
            m6694a(717, null);
            C1601a.m9199a(view.getContext(), m592c((int) C7582R.string.voucher_section_has_selected), view, false);
            ac();
        }
    }

    public final void mo1405X() {
        if (this.an) {
            m6694a(712, null);
            ((aq) aa()).aa();
        } else if (this.am) {
            m6694a(711, null);
            ((aq) aa()).ab();
        } else {
            m6694a(712, null);
            ((aq) aa()).ad();
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.ah) {
            ((aq) aa()).mo2518a(Boolean.valueOf(z));
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.aq;
    }
}
