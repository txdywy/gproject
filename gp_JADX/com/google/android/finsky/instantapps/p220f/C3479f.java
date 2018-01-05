package com.google.android.finsky.instantapps.p220f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.p011c.p012a.C0054l;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.instantapps.p218e.C3426j;
import com.google.android.finsky.instantapps.p218e.C3453i;
import com.google.android.instantapps.common.p219f.C3472a;
import com.google.android.instantapps.common.p219f.C3474b;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C3479f extends C3472a implements C3426j {
    public Context f17674c;
    public final C3485l f17675d;
    public final C3453i f17676e;
    public ArrayList f17677f = new ArrayList();

    public C3479f(C3485l c3485l, C3453i c3453i) {
        this.f17675d = c3485l;
        this.f17676e = c3453i;
    }

    public final void m17053a(List list) {
        this.f17677f.clear();
        for (String c3482i : list) {
            this.f17677f.add(new C3482i(c3482i));
        }
        this.f17676e.mo3530a(list, this);
        this.f3433a.m3638b();
    }

    public final void mo3535a(C3474b c3474b, int i) {
        if (this.f17677f.isEmpty()) {
            ((C3486m) c3474b).f17687t.setText(C7582R.string.instant_apps_settings_excluded_apps_no_apps_text);
            return;
        }
        C3482i c3482i = (C3482i) this.f17677f.get(i);
        C3483j c3483j = (C3483j) c3474b;
        Drawable a = C0054l.m66a(this.f17674c.getResources(), C7582R.drawable.ic_cancel, null);
        CharSequence string = this.f17674c.getString(C7582R.string.instant_apps_excluded_app_remove_button_label, new Object[]{c3482i.f17681b});
        Runnable c3480g = new C3480g(this, c3482i);
        c3483j.f17684u.setText(c3482i.f17681b);
        c3483j.f17683t.setImageBitmap(c3482i.f17682c);
        c3483j.f17685v.setContentDescription(string);
        c3483j.f17685v.setImageDrawable(a);
        c3483j.f17685v.setOnClickListener(new C3484k(c3480g));
    }

    public final int mo1039a() {
        if (this.f17677f.isEmpty()) {
            return 1;
        }
        return this.f17677f.size();
    }

    public final int mo1040a(int i) {
        if (this.f17677f.isEmpty()) {
            return 5;
        }
        return 4;
    }

    public final void mo3526a(String str, String str2) {
        int a = m17048a(str);
        if (a >= 0) {
            ((C3482i) this.f17677f.get(a)).f17681b = str2;
            Collections.sort(this.f17677f, new C3481h());
            this.f3433a.m3638b();
        }
    }

    public final void mo3525a(String str, Bitmap bitmap) {
        int a = m17048a(str);
        if (a >= 0) {
            ((C3482i) this.f17677f.get(a)).f17682c = bitmap;
            m3631c(a);
        }
    }

    final int m17048a(String str) {
        for (int i = 0; i < this.f17677f.size(); i++) {
            if (((C3482i) this.f17677f.get(i)).f17680a.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        this.f17674c = viewGroup.getContext();
        if (i == 5) {
            return new C3486m(LayoutInflater.from(this.f17674c).inflate(C7582R.layout.instant_apps_settings_excluded_apps_message, viewGroup, false));
        }
        return new C3483j(LayoutInflater.from(this.f17674c).inflate(C7582R.layout.instant_apps_settings_excluded_app_row, viewGroup, false));
    }
}
