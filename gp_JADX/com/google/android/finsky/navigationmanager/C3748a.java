package com.google.android.finsky.navigationmanager;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.finsky.cv.p177a.ah;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.eu;
import com.google.android.finsky.cv.p177a.ig;
import com.google.android.finsky.cv.p177a.ik;
import com.google.android.finsky.cv.p177a.io;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.finsky.dfe.h.a.al;

public interface C3748a {
    boolean mo3620A();

    Integer mo3621B();

    Integer mo3622C();

    ViewGroup mo3623D();

    OnClickListener mo3624a(Account account, Document document, int i, C2731v c2731v, String str, int i2, ad adVar, C2495w c2495w);

    OnClickListener mo3625a(OnClickListener onClickListener, Document document);

    OnClickListener mo3626a(Document document, Account account, ad adVar, C2495w c2495w);

    void mo3627a(int i, Bundle bundle);

    void mo3628a(int i, ax axVar, C2495w c2495w, String str);

    void mo3629a(int i, C2495w c2495w);

    void mo3630a(int i, String str, Fragment fragment, boolean z, View... viewArr);

    void mo3631a(Account account, Document document, int i, C2731v c2731v, String str, boolean z, C2495w c2495w);

    void mo3632a(Account account, Document document, String str, int i);

    void mo3633a(Account account, Document document, boolean z);

    void mo3634a(Context context, C2495w c2495w);

    void mo3635a(Uri uri, String str, C2495w c2495w);

    void mo3636a(Bundle bundle);

    void mo3637a(android.support.v4.app.ad adVar);

    void mo3638a(ah ahVar, C2495w c2495w);

    void mo3639a(eu euVar, DfeToc dfeToc, PackageManager packageManager, C2495w c2495w);

    void mo3640a(eu euVar, String str, DfeToc dfeToc, PackageManager packageManager, C2495w c2495w);

    void mo3641a(eu euVar, String str, DfeToc dfeToc, PackageManager packageManager, Document document, String str2, int i, int i2, String str3, int i3, C2495w c2495w);

    void mo3642a(ik ikVar);

    void mo3643a(ip ipVar, String str, int i, DfeToc dfeToc, ad adVar, int i2, C2495w c2495w);

    void mo3644a(ip ipVar, String str, String str2, int i, C2495w c2495w);

    void mo3645a(C2495w c2495w);

    void mo3646a(DfeToc dfeToc, C2495w c2495w);

    void mo3647a(DfeToc dfeToc, C2495w c2495w, int i);

    void mo3648a(DfeToc dfeToc, String str, int i, C2495w c2495w);

    void mo3649a(DfeToc dfeToc, String str, C2495w c2495w);

    void mo3650a(DfeToc dfeToc, String str, boolean z, C2495w c2495w);

    void mo3651a(Document document, int i);

    void mo3652a(Document document, int i, int i2);

    void mo3653a(Document document, View view, C2495w c2495w);

    void mo3654a(Document document, ad adVar, View view, C2495w c2495w);

    void mo3655a(Document document, ad adVar, C2495w c2495w);

    void mo3656a(Document document, ad adVar, View[] viewArr, C2495w c2495w);

    void mo3657a(Document document, C2495w c2495w);

    void mo3658a(Document document, String str, String str2, String str3, C2495w c2495w);

    void mo3659a(Document document, String str, String str2, String str3, boolean z, C2495w c2495w);

    void mo3660a(Document document, String str, boolean z, C2495w c2495w);

    void mo3661a(C3758b c3758b);

    void mo3662a(String str);

    void mo3663a(String str, int i, int i2, ad adVar, int i3, C2495w c2495w);

    void mo3664a(String str, int i, C2495w c2495w, ad adVar);

    void mo3665a(String str, ax axVar, String str2, String str3, String str4, C2495w c2495w);

    void mo3666a(String str, ax axVar, String str2, String str3, String str4, boolean z, C2495w c2495w);

    void mo3667a(String str, ax axVar, boolean z, long j, byte[] bArr, C2495w c2495w);

    void mo3668a(String str, ax axVar, boolean z, C2495w c2495w);

    void mo3669a(String str, ig igVar, C2495w c2495w);

    void mo3670a(String str, io ioVar, C2495w c2495w);

    void mo3671a(String str, C2495w c2495w);

    void mo3672a(String str, String str2, int i, int i2, ad adVar, int i3, C2495w c2495w);

    void mo3673a(String str, String str2, int i, int i2, DfeToc dfeToc, ad adVar, C2495w c2495w);

    void mo3674a(String str, String str2, int i, DfeToc dfeToc, C2495w c2495w);

    void mo3675a(String str, String str2, String str3, String str4);

    void mo3676a(String str, String str2, String str3, String str4, C2495w c2495w);

    void mo3677a(String str, String str2, boolean z, int i, int i2, DfeToc dfeToc, ad adVar, C2495w c2495w);

    void mo3678a(boolean z);

    void mo3679a(al[] alVarArr, String str, int i, boolean z);

    boolean mo3680a();

    boolean mo3681a(int i);

    boolean mo3682a(C2495w c2495w, boolean z);

    String mo3683b();

    void mo3684b(int i);

    void mo3685b(Bundle bundle);

    void mo3686b(android.support.v4.app.ad adVar);

    void mo3687b(C2495w c2495w);

    void mo3688b(DfeToc dfeToc, C2495w c2495w);

    void mo3689b(DfeToc dfeToc, String str, C2495w c2495w);

    void mo3690b(Document document, C2495w c2495w);

    void mo3691b(String str);

    void mo3692b(String str, C2495w c2495w);

    void mo3693b(String str, String str2, int i, DfeToc dfeToc, C2495w c2495w);

    void mo3694b(boolean z);

    boolean mo3695b(C2495w c2495w, boolean z);

    void mo3696c();

    void mo3697c(int i);

    void mo3698c(C2495w c2495w);

    void mo3699d(C2495w c2495w);

    boolean mo3700d();

    void mo3701e();

    void mo3702e(C2495w c2495w);

    void mo3703f();

    void mo3704f(C2495w c2495w);

    int mo3705g();

    boolean mo3706h();

    void mo3707i();

    ab mo3708j();

    Fragment mo3709k();

    C2495w mo3710l();

    ad mo3711m();

    ad mo3712n();

    boolean mo3713o();

    boolean mo3714q();

    boolean mo3715r();

    int mo3716s();

    void mo3717t();

    Document mo3718u();

    int mo3719v();

    boolean mo3720w();

    void mo3721x();

    boolean mo3722y();

    boolean mo3723z();
}
