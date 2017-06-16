package com.alexandrius.accordionswipelayout.library;

import android.support.v7.widget.RecyclerView;

/**
 * Created by savchenko_n on 15.06.17.
 */
public class CollapseAllElementsEvent {

    public final RecyclerView recyclerView;

    public CollapseAllElementsEvent(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }
}
