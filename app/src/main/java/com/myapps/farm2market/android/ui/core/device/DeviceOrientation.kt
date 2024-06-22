package com.myapps.farm2market.android.ui.core.device

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import com.myapps.farm2market.android.ui.core.localConfiguration

enum class DeviceOrientation { Portrait, Landscape }

@Composable
internal fun getDeviceOrientation(configuration: Configuration = localConfiguration()) =
    if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) DeviceOrientation.Landscape
    else DeviceOrientation.Portrait