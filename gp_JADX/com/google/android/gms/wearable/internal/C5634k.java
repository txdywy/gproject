package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.FutureTask;

final class C5634k extends cb {
    public /* synthetic */ PutDataRequest f28609a;

    C5634k(C5058o c5058o, PutDataRequest putDataRequest) {
        this.f28609a = putDataRequest;
        super(c5058o);
    }

    public final /* synthetic */ C4980w mo4495a(Status status) {
        return new C5639p(status, null);
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        bt btVar = (bt) c4948f;
        PutDataRequest putDataRequest = this.f28609a;
        for (Entry value : putDataRequest.m26612a().entrySet()) {
            Asset asset = (Asset) value.getValue();
            if (asset.f28554a == null && asset.f28555b == null && asset.f28556c == null && asset.f28557d == null) {
                String valueOf = String.valueOf(putDataRequest.f28568b);
                String valueOf2 = String.valueOf(asset);
                throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append("Put for ").append(valueOf).append(" contains invalid asset: ").append(valueOf2).toString());
            }
        }
        PutDataRequest a = PutDataRequest.m26609a(putDataRequest.f28568b);
        a.f28570d = putDataRequest.f28570d;
        if ((putDataRequest.f28571e == 0 ? 1 : null) != null) {
            a.f28571e = 0;
        }
        List arrayList = new ArrayList();
        for (Entry value2 : putDataRequest.m26612a().entrySet()) {
            Asset asset2 = (Asset) value2.getValue();
            if (asset2.f28554a != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(asset2);
                        String valueOf4 = String.valueOf(createPipe[0]);
                        String valueOf5 = String.valueOf(createPipe[1]);
                        Log.d("WearableClient", new StringBuilder(((String.valueOf(valueOf3).length() + 61) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append("processAssets: replacing data with FD in asset: ").append(valueOf3).append(" read:").append(valueOf4).append(" write:").append(valueOf5).toString());
                    }
                    a.m26611a((String) value2.getKey(), Asset.m26607a(createPipe[0]));
                    Runnable futureTask = new FutureTask(new bu(createPipe[1], asset2.f28554a));
                    arrayList.add(futureTask);
                    btVar.f28601a.submit(futureTask);
                } catch (Throwable e) {
                    valueOf = String.valueOf(putDataRequest);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 60).append("Unable to create ParcelFileDescriptor for asset in request: ").append(valueOf).toString(), e);
                }
            } else if (asset2.f28557d != null) {
                try {
                    a.m26611a((String) value2.getKey(), Asset.m26607a(btVar.f25418k.getContentResolver().openFileDescriptor(asset2.f28557d, "r")));
                } catch (FileNotFoundException e2) {
                    new br(this, arrayList).mo5072a(new zzfs(4005, null));
                    String valueOf6 = String.valueOf(asset2.f28557d);
                    Log.w("WearableClient", new StringBuilder(String.valueOf(valueOf6).length() + 28).append("Couldn't resolve asset URI: ").append(valueOf6).toString());
                    return;
                }
            } else {
                a.m26611a((String) value2.getKey(), asset2);
            }
        }
        ((at) btVar.m23032u()).mo5106a(new br(this, arrayList), a);
    }
}
