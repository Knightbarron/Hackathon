package com.github.tenx.agtechfarmer.ui.Services;

import androidx.lifecycle.LiveData;

import com.github.tenx.agtechfarmer.data.models.functions.equipments.AllEquipmentsResponse;

public interface ServicesViewModelHelper {

    LiveData<AllEquipmentsResponse> getAllEquipments();

    LiveData<Boolean> getStatusForOrder();

}
