package id.ac.poliban.mi.vc.reihan.wisataapp_e020320061.decoration;

import android.graphics.Rect;

import androidx.annotation.IntRange;
import androidx.annotation.Px;
import androidx.recyclerview.widget.OrientationHelper;


class MarginDelegate {

    private final int spanCount;
    private final int spaceItem;

    MarginDelegate(int spanCount, @Px int spaceItem) {
        this.spanCount = spanCount;
        this.spaceItem = spaceItem;
    }

    void calculateMargin(Rect outRect,
                         int position,
                         int spanCurrent,
                         int itemCount,
                         @IntRange(from = 0, to = 1) int orientation,
                         boolean isReverse,
                         boolean isRTL) {
        if (orientation == OrientationHelper.VERTICAL) {
            outRect.left = spanCurrent * spaceItem / spanCount;
            outRect.right = spaceItem - (spanCurrent + 1) * spaceItem / spanCount;
            if (isReverse) {
                if (position >= spanCount) outRect.bottom = spaceItem;
            } else {
                if (position >= spanCount) outRect.top = spaceItem;
            }
        } else if (orientation == OrientationHelper.HORIZONTAL) {
            outRect.top = spanCurrent * spaceItem / spanCount;
            outRect.bottom = spaceItem - (spanCurrent + 1) * spaceItem / spanCount;
            if (isReverse) {
                if (position >= spanCount) outRect.right = spaceItem;
            } else {
                if (position >= spanCount) outRect.left = spaceItem;
            }
        }
    }
}

// Nama  : Ahmad Reihan H
// NIM   : E020320061
// Kelas : 5C
// Prodi : Manajemen Informatika