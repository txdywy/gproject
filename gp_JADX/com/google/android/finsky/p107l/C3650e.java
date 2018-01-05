package com.google.android.finsky.p107l;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.wireless.android.finsky.dfe.a.a.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

final /* synthetic */ class C3650e implements Runnable {
    public final C3648c f18043a;

    C3650e(C3648c c3648c) {
        this.f18043a = c3648c;
    }

    public final void run() {
        C3648c c3648c = this.f18043a;
        List<Account> cX = c3648c.f18030a.cX();
        int hashCode = c3648c.f18036g.hashCode();
        int i = hashCode;
        for (Account hashCode2 : cX) {
            i = hashCode2.hashCode() ^ i;
        }
        Collection a = c3648c.f18032c.mo2855a();
        HashMap hashMap = new HashMap();
        List arrayList = new ArrayList();
        c3648c.m17250a(a, hashMap, arrayList, cX);
        hashCode = C3648c.m17249a((Collection) arrayList, i);
        List arrayList2 = new ArrayList();
        int[] iArr = new int[]{0};
        int[] iArr2 = new int[]{0};
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < cX.size(); i2++) {
            String str;
            Account account = (Account) cX.get(i2);
            List list = (List) hashMap.get(account);
            int a2 = C3648c.m17249a((Collection) list, i);
            if (TextUtils.isEmpty(c3648c.f18037h)) {
                str = account.name;
            } else {
                str = account.name;
                String str2 = c3648c.f18037h;
                str = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append("/").append(str2).toString();
            }
            C0957n b = C0954a.f5819O.m5777b(str);
            C0957n b2 = C0954a.f5807C.m5777b(str);
            i a3 = c3648c.m17251a(hashCode, ((Integer) b2.m5760a()).intValue(), arrayList, a2, ((Integer) b.m5760a()).intValue(), list);
            if (a3 != null) {
                arrayList2.add(account);
                arrayList4.add(a3);
                arrayList3.add(Integer.valueOf(i2));
                arrayList5.add(new C3652g(c3648c, b2, hashCode, b, a2, iArr, iArr2, arrayList2, account));
            }
        }
        c3648c.m17256a(arrayList2, iArr, iArr2, (List) arrayList4, (List) arrayList5, (List) arrayList3);
    }
}
