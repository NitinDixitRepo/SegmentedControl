package com.nitinthecoder.example.segmentedControl.segmentedcontrolexample;

import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.nitinthecoder.custom.widget.segmentedcontrol.item.column.SegmentAdapter;

/**
 * Created by Robert Apikyan on 9/7/2017.
 */

public class AppSegmentAdapter extends SegmentAdapter<String, AppSegmentViewHolder> {

    @NonNull
    @Override
    protected AppSegmentViewHolder onCreateViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return new AppSegmentViewHolder(layoutInflater.inflate(R.layout.item_segment, null));
    }
}
