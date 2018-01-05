package com.google.android.finsky.notification.impl;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v4.app.cd;
import android.support.v4.app.ce;
import android.support.v4.app.cf;
import android.support.v4.app.cg;
import android.support.v4.app.ch;
import android.support.v4.app.cj;
import android.support.v4.app.cm;
import android.support.v4.os.C0327a;
import android.support.v4.p028a.C0216d;
import android.text.Html;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.gk;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.notification.C1061b;
import com.google.android.finsky.notification.C2182z;
import com.google.android.finsky.notification.C3778a;
import com.google.android.finsky.notification.C3781e;
import com.google.android.finsky.notification.C3782f;
import com.google.android.finsky.notification.C3800x;
import com.google.android.finsky.notification.C3816o;
import com.google.android.finsky.notification.C3817p;
import com.google.android.finsky.notification.C3820u;
import com.google.android.finsky.notification.C3821v;
import com.google.android.finsky.notification.C3823y;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.notification.ac;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.uninstall.bl;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.h.a.ae;
import com.google.wireless.android.finsky.dfe.j.a.f;
import com.squareup.haha.perflib.StackFrame;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p002a.C0002a;

public final class C3803r implements ab {
    public static final int f19095b = "unknown package".hashCode();
    public static final int f19096c = "foreground service".hashCode();
    public final Context f19097a;
    public C1061b f19098d;
    public List f19099e = new ArrayList();
    public C0002a f19100f;
    public C0002a f19101g;
    public C3817p f19102h;
    public C3800x f19103i;
    public ac f19104j;

    public C3803r(Context context) {
        this.f19097a = context;
        ((C1403o) C3947d.m18649a(C1403o.class)).mo1871a(this);
    }

    public final void mo3776a(C1061b c1061b) {
        this.f19098d = c1061b;
    }

    public final void mo3801b(C1061b c1061b) {
        if (this.f19098d == c1061b) {
            this.f19098d = null;
        }
    }

    public final void mo3777a(C2182z c2182z) {
        if (!this.f19099e.contains(c2182z)) {
            this.f19099e.add(c2182z);
        }
    }

    public final void mo3786a(String str, String str2, C2495w c2495w) {
        m18185a(str2, this.f19097a.getString(C7582R.string.internal_space_bar, new Object[]{str}), this.f19097a.getString(C7582R.string.internal_space_title, new Object[]{str}), this.f19097a.getString(C7582R.string.internal_space_message, new Object[]{str}), true, c2495w);
    }

    public final void mo3803b(String str, String str2, C2495w c2495w) {
        m18185a(str2, this.f19097a.getString(C7582R.string.external_space_bar, new Object[]{str}), this.f19097a.getString(C7582R.string.external_space_title, new Object[]{str}), this.f19097a.getString(C7582R.string.external_space_message, new Object[]{str}), false, c2495w);
    }

    private final void m18185a(String str, String str2, String str3, String str4, boolean z, C2495w c2495w) {
        if (this.f19098d == null || this.f19098d.mo1349a(str)) {
            m18189b(str, str2, str3, str4, -1, "err", c2495w);
        } else if (bl.m21377a().m21383b()) {
            this.f19098d.mo1350a(str, str3, str4, 3, c2495w);
        } else {
            int i;
            if (z) {
                i = 47;
            } else {
                i = 48;
            }
            this.f19098d.mo1353b(str, str3, str4, i, c2495w);
        }
    }

    public final void mo3808c(String str, String str2, C2495w c2495w) {
        String str3 = str2;
        m18190b(str3, this.f19097a.getString(C7582R.string.asset_removed_bar, new Object[]{str}), this.f19097a.getString(C7582R.string.asset_removed_title, new Object[]{str}), this.f19097a.getString(C7582R.string.asset_removed_message, new Object[]{str}), "status", c2495w);
    }

    public final void mo3783a(String str, C2495w c2495w) {
        String string = this.f19097a.getString(C7582R.string.malicious_asset_removed_bar, new Object[]{str});
        this.f19097a.getString(C7582R.string.malicious_asset_removed_title, new Object[]{str});
        mo3811e(string, this.f19097a.getString(C7582R.string.malicious_asset_removed_message, new Object[]{str}), c2495w);
    }

    public final void mo3788a(String str, String str2, String str3, int i, boolean z) {
        String string;
        Intent a = C1473m.f7980a.bp().mo4355a(this.f19097a, str, str2, str3, i);
        if (z) {
            string = this.f19097a.getString(C7582R.string.verify_app_disabled_notification_title);
        } else {
            string = this.f19097a.getString(C7582R.string.verify_app_removed_notification_title);
        }
        String string2 = this.f19097a.getString(C7582R.string.verify_app_notification_text, new Object[]{str});
        String concat = "package..removed..".concat(str2);
        m18182a("1.high-priority-notifications", concat, string, string, string2, string2, (int) C7582R.drawable.stat_notify_shield, -1, a, false, null, C3781e.m18030a(concat, string, string2, C7582R.drawable.stat_notify_shield).m18032a(2).m18031a());
    }

    public final void mo3787a(String str, String str2, String str3, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, boolean z) {
        m18177a(str, str2, str3, i, pendingIntent, pendingIntent2, z, this.f19097a.getString(C7582R.string.verify_app_disabled_notification_title));
    }

    public final void mo3804b(String str, String str2, String str3, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, boolean z) {
        String string;
        if (z) {
            string = this.f19097a.getString(C7582R.string.verify_app_disable_request_notification_title);
        } else {
            string = this.f19097a.getString(C7582R.string.verify_app_remove_request_notification_title);
        }
        m18177a(str, str2, str3, i, pendingIntent, pendingIntent2, z, string);
    }

    private final void m18177a(String str, String str2, String str3, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, boolean z, String str4) {
        Intent a = C1473m.f7980a.bp().mo4356a(this.f19097a, str, str2, str3, i, pendingIntent2);
        CharSequence string = z ? this.f19097a.getString(C7582R.string.disable) : this.f19097a.getString(C7582R.string.uninstall);
        String string2 = this.f19097a.getString(C7582R.string.verify_app_notification_text, new Object[]{str});
        int color = this.f19097a.getResources().getColor(C7582R.color.package_malware_notification_color);
        cd cdVar = new cd(C7582R.drawable.ic_delete_gray_24dp, string, pendingIntent);
        String concat = "package..remove..request..".concat(str2);
        m18184a("1.high-priority-notifications", concat, str4, str4, string2, string2, C7582R.drawable.ic_warning_white_24dp, -1, a, false, null, true, "status", color, 2, cdVar, C3781e.m18030a(concat, str4, string2, C7582R.drawable.ic_warning_white_24dp).m18032a(2).m18031a());
    }

