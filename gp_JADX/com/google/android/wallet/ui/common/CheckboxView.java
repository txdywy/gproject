package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.a.a.a.a.b.a.b.a.am;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.a.a.a.a.b.a.b.a.u;
import com.google.android.wallet.common.util.C6591c;
import com.google.android.wallet.p366b.C6508h;
import com.google.android.wallet.p366b.C6512i;
import com.google.android.wallet.p366b.C6515e;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.p383e.C6625i;
import java.util.ArrayList;
import java.util.List;

public class CheckboxView extends C6753f implements C6508h {
    public boolean f33319k = false;
    public CharSequence f33320l;
    public OnCheckedChangeListener f33321m;
    public al f33322n;
    public C6512i f33323o;
    public final ArrayList f33324p = new ArrayList();

    public CheckboxView(Context context) {
        super(context);
    }

    public CheckboxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @TargetApi(11)
    public CheckboxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public CheckboxView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setCheckboxUiField(al alVar) {
        this.f33322n = alVar;
        am e = alVar.e();
        switch (e.c) {
            case 1:
                super.m30584a(this.f33310b);
                break;
            case 2:
                super.m30584a(this.f33311c);
                break;
            default:
                throw new IllegalArgumentException("Unknown Checkbox display type: " + e.c);
        }
        ae aeVar = new ae();
        aeVar.e = alVar.h;
        setInfoMessage(aeVar);
        setState(e.a);
        this.f33319k = !alVar.f;
        this.f33320l = e.b;
    }

    public int getDisplayType() {
        if (this.f33322n != null) {
            return this.f33322n.e().c;
        }
        return 0;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        super.onCheckedChanged(compoundButton, z);
        if (this.f33321m != null) {
            this.f33321m.onCheckedChanged(compoundButton, z);
        }
        if (!this.f33318j) {
            C6512i c6512i = this.f33323o;
            List list = this.f33324p;
            long f = m30589f();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C6515e c6515e = (C6515e) list.get(i);
                if (C6516f.m29563a(c6515e.f32578a)) {
                    u c = C6516f.m29568c(c6515e.f32578a);
                    if (c == null || C6591c.m29907a(c.a, f)) {
                        c6512i.mo5460a(c6515e);
                    }
                }
            }
        }
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.f33321m = onCheckedChangeListener;
    }

    public void setState(int i) {
        switch (i) {
            case 0:
            case 3:
                throw new IllegalArgumentException("Unsupported checkbox state: " + i);
            case 1:
                setChecked(true);
                return;
            case 2:
                setChecked(false);
                return;
            default:
                return;
        }
    }

    public int getState() {
        return isChecked() ? 1 : 2;
    }

    public void setTriggerListener(C6512i c6512i) {
        this.f33323o = c6512i;
    }

    public final void mo5456a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C6515e c6515e = (C6515e) arrayList.get(i);
            switch (c6515e.f32578a.d) {
                case 1:
                case 4:
                    this.f33324p.add(c6515e);
                    break;
                case 3:
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported trigger type: " + c6515e.f32578a.d);
            }
        }
    }

    public final boolean mo5457a(t tVar) {
        return C6516f.m29564a(tVar, m30589f());
    }

    private final long m30589f() {
        return isChecked() ? 1 : 0;
    }

    protected final boolean mo5638a() {
        return this.f33319k;
    }

    protected ae getRequiredErrorInfoMessage() {
        String string;
        ae aeVar = new ae();
        if (TextUtils.isEmpty(this.f33320l)) {
            string = getContext().getString(C6625i.wallet_uic_error_field_must_not_be_empty);
        } else {
            string = this.f33320l.toString();
        }
        aeVar.e = string;
        aeVar.h = 4;
        return aeVar;
    }
}
