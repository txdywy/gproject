package com.google.android.finsky.bg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.text.TextUtils;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gj;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C1608h {
    public static List f8519a;
    public static boolean f8520b;
    public static C1461c f8521c;

    public static int m9243a(Context context, int i) {
        return context.getResources().getColor(C1608h.m9251b(i));
    }

    public static int m9253b(Context context, int i) {
        return context.getResources().getColor(C1608h.m9256d(i));
    }

    public static int m9241a(int i) {
        switch (i) {
            case 1:
                return C7582R.color.play_books_primary;
            case 2:
                return C7582R.color.play_music_primary;
            case 3:
                if (f8520b) {
                    return C7582R.color.play_apps_ent_primary;
                }
                return C7582R.color.play_apps_primary;
            case 4:
                return C7582R.color.play_movies_primary;
            case 6:
                return C7582R.color.play_newsstand_primary;
            default:
                if (f8520b) {
                    return C7582R.color.play_apps_ent_primary;
                }
                return C7582R.color.play_multi_primary;
        }
    }

    public static int m9251b(int i) {
        switch (i) {
            case 1:
                return C7582R.color.play_books_primary;
            case 2:
                return C7582R.color.play_music_primary;
            case 3:
                if (f8520b) {
                    return C7582R.color.play_apps_ent_primary;
                }
                return C7582R.color.play_apps_primary;
            case 4:
                return C7582R.color.play_movies_primary;
            case 6:
                return C7582R.color.play_newsstand_primary;
            default:
                if (f8520b) {
                    return C7582R.color.play_apps_ent_primary;
                }
                return C7582R.color.play_multi_primary;
        }
    }

    public static int m9254c(int i) {
        switch (i) {
            case 1:
                return C7582R.color.play_books_primary_stateful;
            case 2:
                return C7582R.color.play_music_primary_stateful;
            case 3:
                if (f8520b) {
                    return C7582R.color.play_apps_ent_primary_stateful;
                }
                return C7582R.color.play_apps_primary_stateful;
            case 4:
                return C7582R.color.play_movies_primary_stateful;
            case 6:
                return C7582R.color.play_newsstand_primary_stateful;
            default:
                if (f8520b) {
                    return C7582R.color.play_apps_ent_primary_stateful;
                }
                return C7582R.color.play_multi_primary_stateful;
        }
    }

    public static int m9256d(int i) {
        switch (i) {
            case 1:
                return C7582R.color.play_books_secondary;
            case 2:
                return C7582R.color.play_music_secondary;
            case 3:
                if (f8520b) {
                    return C7582R.color.play_apps_ent_secondary;
                }
                return C7582R.color.play_apps_secondary;
            case 4:
                return C7582R.color.play_movies_secondary;
            case 6:
                return C7582R.color.play_newsstand_secondary;
            case 13:
                return C7582R.color.play_multi_secondary;
            default:
                return f8520b ? C7582R.color.play_apps_ent_secondary : C7582R.color.play_multi_secondary;
        }
    }

    public static ColorStateList m9255c(Context context, int i) {
        int i2 = C7582R.color.play_apps_ent_secondary_text;
        switch (i) {
            case 1:
                i2 = C7582R.color.play_books_secondary;
                break;
            case 2:
                i2 = C7582R.color.play_music_secondary;
                break;
            case 3:
                if (!f8520b) {
                    i2 = C7582R.color.play_apps_secondary;
                    break;
                }
                break;
            case 4:
                i2 = C7582R.color.play_movies_secondary;
                break;
            case 6:
                i2 = C7582R.color.play_newsstand_secondary;
                break;
            default:
                if (!f8520b) {
                    i2 = C7582R.color.play_multi_secondary_text;
                    break;
                }
                break;
        }
        return context.getResources().getColorStateList(i2);
    }

    public static ColorStateList m9257d(Context context, int i) {
        int i2 = C7582R.color.play_apps_ent_primary_edittext;
        switch (i) {
            case 1:
                i2 = C7582R.color.play_books_primary_edittext;
                break;
            case 2:
                i2 = C7582R.color.play_music_primary_edittext;
                break;
            case 3:
                if (!f8520b) {
                    i2 = C7582R.color.play_apps_primary_edittext;
                    break;
                }
                break;
            case 4:
                i2 = C7582R.color.play_movies_primary_edittext;
                break;
            case 6:
                i2 = C7582R.color.play_newsstand_primary_edittext;
                break;
            default:
                if (!f8520b) {
                    i2 = C7582R.color.play_multi_primary_edittext;
                    break;
                }
                break;
        }
        return context.getResources().getColorStateList(i2);
    }

    public static String m9247a(int i, List list) {
        if (i == 0) {
            i = 3;
        }
        if (list == null) {
            return null;
        }
        for (gj gjVar : list) {
            if (gjVar.c == i && !TextUtils.isEmpty(gjVar.f)) {
                return gjVar.f;
            }
        }
        return null;
    }

    public static int m9259e(Context context, int i) {
        Resources resources = context.getResources();
        if (f8521c.dj().mo2294a(12636865)) {
            switch (i) {
                case 1:
                    return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_app_size_three_lines_v2);
                case 2:
                case 4:
                    return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size_v2);
                case 3:
                case 5:
                case 6:
                case 16:
                case 17:
                case 44:
                case 64:
                    return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_small_size_v2);
                case 8:
                case 30:
                    return resources.getDimensionPixelSize(C7582R.dimen.play_profile_avatar_size);
                case 24:
                case 25:
                    return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size_v2);
                default:
                    throw new IllegalArgumentException("Unsupported document type (" + i + ")");
            }
        }
        switch (i) {
            case 1:
                return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_app_size_three_lines);
            case 2:
            case 4:
                return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size);
            case 3:
            case 5:
            case 6:
            case 16:
            case 17:
            case 44:
            case 64:
                return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_small_size);
            case 8:
            case 30:
                return resources.getDimensionPixelSize(C7582R.dimen.play_profile_avatar_size);
            case 24:
            case 25:
                return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size);
            default:
                throw new IllegalArgumentException("Unsupported document type (" + i + ")");
        }
    }

    public static int m9261f(Context context, int i) {
        Resources resources = context.getResources();
        if (f8521c.dj().mo2294a(12636865)) {
            switch (i) {
                case 1:
                    return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_app_size_three_lines_v2);
                case 2:
                case 4:
                    return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size_v2);
                case 3:
                    return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_small_size_v2) / 2;
                case 5:
                case 6:
                case 16:
                case 64:
                    return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size_v2);
                case 8:
                case 30:
                    return resources.getDimensionPixelSize(C7582R.dimen.play_profile_avatar_size);
                case 17:
                case 25:
                    return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size_v2);
                case 24:
                    return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size_v2);
                case 44:
                    return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_small_size_v2);
                default:
                    throw new IllegalArgumentException("Unsupported document type (" + i + ")");
            }
        }
        switch (i) {
            case 1:
                return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_app_size_three_lines);
            case 2:
            case 4:
                return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size);
            case 3:
                return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_small_size) / 2;
            case 5:
            case 6:
            case 16:
            case 64:
                return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size);
            case 8:
            case 30:
                return resources.getDimensionPixelSize(C7582R.dimen.play_profile_avatar_size);
            case 17:
            case 25:
                return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size);
            case 24:
                return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_large_size);
            case 44:
                return resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_small_size);
            default:
                throw new IllegalArgumentException("Unsupported document type (" + i + ")");
        }
    }

    public static int m9258e(int i) {
        switch (i) {
            case 1:
            case 6:
                return C7582R.string.read;
            case 2:
                return C7582R.string.listen;
            case 4:
                return C7582R.string.play;
            default:
                return C7582R.string.open;
        }
    }

    public static int m9260f(int i) {
        switch (i) {
            case 1:
                return C7582R.drawable.play_action_button_books_secondary;
            case 2:
                return C7582R.drawable.play_action_button_music_secondary;
            case 3:
                if (f8520b) {
                    return C7582R.drawable.play_action_button_apps_ent_secondary;
                }
                return C7582R.drawable.play_action_button_apps_secondary;
            case 4:
                return C7582R.drawable.play_action_button_movies_secondary;
            case 6:
                return C7582R.drawable.play_action_button_newsstand_secondary;
            default:
                if (f8520b) {
                    return C7582R.drawable.play_action_button_apps_ent_secondary;
                }
                return C7582R.drawable.play_action_button_multi_secondary;
        }
    }

    public static int m9262g(int i) {
        switch (i) {
            case 1:
                return C7582R.drawable.play_action_button_books;
            case 2:
                return C7582R.drawable.play_action_button_music;
            case 3:
                if (f8520b) {
                    return C7582R.drawable.play_action_button_apps_ent_base;
                }
                return C7582R.drawable.play_action_button_apps;
            case 4:
                return C7582R.drawable.play_action_button_movies;
            case 6:
                return C7582R.drawable.play_action_button_newsstand;
            case 10:
                return C7582R.drawable.play_action_button_commerce;
            default:
                if (f8520b) {
                    return C7582R.drawable.play_action_button_apps_ent_base;
                }
                return C7582R.drawable.play_action_button_multi;
        }
    }

    public static String m9249a(String str, int i, Resources resources) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        switch (i) {
            case 1:
                return resources.getString(C7582R.string.content_description_thumbnail_application, new Object[]{str});
            case 2:
            case 4:
                return resources.getString(C7582R.string.content_description_thumbnail_album, new Object[]{str});
            case 3:
                return resources.getString(C7582R.string.content_description_thumbnail_artist, new Object[]{str});
            case 5:
                return resources.getString(C7582R.string.content_description_thumbnail_book, new Object[]{str});
            case 6:
                return resources.getString(C7582R.string.content_description_thumbnail_movie, new Object[]{str});
            case 8:
                return resources.getString(C7582R.string.content_description_thumbnail_developer, new Object[]{str});
            case 16:
            case 17:
            case 24:
            case 25:
                return resources.getString(C7582R.string.content_description_thumbnail_newsstand, new Object[]{str});
            case 18:
            case 19:
            case 20:
                return resources.getString(C7582R.string.content_description_thumbnail_tvshow, new Object[]{str});
            case 44:
                return resources.getString(C7582R.string.content_description_thumbnail_book_series, new Object[]{str});
            case 64:
                return resources.getString(C1592a.aa.intValue(), new Object[]{str});
            default:
                return null;
        }
    }

    public static String m9248a(Resources resources, int i) {
        switch (i) {
            case 1:
                return resources.getString(C7582R.string.rate_this_app);
            case 2:
                return resources.getString(C7582R.string.rate_this_music_album);
            case 4:
                return resources.getString(C7582R.string.rate_this_music_track);
            case 5:
                return resources.getString(C7582R.string.rate_this_book);
            case 6:
                return resources.getString(C7582R.string.rate_this_movie);
            case 16:
            case 17:
            case 24:
            case 25:
                return resources.getString(C7582R.string.rate_this_publication);
            case 18:
                return resources.getString(C7582R.string.rate_this_tv_show);
            case 19:
                return resources.getString(C7582R.string.rate_this_tv_season);
            case 20:
                return resources.getString(C7582R.string.rate_this_tv_episode);
            case 44:
                return resources.getString(C7582R.string.rate_this_book_series);
            case 64:
                return resources.getString(C1592a.ab.intValue(), new Object[]{resources.getString(C7582R.string.audiobook_format)});
            default:
                throw new IllegalArgumentException("Unsupported doc type (" + i + ")");
        }
    }

    public static int m9263g(Context context, int i) {
        int i2 = C7582R.color.status_bar_apps_ent;
        switch (i) {
            case 1:
                i2 = C7582R.color.status_bar_books;
                break;
            case 2:
                i2 = C7582R.color.status_bar_music;
                break;
            case 3:
                if (!f8520b) {
                    i2 = C7582R.color.status_bar_apps;
                    break;
                }
                break;
            case 4:
                i2 = C7582R.color.status_bar_movies;
                break;
            case 6:
                i2 = C7582R.color.status_bar_newsstand;
                break;
            default:
                if (!f8520b) {
                    i2 = C7582R.color.status_bar_multi;
                    break;
                }
                break;
        }
        return context.getResources().getColor(i2);
    }

    public static int m9242a(int i, int i2) {
        switch (i) {
            case 1:
                return C7582R.raw.ic_play_books_24px;
            case 2:
                return C7582R.raw.ic_music_24dp;
            case 3:
                if (i2 == 1) {
                    return C7582R.raw.ic_games_24px;
                }
                if (f8521c.dj().mo2294a(12617606) || f8521c.dj().mo2294a(12628642)) {
                    return C7582R.raw.ic_home_24px;
                }
                return C7582R.raw.ic_play_apps_24dp;
            case 4:
                return C7582R.raw.ic_play_movies_24px;
            case 6:
                return C7582R.raw.ic_play_newsstand_24px;
            case 13:
                return C7582R.raw.ic_entertainment_24dp;
            default:
                return -1;
        }
    }

    public static Drawable m9246a(Context context, int i, int i2) {
        Drawable mutate = C0259a.m1526e(C0216d.m1112a(context, i)).mutate();
        C0259a.m1514a(mutate, C1608h.m9243a(context, i2));
        return mutate;
    }

    public static Drawable m9264h(Context context, int i) {
        return C1608h.m9246a(context, (int) C7582R.drawable.ic_reward_store, i);
    }

    public static int m9252b(int i, int i2) {
        switch (i) {
            case 1:
                return C7582R.string.corpus_title_books;
            case 2:
                return C7582R.string.corpus_title_music;
            case 3:
                if (i2 == 1) {
                    return C7582R.string.games_corpus_title;
                }
                if (f8521c.dj().mo2294a(12617606) || f8521c.dj().mo2294a(12628642)) {
                    return C7582R.string.menu_home_v3;
                }
                return C7582R.string.corpus_title_apps;
            case 4:
                return C7582R.string.corpus_title_movies;
            case 6:
                return C7582R.string.corpus_title_newsstand;
            default:
                throw new IllegalArgumentException("Unsupported backendId (" + i + ")");
        }
    }

    public static int m9244a(List list) {
        if (list == null) {
            return C7582R.string.movies_music_books;
        }
        List a = C1608h.m9250a();
        int a2 = C1608h.m9245a(a, list);
        if (a2 > 4 || a2 <= 0) {
            FinskyLog.m21669e("Invalid digital content corpora count available [%d]", Integer.valueOf(a2));
            return C7582R.string.movies_music_books;
        }
        if (a2 == 1) {
            for (int i = 0; i < a.size(); i++) {
                if (list.contains(a.get(i))) {
                    return C1608h.m9252b(((Integer) a.get(i)).intValue(), 0);
                }
            }
        }
        switch (a2) {
            case 2:
                if (list.contains(Integer.valueOf(4)) && list.contains(Integer.valueOf(2))) {
                    return C7582R.string.movies_music;
                }
                if (list.contains(Integer.valueOf(4)) && list.contains(Integer.valueOf(1))) {
                    return C7582R.string.movies_books;
                }
                if (list.contains(Integer.valueOf(4)) && list.contains(Integer.valueOf(6))) {
                    return C7582R.string.movies_newsstand;
                }
                if (list.contains(Integer.valueOf(2)) && list.contains(Integer.valueOf(1))) {
                    return C7582R.string.music_books;
                }
                if (list.contains(Integer.valueOf(2)) && list.contains(Integer.valueOf(6))) {
                    return C7582R.string.music_newsstand;
                }
                if (list.contains(Integer.valueOf(1)) && list.contains(Integer.valueOf(6))) {
                    return C7582R.string.books_newsstand;
                }
                break;
            case 3:
                if (!list.contains(Integer.valueOf(6))) {
                    return C7582R.string.movies_music_books;
                }
                if (!list.contains(Integer.valueOf(1))) {
                    return C7582R.string.movies_music_newsstand;
                }
                if (!list.contains(Integer.valueOf(2))) {
                    return C7582R.string.movies_books_newsstand;
                }
                if (!list.contains(Integer.valueOf(4))) {
                    return C7582R.string.music_books_newsstand;
                }
                break;
            case 4:
                return C7582R.string.movies_music_books;
        }
        FinskyLog.m21669e("Error in choosing entertainment corpus title", new Object[0]);
        return C7582R.string.movies_music_books;
    }

    public static List m9250a() {
        if (f8519a == null) {
            List arrayList = new ArrayList();
            f8519a = arrayList;
            arrayList.add(Integer.valueOf(4));
            f8519a.add(Integer.valueOf(2));
            f8519a.add(Integer.valueOf(1));
            f8519a.add(Integer.valueOf(6));
        }
        return f8519a;
    }

    public static int m9245a(List list, List list2) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3;
            if (list2.contains(list.get(i2))) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            i += i3;
        }
        return i;
    }
}
