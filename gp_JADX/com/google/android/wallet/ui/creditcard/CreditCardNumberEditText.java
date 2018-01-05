package com.google.android.wallet.ui.creditcard;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.a.a.a.a.b.a.a.c.b.a.w;
import com.google.a.a.a.a.b.a.a.c.b.a.x;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.C6794t;
import com.google.android.wallet.ui.common.C6795u;
import com.google.android.wallet.ui.common.FormEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCardNumberEditText extends FormEditText implements OnClickListener {
    public static final int[] f33707d = new int[]{4, 4, 4, 4};
    public String f33708e = "";
    public ColorStateList f33709f;
    public String f33710g;
    public String f33711h;
    public boolean f33712i;
    public C6656e f33713j;
    public x[] f33714k;
    public final ArrayList f33715l = new ArrayList();
    public Pair f33716m;
    public w[] f33717n;
    public w f33718o;
    public boolean f33719p;
    public C6795u f33720q;
    public C6795u f33721r;
    public final TextWatcher f33722s = new C6800d(this);

    public CreditCardNumberEditText(Context context) {
        super(context);
        m30931a(context);
    }

    public CreditCardNumberEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30931a(context);
    }

    public CreditCardNumberEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30931a(context);
    }

    public void setOnCardNumberChangedListener(C6656e c6656e) {
        this.f33713j = c6656e;
    }

    public void setAllowedCardTypes(x[] xVarArr) {
        this.f33714k = xVarArr;
    }

    public void setInvalidBins(w[] wVarArr) {
        this.f33717n = wVarArr;
    }

    public void setInvalidPanMessage(String str) {
        this.f33711h = str;
    }

    public void setNoMatchPanMessage(String str) {
        this.f33710g = str;
    }

    public String getCardNumber() {
        return this.f33708e;
    }

    public String getConcealedCardNumber() {
        int m = mo5663m();
        int min = Math.min(this.f33708e.length(), m - 4);
        char[] cArr = new char[min];
        Arrays.fill(cArr, '•');
        StringBuilder append = new StringBuilder(m).append(cArr);
        if (min < this.f33708e.length()) {
            append.append(this.f33708e.substring(min));
        }
        return m30936b(append.toString());
    }

    public String getLastFourDigits() {
        return this.f33708e.substring(Math.max(0, this.f33708e.length() - 4));
    }

    public x getCardType() {
        return this.f33716m != null ? (x) this.f33716m.first : null;
    }

    public ArrayList getPossibleCardTypeList() {
        return this.f33715l;
    }

    public final boolean mo5623b() {
        return this.f33708e.length() == mo5663m();
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!m30933n()) {
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
        if (getWindowToken() != null && m30933n() && enoughToFilter() && hasFocus()) {
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
        if (this.f33719p) {
            return super.enoughToFilter();
        }
        return getText().length() == 0;
    }

    protected void replaceText(CharSequence charSequence) {
        if (this.f33719p) {
            super.replaceText(charSequence);
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        m30934o();
    }

    public final void m30935a(C6795u c6795u) {
        if (getAdapter() == null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(c6795u);
            setAdapter(new C6794t(getContext(), arrayList));
            setOnClickListener(this);
            return;
        }
        ((C6794t) getAdapter()).add(c6795u);
    }

    private final void m30932b(C6795u c6795u) {
        if (getAdapter() instanceof C6794t) {
            ((C6794t) getAdapter()).remove(c6795u);
        }
    }

    private final boolean m30933n() {
        return getAdapter() != null && getAdapter().getCount() > 0;
    }

    @TargetApi(17)
    private final void m30931a(Context context) {
        setKeyListener(DigitsKeyListener.getInstance("1234567890 "));
        setSingleLine();
        m30934o();
        if (VERSION.SDK_INT >= 17) {
            setTextDirection(3);
        }
        m30503a(this.f33722s);
        m30515b(new C6797a(this));
        String string = context.getString(C6625i.wallet_uic_error_card_number_invalid);
        m30515b(new C6798b(this, string));
        mo5622a(new C6799c(this, string));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C6617a.uicInvalidCardNumberShakeAnimationEnabled});
        this.f33712i = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private final void m30934o() {
        this.f33709f = getTextColors();
    }

    static w m30930a(w[] wVarArr, String str) {
        if (wVarArr == null) {
            return null;
        }
        int length = str.length();
        for (w wVar : wVarArr) {
            int length2 = wVar.b.length();
            if (length >= length2) {
                String substring = str.substring(0, length2);
                if (substring.compareTo(wVar.b) >= 0 && substring.compareTo(wVar.c) <= 0) {
                    return wVar;
                }
            }
        }
        return null;
    }

    final String m30936b(String str) {
        int[] iArr;
        if (this.f33716m != null) {
            iArr = ((w) this.f33716m.second).e;
        } else {
            iArr = f33707d;
        }
        StringBuilder stringBuilder = new StringBuilder((mo5663m() + iArr.length) - 1);
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (iArr[i2] == i) {
                stringBuilder.append(' ');
                i2++;
                i = 0;
            }
            i++;
            stringBuilder.append(str.charAt(i3));
        }
        return stringBuilder.toString();
    }

    final int mo5663m() {
        if (this.f33716m != null) {
            return ((w) this.f33716m.second).d;
        }
        return 16;
    }

    public void setSuggestions(List list) {
        this.f33719p = true;
        if (this.f33720q != null) {
            m30932b(this.f33720q);
            this.f33720q = null;
        }
        if (this.f33721r != null) {
            m30932b(this.f33721r);
            this.f33721r = null;
        }
        setDropDownBackgroundResource(17301657);
        super.setSuggestions(list);
    }
}
