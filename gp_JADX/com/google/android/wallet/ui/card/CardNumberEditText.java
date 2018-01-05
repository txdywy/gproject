package com.google.android.wallet.ui.card;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.a.a.a.a.b.a.a.c.b.a.t;
import com.google.a.a.a.a.b.a.a.c.b.a.u;
import com.google.a.a.a.a.b.a.b.a.aa;
import com.google.a.a.a.a.b.a.b.a.ab;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.ui.common.C6794t;
import com.google.android.wallet.ui.common.C6795u;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.bl;
import java.util.ArrayList;

public class CardNumberEditText extends FormEditText implements OnClickListener {
    public static final aa f33244d;
    public String f33245e = "";
    public ColorStateList f33246f;
    public boolean f33247g;
    public C6647i f33248h;
    public String f33249i;
    public String f33250j;
    public u[] f33251k;
    public int[] f33252l;
    public boolean f33253m = true;
    public u f33254n;
    public t[] f33255o;
    public int[] f33256p;
    public t f33257q;
    public C6795u f33258r;
    public C6795u f33259s;
    public final TextWatcher f33260t = new C6743h(this);

    public CardNumberEditText(Context context) {
        super(context);
        m30531n();
    }

    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30531n();
    }

    public CardNumberEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30531n();
    }

    public void setOnPanCategoryChangedListener(C6647i c6647i) {
        this.f33248h = c6647i;
    }

    public void setAllowedPanCategories(u[] uVarArr) {
        this.f33251k = uVarArr;
        this.f33252l = new int[uVarArr.length];
    }

    public void setExcludedPanCategories(t[] tVarArr) {
        this.f33255o = tVarArr;
        this.f33256p = new int[tVarArr.length];
    }

    public void setNoMatchPanMessage(String str) {
        this.f33249i = str;
    }

    public void setInvalidPanMessage(String str) {
        this.f33250j = str;
    }

    public final void mo5626a(CharSequence charSequence, int i) {
        m30536a(charSequence.toString(), false);
        super.mo5626a(charSequence, i);
    }

    protected String getIncompleteErrorMessage() {
        return this.f33250j;
    }

    public String getCardNumber() {
        return this.f33245e;
    }

    public String getConcealedCardNumber() {
        int i;
        if (this.f33254n != null) {
            i = this.f33254n.g;
        } else {
            i = 4;
        }
        int size = this.an.size() - i;
        StringBuilder stringBuilder = new StringBuilder(getText());
        int length = stringBuilder.length();
        for (int i2 = 0; i2 < size; i2++) {
            i = ((Integer) this.an.get(i2)).intValue();
            if (i >= length) {
                break;
            }
            stringBuilder.setCharAt(i, '•');
        }
        return stringBuilder.toString();
    }

    public final String mo5522a(String str) {
        if (!mo5581e()) {
            return "";
        }
        String substring = this.f33245e.substring(this.f33245e.length() - this.f33254n.g);
        if (this.f33254n.l != null) {
            bl blVar = new bl(this.f33254n.l);
            if (blVar.m30756a(1)) {
                blVar.m30754a(1, this.f33254n.b);
            }
            if (blVar.m30756a(2)) {
                blVar.m30754a(2, substring);
            }
            if (blVar.m30755a()) {
                return blVar.m30757b();
            }
            throw new IllegalArgumentException("Card summary template contains unknown component references.");
        } else if (TextUtils.isEmpty(this.f33254n.b)) {
            return String.format("• • • %1$s", new Object[]{substring});
        } else {
            return String.format("%1$s  • • • %2$s", new Object[]{this.f33254n.b, substring});
        }
    }

    public u getPanCategory() {
        return this.f33254n;
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!m30530m()) {
            return;
        }
        if (z) {
            mo5627c();
        } else {
            dismissDropDown();
        }
    }

    public void onClick(View view) {
        if (view == this) {
            mo5627c();
        }
    }

    public final void mo5627c() {
        if (getWindowToken() != null && m30530m() && enoughToFilter() && hasFocus()) {
            showDropDown();
            setError(null);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo5627c();
        }
    }

    public boolean enoughToFilter() {
        return getText().length() == 0;
    }

    protected void replaceText(CharSequence charSequence) {
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        m30532o();
    }

    final void m30534a(C6795u c6795u) {
        if (getAdapter() == null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(c6795u);
            setAdapter(new C6794t(getContext(), arrayList));
            setOnClickListener(this);
            return;
        }
        ((C6794t) getAdapter()).add(c6795u);
    }

    private final boolean m30530m() {
        return getAdapter() != null && getAdapter().getCount() > 0;
    }

    @TargetApi(17)
    private final void m30531n() {
        m30532o();
        setInputType(2);
        setTemplateFormattingScheme(f33244d);
        if (VERSION.SDK_INT >= 17) {
            setTextDirection(3);
        }
        m30503a(this.f33260t);
        m30515b(new C6740e(this));
        m30515b(new C6741f(this));
        mo5622a(new C6742g(this));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C6617a.uicInvalidCardNumberShakeAnimationEnabled});
        this.f33247g = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private final void m30532o() {
        this.f33246f = getTextColors();
    }

    final void m30536a(String str, boolean z) {
        u uVar = this.f33254n;
        boolean startsWith = str.startsWith(this.f33245e);
        this.f33245e = str;
        this.f33254n = null;
        this.f33253m = false;
        int length = this.f33251k.length;
        int i = 0;
        boolean z2 = false;
        while (i < length) {
            if (!startsWith || this.f33252l[i] == 0) {
                this.f33252l[i] = m30529a(this.f33251k[i].c, str);
            }
            if (!this.f33253m && this.f33252l[i] == 0) {
                this.f33253m = true;
                this.f33254n = null;
            }
            if (!this.f33253m && this.f33252l[i] > r0) {
                this.f33254n = this.f33251k[i];
                z2 = this.f33252l[i];
            }
            i++;
        }
        this.f33257q = null;
        i = this.f33255o.length;
        int i2 = 0;
        while (i2 < i) {
            if (!startsWith || this.f33256p[i2] == 0) {
                this.f33256p[i2] = m30529a(this.f33255o[i2].b, str);
            }
            if (this.f33257q == null && this.f33256p[i2] > 0) {
                this.f33257q = this.f33255o[i2];
            }
            i2++;
        }
        if (!C6600l.m29950a(uVar, this.f33254n)) {
            if (this.f33254n == null || this.f33254n.e == null) {
                mo5642a(f33244d, z);
            } else {
                mo5642a(this.f33254n.e, z);
                if (this.f33254n.f >= 0) {
                    mo5641a(this.f33254n.f, this.an.size());
                }
            }
            if (this.f33248h != null) {
                this.f33248h.mo5552a(this.f33254n);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m30529a(com.google.a.a.a.a.b.a.a.c.b.a.v[] r18, java.lang.String r19) {
        /*
        r0 = r18;
        r9 = r0.length;
        r2 = 0;
        r8 = r2;
    L_0x0005:
        if (r8 >= r9) goto L_0x00c3;
    L_0x0007:
        r10 = r18[r8];
        r4 = r19.length();
        r11 = r10.b;
        if (r4 < r11) goto L_0x0033;
    L_0x0011:
        r2 = 1;
    L_0x0012:
        r3 = 0;
        r6 = r10.c;
        r12 = 0;
        r5 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r5 == 0) goto L_0x003f;
    L_0x001b:
        r6 = r10.c;
        r5 = java.lang.Long.toString(r6);
        r3 = r5.length();
        if (r4 > r3) goto L_0x0037;
    L_0x0027:
        r0 = r19;
        r2 = r5.startsWith(r0);
        if (r2 == 0) goto L_0x0035;
    L_0x002f:
        r2 = 0;
    L_0x0030:
        if (r2 < 0) goto L_0x00be;
    L_0x0032:
        return r2;
    L_0x0033:
        r2 = 0;
        goto L_0x0012;
    L_0x0035:
        r2 = -1;
        goto L_0x0030;
    L_0x0037:
        r0 = r19;
        r5 = r0.startsWith(r5);
        if (r5 == 0) goto L_0x00bb;
    L_0x003f:
        r5 = r11 + -1;
        if (r3 != r5) goto L_0x0061;
    L_0x0043:
        if (r2 != 0) goto L_0x0047;
    L_0x0045:
        r2 = 0;
        goto L_0x0030;
    L_0x0047:
        r2 = 0;
    L_0x0048:
        r3 = r11 + -1;
        r0 = r19;
        r3 = r0.charAt(r3);
        r3 = java.lang.Character.getNumericValue(r3);
        r4 = r10.e;
        r2 = r4[r2];
        r4 = 1;
        r3 = r4 << r3;
        r2 = r2 & r3;
        if (r2 == 0) goto L_0x00bb;
    L_0x005e:
        r2 = r10.b;
        goto L_0x0030;
    L_0x0061:
        if (r2 == 0) goto L_0x007c;
    L_0x0063:
        r4 = r11 + -1;
        r0 = r19;
        r3 = r0.substring(r3, r4);
        r4 = java.lang.Long.parseLong(r3);
        r6 = r4;
    L_0x0070:
        r3 = r10.d;
        r3 = java.util.Arrays.binarySearch(r3, r6);
        if (r3 < 0) goto L_0x00ab;
    L_0x0078:
        if (r2 != 0) goto L_0x00c6;
    L_0x007a:
        r2 = 0;
        goto L_0x0030;
    L_0x007c:
        r4 = r11 - r4;
        r12 = r4 + -1;
        r0 = r19;
        r3 = r0.substring(r3);
        r4 = android.text.TextUtils.isEmpty(r3);
        if (r4 == 0) goto L_0x00a2;
    L_0x008c:
        r4 = 0;
    L_0x008e:
        r6 = 1;
        r6 = r6 + r4;
        r3 = 0;
        r16 = r6;
        r6 = r4;
        r4 = r16;
    L_0x0097:
        if (r3 >= r12) goto L_0x00a7;
    L_0x0099:
        r14 = 10;
        r6 = r6 * r14;
        r14 = 10;
        r4 = r4 * r14;
        r3 = r3 + 1;
        goto L_0x0097;
    L_0x00a2:
        r4 = java.lang.Long.parseLong(r3);
        goto L_0x008e;
    L_0x00a7:
        r12 = 1;
        r4 = r4 - r12;
        goto L_0x0070;
    L_0x00ab:
        r3 = -r3;
        r3 = r3 + -1;
        r6 = r10.d;
        r6 = r6.length;
        if (r3 == r6) goto L_0x00bb;
    L_0x00b3:
        r6 = r10.d;
        r6 = r6[r3];
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0078;
    L_0x00bb:
        r2 = -1;
        goto L_0x0030;
    L_0x00be:
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0005;
    L_0x00c3:
        r2 = -1;
        goto L_0x0032;
    L_0x00c6:
        r2 = r3;
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.card.CardNumberEditText.a(com.google.a.a.a.a.b.a.a.c.b.a.v[], java.lang.String):int");
    }

    static {
        aa aaVar = new aa();
        f33244d = aaVar;
        aaVar.a = new ab[]{new ab()};
        f33244d.a[0].b = "D";
        f33244d.b = "DDDD DDDD DDDD DDDD";
        f33244d.c = false;
    }
}
