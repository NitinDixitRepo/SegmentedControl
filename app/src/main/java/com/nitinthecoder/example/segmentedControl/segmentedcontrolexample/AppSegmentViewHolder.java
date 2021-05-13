package com.nitinthecoder.example.segmentedControl.segmentedcontrolexample;

import androidx.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.nitinthecoder.custom.widget.segmentedcontrol.item.column.SegmentViewHolder;

/**
 * Created by Robert Apikyan on 9/7/2017.
 */

public class AppSegmentViewHolder extends SegmentViewHolder<String> {
    TextView textView;
    public AppSegmentViewHolder(@NonNull View sectionView) {
        super(sectionView);
        textView = (TextView) sectionView.findViewById(R.id.text_view);
    }

    @Override
    protected void onSegmentBind(String segmentData) {
        textView.setText(segmentData);
    }
}
