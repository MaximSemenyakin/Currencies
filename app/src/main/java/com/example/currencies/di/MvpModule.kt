package com.example.currencies.di

import com.example.currencies.mvp.presenter.CurrenciesPresenter
import com.example.currencies.mvp.presenter.LatestChartPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MvpModule {

    @Provides
    @Singleton
    fun provideCurrenciesPresenter() : CurrenciesPresenter = CurrenciesPresenter()

    @Provides
    @Singleton
    fun provideLatestCurrenciesPresenter() : LatestChartPresenter = LatestChartPresenter()

}