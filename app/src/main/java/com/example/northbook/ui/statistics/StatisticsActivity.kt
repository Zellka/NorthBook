package com.example.northbook.ui.statistics

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import androidx.annotation.RequiresApi
import com.example.northbook.R

import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.BarGraphSeries
import com.jjoe64.graphview.series.DataPoint


class StatisticsActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.northbook.R.layout.activity_statistics)
        supportActionBar?.hide()
        val graph = findViewById<View>(com.example.northbook.R.id.graph) as GraphView
        val series: BarGraphSeries<DataPoint> = BarGraphSeries(
            arrayOf(
                DataPoint(0.0, 11.0),
                DataPoint(1.0, 15.0),
                DataPoint(2.0, 13.0),
                DataPoint(3.0, 12.0),
                DataPoint(4.0, 16.0)
            )
        )
        series.color = getColor(R.color.purple_500)

        graph.addSeries(series)
    }

    fun back(view: View) {
        finish()
    }
}