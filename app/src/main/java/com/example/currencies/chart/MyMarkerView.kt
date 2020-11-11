package com.example.currencies.chart

import android.annotation.SuppressLint
import android.content.Context
import android.widget.TextView
import com.example.currencies.R
import com.example.currencies.dateToString
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.utils.MPPointF
import kotlinx.android.synthetic.main.custom_marker_view.view.*

@SuppressLint
class MyMarkerView(context: Context, layoutResource: Int) : MarkerView(context, layoutResource) {

    private val tvContext: TextView

    init {
        tvContext = findViewById(R.id.tvContent)
    }

    override fun refreshContent(e: Entry?, highlight: Highlight?) {
        tvContext.text = e?.y.toString() + "\n" + e?.x?.dateToString("MMM dd, yyyy")
        super.refreshContent(e, highlight)
    }

    override fun getOffset(): MPPointF {
        return MPPointF((-(width / 2)).toFloat(), (-height).toFloat())
    }

}