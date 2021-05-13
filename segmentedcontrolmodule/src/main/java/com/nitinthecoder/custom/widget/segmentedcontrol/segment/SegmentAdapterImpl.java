package com.nitinthecoder.custom.widget.segmentedcontrol.segment;

import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.nitinthecoder.custom.widget.segmentedControl.R;
import com.nitinthecoder.custom.widget.segmentedcontrol.item.column.SegmentAdapter;

/**
 * Created by Robert Apikyan on 9/8/2017.
 */

public class SegmentAdapterImpl extends SegmentAdapter<CharSequence, SegmentViewHolderImpl> {

    @NonNull
    @Override
    protected SegmentViewHolderImpl onCreateViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new SegmentViewHolderImpl(layoutInflater.inflate(R.layout.item_segment_impl, null));
    }
}
