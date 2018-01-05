package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.a.a.a.a.b.a.b.a.aa;
import com.google.android.wallet.common.util.C6594f;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.ui.date.C6754a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateEditText extends FormEditText implements OnEditorActionListener, C6754a {
    public Pattern f33326d;
    public String f33327e;
    public String f33328f = "";
    public String f33329g = "";
    public String f33330h = "";
    public boolean f33331i;
    public int f33332j;
    public int f33333k;
    public int f33334l;
    public int f33335m;
    public int f33336n;
    public int f33337o;
    public C6594f f33338p;
    public final TextWatcher f33339q = new C6792o(this);

    public DateEditText(Context context) {
        super(context);
        m30596m();
    }

    public DateEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30596m();
    }

    public DateEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30596m();
    }

    public final void m30598a(int i, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "/";
        }
        this.f33327e = str2;
        this.f33326d = Pattern.compile(this.f33327e, 16);
        String valueOf = String.valueOf("0123456789");
        String valueOf2 = String.valueOf(this.f33327e);
        setKeyListener(new by(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 20));
        this.f33337o = i;
        if (TextUtils.isEmpty(str)) {
            str = m30594a(i);
        }
        this.f33338p = new C6594f(str, i, this.f33327e);
        this.f33332j = this.f33338p.f32730a;
        this.f33333k = this.f33338p.f32731b;
        this.f33334l = this.f33338p.f32732c;
        this.f33336n = this.f33338p.f32733d;
        this.f33335m = this.f33338p.f32734e;
    }

    public C6594f getDateFormatter() {
        return this.f33338p;
    }

    public final void m30601a(String str, String str2, int i) {
        if (this.f33337o != 2) {
            throw new IllegalArgumentException("Only setting the month and year is only supported for DateField.YEAR_MONTH");
        }
        this.f33329g = str;
        this.f33330h = str2;
        mo5626a(mo5627c(), i);
    }

    public int getDay() {
        try {
            return Integer.parseInt(this.f33328f);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int getMonth() {
        try {
            return Integer.parseInt(this.f33329g);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int getYear() {
        try {
            if (this.f33336n == 4) {
                return Integer.parseInt(this.f33330h);
            }
            return Integer.parseInt(this.f33330h) + 2000;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    @TargetApi(17)
    private final void m30596m() {
        setSingleLine();
        setOnEditorActionListener(this);
        m30503a(this.f33339q);
        if (VERSION.SDK_INT >= 17) {
            setTextDirection(3);
        }
        m30598a(2, m30594a(2), "/");
    }

    static String m30595a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.length() > 2) {
            str = str.substring(0, 2);
        }
        if (Integer.parseInt(str) > (z ? 31 : 12)) {
            return str.substring(0, 1);
        }
        return str;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 8192) {
            int length = getText().length();
            if (accessibilityEvent.getFromIndex() == length && accessibilityEvent.getToIndex() == length) {
                return false;
            }
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    final void m30599a(int i, boolean z) {
        int i2 = 0;
        Object obj = getText().toString();
        int length = obj.length();
        if (z) {
            if (i > length) {
                i = length;
            } else if (i > 0 && obj.substring(i - 1, i).equals(this.f33327e)) {
                i -= this.f33327e.length();
            }
        } else if (i > length || i == 0) {
            i = length;
        } else {
            while (this.f33326d.matcher(getText().toString()).region(0, i).find()) {
                i2++;
            }
            if ((i2 == this.f33332j && C6600l.m29969e(this.f33328f)) || ((i2 == this.f33333k && C6600l.m29968d(this.f33329g)) || (i2 == this.f33334l && this.f33330h.length() == this.f33336n))) {
                Matcher matcher = this.f33326d.matcher(obj);
                if (matcher.find(i)) {
                    i = matcher.end();
                }
            }
        }
        setSelection(Math.min(i, getText().length()));
    }

    final String mo5627c() {
        return this.f33338p.m29922a(this.f33328f, this.f33329g, this.f33330h);
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (i) {
            case 5:
                int selectionStart = textView.getSelectionStart();
                if (selectionStart == textView.getSelectionEnd()) {
                    Object obj = getText().toString();
                    Matcher matcher = this.f33326d.matcher(obj);
                    matcher.region(selectionStart, obj.length());
                    if (matcher.find()) {
                        setSelection(matcher.end());
                        return true;
                    }
                }
                break;
        }
        return false;
    }

    public final boolean mo5623b() {
        if (getSelectionEnd() != getText().length()) {
            return false;
        }
        int i = this.f33335m - 1;
        if (i == this.f33332j) {
            return C6600l.m29969e(this.f33328f);
        }
        if (i == this.f33333k) {
            return C6600l.m29968d(this.f33329g);
        }
        if (i == this.f33334l && this.f33336n == this.f33330h.length()) {
            return true;
        }
        return false;
    }

    protected final void mo5642a(aa aaVar, boolean z) {
        throw new UnsupportedOperationException("Template formatting schemes are not supported for DateEditText");
    }

    public final void mo5641a(int i, int i2) {
        throw new UnsupportedOperationException("Setting minimum/maximum length is not supported for DateEditText");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 16 && this.f33331i) {
            this.f33331i = false;
        } else {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    private static String m30594a(int i) {
        switch (i) {
            case 1:
                return "M/d/yyyy";
            case 2:
                return "M/yy";
            default:
                throw new IllegalArgumentException(i + " not a supported DateField.type");
        }
    }
}
