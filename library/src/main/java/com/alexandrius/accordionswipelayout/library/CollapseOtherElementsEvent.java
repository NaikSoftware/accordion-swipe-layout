package com.alexandrius.accordionswipelayout.library;

import android.support.v7.widget.RecyclerView;

/**
 * Created by savchenko_n on 15.06.17.
 */
public class CollapseOtherElementsEvent {

    public final RecyclerView recyclerView;
    public final SwipeLayout currentSwipeLayout;

    public CollapseOtherElementsEvent(RecyclerView recyclerView, SwipeLayout currentSwipeLayout) {
        this.recyclerView = recyclerView;
        this.currentSwipeLayout = currentSwipeLayout;
    }

    @Override
    public String toString() {
        return "Event from " + currentSwipeLayout.toString();
    }
}
