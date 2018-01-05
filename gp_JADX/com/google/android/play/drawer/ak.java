package com.google.android.play.drawer;

import android.accounts.Account;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.play.C6317h;
import com.google.android.play.dfe.api.C1460g;
import com.google.android.play.image.C1294w;
import com.google.android.play.utils.k;
import com.google.android.play.utils.p354b.C6322j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ak extends em implements C6290a {
    public LayoutInflater f31416c;
    public C1294w f31417d;
    public C3691k f31418e;
    public C3690g f31419f;
    public final PlayDrawerRecyclerView f31420g;
    public int f31421h;
    public C1460g f31422i;
    public final List f31423j = new ArrayList();
    public final List f31424k = new ArrayList();
    public C6297l f31425l;
    public boolean f31426m;
    public boolean f31427n;
    public Account f31428o;
    public Account[] f31429p = new Account[0];
    public final Map f31430q = new HashMap();
    public final Set f31431r = new HashSet();
    public boolean f31432s;
    public boolean f31433t;
    public Context f31434u;
    public boolean f31435v;
    public C3714i f31436w;
    public boolean f31437x;
    public boolean f31438y;
    public boolean f31439z = false;

    public ak(PlayDrawerRecyclerView playDrawerRecyclerView) {
        this.f31420g = playDrawerRecyclerView;
        this.f31420g.getContext();
        this.f31420g.setLayoutManager(new LinearLayoutManager());
        this.f31420g.setHasFixedSize(true);
        this.f31420g.setItemViewCacheSize(((Integer) C6322j.f31586P.m28964b()).intValue());
        b_(true);
    }

    public final void mo5380a(Context context, boolean z, C3691k c3691k, C1460g c1460g, C1294w c1294w, C3690g c3690g, boolean z2, C3714i c3714i, boolean z3) {
        this.f31434u = context;
        this.f31416c = LayoutInflater.from(context);
        this.f31422i = c1460g;
        this.f31417d = c1294w;
        this.f31418e = c3691k;
        this.f31419f = c3690g;
        this.f31421h = -1;
        this.f31432s = z;
        this.f31437x = z2;
        this.f31438y = z3;
        this.f31420g.setAdapter(this);
        if (c3714i == null) {
            c3714i = new al();
        }
        this.f31436w = c3714i;
    }

    public final boolean mo5385b() {
        return this.f31432s;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5382a(java.lang.String r16, android.accounts.Account[] r17, java.util.List r18, java.util.List r19) {
        /*
        r15 = this;
        r0 = r17;
        r6 = r0.length;
        if (r6 != 0) goto L_0x0091;
    L_0x0005:
        r1 = r15.f31427n;
        if (r1 == 0) goto L_0x0018;
    L_0x0009:
        r1 = 0;
        r15.f31428o = r1;
        r1 = 0;
        r1 = new android.accounts.Account[r1];
        r15.f31429p = r1;
        r1 = 0;
        r15.f31427n = r1;
        r1 = 0;
        r15.m3633d(r1);
    L_0x0018:
        r1 = r15.f31423j;
        r0 = r18;
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x0041;
    L_0x0022:
        r1 = r15.f31423j;
        r1 = r1.size();
        r2 = r15.f31423j;
        r2.clear();
        r2 = r15.f31423j;
        r0 = r18;
        r2.addAll(r0);
        r2 = r15.f31432s;
        if (r2 != 0) goto L_0x0041;
    L_0x0038:
        r2 = r15.m28889e();
        r3 = r15.f31423j;
        r15.m28886a(r2, r1, r3);
    L_0x0041:
        r1 = r15.f31424k;
        r0 = r19;
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x0073;
    L_0x004b:
        r1 = r15.f31424k;
        r1 = r1.size();
        r2 = r15.f31424k;
        r2.clear();
        r2 = r15.f31424k;
        r0 = r19;
        r2.addAll(r0);
        r2 = r15.f31432s;
        if (r2 != 0) goto L_0x0073;
    L_0x0061:
        r2 = r15.m28889e();
        r3 = r15.f31423j;
        r3 = r3.size();
        r2 = r2 + r3;
        r2 = r2 + 1;
        r3 = r15.f31424k;
        r15.m28886a(r2, r1, r3);
    L_0x0073:
        r1 = r15.m28889e();
        r2 = r15.f31423j;
        r2 = r2.size();
        r1 = r1 + r2;
        r1 = r1 + 1;
        r2 = r15.f31426m;
        if (r2 == 0) goto L_0x0090;
    L_0x0084:
        r2 = 0;
        r15.f31425l = r2;
        r2 = 0;
        r15.f31426m = r2;
        r2 = 0;
        r15.f31433t = r2;
        r15.m3633d(r1);
    L_0x0090:
        return;
    L_0x0091:
        r1 = 0;
        r2 = r15.f31431r;
        r0 = r16;
        r2 = r2.contains(r0);
        if (r2 != 0) goto L_0x009d;
    L_0x009c:
        r1 = 1;
    L_0x009d:
        r2 = r15.f31428o;
        if (r2 == 0) goto L_0x00ad;
    L_0x00a1:
        r2 = r15.f31428o;
        r2 = r2.name;
        r0 = r16;
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x00ae;
    L_0x00ad:
        r1 = 1;
    L_0x00ae:
        r2 = r6 + -1;
        r7 = new android.accounts.Account[r2];
        r2 = r15.f31429p;
        r2 = r2.length;
        r3 = r7.length;
        if (r2 == r3) goto L_0x00b9;
    L_0x00b8:
        r1 = 1;
    L_0x00b9:
        r3 = 0;
        r0 = r17;
        r8 = r0.length;
        r2 = 0;
        r5 = r2;
        r14 = r3;
        r3 = r1;
        r1 = r14;
    L_0x00c2:
        if (r5 >= r8) goto L_0x00e7;
    L_0x00c4:
        r9 = r17[r5];
        r2 = r9.name;
        r0 = r16;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00d8;
    L_0x00d0:
        r15.f31428o = r9;
        r2 = r3;
    L_0x00d3:
        r3 = r5 + 1;
        r5 = r3;
        r3 = r2;
        goto L_0x00c2;
    L_0x00d8:
        r2 = r6 + -1;
        if (r1 != r2) goto L_0x00f6;
    L_0x00dc:
        r1 = "current account not found in accounts";
        r2 = 0;
        r2 = new java.lang.Object[r2];
        com.google.android.play.utils.PlayCommonLog.c(r1, r2);
        r15.f31428o = r9;
        r3 = 1;
    L_0x00e7:
        if (r3 == 0) goto L_0x0018;
    L_0x00e9:
        if (r6 <= 0) goto L_0x011a;
    L_0x00eb:
        r1 = 1;
    L_0x00ec:
        r15.f31427n = r1;
        r15.f31429p = r7;
        r1 = 0;
        r15.m3631c(r1);
        goto L_0x0018;
    L_0x00f6:
        r2 = r1 + 1;
        r7[r1] = r9;
        if (r3 != 0) goto L_0x011c;
    L_0x00fc:
        r1 = 0;
        r10 = r15.f31429p;
        r11 = r10.length;
        r4 = 0;
    L_0x0101:
        if (r4 >= r11) goto L_0x0110;
    L_0x0103:
        r12 = r10[r4];
        r12 = r12.name;
        r13 = r9.name;
        r12 = r12.equals(r13);
        if (r12 == 0) goto L_0x0117;
    L_0x010f:
        r1 = 1;
    L_0x0110:
        if (r1 != 0) goto L_0x011c;
    L_0x0112:
        r1 = 1;
        r14 = r2;
        r2 = r1;
        r1 = r14;
        goto L_0x00d3;
    L_0x0117:
        r4 = r4 + 1;
        goto L_0x0101;
    L_0x011a:
        r1 = 0;
        goto L_0x00ec;
    L_0x011c:
        r1 = r2;
        r2 = r3;
        goto L_0x00d3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.drawer.ak.a(java.lang.String, android.accounts.Account[], java.util.List, java.util.List):void");
    }

    public final void mo5386c() {
        if (this.f31429p.length > 0 && this.f31432s) {
            m28903d();
        }
    }

    public final void mo5383a(boolean z) {
        this.f31435v = z;
    }

    public final int mo1039a() {
        int i = this.f31427n ? 1 : 0;
        if (this.f31432s) {
            return i + this.f31429p.length;
        }
        i = ((i + 1) + this.f31423j.size()) + 1;
        if (this.f31426m) {
            i++;
        }
        return i + this.f31424k.size();
    }

    private final Object m28890e(int i) {
        if (this.f31427n) {
            if (i == 0) {
                return this.f31428o.name;
            }
            i--;
        }
        if (this.f31432s) {
            return this.f31429p[i];
        }
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        int size = this.f31423j.size();
        if (i2 < size) {
            return this.f31423j.get(i2);
        }
        i2 -= size;
        if (this.f31426m) {
            if (i2 == 0) {
                return this.f31425l;
            }
            i2--;
        }
        if (i2 == 0) {
            return null;
        }
        return this.f31424k.get(i2 - 1);
    }

    public final long mo1043b(int i) {
        return (long) i;
    }

    public final int mo1040a(int i) {
        if (this.f31427n) {
            if (i != 0) {
                i--;
            } else if (this.f31437x) {
                return 9;
            } else {
                return 0;
            }
        }
        if (this.f31432s) {
            if (this.f31437x) {
                return 10;
            }
            return 1;
        } else if (i == 0) {
            return 2;
        } else {
            int i2 = i - 1;
            if (i2 < this.f31423j.size()) {
                C6298m c6298m = (C6298m) this.f31423j.get(i2);
                if (c6298m.f31483h) {
                    return 6;
                }
                if (this.f31426m && this.f31433t && !c6298m.f31481f) {
                    return 5;
                }
                if (c6298m.f31480e) {
                    return 3;
                }
                return 4;
            }
            i2 -= this.f31423j.size();
            if (i2 == 0) {
                return 6;
            }
            i2--;
            if (this.f31426m && i2 == 0) {
                return 8;
            }
            return 7;
        }
    }

    private final void m28887a(cv cvVar, String str, PlayDrawerProfileInfoView playDrawerProfileInfoView, Account account) {
        cv cvVar2 = (cv) this.f31430q.get(str);
        this.f31430q.put(str, cvVar);
        this.f31431r.add(str);
        int j = ((LinearLayoutManager) this.f31420g.getLayoutManager()).m3124j();
        j = (this.f31421h < j || this.f31421h > (this.f31420g.getChildCount() + j) - 1) ? 0 : 1;
        if (j != 0) {
            if (cvVar2 == null && cvVar != null && str.equals(this.f31428o.name)) {
                playDrawerProfileInfoView.m28866a(account, this.f31429p, this.f31430q, this.f31417d, this.f31436w);
            }
            m3631c(0);
        }
    }

    final void m28903d() {
        m3634d(1, mo1039a() - 1);
        this.f31432s = !this.f31432s;
        m3632c(1, mo1039a() - 1);
    }

    private final View m28885a(ViewGroup viewGroup, boolean z, boolean z2) {
        PlayDrawerPrimaryActionView playDrawerPrimaryActionView = (PlayDrawerPrimaryActionView) this.f31416c.inflate(PlayDrawerPrimaryActionView.m28861a(z, z2), viewGroup, false);
        playDrawerPrimaryActionView.m28862a(viewGroup, z, z2);
        return playDrawerPrimaryActionView;
    }

    private final int m28889e() {
        return ((this.f31427n ? 1 : 0) + 0) + 1;
    }

    private final void m28886a(int i, int i2, List list) {
        if (i2 == list.size()) {
            m3619a(i, i2);
            return;
        }
        m3634d(i, i2);
        m3632c(i, list.size());
    }

    public final void mo5381a(C3714i c3714i) {
        this.f31436w = c3714i;
    }

    public final void mo5384b(boolean z) {
        this.f31439z = z;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        aj ajVar = (aj) frVar;
        int a = mo1040a(i);
        Object e = m28890e(i);
        String str;
        Account account;
        switch (a) {
            case 0:
                PlayDrawerProfileInfoView playDrawerProfileInfoView = (PlayDrawerProfileInfoView) ajVar.a;
                this.f31421h = i;
                Account account2 = this.f31428o;
                String str2 = this.f31428o.name;
                playDrawerProfileInfoView.m28866a(account2, this.f31429p, this.f31430q, this.f31417d, this.f31436w);
                playDrawerProfileInfoView.m28872c(this.f31435v);
                if (!this.f31439z) {
                    if (this.f31438y) {
                        this.f31422i.mo2019a(account2).mo5377a(new aw(this, str2, playDrawerProfileInfoView, account2), new ax(), true);
                    } else {
                        this.f31422i.mo2019a(account2).mo5376a(new ay(this, str2, playDrawerProfileInfoView, account2), new az());
                    }
                    for (Account account3 : this.f31429p) {
                        str = account3.name;
                        if (!this.f31431r.contains(str)) {
                            if (this.f31438y) {
                                this.f31422i.mo2019a(account3).mo5377a(new am(this, str), new an(), true);
                            } else {
                                this.f31422i.mo2019a(account3).mo5376a(new ao(this, str), new ap());
                            }
                        }
                    }
                }
                playDrawerProfileInfoView.m28871b(this.f31432s);
                playDrawerProfileInfoView.f31405p = new ba(this);
                if (this.f31429p.length > 0) {
                    playDrawerProfileInfoView.m28870a(true);
                    playDrawerProfileInfoView.setOnClickListener(new bb());
                    playDrawerProfileInfoView.m28867a(new bc(this));
                    return;
                }
                playDrawerProfileInfoView.m28870a(false);
                playDrawerProfileInfoView.setOnClickListener(null);
                playDrawerProfileInfoView.m28867a(null);
                return;
            case 1:
                account = (Account) e;
                PlayDrawerAccountRow playDrawerAccountRow = (PlayDrawerAccountRow) ajVar.a;
                str = account.name;
                playDrawerAccountRow.m28852a((cv) this.f31430q.get(str), this.f31436w.mo3617a(account), this.f31417d);
                playDrawerAccountRow.setOnClickListener(new aq(this, str));
                return;
            case 2:
            case 6:
                return;
            case 3:
            case 4:
            case 5:
                PlayDrawerPrimaryActionView playDrawerPrimaryActionView = (PlayDrawerPrimaryActionView) ajVar.a;
                C6298m c6298m = (C6298m) m28890e(i);
                playDrawerPrimaryActionView.m28863a(c6298m, k.b(this.f31434u));
                playDrawerPrimaryActionView.setOnClickListener(new as(this, c6298m));
                return;
            case 7:
                C6299n c6299n = (C6299n) e;
                TextView textView = (TextView) ajVar.a;
                textView.setText(c6299n.f31490a);
                textView.setOnClickListener(new at(this, c6299n));
                textView.setGravity(8388627);
                return;
            case 8:
                PlayDrawerDownloadSwitchRow playDrawerDownloadSwitchRow = (PlayDrawerDownloadSwitchRow) ajVar.a;
                playDrawerDownloadSwitchRow.m28853a(this.f31425l);
                playDrawerDownloadSwitchRow.f31379h = new au(this);
                playDrawerDownloadSwitchRow.m28854a(this.f31433t);
                return;
            case 9:
                PlayDrawerMiniProfileInfoView playDrawerMiniProfileInfoView = (PlayDrawerMiniProfileInfoView) ajVar.a;
                this.f31421h = i;
                playDrawerMiniProfileInfoView.m28860b(this.f31432s);
                playDrawerMiniProfileInfoView.m28857a(this.f31428o, this.f31436w);
                if (this.f31429p.length > 0) {
                    playDrawerMiniProfileInfoView.m28859a(true);
                    playDrawerMiniProfileInfoView.m28858a(new av(this));
                    return;
                }
                playDrawerMiniProfileInfoView.m28859a(false);
                playDrawerMiniProfileInfoView.m28858a(null);
                return;
            case 10:
                account = (Account) e;
                PlayDrawerMiniAccountRow playDrawerMiniAccountRow = (PlayDrawerMiniAccountRow) ajVar.a;
                String str3 = account.name;
                playDrawerMiniAccountRow.m28855a(this.f31436w.mo3617a(account));
                playDrawerMiniAccountRow.setOnClickListener(new ar(this, str3));
                return;
            default:
                throw new UnsupportedOperationException("View type " + a + " not supported");
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        View inflate;
        switch (i) {
            case 0:
                inflate = this.f31416c.inflate(C6317h.play_drawer_profile_info, viewGroup, false);
                break;
            case 1:
                inflate = this.f31416c.inflate(C6317h.play_drawer_account_row, viewGroup, false);
                break;
            case 2:
                inflate = this.f31416c.inflate(C6317h.play_drawer_primary_actions_top_spacing, viewGroup, false);
                break;
            case 3:
                inflate = m28885a(viewGroup, true, false);
                break;
            case 4:
                inflate = m28885a(viewGroup, false, false);
                break;
            case 5:
                inflate = m28885a(viewGroup, false, true);
                break;
            case 6:
                inflate = this.f31416c.inflate(C6317h.play_drawer_secondary_actions_top_separator, viewGroup, false);
                break;
            case 7:
                inflate = this.f31416c.inflate(C6317h.play_drawer_secondary_action, viewGroup, false);
                break;
            case 8:
                inflate = this.f31416c.inflate(C6317h.play_drawer_download_toggle, viewGroup, false);
                break;
            case 9:
                inflate = this.f31416c.inflate(C6317h.play_drawer_mini_profile_info_view, viewGroup, false);
                break;
            case 10:
                inflate = this.f31416c.inflate(C6317h.play_drawer_mini_account_row, viewGroup, false);
                break;
            default:
                throw new UnsupportedOperationException("View type " + i + " not supported");
        }
        return new aj(inflate);
    }
}
