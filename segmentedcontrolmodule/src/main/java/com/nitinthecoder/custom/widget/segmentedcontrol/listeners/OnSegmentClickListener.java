package com.nitinthecoder.custom.widget.segmentedcontrol.listeners;

import com.nitinthecoder.custom.widget.segmentedcontrol.item.column.SegmentViewHolder;

/**
 * Created by Robert Apikyan on 9/7/2017.
 */

public interface OnSegmentClickListener<D> {
    /**
     * @param segmentViewHolder, the clicked segment view holder instance
     */
    void onSegmentClick(SegmentViewHolder<D> segmentViewHolder);
}