    public final void mo3810d(String str, String str2, C2495w c2495w) {
        m18181a(str2, this.f19097a.getString(C7582R.string.external_space_missing_bar, new Object[]{str}), this.f19097a.getString(C7582R.string.external_space_missing_title, new Object[]{str}), this.f19097a.getString(C7582R.string.external_space_missing_message, new Object[]{str, C3803r.m18169a(901, 2)}), c2495w);
    }

    public final void mo3785a(String str, String str2, int i, String str3, boolean z, C2495w c2495w) {
        int i2;
        Context context = this.f19097a;
        switch (i) {
            case 927:
                i2 = C7582R.string.error_while_downloading_timeout_error_title;
                break;
            case 944:
                i2 = C7582R.string.error_while_downloading_outdated_response_title;
                break;
            default:
                if (!z) {
                    i2 = C7582R.string.error_while_downloading_title;
                    break;
                } else {
                    i2 = C7582R.string.error_while_downloading_update_title;
                    break;
                }
        }
        String string = context.getString(i2, new Object[]{str});
        if (str3 == null) {
            switch (i) {
                case 927:
                    i2 = C7582R.string.error_while_downloading_timeout_error_message;
                    break;
                case 944:
                    i2 = C7582R.string.error_while_downloading_outdated_response_message;
                    break;
                default:
                    if (!z) {
                        i2 = C7582R.string.error_while_downloading_message;
                        break;
                    } else {
                        i2 = C7582R.string.error_while_downloading_update_message;
                        break;
                    }
            }
        } else if (z) {
            i2 = C7582R.string.error_while_downloading_update_message_server_message;
        } else {
            i2 = C7582R.string.error_while_downloading_message_server_message;
        }
        context = this.f19097a;
        Object[] objArr = new Object[3];
        objArr[0] = str;
        if (str3 == null) {
            str3 = Integer.valueOf(i);
        }
        objArr[1] = str3;
        objArr[2] = C3803r.m18169a(i, 1);
        m18181a(str2, string, string, context.getString(i2, objArr), c2495w);
    }

    private static String m18169a(int i, int i2) {
        String str;
        switch (i) {
            case 901:
                str = (String) C0955b.fi.m28964b();
                break;
            case 920:
            case 922:
            case 923:
            case 924:
            case 925:
            case 927:
            case 928:
                str = (String) C0955b.ff.m28964b();
                break;
            default:
                switch (i2) {
                    case 1:
                        str = (String) C0955b.fe.m28964b();
                        break;
                    case 2:
                        str = (String) C0955b.fg.m28964b();
                        break;
                    default:
                        str = (String) C0955b.fh.m28964b();
                        break;
                }
        }
        return str.replace("%lang%", Locale.getDefault().getLanguage().toLowerCase());
    }

    public final void mo3796a(String str, String str2, boolean z, boolean z2, Intent intent, C2495w c2495w) {
        int i;
        String str3;
        String str4;
        String str5;
        Context context = this.f19097a;
        if (z) {
            i = C7582R.string.notification_updating_status;
        } else {
            i = C7582R.string.notification_installing_status;
        }
        String format = String.format(context.getString(i), new Object[]{str});
        context = this.f19097a;
        if (z) {
            i = C7582R.string.notification_updating_message;
        } else {
            i = C7582R.string.notification_installing_message;
        }
        String format2 = String.format(context.getString(i), new Object[]{str});
        Intent intent2 = null;
        if ("com.google.android.instantapps.supervisor".equals(str2)) {
            intent2 = C1473m.f7980a.bo().mo2734a(this.f19097a);
            str3 = format2;
            str4 = format;
            str5 = str;
        } else if ("com.google.android.gms".equals(str2)) {
            str4 = this.f19097a.getString(C7582R.string.notification_gmscore_updating_ticker);
            str3 = this.f19097a.getString(C7582R.string.notification_gmscore_updating_content);
            str5 = this.f19097a.getString(C7582R.string.notification_gmscore_updating_title);
        } else if (z2) {
            str4 = this.f19097a.getString(C7582R.string.notification_rapid_update_ticker);
            str3 = this.f19097a.getString(C7582R.string.notification_rapid_update_content);
            str5 = str;
        } else if (intent != null) {
            intent2 = intent;
            str3 = format2;
            str4 = format;
            str5 = str;
        } else if (z) {
            intent2 = C1473m.f7980a.bo().mo2734a(this.f19097a);
            str3 = format2;
            str4 = format;
            str5 = str;
        } else {
            intent2 = C1473m.f7980a.bo().mo2750a(this.f19097a, str2, null, null, C1289l.m7694a(str2), c2495w);
            str3 = format2;
            str4 = format;
            str5 = str;
        }
        m18183a("4.update-completion-notifications", "package installing", str4, str5, str3, null, 17301633, 0, intent2, false, null, "progress", C3781e.m18030a("package installing", str5, str3, 17301633).m18032a(2).m18031a());
    }

