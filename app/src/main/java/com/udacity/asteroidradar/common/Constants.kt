package com.udacity.asteroidradar.common

import com.udacity.asteroidradar.BuildConfig

object Constants {
    const val API_QUERY_DATE_FORMAT = "YYYY-MM-dd"
    const val DEFAULT_END_DATE_DAYS = 7
    const val BASE_URL = "https://api.nasa.gov/"
    const val api_key = BuildConfig.NASA_API_KEY
    const val WORK_NAME = "RefreshDataWorker"
}

