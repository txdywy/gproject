package com.google.android.wallet.common.p376a;

import android.accounts.Account;
import android.app.Activity;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.a.ag;
import com.android.volley.r;
import com.google.a.a.a.a.b.a.c.d;
import com.google.android.wallet.C6491a;
import com.google.android.wallet.common.p367c.p368a.C6568a;
import com.google.android.wallet.common.p367c.p368a.C6571e;
import com.google.android.wallet.common.p367c.p368a.C6572f;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.C6600l;
import com.google.p440g.p441a.p442a.C7147b;
import com.google.p443h.p451c.p457c.p458a.p459a.C7167b;
import com.google.p443h.p451c.p457c.p458a.p459a.C7168c;
import com.google.p443h.p451c.p457c.p458a.p459a.C7169d;
import com.google.p443h.p451c.p457c.p460b.p467d.C7178b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class C6562o implements C6550c {
    public final r f32678a;
    public final Activity f32679b;
    public final Account f32680c;
    public final C7178b f32681d;
    public d f32682e;
    public C6568a f32683f;

    public C6562o(Activity activity, C7178b c7178b, Account account, r rVar) {
        this.f32679b = activity;
        this.f32681d = c7178b;
        this.f32680c = account;
        this.f32678a = rVar;
    }

    public final String mo5511a() {
        return "OrchestrationAddressSource";
    }

    public final List mo5512a(CharSequence charSequence, char c, char[] cArr, int i, String str) {
        int i2 = 0;
        List arrayList = new ArrayList();
        String charSequence2 = charSequence.toString();
        if (!(TextUtils.isEmpty(charSequence2) || c == 'Z' || c == 'N')) {
            if (this.f32682e == null) {
                this.f32682e = C6600l.m29940a(this.f32679b, 0, null, com.google.android.gms.common.d.a(this.f32679b) == 0, C6491a.f32500a, C6491a.f32501b, C6589a.m29894a(this.f32679b));
            }
            if (this.f32683f == null) {
                this.f32683f = C6568a.m29808a(this.f32679b, this.f32680c, this.f32681d);
            }
            C7168c c7168c = new C7168c();
            c7168c.f34994a = this.f32682e;
            c7168c.f34995b = charSequence2;
            c7168c.f34996c = C6563p.m29793a(i);
            c7168c.f34997d = 3;
            c7168c.f34998e = C6553f.f32655d.get(c, 8);
            C7169d a = m29788a("addressentry/getaddresssuggestion", this.f32683f, c7168c);
            if (a != null) {
                C7167b[] c7167bArr = a.f35001c;
                int length = c7167bArr.length;
                while (i2 < length) {
                    C7167b c7167b = c7167bArr[i2];
                    arrayList.add(new C6551d(charSequence2, c7167b.f34992b.d, Html.fromHtml(c7167b.f34993c.e), "OrchestrationAddressSource"));
                    i2++;
                }
            }
        }
        return arrayList;
    }

    public final C7147b mo5510a(String str, String str2) {
        throw new UnsupportedOperationException(String.format("%s does not use reference identifiers", new Object[]{"OrchestrationAddressSource"}));
    }

    private final C7169d m29788a(String str, C6568a c6568a, C7168c c7168c) {
        Throwable e;
        Object agVar = new ag();
        this.f32678a.a(new C6571e(str, c6568a, c7168c, C7169d.class, new C6572f(agVar), agVar));
        try {
            return (C7169d) agVar.get();
        } catch (InterruptedException e2) {
            e = e2;
        } catch (ExecutionException e3) {
            e = e3;
        }
        Log.e("OrchestrationAddressSou", "Exception sending Volley request", e);
        return null;
    }
}
