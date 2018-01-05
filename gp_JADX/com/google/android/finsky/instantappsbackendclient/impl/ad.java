package com.google.android.finsky.instantappsbackendclient.impl;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.instantapps.common.C5802i;
import com.google.android.p102c.C0925g;
import com.google.e.a.a.a.a.a.d;
import com.google.e.a.a.a.a.a.g;
import com.google.protobuf.nano.C0757i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

final class ad {
    public final AccountManager f17862a;
    public final Resources f17863b;
    public final C3574a f17864c;
    public final String f17865d;
    public final ContentResolver f17866e;

    ad(Context context, Resources resources, AccountManager accountManager, C3574a c3574a, String str) {
        this.f17863b = resources;
        this.f17862a = accountManager;
        this.f17864c = c3574a;
        this.f17865d = str;
        this.f17866e = context.getContentResolver();
    }

    static String m17157a(int i, C0757i c0757i, String str) {
        String str2 = (String) C5802i.f29258a.m26938b();
        Builder buildUpon = Uri.parse(new StringBuilder((String.valueOf(str2).length() + 8) + String.valueOf(str).length()).append("https://").append(str2).append(str).toString()).buildUpon();
        if (i == 0) {
            buildUpon.appendQueryParameter("$req", Base64.encodeToString(C0757i.m4909a(c0757i), 10));
        }
        return buildUpon.build().toString();
    }

    final Map m17160a(String str) {
        Throwable e;
        Map hashMap = new HashMap();
        Account account = null;
        Account[] accountsByType = this.f17862a.getAccountsByType("com.google");
        int length = accountsByType.length;
        int i = 0;
        while (i < length) {
            Account account2 = accountsByType[i];
            if (!str.equals(account2.name)) {
                account2 = account;
            }
            i++;
            account = account2;
        }
        if (account != null) {
            try {
                AccountManager accountManager = this.f17862a;
                String str2 = "oauth2:";
                String valueOf = String.valueOf(this.f17865d);
                CharSequence blockingGetAuthToken = accountManager.blockingGetAuthToken(account, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), false);
                if (TextUtils.isEmpty(blockingGetAuthToken)) {
                    throw new AuthStateException("Fetched auth token is undefined");
                }
                String str3 = "Authorization";
                String str4 = "Bearer ";
                valueOf = String.valueOf(blockingGetAuthToken);
                hashMap.put(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                hashMap.put("Content-Type", "application/x-protobuf");
                return hashMap;
            } catch (OperationCanceledException e2) {
                e = e2;
                throw new AuthStateException("Couldn't get auth token", e);
            } catch (IOException e3) {
                e = e3;
                throw new AuthStateException("Couldn't get auth token", e);
            } catch (AuthenticatorException e4) {
                e = e4;
                throw new AuthStateException("Couldn't get auth token", e);
            }
        }
        throw new AuthStateException("Opted-in account does not exist on device.");
    }

    static byte[] m17158a(int i, C0757i c0757i) {
        if (i != 0 && i == 1) {
            return C0757i.m4909a(c0757i);
        }
        return null;
    }

    final g m17159a() {
        int i = 0;
        g gVar = new g();
        if (VERSION.SDK_INT < 23 || VERSION.PREVIEW_SDK_INT <= 0) {
            gVar.a = VERSION.SDK_INT;
        } else {
            gVar.a = 10000;
        }
        gVar.c = this.f17864c.m17147a();
        gVar.b = this.f17864c.m17148b();
        gVar.e = false;
        d dVar = new d();
        dVar.a = 0;
        gVar.d = dVar;
        gVar.h = C0925g.m5650a(this.f17866e, "android_id", 0);
        if (VERSION.SDK_INT >= 24) {
            LocaleList locales = this.f17863b.getConfiguration().getLocales();
            if (locales.size() > 0) {
                gVar.f = new String[locales.size()];
                while (i < locales.size()) {
                    gVar.f[i] = locales.get(i).toLanguageTag();
                    i++;
                }
            }
            gVar.g = true;
        } else {
            gVar.f = new String[]{this.f17863b.getConfiguration().locale.toLanguageTag()};
        }
        return gVar;
    }
}
