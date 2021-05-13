package com.nitinthecoder.custom.widget.segmentedcontrol;

import com.nitinthecoder.custom.widget.segmentedcontrol.item.column.SegmentViewHolder;

public interface SegmentConsumer<D> {
    void apply(SegmentViewHolder<D> segmentViewHolder);
}