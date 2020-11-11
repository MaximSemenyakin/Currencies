package com.example.currencies.di

import com.example.currencies.YearValueFormatter
import com.example.currencies.chart.LatestChart
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ChartModule {

    @Provides
    @Singleton
    fun provideLatestChart() = LatestChart()

    @Provides
    @Singleton
    fun provideYearFormatter() = YearValueFormatter()

}