package com.myapps.farm2market.android.ui.core.grid

import androidx.compose.runtime.Composable
import com.myapps.farm2market.android.ui.core.device.DeviceOrientation
import com.myapps.farm2market.android.ui.core.device.DeviceType
import com.myapps.farm2market.android.ui.core.device.getDeviceOrientation
import com.myapps.farm2market.android.ui.core.device.getDeviceType

data class GridInformation(
    val columns: Int,
    val rows: Int
)

@Composable
internal fun getGridInformation(
    deviceType: DeviceType = getDeviceType(),
    deviceOrientation: DeviceOrientation = getDeviceOrientation()
): GridInformation =
    if (deviceType == DeviceType.Phone) {
        if (deviceOrientation == DeviceOrientation.Portrait)
            GridInformation(columns = 4, rows = 6) else GridInformation(columns = 6, rows = 4)
    } else {
        if (deviceOrientation == DeviceOrientation.Portrait)
            GridInformation(columns = 6, rows = 8) else GridInformation(columns = 6, rows = 8)
    }