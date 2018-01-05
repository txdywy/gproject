package com.google.android.play.drawer;

import android.accounts.Account;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.play.C6317h;
import com.google.android.play.dfe.api.C1460g;
import com.google.android.play.image.C1294w;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class C6300o extends BaseAdapter implements C6290a {
    public LayoutInflater f31492a;
    public C1294w f31493b;
    public C3691k f31494c;
    public C3690g f31495d;
    public final ListView f31496e;
    public int f31497f;
    public C1460g f31498g;
    public final List f31499h = new ArrayList();
    public final List f31500i = new ArrayList();
    public C6297l f31501j;
    public boolean f31502k;
    public boolean f31503l;
    public Account f31504m;
    public Account[] f31505n = new Account[0];
    public final Map f31506o = new HashMap();
    public final Set f31507p = new HashSet();
    public boolean f31508q;
    public boolean f31509r;
    public Context f31510s;
    public boolean f31511t;
    public C3714i f31512u;
    public boolean f31513v;
    public boolean f31514w;
    public boolean f31515x = false;

    public C6300o(ListView listView) {
        this.f31496e = listView;
        this.f31496e.setOnItemClickListener(new C6301p());
    }

    public final void mo5380a(Context context, boolean z, C3691k c3691k, C1460g c1460g, C1294w c1294w, C3690g c3690g, boolean z2, C3714i c3714i, boolean z3) {
        this.f31510s = context;
        this.f31492a = LayoutInflater.from(context);
        this.f31498g = c1460g;
        this.f31493b = c1294w;
        this.f31494c = c3691k;
        this.f31495d = c3690g;
        this.f31497f = -1;
        this.f31508q = z;
        this.f31513v = z2;
        this.f31514w = z3;
        this.f31496e.setAdapter(this);
        if (c3714i == null) {
            c3714i = new aa();
        }
        this.f31512u = c3714i;
    }

    public final boolean mo5385b() {
        return this.f31508q;
    }

    public final void mo5382a(String str, Account[] accountArr, List list, List list2) {
        boolean z;
        boolean z2 = false;
        int length = accountArr.length;
        if (length == 0) {
            this.f31504m = null;
            this.f31505n = new Account[0];
        } else {
            this.f31505n = new Account[(length - 1)];
            int i = 0;
            for (Account account : accountArr) {
                if (str.equals(account.name)) {
                    this.f31504m = account;
                } else if (i == length - 1) {
                    PlayCommonLog.c("current account not found in accounts", new Object[0]);
                    this.f31504m = account;
                    break;
                } else {
                    int i2 = i + 1;
                    this.f31505n[i] = account;
                    i = i2;
                }
            }
        }
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f31503l = z;
        this.f31499h.clear();
        this.f31500i.clear();
        this.f31499h.addAll(list);
        this.f31500i.addAll(list2);
        this.f31501j = null;
        this.f31502k = false;
        if (this.f31502k) {
            z2 = null.f31475e;
        }
        this.f31509r = z2;
        notifyDataSetChanged();
    }

    public final void mo5386c() {
        if (this.f31505n.length > 0 && this.f31508q) {
            m28918a();
        }
    }

    public final void mo5383a(boolean z) {
        this.f31511t = z;
    }

    public final int getCount() {
        int i = this.f31503l ? 1 : 0;
        if (this.f31508q) {
            return i + this.f31505n.length;
        }
        i = ((i + 1) + this.f31499h.size()) + 1;
        if (this.f31502k) {
            i++;
        }
        return i + this.f31500i.size();
    }

    public final Object getItem(int i) {
        if (this.f31503l) {
            if (i == 0) {
                return this.f31504m.name;
            }
            i--;
        }
        if (this.f31508q) {
            return this.f31505n[i];
        }
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        int size = this.f31499h.size();
        if (i2 < size) {
            return this.f31499h.get(i2);
        }
        i2 -= size;
        if (this.f31502k) {
            if (i2 == 0) {
                return this.f31501j;
            }
            i2--;
        }
        if (i2 == 0) {
            return null;
        }
        return this.f31500i.get(i2 - 1);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        if (this.f31503l) {
            if (i != 0) {
                i--;
            } else if (this.f31513v) {
                return 9;
            } else {
                return 0;
            }
        }
        if (this.f31508q) {
            if (this.f31513v) {
                return 10;
            }
            return 1;
        } else if (i == 0) {
            return 2;
        } else {
            int i2 = i - 1;
            if (i2 < this.f31499h.size()) {
                C6298m c6298m = (C6298m) this.f31499h.get(i2);
                if (c6298m.f31483h) {
                    return 6;
                }
                if (this.f31502k && this.f31509r && !c6298m.f31481f) {
                    return 5;
                }
                if (c6298m.f31480e) {
                    return 3;
                }
                return 4;
            }
            i2 -= this.f31499h.size();
            if (i2 == 0) {
                return 6;
            }
            i2--;
            if (this.f31502k && i2 == 0) {
                return 8;
            }
            return 7;
        }
    }

    public final int getViewTypeCount() {
        return 11;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final boolean isEnabled(int i) {
        switch (getItemViewType(i)) {
            case 2:
            case 6:
                return false;
            default:
                return true;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        Object item = getItem(i);
        View view2;
        String str;
        Account account;
        View view3;
        switch (itemViewType) {
            case 0:
                if (view != null) {
                    view2 = view;
                } else {
                    view2 = this.f31492a.inflate(C6317h.play_drawer_profile_info, viewGroup, false);
                }
                PlayDrawerProfileInfoView playDrawerProfileInfoView = (PlayDrawerProfileInfoView) view2;
                this.f31497f = i;
                Account account2 = this.f31504m;
                String str2 = this.f31504m.name;
                playDrawerProfileInfoView.m28866a(account2, this.f31505n, this.f31506o, this.f31493b, this.f31512u);
                playDrawerProfileInfoView.m28872c(this.f31511t);
                if (!this.f31515x) {
                    if (this.f31514w) {
                        this.f31498g.mo2019a(account2).mo5377a(new ac(this, str2, playDrawerProfileInfoView, account2), new ad(), true);
                    } else {
                        this.f31498g.mo2019a(account2).mo5376a(new ae(this, str2, playDrawerProfileInfoView, account2), new af());
                    }
                    for (Account account3 : this.f31505n) {
                        str = account3.name;
                        if (!this.f31507p.contains(str)) {
                            if (this.f31514w) {
                                this.f31498g.mo2019a(account3).mo5377a(new C6303r(this, str), new C6304s(), true);
                            } else {
                                this.f31498g.mo2019a(account3).mo5376a(new C6305t(this, str), new C6306u());
                            }
                        }
                    }
                }
                playDrawerProfileInfoView.m28871b(this.f31508q);
                playDrawerProfileInfoView.f31405p = new ag(this);
                if (this.f31505n.length > 0) {
                    playDrawerProfileInfoView.m28870a(true);
                    playDrawerProfileInfoView.setOnClickListener(new ah());
                    playDrawerProfileInfoView.m28867a(new C6302q(this));
                    return playDrawerProfileInfoView;
                }
                playDrawerProfileInfoView.m28870a(false);
                playDrawerProfileInfoView.setOnClickListener(null);
                playDrawerProfileInfoView.m28867a(null);
                return playDrawerProfileInfoView;
            case 1:
                account = (Account) item;
                if (view != null) {
                    view3 = view;
                } else {
                    view3 = this.f31492a.inflate(C6317h.play_drawer_account_row, viewGroup, false);
                }
                view3 = (PlayDrawerAccountRow) view3;
                str = account.name;
                view3.m28852a((cv) this.f31506o.get(str), this.f31512u.mo3617a(account), this.f31493b);
                view3.setOnClickListener(new C6307v(this, str));
                return view3;
            case 2:
                if (view != null) {
                    return view;
                }
                return this.f31492a.inflate(C6317h.play_drawer_primary_actions_top_spacing, viewGroup, false);
            case 3:
                return m28915a(view, viewGroup, (C6298m) item, true, false);
            case 4:
                return m28915a(view, viewGroup, (C6298m) item, false, false);
            case 5:
                return m28915a(view, viewGroup, (C6298m) item, false, true);
            case 6:
                if (view != null) {
                    return view;
                }
                return this.f31492a.inflate(C6317h.play_drawer_secondary_actions_top_separator, viewGroup, false);
            case 7:
                C6299n c6299n = (C6299n) item;
                if (view != null) {
                    view3 = view;
                } else {
                    view3 = this.f31492a.inflate(C6317h.play_drawer_secondary_action, viewGroup, false);
                }
                view3 = (TextView) view3;
                view3.setText(c6299n.f31490a);
                view3.setOnClickListener(new C6310y(this, c6299n));
                view3.setGravity(8388627);
                return view3;
            case 8:
                if (view == null) {
                    view2 = (PlayDrawerDownloadSwitchRow) this.f31492a.inflate(C6317h.play_drawer_download_toggle, viewGroup, false);
                    view2.m28853a(this.f31501j);
                    view2.f31379h = new C6311z(this);
                } else {
                    view2 = (PlayDrawerDownloadSwitchRow) view;
                }
                view2.m28854a(this.f31509r);
                return view2;
            case 9:
                if (view != null) {
                    view2 = view;
                } else {
                    view2 = this.f31492a.inflate(C6317h.play_drawer_mini_profile_info_view, viewGroup, false);
                }
                PlayDrawerMiniProfileInfoView playDrawerMiniProfileInfoView = (PlayDrawerMiniProfileInfoView) view2;
                this.f31497f = i;
                playDrawerMiniProfileInfoView.m28860b(this.f31508q);
                playDrawerMiniProfileInfoView.m28857a(this.f31504m, this.f31512u);
                if (this.f31505n.length > 0) {
                    playDrawerMiniProfileInfoView.m28859a(true);
                    playDrawerMiniProfileInfoView.m28858a(new ab(this));
                    return playDrawerMiniProfileInfoView;
                }
                playDrawerMiniProfileInfoView.m28859a(false);
                playDrawerMiniProfileInfoView.m28858a(null);
                return playDrawerMiniProfileInfoView;
            case 10:
                account = (Account) item;
                if (view != null) {
                    view3 = view;
                } else {
                    view3 = this.f31492a.inflate(C6317h.play_drawer_mini_account_row, viewGroup, false);
                }
                view3 = (PlayDrawerMiniAccountRow) view3;
                String str3 = account.name;
                view3.m28855a(this.f31512u.mo3617a(account));
                view3.setOnClickListener(new C6308w(this, str3));
                return view3;
            default:
                throw new UnsupportedOperationException("View type " + itemViewType + " not supported");
        }
    }

    private final void m28916a(cv cvVar, String str, PlayDrawerProfileInfoView playDrawerProfileInfoView, Account account) {
        cv cvVar2 = (cv) this.f31506o.get(str);
        this.f31506o.put(str, cvVar);
        this.f31507p.add(str);
        if (cvVar2 == null && cvVar != null && str.equals(this.f31504m.name)) {
            int firstVisiblePosition = this.f31496e.getFirstVisiblePosition();
            Object obj = (this.f31497f < firstVisiblePosition || this.f31497f > (this.f31496e.getChildCount() + firstVisiblePosition) - 1) ? null : 1;
            if (obj != null) {
                playDrawerProfileInfoView.m28866a(account, this.f31505n, this.f31506o, this.f31493b, this.f31512u);
            }
        }
    }

    final void m28918a() {
        this.f31508q = !this.f31508q;
        notifyDataSetChanged();
    }

    private final View m28915a(View view, ViewGroup viewGroup, C6298m c6298m, boolean z, boolean z2) {
        View view2;
        if (view != null) {
            view2 = view;
        } else {
            view2 = this.f31492a.inflate(PlayDrawerPrimaryActionView.m28861a(z, z2), viewGroup, false);
        }
        PlayDrawerPrimaryActionView playDrawerPrimaryActionView = (PlayDrawerPrimaryActionView) view2;
        playDrawerPrimaryActionView.m28862a(viewGroup, z, z2);
        playDrawerPrimaryActionView.m28863a(c6298m, k.b(this.f31510s));
        playDrawerPrimaryActionView.setOnClickListener(new C6309x(this, c6298m));
        return playDrawerPrimaryActionView;
    }

    public final void mo5381a(C3714i c3714i) {
        this.f31512u = c3714i;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void mo5384b(boolean z) {
        this.f31515x = z;
    }
}