    public final void mo3795a(String str, String str2, String str3, boolean z, boolean z2, C2495w c2495w) {
        m18195e("package installing");
        String str4;
        if (z) {
            int i;
            m18195e(str2);
            String str5 = (String) C0954a.af.m5760a();
            String replace = str.replace('\n', ' ');
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str5)) {
                arrayList.addAll(Arrays.asList(str5.split("\n")));
                arrayList.remove(replace);
            }
            arrayList.add(0, replace);
            C0954a.af.m5763a(TextUtils.join("\n", arrayList));
            int size = arrayList.size();
            String format = String.format(this.f19097a.getString(C7582R.string.notification_update_success_status), new Object[]{replace});
            String quantityString = this.f19097a.getResources().getQuantityString(C7582R.plurals.notification_update_success_message, size, new Object[]{Integer.valueOf(size)});
            Resources resources = this.f19097a.getResources();
            switch (size) {
                case 0:
                    FinskyLog.m21665c("App count is 0 in successful update notification", new Object[0]);
                    return;
                case 1:
                    str4 = (String) arrayList.get(0);
                    break;
                case 2:
                    str4 = resources.getString(C7582R.string.multiple_items_2, new Object[]{arrayList.get(0), arrayList.get(1)});
                    break;
                case 3:
                    str4 = resources.getString(C7582R.string.multiple_items_3, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2)});
                    break;
                case 4:
                    str4 = resources.getString(C7582R.string.multiple_items_4, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), arrayList.get(3)});
                    break;
                case 5:
                    str4 = resources.getString(C7582R.string.multiple_items_5, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), arrayList.get(3), arrayList.get(4)});
                    break;
                default:
                    str4 = resources.getString(C7582R.string.notification_multiple_updates_more, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), arrayList.get(3), Integer.valueOf(size - 4)});
                    break;
            }
            if (size <= 1) {
                C3803r.m18170a(902, null, c2495w);
            }
            Intent a = NotificationReceiver.m18050a(c2495w);
            Intent b = NotificationReceiver.m18062b(c2495w);
            if (size > 1) {
                i = C7582R.drawable.stat_notify_installed_collapse;
            } else {
                i = C7582R.drawable.stat_notify_installed;
            }
            m18182a("4.update-completion-notifications", "successful update", format, quantityString, str4, str4, i, -1, a, true, b, C3781e.m18030a("successful update", quantityString, str4, i).m18032a(2).m18031a());
            return;
        }
        format = String.format(this.f19097a.getString(C7582R.string.notification_installation_success_status), new Object[]{str});
        if (!TextUtils.isEmpty(str3)) {
            str4 = this.f19097a.getString(C7582R.string.notification_installation_continue_message);
        } else if (z2 && C1473m.f7980a.dj().mo2294a(12640245)) {
            str4 = this.f19097a.getString(C7582R.string.notification_installation_success_message_for_inline);
        } else {
            str4 = this.f19097a.getString(C7582R.string.notification_installation_success_message);
        }
        C3803r.m18170a(901, null, c2495w);
        m18182a("4.update-completion-notifications", str2, format, str, str4, null, (int) C7582R.drawable.stat_notify_installed, 0, NotificationReceiver.m18053a(str2, str3, c2495w), true, NotificationReceiver.m18052a(str2, c2495w), C3781e.m18030a(str2, str, str4, C7582R.drawable.stat_notify_installed).m18035a(C3816o.m18256a(str2)).m18032a(2).m18031a());
    }

    public final void mo3784a(String str, String str2, int i, C2495w c2495w) {
        int i2 = C7582R.string.install_failed_already_exists;
        m18195e("package installing");
        String string = this.f19097a.getString(C7582R.string.install_failed_bar, new Object[]{str});
        String string2 = this.f19097a.getString(C7582R.string.install_failed_title, new Object[]{str});
        String a = C3803r.m18169a(i, 1);
        switch (i) {
            case -109:
            case -108:
            case -107:
            case -106:
            case -105:
            case -104:
            case -103:
            case -101:
            case -100:
            case -23:
            case -22:
            case -21:
            case -16:
            case -14:
            case -12:
            case -11:
            case -9:
            case -8:
            case -7:
            case StackFrame.NATIVE_METHOD /*-3*/:
            case StackFrame.COMPILED_METHOD /*-2*/:
                i2 = C7582R.string.install_failed_message;
                break;
            case -20:
            case -19:
                i2 = C7582R.string.install_invalid_install_location;
                break;
            case -18:
                i2 = C7582R.string.install_failed_container_error;
                break;
            case -17:
                i2 = C7582R.string.install_failed_missing_feature;
                break;
            case -13:
                i2 = C7582R.string.install_failed_conflicting_provider;
                break;
            case -10:
                i2 = C7582R.string.install_failed_replace_couldnt_delete;
                break;
            case -5:
            case -1:
                break;
            case -4:
                i2 = C7582R.string.install_failed_insufficient_storage;
                break;
            case 980:
                i2 = C7582R.string.install_failed_update_preview_apk;
                break;
            case 982:
                i2 = C7582R.string.install_disallowed_by_policy;
                break;
            default:
                i2 = C7582R.string.install_failed_message;
                break;
        }
        a = this.f19097a.getString(i2, new Object[]{str, Integer.valueOf(i), a});
        if (i == -18) {
            m18185a(str2, string, string2, a, false, c2495w);
            return;
        }
        int i3 = -1;
        if (i == -104) {
            i3 = 1;
        }
        m18180a(str2, string, string2, a, i3, "err", c2495w);
    }

    public final void mo3793a(String str, String str2, String str3, String str4, String str5, C2495w c2495w) {
        String str6 = "err";
        if (this.f19098d == null || !this.f19098d.mo1351a(str4, str, str3, str5, c2495w)) {
            mo3792a(str4, str2, str, str3, 17301642, C1473m.f7980a.bo().mo2750a(this.f19097a, str4, str, str3, str5, c2495w), str6);
        }
    }

    public final void mo3791a(String str, String str2, String str3, C2495w c2495w) {
        m18189b(str2, str3, str, str3, 2, "err", c2495w);
    }

    private final void m18181a(String str, String str2, String str3, String str4, C2495w c2495w) {
        m18190b(str, str2, str3, str4, "err", c2495w);
    }

    private final void m18190b(String str, String str2, String str3, String str4, String str5, C2495w c2495w) {
        m18180a(str, str2, str3, str4, -1, str5, c2495w);
    }

    private final void m18180a(String str, String str2, String str3, String str4, int i, String str5, C2495w c2495w) {
        if (this.f19098d == null || !this.f19098d.mo1350a(str, str3, str4, i, c2495w)) {
            Intent a = C1473m.f7980a.bo().mo2750a(this.f19097a, str, str3, str4, C1289l.m7694a(str), c2495w);
            a.putExtra("error_return_code", i);
            mo3792a(str, str2, str3, str4, 17301642, a, str5);
        }
    }

    private final void m18189b(String str, String str2, String str3, String str4, int i, String str5, C2495w c2495w) {
        if (this.f19098d == null || this.f19098d.mo1349a(str)) {
            String str6;
            String str7;
            if (i == 2) {
                str6 = null;
                str7 = null;
            } else {
                str7 = str4;
                str6 = str3;
            }
            C3781e a = C3803r.m18167a(C3781e.m18030a(str, str3, str4, 17301642).m18036a(C3820u.m18262a(C1473m.f7980a.bo().mo2756a(str, str6, str7, C1289l.m7694a(str))).m18266a("error_return_code", (long) i).m18265a()));
            CharSequence obj = Html.fromHtml(a.f18987a.f18992d).toString();
            int d = C3803r.m18193d(a.f18987a.f18989a);
            cg a2 = new cg(this.f19097a).m1415a(a.f18987a.f18993e).m1426c(str2).m1418a(C4678i.m21812a());
            a2.f1522z = str5;
            a2.f1485C = 0;
            a2.f1507k = m18196f();
            a2 = a2.m1423a(true);
            a2.f1519w = true;
            a2 = a2.m1422a(a.f18987a.f18991c).m1425b(obj);
            a2.m1424a(2, false);
            cg a3 = a2.m1421a(new cf().m1410a(a.f18987a.f18991c).m1412b(obj));
            m18172a(a3, a, c2495w);
            m18188b(a3, a, c2495w);
            m18192c(a3, a, c2495w);
            m18173a(a3, null, d, a);
        }
    }

    public final void mo3811e(String str, String str2, C2495w c2495w) {
        mo3792a(null, str, str, str2, 17301642, C1473m.f7980a.bo().mo2750a(this.f19097a, null, str, str2, null, c2495w), "status");
    }

    public final void mo3792a(String str, String str2, String str3, String str4, int i, Intent intent, String str5) {
        m18179a(str, str2, str3, str4, i, intent, null, str5, true, false, null, false);
    }

    public final void mo3790a(String str, String str2, String str3, Intent intent, PendingIntent pendingIntent, String str4) {
        m18179a(str, null, str2, str3, (int) C7582R.mipmap.ic_round_launcher_play_store, intent, pendingIntent, str4, false, true, null, false);
    }

    public final void mo3789a(String str, String str2, String str3, PendingIntent pendingIntent, String str4, cd cdVar) {
        m18179a(str, null, str2, str3, (int) C7582R.drawable.ic_wear_play_download_white_24dp, null, pendingIntent, str4, false, false, cdVar, true);
    }

    @Deprecated
    private final void m18179a(String str, String str2, String str3, String str4, int i, Intent intent, PendingIntent pendingIntent, String str5, boolean z, boolean z2, cd cdVar, boolean z3) {
        Object obj = Html.fromHtml(str4).toString();
        int d = C3803r.m18193d(str);
        PendingIntent pendingIntent2 = null;
        if (intent != null) {
            if (z2) {
                pendingIntent2 = PendingIntent.getBroadcast(this.f19097a, d, intent, 1342177280);
            } else {
                pendingIntent2 = PendingIntent.getActivity(this.f19097a, d, intent, 1342177280);
            }
        }
        cg a = new cg(this.f19097a).m1415a(i).m1426c(str2).m1418a(System.currentTimeMillis());
        a.f1522z = str5;
        a.f1485C = 0;
        a.f1507k = m18196f();
        a = a.m1423a(z);
        a.f1519w = true;
        a = a.m1422a((CharSequence) str3).m1425b(obj);
        a.m1424a(2, z3);
        a = a.m1421a(new cf().m1410a((CharSequence) str3).m1412b(obj));
        if (pendingIntent != null) {
            a.m1419a(pendingIntent);
        }
        if (pendingIntent2 != null) {
            a.f1501e = pendingIntent2;
        }
        if (cdVar != null) {
            a.m1420a(cdVar);
        }
        m18173a(a, null, d, C3781e.m18030a(str, str3, obj, i).m18032a(2).m18031a());
    }

    public final void mo3794a(String str, String str2, String str3, String str4, String str5, C3820u c3820u, String str6, int i, String str7, int i2, C2495w c2495w) {
        int d = C3803r.m18193d(str2);
        CharSequence obj = Html.fromHtml(str5).toString();
        C3820u a = C3820u.m18262a(c3820u).m18266a("notification_manager.notification_id", (long) d).m18265a();
        Resources resources = this.f19097a.getResources();
        C3781e a2 = C3803r.m18167a(C3781e.m18030a(str2, str4, obj, C7582R.drawable.ic_play_store).m18035a(C3816o.m18254a((int) C7582R.drawable.ic_warning_grey)).m18036a(a).m18034a(new C3778a(str7, C7582R.drawable.ic_arrow_forward, a)).m18039b(i2));
        PendingIntent a3 = m18163a(a, a2, c2495w);
        cg a4 = new cg(this.f19097a).m1415a((int) C7582R.drawable.ic_play_store).m1426c(str3).m1418a(System.currentTimeMillis());
        a4.f1522z = str6;
        a4.f1485C = 0;
        a4.f1507k = m18196f();
        a4 = a4.m1423a(true);
        a4.f1519w = true;
        a4 = a4.m1422a((CharSequence) str4).m1425b(obj);
        a4.f1501e = a3;
        cg a5 = a4.m1421a(new cf().m1410a((CharSequence) str4).m1412b(obj));
        a5.f1484B = resources.getColor(i);
        cg a6 = a5.m1417a(C7582R.drawable.ic_arrow_forward, str7, a3);
        C3803r.m18170a(i2, null, c2495w);
        this.f19102h.m18259a(a2.f18987a.f18994f, str2, new C3807u(this, a6, str, d, a2));
    }

    public final void mo3779a(ae aeVar, String str, boolean z, C2495w c2495w) {
        String b = C3803r.m18186b(aeVar);
        int d = C3803r.m18193d(b);
        Intent a = NotificationReceiver.m18051a(aeVar, "com.android.vending.REMOTE_ESCALATION_CLICKED", str, c2495w);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f19097a, d, NotificationReceiver.m18051a(aeVar, "com.android.vending.REMOTE_ESCALATION_DELETED", str, c2495w), 1342177280);
        cd[] cdVarArr;
        if (aeVar.i == 1 && aeVar.k && !TextUtils.isEmpty(aeVar.h)) {
            cd a2 = m18165a(aeVar, "com.android.vending.REMOTE_ESCALATION_APPROVE_CLICKED", str, (int) C7582R.drawable.ic_checkmark_green, C1592a.f8457f.intValue(), c2495w);
            cd a3 = m18165a(aeVar, "com.android.vending.REMOTE_ESCALATION_DENY_CLICKED", str, (int) C7582R.drawable.ic_clear_grey600_24dp, C1592a.f8458g.intValue(), c2495w);
            cdVarArr = new cd[]{a3, a2};
        } else {
            cdVarArr = new cd[0];
        }
        C3782f a4 = C3781e.m18030a(b, aeVar.d, aeVar.e, C7582R.drawable.ic_play_store).m18037a(str).m18032a(2);
        if (!(aeVar.c == null || TextUtils.isEmpty(aeVar.c.f11860f))) {
            a4.m18035a(C3816o.m18255a(aeVar.c));
        }
        C3781e a5 = a4.m18031a();
        String b2 = C3803r.m18186b(aeVar);
        int d2 = C3803r.m18193d(b2);
        a.putExtra("notification_manager.notification_id", d2);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this.f19097a, d2, a, 1342177280);
        CharSequence charSequence = aeVar.d;
        CharSequence charSequence2 = aeVar.e;
        cg a6 = new cg(this.f19097a).m1418a(System.currentTimeMillis());
        a6.f1522z = "status";
        a6.f1485C = 0;
        a6.f1507k = m18196f();
        a6 = a6.m1423a(true);
        a6.f1519w = true;
        a6 = a6.m1422a(charSequence).m1425b(charSequence2).m1415a((int) C7582R.drawable.ic_play_prism);
        a6.f1501e = broadcast2;
        cg a7 = a6.m1421a(new cf().m1410a(charSequence).m1412b(charSequence2));
        a7.f1517u = aeVar.j;
        cg c = a7.m1426c(charSequence);
        c.f1484B = this.f19097a.getResources().getColor(C7582R.color.play_family_primary);
        if (z) {
            c.m1416a(0, 0);
        }
        if (VERSION.SDK_INT >= 24) {
            c.f1516t = "remote_escalation_group";
        }
        if (broadcast != null) {
            c.m1419a(broadcast);
        }
        for (cd a8 : r2) {
            c.m1420a(a8);
        }
        this.f19102h.m18259a(a5.f18987a.f18994f, b2, new C3808v(this, c, d2, a5));
    }

    public final void mo3778a(ae aeVar) {
        m18195e(C3803r.m18186b(aeVar));
    }

    private static String m18186b(ae aeVar) {
        if (aeVar.j) {
            return "remote.escalation.";
        }
        String str = aeVar.g;
        String str2 = aeVar.h;
        return new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(str2).length()).append("remote.escalation.").append(str).append(str2).toString();
    }

    private final cd m18165a(ae aeVar, String str, String str2, int i, int i2, C2495w c2495w) {
        int d = C3803r.m18193d(C3803r.m18186b(aeVar)) + i;
        return new ce(i, this.f19097a.getResources().getString(i2), PendingIntent.getBroadcast(this.f19097a, d, NotificationReceiver.m18051a(aeVar, str, str2, c2495w), 134217728)).m1408a();
    }

    public final Notification mo3771a(String str, int i, String str2, Intent intent) {
        CharSequence obj = Html.fromHtml(str).toString();
        PendingIntent activity = PendingIntent.getActivity(this.f19097a, f19096c, intent, 1342177280);
        cg cgVar = new cg(this.f19097a);
        cgVar.m1424a(2, true);
        cgVar = cgVar.m1415a(i).m1426c(obj).m1418a(System.currentTimeMillis());
        cgVar.f1522z = "status";
        cgVar.f1485C = 0;
        cgVar.f1507k = m18196f();
        cgVar.f1519w = true;
        cgVar = cgVar.m1425b(obj);
        cgVar.f1501e = activity;
        cg a = cgVar.m1421a(new cf().m1412b(obj));
        if (C0327a.m1722b() && !TextUtils.isEmpty(str2)) {
            a.f1490H = str2;
        }
        return a.m1414a();
    }

    static void m18175a(C3781e c3781e, boolean z) {
        int i = -1;
        if (((Boolean) C0955b.f5891h.m28964b()).booleanValue()) {
            if (c3781e.f18987a.f18997i != null) {
                i = c3781e.f18987a.f18997i.f19149b.getInt("error_return_code", -1);
            }
            String str = z ? "Showing" : "Suppressing";
            FinskyLog.m21659a("%s notification: [ID=%s, Title=%s, Message=%s, returnCode=%d]", str, c3781e.f18987a.f18989a, c3781e.f18987a.f18991c, c3781e.f18987a.f18992d, Integer.valueOf(i));
        }
    }

    final void m18237c(List list, int i, C2495w c2495w) {
        Resources resources = this.f19097a.getResources();
        int size = list.size();
        if (size == 0) {
            FinskyLog.m21665c("App count is 0 in new updates notification", new Object[0]);
            return;
        }
        String b;
        String string = resources.getString(C7582R.string.notification_new_updates_available_status);
        String quantityString = resources.getQuantityString(C7582R.plurals.notification_new_updates_available_message, size, new Object[]{Integer.valueOf(size)});
        if (size == i) {
            b = m18187b(list);
        } else if (size < i) {
            b = resources.getString(C7582R.string.notification_total_pending, new Object[]{Integer.valueOf(i)});
        } else {
            FinskyLog.m21665c("all updates count is less than new updates notification", new Object[0]);
            return;
        }
        if (size > 1) {
            size = C7582R.drawable.stat_notify_update_collapse;
        } else {
            size = C7582R.drawable.stat_notify_update;
        }
        C3803r.m18170a(900, null, c2495w);
        C3820u a = NotificationReceiver.m18054a();
        C3781e a2 = C3803r.m18167a(C3781e.m18030a("updates", quantityString, b, size).m18032a(1).m18036a(a).m18041b(NotificationReceiver.m18063b()).m18034a(new C3778a(resources.getQuantityString(C7582R.plurals.notification_update_all_button_text, i), C7582R.drawable.stat_notify_update, NotificationReceiver.m18072g())).m18039b(900));
        m18178a("3.update-notifications", string, b, i, "status", a2, c2495w);
    }

    public final void mo3798a(List list, int i, C2495w c2495w) {
        if (!C1473m.f7980a.dj().mo2294a(12635662) || !((C3788c) this.f19100f.mo1a()).m18134a("updates", 900, list, i, c2495w)) {
            m18237c(list, i, c2495w);
        }
    }

    final void m18233b(List list, C2495w c2495w) {
        Resources resources = this.f19097a.getResources();
        int size = list.size();
        if (size == 0) {
            FinskyLog.m21665c("App count is 0 in new outstanding updates notification", new Object[0]);
            return;
        }
        String quantityString = resources.getQuantityString(C7582R.plurals.notification_outstanding_updates_message, size, new Object[]{Integer.valueOf(size)});
        String b = m18187b(list);
        int i = size > 1 ? C7582R.drawable.stat_notify_update_collapse : C7582R.drawable.stat_notify_update;
        C3803r.m18170a(903, null, c2495w);
        m18178a("3.update-notifications", quantityString, b, -1, "status", C3803r.m18167a(C3781e.m18030a("updates", quantityString, b, i).m18032a(1).m18036a(NotificationReceiver.m18066c()).m18041b(NotificationReceiver.m18069d()).m18034a(new C3778a(resources.getQuantityString(C7582R.plurals.notification_update_all_button_text, size), C7582R.drawable.stat_notify_update, NotificationReceiver.m18072g())).m18039b(903)), c2495w);
    }

    public final void mo3799a(List list, C2495w c2495w) {
        if (C1473m.f7980a.dj().mo2294a(12635662)) {
            if (((C3788c) this.f19100f.mo1a()).m18134a("updates", 903, list, list.size(), c2495w)) {
                return;
            }
        }
        m18233b(list, c2495w);
    }

    final void m18240d(List list, int i, C2495w c2495w) {
        Resources resources = this.f19097a.getResources();
        int size = list.size();
        if (size == 0) {
            FinskyLog.m21665c("App count is 0 in need approval notification", new Object[0]);
            return;
        }
        String b;
        String quantityString = resources.getQuantityString(C7582R.plurals.notification_need_approval_message, size, new Object[]{Integer.valueOf(size)});
        if (size == i) {
            b = m18187b(list);
        } else if (size < i) {
            b = resources.getString(C7582R.string.notification_total_pending, new Object[]{Integer.valueOf(i)});
        } else {
            FinskyLog.m21665c("all updates count is less than updates requiring approval notification", new Object[0]);
            return;
        }
        if (size > 1) {
            size = C7582R.drawable.stat_notify_update_collapse;
        } else {
            size = C7582R.drawable.stat_notify_update;
        }
        C3803r.m18170a(904, null, c2495w);
        C3820u e = NotificationReceiver.m18070e();
        m18178a("3.update-notifications", quantityString, b, -1, "status", C3803r.m18167a(C3781e.m18030a("updates", quantityString, b, size).m18032a(1).m18036a(e).m18041b(NotificationReceiver.m18071f()).m18034a(new C3778a(resources.getQuantityString(C7582R.plurals.notification_update_all_button_text, i), C7582R.drawable.stat_notify_update, NotificationReceiver.m18072g())).m18039b(904)), c2495w);
    }

    public final void mo3805b(List list, int i, C2495w c2495w) {
        if (!C1473m.f7980a.dj().mo2294a(12635662) || !((C3788c) this.f19100f.mo1a()).m18134a("updates", 904, list, i, c2495w)) {
            m18240d(list, i, c2495w);
        }
    }

    public final void mo3775a(Document document, String str, bd bdVar, C2495w c2495w) {
        String str2 = document.f14885a.f12096c;
        if (document.m14625N() == null) {
            FinskyLog.m21669e("appDocument doesn't have app details (%s)", str2);
            return;
        }
        byte[] bArr;
        if (document != null) {
            bArr = document.f14885a.f12087D;
        } else {
            bArr = null;
        }
        C3803r.m18170a(905, bArr, c2495w);
        C3820u a = NotificationReceiver.m18057a(str2, str);
        C3820u a2 = NotificationReceiver.m18056a(str2);
        Resources resources = this.f19097a.getResources();
        String string = resources.getString(C7582R.string.notification_preregistration_released_title, new Object[]{document.f14885a.f12100g});
        String string2 = resources.getString(C7582R.string.notification_preregistration_released_subtitle);
        C3782f a3 = C3781e.m18030a("preregistration..released..".concat(str2), string, string2, C7582R.drawable.stat_notify_update).m18037a(str).m18036a(a).m18041b(a2).m18039b(905).m18038a(document.f14885a.f12087D);
        if (bdVar != null) {
            a3.m18035a(C3816o.m18255a(bdVar));
        }
        m18178a("2.account-alerts-notifications", string, string2, -1, "status", C3803r.m18167a(a3), c2495w);
    }

    public final void mo3774a(C2495w c2495w) {
        Resources resources = this.f19097a.getResources();
        String string = resources.getString(C7582R.string.notification_connection_restored_title);
        String str = "connectivity-notifications";
        C3803r.m18170a(919, null, c2495w);
        m18182a("6.connectivity-notifications", str, string, string, resources.getString(C7582R.string.notification_connection_restored_message), null, (int) C7582R.drawable.ic_play_store, 0, NotificationReceiver.m18065c(c2495w), true, NotificationReceiver.m18068d(c2495w), C3781e.m18030a(str, string, string, C7582R.drawable.ic_play_store).m18032a(2).m18031a());
    }

    private final String m18187b(List list) {
        Resources resources = this.f19097a.getResources();
        switch (list.size()) {
            case 1:
                return resources.getString(C7582R.string.notification_update_1, new Object[]{((Document) list.get(0)).f14885a.f12100g});
            case 2:
                return resources.getString(C7582R.string.notification_update_2, new Object[]{((Document) list.get(0)).f14885a.f12100g, ((Document) list.get(1)).f14885a.f12100g});
            case 3:
                return resources.getString(C7582R.string.notification_update_3, new Object[]{((Document) list.get(0)).f14885a.f12100g, ((Document) list.get(1)).f14885a.f12100g, ((Document) list.get(2)).f14885a.f12100g});
            case 4:
                return resources.getString(C7582R.string.notification_update_4, new Object[]{((Document) list.get(0)).f14885a.f12100g, ((Document) list.get(1)).f14885a.f12100g, ((Document) list.get(2)).f14885a.f12100g, ((Document) list.get(3)).f14885a.f12100g});
            case 5:
                return resources.getString(C7582R.string.notification_update_5, new Object[]{((Document) list.get(0)).f14885a.f12100g, ((Document) list.get(1)).f14885a.f12100g, ((Document) list.get(2)).f14885a.f12100g, ((Document) list.get(3)).f14885a.f12100g, ((Document) list.get(4)).f14885a.f12100g});
            default:
                return resources.getString(C7582R.string.notification_update_more, new Object[]{((Document) list.get(0)).f14885a.f12100g, ((Document) list.get(1)).f14885a.f12100g, ((Document) list.get(2)).f14885a.f12100g, ((Document) list.get(3)).f14885a.f12100g, Integer.valueOf(list.size() - 4)});
        }
    }

    private final void m18182a(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Intent intent, boolean z, Intent intent2, C3781e c3781e) {
        m18183a(str, str2, str3, str4, str5, str6, i, i2, intent, z, intent2, "status", c3781e);
    }

    private final void m18178a(String str, String str2, String str3, int i, String str4, C3781e c3781e, C2495w c2495w) {
        int c = C0216d.m1116c(this.f19097a, C7582R.color.play_apps_primary);
        int f = m18196f();
        cg b = new cg(this.f19097a).m1426c(str2).m1422a(c3781e.f18987a.f18991c).m1425b(c3781e.f18987a.f18992d);
        b.f1522z = str4;
        b.f1485C = 0;
        b.f1519w = true;
        if (!TextUtils.isEmpty(str3)) {
            b.m1421a(new cf().m1412b(str3));
        }
        b.m1415a(c3781e.f18987a.f18993e);
        if (i > 0) {
            b.f1506j = i;
        }
        b.f1484B = c;
        b.f1507k = f;
        int d = C3803r.m18193d(c3781e.f18987a.f18989a);
        m18172a(b, c3781e, c2495w);
        m18188b(b, c3781e, c2495w);
        m18192c(b, c3781e, c2495w);
        b.m1423a(true);
        this.f19102h.m18259a(c3781e.f18987a.f18994f, c3781e.f18987a.f18989a, new C3809w(this, b, str, d, c3781e));
    }

    private final void m18172a(cg cgVar, C3781e c3781e, C2495w c2495w) {
        int d = C3803r.m18193d(c3781e.f18987a.f18989a);
        if (c3781e.f18987a.f18999k != null) {
            cgVar.m1420a(m18164a(c3781e.f18987a.f18999k, c2495w, d));
        }
        if (c3781e.f18987a.f19000l != null) {
            cgVar.m1420a(m18164a(c3781e.f18987a.f19000l, c2495w, d));
        }
    }

    private final void m18188b(cg cgVar, C3781e c3781e, C2495w c2495w) {
        if (c3781e.f18987a.f18997i != null) {
            cgVar.f1501e = m18163a(c3781e.f18987a.f18997i, c3781e, c2495w);
        }
    }

    private final void m18192c(cg cgVar, C3781e c3781e, C2495w c2495w) {
        if (c3781e.f18987a.f18998j != null) {
            cgVar.m1419a(m18163a(c3781e.f18987a.f18998j, c3781e, c2495w));
        }
    }

    private final cd m18164a(C3778a c3778a, C2495w c2495w, int i) {
        return new cd(c3778a.f18985b, c3778a.f18984a, this.f19103i.mo3770a(c3778a.f18986c, i, c2495w));
    }

    private final PendingIntent m18163a(C3820u c3820u, C3781e c3781e, C2495w c2495w) {
        return this.f19103i.mo3770a(c3820u, C3803r.m18193d(c3781e.f18987a.f18989a), c2495w);
    }

    private static C3781e m18167a(C3782f c3782f) {
        C3781e a = c3782f.m18031a();
        if (!C1473m.f7980a.dj().mo2294a(12637790)) {
            return a;
        }
        if (a.f18987a.f18997i != null) {
            c3782f.m18036a(C3803r.m18168a(a.f18987a.f18997i, a));
        }
        if (a.f18987a.f18999k != null) {
            c3782f.m18034a(C3803r.m18166a(a.f18987a.f18999k, a));
        }
        if (a.f18987a.f19000l != null) {
            c3782f.m18040b(C3803r.m18166a(a.f18987a.f19000l, a));
        }
        return c3782f.m18031a();
    }

    private static C3778a m18166a(C3778a c3778a, C3781e c3781e) {
        if (c3778a.f18986c == null) {
            return c3778a;
        }
        return new C3778a(c3778a.f18984a, c3778a.f18985b, C3803r.m18168a(c3778a.f18986c, c3781e));
    }

    private static C3820u m18168a(C3820u c3820u, C3781e c3781e) {
        C3821v a = C3820u.m18262a(c3820u).m18267a("mark_as_read_notification_id", c3781e.f18987a.f18989a);
        if (c3781e.f18987a.f18990b != null) {
            a.m18267a("mark_as_read_account_name", c3781e.f18987a.f18990b);
        }
        return a.m18265a();
    }

    @Deprecated
    private final void m18183a(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Intent intent, boolean z, Intent intent2, String str7, C3781e c3781e) {
        m18184a(str, str2, str3, str4, str5, str6, i, i2, intent, z, intent2, false, str7, this.f19097a.getResources().getColor(C7582R.color.play_apps_primary), m18196f(), null, c3781e);
    }

    @Deprecated
    private final void m18184a(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Intent intent, boolean z, Intent intent2, boolean z2, String str7, int i3, int i4, cd cdVar, C3781e c3781e) {
        cg b = new cg(this.f19097a).m1426c(str3).m1422a((CharSequence) str4).m1425b(str5);
        b.f1522z = str7;
        b.f1485C = 0;
        b.f1519w = true;
        if (!TextUtils.isEmpty(str6)) {
            b.m1421a(new cf().m1412b(str6));
        }
        b.m1415a(i);
        if (i2 > 0) {
            b.f1506j = i2;
        }
        b.f1484B = i3;
        b.f1507k = i4;
        if (cdVar != null) {
            b.m1420a(cdVar);
        }
        int d = C3803r.m18193d(str2);
        if (intent != null) {
            PendingIntent broadcast;
            if (z) {
                broadcast = PendingIntent.getBroadcast(this.f19097a, d, intent, 1342177280);
            } else {
                broadcast = PendingIntent.getActivity(this.f19097a, d, intent, 1342177280);
            }
            b.f1501e = broadcast;
        }
        if (intent2 != null) {
            b.m1419a(PendingIntent.getBroadcast(this.f19097a, d, intent2, 1342177280));
        }
        if (z2) {
            b.m1424a(2, true);
        } else {
            b.m1423a(true);
        }
        this.f19102h.m18259a(c3781e.f18987a.f18994f, str2, new C3810x(this, b, str, d, c3781e));
    }

    public final void mo3781a(f fVar, int i, C2495w c2495w) {
        C3803r.m18170a(907, fVar.k, c2495w);
        byte[] bArr = fVar.k;
        if (C1473m.f7980a.dj().mo2294a(12640913) && C4671b.m21786c()) {
            boolean a = cm.m1438a(this.f19097a).m1439a();
            if (!a) {
                c2495w.m13371a(new C2474c(3050).m13240a(bArr).f13342a, null);
            }
            int intValue = ((Integer) C0954a.bG.m5760a()).intValue();
            int i2 = a ? 1 : 0;
            if (intValue != i2) {
                c2495w.m13371a(new C2474c(422).m13235a(Integer.valueOf(intValue)).m13243b(Integer.valueOf(i2)).f13342a, null);
                C0954a.bG.m5763a(Integer.valueOf(i2));
            }
        }
        C3781e a2 = C3803r.m18167a(C3781e.m18029a(this.f19104j.mo3761a(fVar)));
        int d = C3803r.m18193d(a2.f18987a.f18989a);
        PendingIntent a3 = m18163a(a2.f18987a.f18997i, a2, c2495w);
        int a4 = C1608h.m9243a(this.f19097a, i);
        cg a5 = new cg(this.f19097a).m1415a(a2.f18987a.f18993e).m1426c(fVar.j).m1418a(System.currentTimeMillis());
        a5.f1522z = "status";
        a5.f1485C = 0;
        a5.f1507k = m18196f();
        cg a6 = a5.m1423a(true);
        a6.f1519w = true;
        cg b = a6.m1422a(a2.f18987a.f18991c).m1425b(a2.f18987a.f18992d);
        b.f1501e = a3;
        b.f1484B = a4;
        b = b.m1421a(new cf().m1410a(a2.f18987a.f18991c).m1412b(a2.f18987a.f18992d));
        if (a2.f18987a.f18999k != null) {
            b.m1420a(m18164a(a2.f18987a.f18999k, c2495w, d));
        }
        if (a2.f18987a.f19000l != null) {
            b.m1420a(m18164a(a2.f18987a.f19000l, c2495w, d));
        }
        this.f19102h.m18259a(a2.f18987a.f18994f, a2.f18987a.f18989a, new C3811y(this, b, a2, d));
    }

    private static int m18193d(String str) {
        return str == null ? f19095b : str.hashCode();
    }

    private final void m18173a(cg cgVar, String str, int i, C3781e c3781e) {
        if (C1503a.m8831b(this.f19097a)) {
            ch cjVar = new cj();
            cjVar.f1524b |= 64;
            cjVar.mo319a(cgVar);
        }
        if (C0327a.m1722b() && !TextUtils.isEmpty(str)) {
            cgVar.f1490H = str;
        }
        C1473m.f7980a.mo2037Q().m8837a(new C3812z(this, i, cgVar.m1414a(), c3781e));
    }

    private final void m18195e(String str) {
        m18197f(str);
        if (C1473m.f7980a.dj().mo2294a(12637790)) {
            ((au) this.f19101g.mo1a()).f19030a.f19014c.mo1527d(af.m18083a(str, null));
        }
    }

    private final void m18197f(String str) {
        NotificationManager notificationManager = (NotificationManager) this.f19097a.getSystemService("notification");
        int d = C3803r.m18193d(str);
        notificationManager.cancel(d);
        for (int i = 0; i < this.f19099e.size(); i++) {
            ((C2182z) this.f19099e.get(i)).mo2773b(d);
        }
    }

    public final void mo3782a(String str) {
        m18195e(str);
    }

    public final void mo3772a() {
        m18195e("updates");
    }

    public final void mo3800b() {
        m18195e("package installing");
    }

    public final void mo3802b(String str) {
        m18195e("package..remove..request..".concat(str));
    }

    public final void mo3807c(String str) {
        m18195e("package..removed..".concat(str));
    }

    public final void mo3780a(f fVar) {
        m18197f("rich.user.notification.".concat(fVar.c));
    }

    private static void m18170a(int i, byte[] bArr, C2495w c2495w) {
        c2495w.m13370a(new C2488p().m13345b(new C2473o(i, bArr, null)));
    }

    public final int mo3806c() {
        return f19096c;
    }

    private final int m18196f() {
        if (C1503a.m8831b(this.f19097a)) {
            return 1;
        }
        return -1;
    }

    @TargetApi(26)
    public final void mo3809d() {
        if (C0327a.m1722b()) {
            NotificationManager notificationManager = (NotificationManager) this.f19097a.getSystemService(NotificationManager.class);
            notificationManager.deleteNotificationChannel("update-notifications");
            notificationManager.deleteNotificationChannel("update-completion-notifications");
            notificationManager.deleteNotificationChannel("high-priority-notifications");
            notificationManager.deleteNotificationChannel("account-alerts-notifications");
            C3803r.m18171a(notificationManager, "1.high-priority-notifications", this.f19097a.getString(C7582R.string.high_priority_notification_channel), 3, true);
            C3803r.m18171a(notificationManager, "2.account-alerts-notifications", this.f19097a.getString(C7582R.string.account_alerts_notification_channel), 3, true);
            C3803r.m18171a(notificationManager, "3.update-notifications", this.f19097a.getString(C7582R.string.update_available_notification_channel), 2, true);
            C3803r.m18171a(notificationManager, "4.update-completion-notifications", this.f19097a.getString(C7582R.string.update_completion_notification_channel), 2, true);
            C3803r.m18171a(notificationManager, "5.maintenance-channel", this.f19097a.getString(C7582R.string.maintenance_notification_channel), 1, false);
            C3803r.m18171a(notificationManager, "6.connectivity-notifications", this.f19097a.getString(C7582R.string.connectivity_notification_channel), 2, true);
        }
    }

    private static void m18171a(NotificationManager notificationManager, String str, CharSequence charSequence, int i, boolean z) {
        NotificationChannel notificationChannel = new NotificationChannel(str, charSequence, i);
        notificationChannel.setShowBadge(z);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public final void mo3797a(List list) {
        if (C1473m.f7980a.dj().mo2294a(12637790)) {
            List arrayList = new ArrayList();
            for (C3823y c3823y : list) {
                String str = c3823y.f19156a;
                if (str.startsWith("rich.user.notification.") && C1473m.f7980a.dj().mo2294a(12641819)) {
                    arrayList.add(c3823y);
                } else {
                    af afVar = ((au) this.f19101g.mo1a()).f19030a;
                    afVar.f19014c.mo1521a(af.m18083a(str, c3823y.f19157b)).mo4397a(new aq(afVar)).mo4396a(new ar(afVar));
                }
            }
            List c = C3803r.m18191c(arrayList);
            if (c.size() > 0) {
                C1254c b;
                if (((C3823y) arrayList.get(0)).f19157b != null) {
                    b = C1473m.f7980a.mo2112b(((C3823y) arrayList.get(0)).f19157b);
                } else {
                    b = C1473m.f7980a.ap();
                }
                b.mo1629b(c, C3804s.f19105a, C3805t.f19106a);
            }
        }
    }

    private static List m18191c(List list) {
        String cZ = C1473m.f7980a.mo2040T().cZ();
        List arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = ((C3823y) list.get(i)).f19157b;
            if (str == null || str.equals(cZ) || list.size() <= 1) {
                gk gkVar = new gk();
                str = ((C3823y) list.get(i)).f19156a.replaceAll("rich.user.notification.", "");
                if (str == null) {
                    throw new NullPointerException();
                }
                gkVar.f12455b |= 1;
                gkVar.f12456c = str;
                gkVar.f12457d = 2;
                gkVar.f12455b |= 2;
                arrayList.add(gkVar);
            } else {
                FinskyLog.m21669e("Rich user notification '%s' marked as read which does not match current account: '%s'. This is not allowed as part of a batch update.", list.get(i), cZ);
            }
        }
        return arrayList;
    }

    public final void mo3773a(Intent intent) {
        String stringExtra = intent.getStringExtra("mark_as_read_notification_id");
        if (stringExtra != null) {
            mo3797a(Collections.singletonList(new C3823y(stringExtra, intent.getStringExtra("mark_as_read_account_name"))));
        }
    }

    static final /* synthetic */ void m18194e() {
    }
}
