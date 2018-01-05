package com.caverock.androidsvg;

import android.content.res.Resources;
import android.util.Log;
import java.io.FileNotFoundException;

final class cv extends cu {
    public final /* synthetic */ SVGImageView f4460c;

    cv(SVGImageView sVGImageView) {
        this.f4460c = sVGImageView;
    }

    private final C0722q m4696a(String... strArr) {
        String str;
        String message;
        Resources resources = this.f4460c.getResources();
        C0722q a = C0722q.f4613a.m4690a(strArr[0], m4694a(resources));
        if (a != null) {
            return a;
        }
        try {
            a = C0722q.m4785a(this.f4460c.getContext().getAssets(), strArr[0]);
            m4695a(a, resources);
            C0722q.f4613a.m4692a(a, strArr[0]);
            return a;
        } catch (SVGParseException e) {
            str = strArr[0];
            message = e.getMessage();
            Log.e("SVGImageView", new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(message).length()).append("Error loading file ").append(str).append(": ").append(message).toString());
            return null;
        } catch (FileNotFoundException e2) {
            String str2 = "SVGImageView";
            str = "File not found: ";
            message = String.valueOf(strArr[0]);
            Log.e(str2, message.length() != 0 ? str.concat(message) : new String(str));
            return null;
        } catch (Throwable e3) {
            Throwable th = e3;
            str = "SVGImageView";
            String str3 = "Unable to load asset file: ";
            message = String.valueOf(strArr[0]);
            Log.e(str, message.length() != 0 ? str3.concat(message) : new String(str3), th);
            return null;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C0722q c0722q = (C0722q) obj;
        if (c0722q != null) {
            this.f4460c.setImageDrawable(new cs(c0722q, this.a));
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4696a((String[]) objArr);
    }
}
