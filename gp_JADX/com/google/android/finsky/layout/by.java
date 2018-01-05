package com.google.android.finsky.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.setup.PreloadWrapper;
import com.google.android.play.utils.k;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.squareup.leakcanary.C7582R;

@TargetApi(21)
public final class by extends LinearLayout {
    public View f18549a;
    public TextView f18550b;
    public LinearLayout f18551c;
    public boolean f18552d;
    public PreloadWrapper[] f18553e;
    public boolean[] f18554f;
    public cb f18555g;
    public final OnClickListener f18556h = new bz(this);

    public by(Context context) {
        super(context);
        setOrientation(1);
        Context context2 = getContext();
        inflate(context2, C7582R.layout.setup_wizard_preloads_section, this);
        this.f18549a = findViewById(C7582R.id.preloads_section_divider);
        this.f18550b = (TextView) findViewById(C7582R.id.preloads_section_title);
        this.f18551c = (LinearLayout) findViewById(C7582R.id.preloads_section_list);
        this.f18552d = k.b(context2);
    }

    public final void setListener(cb cbVar) {
        this.f18555g = cbVar;
    }

    public final void setSelectedStatesWithoutNotify(boolean z) {
        for (int i = 0; i < this.f18554f.length; i++) {
            if (!this.f18553e[i].f20562a.h) {
                this.f18554f[i] = z;
            }
        }
        m17436a(false);
    }

    public final void setSelectedStates(boolean[] zArr) {
        this.f18554f = zArr;
        m17436a(true);
    }

    public final void setSectionVisible(boolean z) {
        int i;
        int i2 = 0;
        View view = this.f18549a;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        boolean isEmpty = TextUtils.isEmpty(this.f18550b.getText());
        TextView textView = this.f18550b;
        if (!z || isEmpty) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout = this.f18551c;
        if (!z) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    public final int getCount() {
        return this.f18551c.getChildCount();
    }

    public final boolean[] getSelectedStates() {
        return this.f18554f;
    }

    public final ee[] getPreloads() {
        ee[] eeVarArr = new ee[this.f18553e.length];
        for (int i = 0; i < eeVarArr.length; i++) {
            eeVarArr[i] = this.f18553e[i].f20562a;
        }
        return eeVarArr;
    }

    public final int getPreloadsCount() {
        return this.f18553e.length;
    }

    public final ee m17434a(int i) {
        return this.f18553e[i].f20562a;
    }

    public final void m17435a(String str, ee[] eeVarArr, boolean z) {
        PreloadWrapper[] preloadWrapperArr = new PreloadWrapper[eeVarArr.length];
        for (int i = 0; i < eeVarArr.length; i++) {
            preloadWrapperArr[i] = new PreloadWrapper(eeVarArr[i]);
        }
        this.f18553e = preloadWrapperArr;
        this.f18554f = new boolean[eeVarArr.length];
        this.f18550b.setText(str);
        setSectionVisible(eeVarArr.length > 0);
        this.f18551c.removeAllViews();
        int length = this.f18553e.length;
        LayoutInflater from = LayoutInflater.from(getContext());
        for (int i2 = 0; i2 < length; i2++) {
            boolean z2;
            ViewGroup viewGroup = (ViewGroup) from.inflate(C7582R.layout.restore_apps_row_entry, this.f18551c, false);
            ca caVar = new ca(this, viewGroup);
            caVar.f18565g = i2;
            ee eeVar = caVar.f18566h.f18553e[i2].f20562a;
            boolean z3 = eeVar.h;
            caVar.f18562d.setTextDirection(caVar.f18566h.f18552d ? 3 : 4);
            caVar.f18562d.setText(eeVar.n.f12100g);
            caVar.f18563e.setVisibility(z3 ? 0 : 8);
            caVar.f18564f.setEnabled(!z3);
            caVar.f18564f.setVisibility(z3 ? 4 : 0);
            bd aj = caVar.f18566h.f18553e[i2].f20563b.aj();
            if (aj != null) {
                C1473m.f7980a.ar().m9288a(caVar.f18561c, aj.f11860f, aj.f11863i);
            }
            if (!(caVar.f18565g != caVar.f18566h.f18553e.length - 1 || z || caVar.f18560b == null)) {
                caVar.f18560b.setVisibility(8);
            }
            caVar.f18559a.setOnClickListener(caVar);
            if (!z3) {
                caVar.f18564f.setTag(Integer.valueOf(caVar.f18565g));
                caVar.f18564f.setOnClickListener(caVar.f18566h.f18556h);
            }
            viewGroup.setTag(caVar);
            this.f18551c.addView(viewGroup);
            ee eeVar2 = this.f18553e[i2].f20562a;
            boolean[] zArr = this.f18554f;
            if (eeVar2.h) {
                z2 = true;
            } else {
                z2 = eeVar2.i;
            }
            zArr[i2] = z2;
        }
        m17436a(true);
    }

    public final void m17436a(boolean z) {
        for (int i = 0; i < this.f18554f.length; i++) {
            ((Checkable) ((ViewGroup) this.f18551c.getChildAt(i)).findViewById(C7582R.id.checkable_item)).setChecked(this.f18554f[i]);
        }
        if (z && this.f18555g != null) {
            this.f18555g.mo3914a();
        }
    }
}
