package com.google.android.libraries.play.entertainment.p351m;

import android.content.Context;
import android.support.v4.p037h.C0310e;
import android.support.v4.p037h.C0325v;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C6098k;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;
import com.google.android.libraries.play.entertainment.bitmap.ImageInfo;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.wireless.android.finsky.dfe.g.a.ab;
import com.google.wireless.android.finsky.dfe.g.a.ad;
import com.google.wireless.android.finsky.dfe.g.a.ae;

public final class C6121g {
    public final C0325v f30291a = new C0325v();

    public final C6121g m28115a(int i, Object obj) {
        this.f30291a.m1710a(i, C6116b.m28100a(obj));
        return this;
    }

    public final C6121g m28116a(View view, int i, Class cls) {
        this.f30291a.m1710a(i, (View) cls.cast(C6116b.m28100a(view.findViewById(i))));
        return this;
    }

    public final C6121g m28128b(View view, int i, Class cls) {
        View view2 = (View) cls.cast(view.findViewById(i));
        if (view2 != null) {
            this.f30291a.m1710a(i, view2);
        }
        return this;
    }

    public final Object m28117a(Class cls, int i) {
        return cls.cast(C6116b.m28100a(this.f30291a.m1709a(i)));
    }

    public final Object m28129b(Class cls, int i) {
        return cls.cast(this.f30291a.m1709a(i));
    }

    public final void m28119a(int i) {
        C0325v c0325v = this.f30291a;
        int a = C0310e.m1672a(c0325v.f1769c, c0325v.f1771e, i);
        if (a >= 0 && c0325v.f1770d[a] != C0325v.f1767a) {
            c0325v.f1770d[a] = C0325v.f1767a;
            c0325v.f1768b = true;
        }
    }

    public final void m28122a(ab abVar, int i) {
        CharSequence charSequence;
        if (abVar == null) {
            charSequence = null;
        } else {
            charSequence = abVar.b;
        }
        m28125a(charSequence, i);
    }

    public final void m28125a(CharSequence charSequence, int i) {
        TextView textView = (TextView) m28129b(TextView.class, i);
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void m28130b(CharSequence charSequence, int i) {
        TextView textView = (TextView) m28129b(TextView.class, i);
        if (textView != null) {
            textView.setText(charSequence);
            textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        }
    }

    public final void m28126a(CharSequence charSequence, int i, int i2, Object... objArr) {
        TextView textView = (TextView) m28129b(TextView.class, i);
        if (textView != null) {
            CharSequence string;
            textView.setText(charSequence);
            Context context = textView.getContext();
            if (objArr.length == 0) {
                string = context.getString(i2);
            } else {
                string = context.getString(i2, objArr);
            }
            textView.setContentDescription(string);
        }
    }

    public final void m28127a(String str, int i) {
        TextView textView = (TextView) m28129b(TextView.class, i);
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(C6120f.m28114a(Html.fromHtml(str)));
    }

    public final void m28121a(long j, int i, StringBuilder stringBuilder) {
        TextView textView = (TextView) m28129b(TextView.class, i);
        if (textView != null) {
            textView.setText(DateUtils.formatElapsedTime(stringBuilder, j));
            textView.setContentDescription(textView.getContext().getString(C6098k.pe__content_description_duration, new Object[]{r1}));
        }
    }

    public final void m28120a(int i, int i2) {
        View view = (View) m28129b(View.class, i2);
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public final void m28124a(ae aeVar, int i, String str, int i2, C6032d... c6032dArr) {
        m28123a(aeVar, i, str, i2, null, c6032dArr);
    }

    public final void m28123a(ae aeVar, int i, String str, int i2, ad adVar, C6032d... c6032dArr) {
        PEImageView pEImageView = (PEImageView) m28129b(PEImageView.class, i);
        if (pEImageView == null) {
            return;
        }
        if (aeVar == null) {
            pEImageView.m27921a();
            return;
        }
        ImageInfo a;
        if (!aeVar.f) {
            i2 = 0;
            a = ImageInfo.m27915a(aeVar.c, aeVar.f, aeVar.d, aeVar.e);
        } else if (adVar != null) {
            r2 = String.valueOf(aeVar.c);
            r1 = String.valueOf(str);
            a = ImageInfo.m27916a(r1.length() != 0 ? r2.concat(r1) : new String(r2), aeVar.f, aeVar.d, aeVar.e, adVar);
        } else {
            r2 = String.valueOf(aeVar.c);
            r1 = String.valueOf(str);
            a = ImageInfo.m27915a(r1.length() != 0 ? r2.concat(r1) : new String(r2), aeVar.f, aeVar.d, aeVar.e);
        }
        pEImageView.m27923a(a, i2, c6032dArr);
    }

    public final void m28118a() {
        for (int i = 0; i < this.f30291a.m1708a(); i++) {
            Object d = this.f30291a.m1715d(i);
            if (d instanceof PEImageView) {
                ((PEImageView) d).m27921a();
            }
        }
    }
}
