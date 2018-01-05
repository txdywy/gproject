package com.google.android.finsky.services;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.vending.p059e.C0644b;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.p060a.ag;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.activities.RateReviewActivity;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.cv.p177a.le;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.ratereview.C3964c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.dfe.api.C6287d;
import com.google.wireless.android.finsky.dfe.nano.by;
import com.google.wireless.android.finsky.dfe.nano.ft;
import com.google.wireless.android.finsky.dfe.nano.gp;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.concurrent.ExecutionException;

final class C4088v extends C0644b {
    public final /* synthetic */ ReviewsService f20460a;

    C4088v(ReviewsService reviewsService) {
        this.f20460a = reviewsService;
    }

    public final Bundle mo3907a(String str, String str2) {
        int i;
        C1473m c1473m = C1473m.f7980a;
        for (Account account : c1473m.mo2041U().mo1188d()) {
            if (account.name.equals(str)) {
                break;
            }
        }
        Account account2 = null;
        if (account2 == null) {
            FinskyLog.m21659a("No account found for %s", FinskyLog.m21655a(str));
            return null;
        }
        C2482j f = c1473m.mo2242f(str);
        C2744a c2744a = this.f20460a.f20424c;
        String a = C2744a.m14785a(this.f20460a, str2, null, f, 514);
        if (a == null) {
            return null;
        }
        FinskyLog.m21659a("Received rate&review request for %s from %s", str2, a);
        Bundle bundle = new Bundle();
        C1254c b = c1473m.mo2112b(str);
        C6287d aq = c1473m.aq();
        ag agVar = new ag();
        aq.mo5377a(agVar, agVar, true);
        try {
            cv cvVar = ((le) agVar.get()).f13004a;
            if (c1473m.dn() == null) {
                FinskyLog.m21659a("Toc was empty on Rate&Review, requesting it.", new Object[0]);
                ag agVar2 = new ag();
                C1473m.f7980a.mo2038R().m15108a(b, false, false, new C4089w(agVar2));
                try {
                    c1473m.mo2057a(new DfeToc((gp) agVar2.get()));
                } catch (InterruptedException e) {
                    FinskyLog.m21665c("Interrupted while trying to retrieve ToC", new Object[0]);
                    return bundle;
                } catch (ExecutionException e2) {
                    ReviewsService.m18994a(str2, f, a, e2, "Unable to retrieve ToC: %s", 1311);
                    return bundle;
                }
            }
            boolean booleanValue = ((Boolean) C0954a.ae.m5777b(str).m5760a()).booleanValue();
            if (C1473m.f7980a.aN().dj().mo2294a(12637755)) {
                booleanValue = ((Boolean) C0954a.ad.m5777b(str).m5760a()).booleanValue();
            }
            if (c1473m.dn().f14881a.f31775r && (!r2 || cvVar == null)) {
                return bundle;
            }
            Document document = cvVar != null ? new Document(cvVar) : null;
            C0660x agVar3 = new ag();
            b.mo1599a(C1289l.m7694a(str2), true, true, null, null, agVar3, (C0657w) agVar3);
            try {
                by byVar = (by) agVar3.get();
                cv cvVar2 = byVar.c;
                if (cvVar2 == null) {
                    FinskyLog.m21659a("No doc in details response for %s", str2);
                    return bundle;
                }
                iu iuVar;
                iu a2 = c1473m.mo2248i(str).m18689a(str2, null, false);
                if (a2 != null) {
                    iuVar = a2;
                } else if (TextUtils.isEmpty(byVar.l)) {
                    iuVar = byVar.o;
                } else {
                    agVar = new ag();
                    b.mo1632c(byVar.l, agVar, agVar);
                    try {
                        ft ftVar = (ft) agVar.get();
                        C1473m.f7980a.ac();
                        iuVar = C3964c.m18673a(ftVar, false);
                    } catch (InterruptedException e3) {
                        FinskyLog.m21665c("Interrupted while trying to retrieve user review", new Object[0]);
                        return bundle;
                    } catch (ExecutionException e22) {
                        ReviewsService.m18994a(str2, f, a, e22, "Unable to retrieve item user review: %s", 1313);
                        return bundle;
                    }
                }
                String str3 = byVar.l;
                booleanValue = document == null;
                Document document2 = new Document(cvVar2);
                if (iuVar != null) {
                    i = iuVar.f12717e;
                } else {
                    i = 0;
                }
                Context baseContext = this.f20460a.getBaseContext();
                C2495w a3 = this.f20460a.f20423b.m13184a(null);
                Intent intent = new Intent(C1473m.f7980a.f7981b, RateReviewActivity.class);
                intent.putExtra("account_name", str);
                intent.putExtra("doc_id", document2.f14885a.f12096c);
                intent.putExtra("doc_user_review_url", str3);
                intent.putExtra("doc_title", document2.f14885a.f12100g);
                intent.putExtra("author", document);
                intent.putExtra("backend", document2.f14885a.f12099f);
                intent.putExtra("previous_rating", i);
                if (iuVar != null) {
                    intent.putExtra("previous_title", iuVar.f12719g);
                    intent.putExtra("previous_comment", iuVar.f12720h);
                    if (iuVar.f12716d != null) {
                        intent.putExtra("previous_author", ParcelableProto.m21671a(iuVar.f12716d));
                    }
                }
                intent.putExtra("server_logs_cookie", document2.f14885a.f12087D);
                intent.putExtra("impression_id", C2482j.m13315j());
                intent.putExtra("is_external_request", true);
                intent.putExtra("is_anonymous_rating", booleanValue);
                intent.putExtra("doc_creator", document2.f14885a.f12102i);
                Resources resources = baseContext.getResources();
                C1473m.f7980a.bR();
                bd a4 = af.m9220a(document2, 0, resources.getDimensionPixelSize(C7582R.dimen.base_row_height), new int[]{4, 0});
                if (a4 != null) {
                    intent.putExtra("doc_thumbnail_url", a4.f11860f);
                }
                intent.putExtra("doc_thumbnail_is_fife", a4.f11863i);
                a3.m13380b(str).m13376a(intent);
                intent.setData(Uri.fromParts("reviewsservice", cvVar2.f12096c, Integer.toString(ReviewsService.f20422a.getAndIncrement())));
                bundle.putParcelable("rate_and_review_intent", PendingIntent.getActivity(this.f20460a, 0, intent, MemoryMappedFileBuffer.DEFAULT_SIZE));
                bundle.putInt("rate_and_review_request_code", 43);
                bundle.putString("doc_id", cvVar2.f12096c);
                bundle.putString("doc_title", cvVar2.f12100g);
                if (iuVar != null) {
                    bundle.putInt("rating", iuVar.f12717e);
                    bundle.putString("review_title", iuVar.f12719g);
                    bundle.putString("review_comment", iuVar.f12720h);
                }
                if (document != null) {
                    bundle.putString("author_title", document.f14885a.f12100g);
                    bundle.putString("author_profile_image_url", ((bd) document.m14644c(4).get(0)).f11860f);
                }
                c2744a = this.f20460a.f20424c;
                C2744a.m14787a(f, 514, str2, 0, a);
                return bundle;
            } catch (InterruptedException e4) {
                FinskyLog.m21665c("Interrupted while trying to retrieve item details", new Object[0]);
                return bundle;
            } catch (ExecutionException e222) {
                ReviewsService.m18994a(str2, f, a, e222, "Unable to retrieve item details: %s", 1312);
                return bundle;
            }
        } catch (InterruptedException e5) {
            FinskyLog.m21659a("Interrupted while trying to retrieve user profile", new Object[0]);
            return bundle;
        } catch (ExecutionException e2222) {
            ReviewsService.m18994a(str2, f, a, e2222, "Unable to retrieve user profile: %s", 1310);
            return bundle;
        }
    }
}
