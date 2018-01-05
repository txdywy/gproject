package com.google.android.finsky.at;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;

public final class com.google.android.finsky.at.d extends android.support.v4.app.p
{

    d() {
        android.support.v4.app.p();
    }

    public final Dialog a(Bundle p0) {
        this.b(0);
        v0 = new ProgressDialog(this.h());
        v0.setProgressStyle(0);
        v1 = this.q.getInt("message_id", 2131952451);
        if (this.q.containsKey("message"))
            v0.setMessage(this.q.getString("message"));
        else if (v1 != 0)
            v0.setMessage(this.i().getString(v1));
        v0.setCancelable(0);
        v0.setIndeterminate(1);
        return v0;
    }

}
