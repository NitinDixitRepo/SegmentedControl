package com.nitinthecoder.custom.widget.segmentedcontrol.item.row;

import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import section_layout.widget.custom.android.com.sectionlayout.SectionLayout;
import section_layout.widget.custom.android.com.sectionlayout.distributive_section_layout.DistributiveSectionLayout;
import com.nitinthecoder.custom.widget.segmentedcontrol.item.column.SegmentAdapter;
import com.nitinthecoder.custom.widget.segmentedcontrol.item.column.SegmentData;

/**
 * Created by Robert Apikyan on 9/7/2017.
 */

public class SegmentRowAdapter<D> extends SectionLayout.Adapter<Boolean, SegmentRowViewHolder<SegmentData<D>>> {

    private final SegmentAdapter segmentAdapter;

    public SegmentRowAdapter(SegmentAdapter segmentAdapter) {
        this.segmentAdapter = segmentAdapter;
    }

    @NonNull
    @Override
    protected SegmentRowViewHolder<SegmentData<D>> onCreateViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new SegmentRowViewHolder<>(new DistributiveSectionLayout<SegmentData<D>>(layoutInflater.getContext()), segmentAdapter);
    }
}
