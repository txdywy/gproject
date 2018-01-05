package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.a.f.e;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.p376a.C6553f;
import com.google.android.wallet.common.p376a.C6563p;
import com.google.android.wallet.p366b.C6508h;
import com.google.android.wallet.p366b.C6512i;
import com.google.android.wallet.p366b.C6515e;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6625i;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

public class RegionCodeView extends FrameLayout implements C6508h, aa, bv {
    public TextView f33448d;
    public RegionCodeSelectorSpinner f33449e;
    public h f33450f;
    public boolean f33451g;
    public boolean f33452h;
    public int f33453i;
    public bv f33454j;
    public C6512i f33455k;
    public final ArrayList f33456l = new ArrayList();
    public at f33457m;

    public RegionCodeView(Context context) {
        super(context);
    }

    public RegionCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RegionCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public RegionCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f33449e = (RegionCodeSelectorSpinner) findViewById(C6622f.region_code_spinner);
        this.f33449e.setLabel(getContext().getString(C6625i.wallet_uic_address_field_country));
        this.f33448d = (TextView) findViewById(C6622f.region_code_text);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f33449e.setEnabled(z);
        this.f33448d.setEnabled(z);
    }

    public void setFormHeader(h hVar) {
        this.f33450f = hVar;
        if (hVar != null) {
            setUiReference(hVar.b);
        }
    }

    public void setUiReference(long j) {
        this.f33449e.setUiReference(j);
    }

    public void setLogContext(LogContext logContext) {
        this.f33449e.setLogContext(logContext);
    }

    public void setRegionCodes(int[] iArr) {
        if (iArr.length == 1) {
            this.f33449e.setRegionCodeSelectedListener(null);
            this.f33449e.setVisibility(8);
            this.f33448d.setText(C6553f.m29741b(iArr[0]));
            mo5568a(iArr[0], getId(), false);
            this.f33448d.setVisibility(0);
            this.f33451g = true;
        } else {
            this.f33449e.setRegionCodeSelectedListener(this);
            this.f33449e.setRegionCodes(iArr);
            this.f33449e.setVisibility(0);
            this.f33448d.setVisibility(8);
            this.f33451g = false;
        }
        this.f33452h = true;
    }

    public final void m30671a(int i) {
        if (this.f33452h) {
            this.f33453i = i;
            if (!this.f33451g) {
                FormSpinner formSpinner = this.f33449e;
                if (formSpinner.getAdapter() == null) {
                    throw new IllegalStateException("Populate selector with region codes before setting the selected Region Code");
                } else if (i != 0 && i != formSpinner.getSelectedRegionCode()) {
                    int position = ((bw) formSpinner.getAdapter()).getPosition(Integer.valueOf(i));
                    if (position >= 0) {
                        formSpinner.setNonUserInputSelection(position);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("setRegionCodes() must be called before setSelectedRegionCode()");
    }

    public void setRegionCodeSelectedListener(bv bvVar) {
        this.f33454j = bvVar;
    }

    public View getIconAlignToView() {
        return this.f33451g ? this.f33448d : this.f33449e;
    }

    public int getSelectedRegionCode() {
        if (this.f33451g) {
            return this.f33453i;
        }
        return this.f33449e.getSelectedRegionCode();
    }

    public e getFieldValue() {
        e eVar = new e();
        eVar.a = this.f33450f.a;
        eVar.b = this.f33450f.c;
        eVar.c = C6563p.m29793a(getSelectedRegionCode());
        return eVar;
    }

    public final void mo5568a(int i, int i2, boolean z) {
        int i3 = 0;
        boolean z2 = z && i != this.f33453i;
        this.f33453i = i;
        if (this.f33454j != null) {
            this.f33454j.mo5568a(i, getId(), z2);
        }
        if (z2) {
            int size = this.f33456l.size();
            while (i3 < size) {
                C6515e c6515e = (C6515e) this.f33456l.get(i3);
                if (c6515e.f32578a.c().a == null) {
                    this.f33455k.mo5460a(c6515e);
                } else if (Pattern.compile(c6515e.f32578a.c().a.b).matcher(C6563p.m29793a(this.f33453i)).matches()) {
                    this.f33455k.mo5460a(c6515e);
                }
                i3++;
            }
        }
    }

    public void setTriggerListener(C6512i c6512i) {
        this.f33455k = c6512i;
    }

    public final void mo5456a(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C6515e c6515e = (C6515e) arrayList.get(i);
            if (c6515e.f32578a.d == 1) {
                this.f33456l.add(c6515e);
                i++;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported trigger type: %d", new Object[]{Integer.valueOf(c6515e.f32578a.d)}));
            }
        }
    }

    public final boolean mo5457a(t tVar) {
        if (tVar.d == 1) {
            return false;
        }
        throw new IllegalArgumentException("Unsupported trigger type: " + tVar.d);
    }

    public final boolean cQ_() {
        return this.f33451g || this.f33449e.cQ_();
    }

    public final boolean mo5581e() {
        return this.f33451g || this.f33449e.mo5581e();
    }

    public CharSequence getError() {
        return this.f33451g ? null : this.f33449e.getError();
    }

    public final void mo5578a(CharSequence charSequence, boolean z) {
        if (!this.f33451g) {
            this.f33449e.mo5578a(charSequence, z);
        }
    }

    public final void cT_() {
        if (!this.f33451g) {
            this.f33449e.cT_();
        } else if (this.f33448d.hasFocus() || !this.f33448d.requestFocus()) {
            ci.m30882c(this.f33448d);
        }
    }

    public at getParentFormElement() {
        return this.f33457m;
    }

    public void setParentFormElement(at atVar) {
        this.f33457m = atVar;
    }

    public final String mo5522a(String str) {
        if (this.f33451g) {
            return this.f33448d.getText().toString();
        }
        return this.f33449e.mo5522a(null);
    }
}
