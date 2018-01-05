package com.google.android.finsky.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.android.finsky.pagesystem.C1052j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class de extends C1052j implements ds, C1056b {
    public Document f6658a;
    public ViewGroup f6659c;
    public C2719i f6660d;
    public int f6661f;
    public RadioGroup f6662g;
    public ce f6663h = C2482j.m13283a(301);
    public cu i_;
    public String j_;

    public final void mo138d() {
        if (this.i_ != null) {
            this.i_.mo1313a();
        }
        super.mo138d();
    }

    public final void u_() {
        dl ao = ao();
        if (ao != null) {
            if (ao.f6668c != -1) {
                ab abVar = this.f730B;
                if (abVar.mo283a("flag_item_dialog") == null) {
                    int i = ao.f6668c;
                    Fragment dpVar = new dp();
                    Bundle bundle = new Bundle();
                    bundle.putInt("prompt_string_res_id", i);
                    dpVar.m600f(bundle);
                    dpVar.m581a((Fragment) this, 0);
                    dpVar.m625a(abVar, "flag_item_dialog");
                    return;
                }
                return;
            }
            aj();
        }
    }

    public final void v_() {
        this.bm.mo1244m();
    }

    protected final void aa() {
    }

    public final void f_(int i) {
        if (i == 10 && m603h() != null) {
            if (m603h() instanceof C1037e) {
                ((C1037e) m603h()).mo1244m();
            } else {
                FinskyLog.m21669e("Dialog not hosted by PageFragmentHost. Cannot navigate back.", new Object[0]);
            }
        }
    }

    protected final int mo1298Z() {
        return C7582R.layout.flag_item;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        View view = this.bt;
        this.f6659c = (ViewGroup) view.findViewById(C7582R.id.item_details_panel);
        this.f6662g = (RadioGroup) view.findViewById(C7582R.id.flag_item_list);
        ButtonBar buttonBar = (ButtonBar) view.findViewById(C7582R.id.button_bar);
        buttonBar.setPositiveButtonTitle((int) C7582R.string.submit);
        buttonBar.setPositiveButtonEnabled(false);
        buttonBar.setClickListener(this);
        this.f6662g.setOnCheckedChangeListener(new df(buttonBar));
        if (bundle != null) {
            int i;
            this.j_ = bundle.getString("flag_free_text_message");
            if (bundle.containsKey("flag_selected_button_id")) {
                i = bundle.getInt("flag_selected_button_id");
            } else {
                i = -1;
            }
            this.f6661f = i;
        }
        if (bundle == null || !bundle.containsKey("doc")) {
            this.bs.m16127a(0, null);
            this.f6660d = new C2719i(this.bo, this.bF);
            this.f6660d.m11918a(new dg(this));
            this.f6660d.m11917a(new dh(this));
            return;
        }
        m6456a((Document) bundle.getParcelable("doc"));
    }

    public final void m6456a(Document document) {
        this.f6658a = document;
        C2482j.m13285a(this.f6663h, this.f6658a.f14885a.f12087D);
        if (this.i_ == null) {
            this.i_ = bl.m6308a(this.k_, this.f6658a.f14885a.f12099f, this.bo.mo1620b());
            this.i_.mo1324d(false);
            this.i_.mo1330r();
            this.i_.mo1316a(this.bn, this.bp, this.bD, this, false, null, null, false, this, this.bw.m13366a(this.bo.mo1620b()));
        }
        this.f6662g.removeAllViews();
        LayoutInflater from = LayoutInflater.from(this.bn);
        for (dl dlVar : m6454b(this.f6658a.f14885a.f12099f)) {
            RadioButton radioButton = (RadioButton) from.inflate(C7582R.layout.radio_button_row, this.f6662g, false);
            radioButton.setText(dlVar.f6667b);
            radioButton.setTag(dlVar);
            this.f6662g.addView(radioButton);
            if (this.f6661f != -1 && this.f6661f == dlVar.f6667b) {
                this.f6662g.check(radioButton.getId());
            }
        }
        m_();
    }

    public final void cg_() {
        if (this.f6658a != null) {
            int i;
            TextView textView = (TextView) this.bt.findViewById(C7582R.id.flag_content_instruction);
            if (this.f6658a.f14885a.f12099f == 3) {
                i = C7582R.string.flag_page_description;
            } else {
                i = C7582R.string.flag_page_description_non_app;
            }
            textView.setText(i);
            if (this.f6658a.f14885a.f12099f == 2) {
                textView = (TextView) this.bt.findViewById(C7582R.id.flag_content_footer);
                textView.setText(Html.fromHtml(m572a((int) C7582R.string.flag_page_footer_music, C0955b.f5907w.m28964b())));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setVisibility(0);
            }
            this.i_.mo1317a(this.f6658a, null, false, null, true, null, this.f6659c);
            this.bt.findViewById(C7582R.id.item_summary_trailing).setBackgroundColor(C1608h.m9243a(this.bn, this.f6658a.f14885a.f12099f));
            ac();
        }
    }

    public final void ac() {
        this.bm.mo1241c(this.bn.getString(C7582R.string.flagging_title));
        this.bm.mo1237a(this.f6658a.f14885a.f12099f, false);
        this.bm.mo1246z();
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        if (this.f6658a != null) {
            bundle.putParcelable("doc", this.f6658a);
            bundle.putString("flag_free_text_message", this.j_);
            if (ao() != null) {
                bundle.putInt("flag_selected_button_id", ao().f6667b);
            }
        }
    }

    public final void mo1339a(String str) {
        this.j_ = str;
        aj();
    }

    private final void aj() {
        this.bm.mo1244m();
        ao().mo1342a(this.bn, this.f6658a, this.j_);
    }

    private final List m6454b(int i) {
        List arrayList;
        if (i == 3) {
            int i2;
            if (C1473m.f7980a.ah().mo2812a(this.f6658a.m14625N().f13171k).isEmpty()) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            boolean booleanValue = ((Boolean) C0955b.f5882Z.m28964b()).booleanValue();
            arrayList = new ArrayList();
            arrayList.add(new di(1, C7582R.string.flag_sexual_content, -1));
            arrayList.add(new di(3, C7582R.string.flag_graphic_violence, -1));
            arrayList.add(new di(4, C7582R.string.flag_hateful_content, -1));
            if (i2 != 0) {
                arrayList.add(new di(7, C7582R.string.flag_harmful_to_device, C7582R.string.flag_harmful_prompt));
            }
            if (!booleanValue) {
                arrayList.add(new di(5, C7582R.string.flag_improper_content_rating, -1));
            }
            arrayList.add(new di(11, C7582R.string.flag_pharma_content, -1));
            arrayList.add(new di(12, C7582R.string.flag_copycat, -1));
            arrayList.add(new di(8, C7582R.string.flag_other_objection, C7582R.string.flag_other_concern_prompt));
            return arrayList;
        } else if (i == 2) {
            arrayList = new ArrayList();
            arrayList.add(new dm(5, C7582R.string.flag_incorrect_metadata));
            arrayList.add(new dm(1, C7582R.string.flag_sexual_content));
            arrayList.add(new dm(4, C7582R.string.flag_hateful_content));
            arrayList.add(new dm(6, C7582R.string.flag_spam));
            arrayList.add(new dm(2, C7582R.string.flag_minor_abuse));
            arrayList.add(new dm(8, C7582R.string.flag_other_objection));
            return arrayList;
        } else {
            throw new IllegalStateException("unsupported backend type");
        }
    }

    private final dl ao() {
        if (this.f746R == null || this.f6662g.getCheckedRadioButtonId() == -1) {
            return null;
        }
        int indexOfChild = this.f6662g.indexOfChild(this.f746R.findViewById(this.f6662g.getCheckedRadioButtonId()));
        List b = m6454b(this.f6658a.f14885a.f12099f);
        if (indexOfChild < b.size()) {
            return (dl) b.get(indexOfChild);
        }
        return null;
    }

    public final ce getPlayStoreUiElement() {
        return this.f6663h;
    }
}
