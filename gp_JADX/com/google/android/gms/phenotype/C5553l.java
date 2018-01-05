package com.google.android.gms.phenotype;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.tasks.C5587d;
import com.google.android.gms.tasks.C5591h;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class C5553l {
    public final C5547f f28466a;
    public final String f28467b;
    public long f28468c;

    @Deprecated
    public C5553l(C5058o c5058o, String str) {
        this(C5502b.m26420a(c5058o.mo4552b()), str);
    }

    private C5553l(C5547f c5547f, String str) {
        this.f28466a = c5547f;
        this.f28467b = str;
        this.f28468c = 2000;
    }

    public abstract void mo5159a(Configurations configurations);

    public final boolean m26539a(String str, int i) {
        Throwable e;
        while (i > 0) {
            C5587d a = this.f28466a.m23220a(new C5555n(this.f28467b, str));
            try {
                C5591h.m26586a(a, this.f28468c, TimeUnit.MILLISECONDS);
                mo5159a((Configurations) a.mo5061c());
                try {
                    C5591h.m26586a(this.f28466a.m23220a(new C5556o(((Configurations) a.mo5061c()).f28286a)), this.f28468c, TimeUnit.MILLISECONDS);
                    return true;
                } catch (ExecutionException e2) {
                    e = e2;
                } catch (InterruptedException e3) {
                    e = e3;
                } catch (TimeoutException e4) {
                    e = e4;
                }
            } catch (ExecutionException e5) {
                e = e5;
            } catch (InterruptedException e6) {
                e = e6;
            } catch (TimeoutException e7) {
                e = e7;
            }
        }
        String str2 = "PhenotypeFlagCommitter";
        String str3 = "No more attempts remaining, giving up for ";
        String valueOf = String.valueOf(this.f28467b);
        Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        return false;
        str3 = this.f28467b;
        Log.w("PhenotypeFlagCommitter", new StringBuilder(String.valueOf(str3).length() + 41).append("Committing snapshot for ").append(str3).append(" failed, retrying").toString(), e);
        i--;
        str3 = this.f28467b;
        Log.e("PhenotypeFlagCommitter", new StringBuilder(String.valueOf(str3).length() + 31).append("Retrieving snapshot for ").append(str3).append(" failed").toString(), e);
        return false;
    }

    public static void m26537a(SharedPreferences sharedPreferences, Configurations configurations) {
        Editor edit = sharedPreferences.edit();
        if (!configurations.f28289d) {
            edit.clear();
        }
        for (Configuration configuration : configurations.f28288c) {
            if (configuration != null) {
                String str;
                for (String str2 : configuration.f28284c) {
                    edit.remove(str2);
                }
                for (Flag flag : configuration.f28283b) {
                    switch (flag.f28308g) {
                        case 1:
                            str2 = flag.f28302a;
                            if (flag.f28308g == 1) {
                                edit.putLong(str2, flag.f28303b);
                                break;
                            }
                            throw new IllegalArgumentException("Not a long type");
                        case 2:
                            str2 = flag.f28302a;
                            if (flag.f28308g == 2) {
                                edit.putBoolean(str2, flag.f28304c);
                                break;
                            }
                            throw new IllegalArgumentException("Not a boolean type");
                        case 3:
                            str2 = flag.f28302a;
                            if (flag.f28308g == 3) {
                                edit.putFloat(str2, (float) flag.f28305d);
                                break;
                            }
                            throw new IllegalArgumentException("Not a double type");
                        case 4:
                            str2 = flag.f28302a;
                            if (flag.f28308g == 4) {
                                edit.putString(str2, flag.f28306e);
                                break;
                            }
                            throw new IllegalArgumentException("Not a String type");
                        case 5:
                            if (flag.f28308g == 5) {
                                edit.putString(flag.f28302a, Base64.encodeToString(flag.f28307f, 3));
                                break;
                            }
                            throw new IllegalArgumentException("Not a bytes type");
                        default:
                            break;
                    }
                }
                continue;
            }
        }
        edit.putString("__phenotype_server_token", configurations.f28287b);
        edit.putString("__phenotype_snapshot_token", configurations.f28286a);
        if (!edit.commit()) {
            Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
        }
    }
}
