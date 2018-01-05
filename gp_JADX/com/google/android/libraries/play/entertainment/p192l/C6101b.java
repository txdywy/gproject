package com.google.android.libraries.play.entertainment.p192l;

import android.accounts.Account;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6119e;
import java.util.Locale;

public abstract class C6101b {
    public final Account f30259a;
    public final String f30260b;

    public C6101b(Account account, String str) {
        boolean z = (mo5296c() && account == null) ? false : true;
        C6116b.m28103a(z);
        this.f30259a = account;
        this.f30260b = (String) C6116b.m28099a((CharSequence) str);
    }

    public abstract int mo5294a();

    public abstract String mo5295b();

    public abstract boolean mo5296c();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6101b c6101b = (C6101b) obj;
        if (C6119e.m28112a(this.f30259a, c6101b.f30259a) && this.f30260b.equals(c6101b.f30260b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((C6119e.m28111a(this.f30259a) + 589) * 31) + mo5294a()) * 31) + this.f30260b.hashCode();
    }

    public String toString() {
        return String.format(Locale.US, "BlobId[acct=%s,type=%s,id=%s", new Object[]{this.f30259a, mo5295b(), this.f30260b});
    }
}
