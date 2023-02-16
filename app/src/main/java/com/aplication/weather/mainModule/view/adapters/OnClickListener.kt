package com.aplication.weather.mainModule.view.adapters

import com.aplication.weather.common.entities.Forecast


interface OnClickListener {
    fun onClick(forecast: Forecast)
}