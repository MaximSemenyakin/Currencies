package com.example.currencies.di

import com.example.currencies.activities.ChartActivity
import com.example.currencies.activities.MainActivity
import com.example.currencies.chart.LatestChart
import com.example.currencies.fragments.CurrinciesListFragment
import com.example.currencies.mvp.presenter.CurrenciesPresenter
import com.example.currencies.mvp.presenter.LatestChartPresenter
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, RestModule::class, MvpModule::class, ChartModule::class])
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(activity: ChartActivity)

    fun inject(presenter: CurrenciesPresenter)
    fun inject(presenter: LatestChartPresenter)

    fun inject(fragment: CurrinciesListFragment)

    fun inject(chart: LatestChart)


}