package com.google.android.finsky.br;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

public interface C2162a {
    Intent mo2683a(int i, String str, String str2);

    Intent mo2684a(Context context, int i, String str);

    Intent mo2685a(Context context, Intent intent);

    Intent mo2686a(Context context, Document document, String str);

    Intent mo2687a(Context context, Class cls, String str, String str2);

    Intent mo2688a(PackageManager packageManager, Uri uri, String str);

    Intent mo2689a(Uri uri);

    Intent mo2690a(Uri uri, String str);

    Intent mo2691a(String str, String str2);

    String mo2692a();

    String mo2693a(int i);

    void mo2694a(Context context, ad adVar, C2495w c2495w, String str, boolean z, String str2);

    void mo2695a(Context context, String str, int i, int i2, ab abVar, Fragment fragment);

    void mo2696a(Context context, String str, boolean z, String str2);

    boolean mo2697a(int i, Intent intent);

    boolean mo2698a(Activity activity, Intent intent);

    boolean mo2699a(Context context, Account account, Document document, ab abVar, Fragment fragment, int i);

    boolean mo2700a(Context context, Account account, Document document, ab abVar, Fragment fragment, int i, PurchaseParams purchaseParams);

    boolean mo2701a(Context context, Document document, Account account);

    boolean mo2702a(PackageManager packageManager);

    boolean mo2703a(PackageManager packageManager, int i);

    boolean mo2704a(PackageManager packageManager, Intent intent);

    Intent mo2705b(int i, String str, String str2);

    Intent mo2706b(Context context, int i, String str);

    Intent mo2707b(Context context, Document document, String str);

    Intent mo2708b(Context context, Class cls, String str, String str2);

    Intent mo2709b(PackageManager packageManager, Uri uri, String str);

    Intent mo2710b(Uri uri);

    String mo2711b(int i);

    boolean mo2712b(int i, Intent intent);

    boolean mo2713b(PackageManager packageManager, int i);

    boolean mo2714b(String str, String str2);

    int mo2715c(int i);

    Intent mo2716c(String str, String str2);

    int mo2717d(int i);

    int mo2718e(int i);
}
