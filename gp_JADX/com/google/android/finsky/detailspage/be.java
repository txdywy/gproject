package com.google.android.finsky.detailspage;

import android.content.Context;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.detailsmodules.modules.secondaryactions.C2607c;
import com.google.android.finsky.detailsmodules.modules.subscriptions.C2611b;
import com.google.android.finsky.detailsmodules.modules.subscriptions.C2617h;
import com.google.android.finsky.detailsmodules.p183a.C2598b;
import com.google.android.finsky.detailsmodules.p183a.C2599c;
import com.google.android.finsky.detailspage.episodelist.C2644a;
import com.google.android.finsky.detailspage.seasonlist.C2664a;
import com.google.android.finsky.detailspage.videowatchaction.C2676a;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;

public final class be {
    public final C0988c f14272a;
    public final C2162a f14273b;
    public final C1287h f14274c;
    public final C1461c f14275d;
    public final C2206c f14276e;
    public final C2233o f14277f;
    public final C2611b f14278g;
    public final C2974a f14279h;

    be(C0988c c0988c, C2162a c2162a, C1287h c1287h, C1461c c1461c, C2206c c2206c, C2233o c2233o, C2611b c2611b, C2974a c2974a) {
        this.f14272a = c0988c;
        this.f14273b = c2162a;
        this.f14274c = c1287h;
        this.f14275d = c1461c;
        this.f14276e = c2206c;
        this.f14277f = c2233o;
        this.f14278g = c2611b;
        this.f14279h = c2974a;
    }

    final C2598b m13938a(Class cls, Context context, String str, C2599c c2599c, C2495w c2495w, C3748a c3748a, ad adVar) {
        if (cls == ct.class) {
            return new ct();
        }
        if (cls == am.class) {
            return new am();
        }
        if (cls == C2655i.class) {
            return new C2655i();
        }
        if (cls == go.class) {
            return new go();
        }
        if (cls == ad.class) {
            return new ad();
        }
        if (cls == C2676a.class) {
            return new C2676a();
        }
        if (cls == gy.class) {
            return new gy();
        }
        if (cls == ci.class) {
            return new ci();
        }
        if (cls == dc.class) {
            return new dc();
        }
        if (cls == cz.class) {
            return new cz();
        }
        if (cls == C2617h.class) {
            return new C2617h(str, c2599c, c2495w, c3748a, adVar, this.f14274c, this.f14276e, this.f14278g);
        } else if (cls == gq.class) {
            return new gq();
        } else {
            if (cls == bk.class) {
                return new bk();
            }
            if (cls == C2636c.class) {
                return new C2636c();
            }
            if (cls == C2652f.class) {
                return new C2652f();
            }
            if (cls == al.class) {
                return new al();
            }
            if (cls == dz.class) {
                return new dz();
            }
            if (cls == ef.class) {
                return new ef();
            }
            if (cls == bq.class) {
                return new bq();
            }
            if (cls == df.class) {
                return new df();
            }
            if (cls == de.class) {
                return new de();
            }
            if (cls == cv.class) {
                return new cv();
            }
            if (cls == C2688x.class) {
                return new C2688x();
            }
            if (cls == ce.class) {
                return new ce();
            }
            if (cls == C2634b.class) {
                return new C2634b();
            }
            if (cls == C2632a.class) {
                return new C2632a();
            }
            if (cls == fo.class) {
                return new fo();
            }
            if (cls == bt.class) {
                return new bt();
            }
            if (cls == C2664a.class) {
                return new C2664a();
            }
            if (cls == C2644a.class) {
                return new C2644a();
            }
            if (cls == eo.class) {
                return new eo();
            }
            if (cls == fg.class) {
                return new fg();
            }
            if (cls == el.class) {
                return new el();
            }
            if (cls == dx.class) {
                return new dx();
            }
            if (cls == gs.class) {
                return new gs();
            }
            if (cls == gw.class) {
                return new gw();
            }
            if (cls == dn.class) {
                return new dn();
            }
            if (cls == dw.class) {
                return new dw();
            }
            if (cls == C2607c.class) {
                return new C2607c(context, str, c2599c, c2495w, c3748a, adVar, this.f14272a, this.f14273b, this.f14274c, this.f14275d, this.f14276e, this.f14277f, this.f14279h);
            } else if (cls == dd.class) {
                return new dd();
            } else {
                if (cls == bn.class) {
                    return new bn();
                }
                if (cls == fd.class) {
                    return new fd();
                }
                if (cls == C2689y.class) {
                    return new C2689y();
                }
                if (cls == dl.class) {
                    return new dl();
                }
                if (cls == cr.class) {
                    return new cr();
                }
                if (cls == cp.class) {
                    return new cp();
                }
                if (cls == C2674v.class) {
                    return new C2674v(this.f14275d);
                }
                String valueOf = String.valueOf(cls);
                FinskyLog.m21669e(new StringBuilder(String.valueOf(valueOf).length() + 56).append("No corresponding creation method to instantiate module: ").append(valueOf).toString(), new Object[0]);
                return null;
            }
        }
    }
}
