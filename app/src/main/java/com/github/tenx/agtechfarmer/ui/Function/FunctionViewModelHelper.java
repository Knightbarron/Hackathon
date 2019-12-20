package com.github.tenx.agtechfarmer.ui.Function;

import androidx.lifecycle.LiveData;

import com.github.tenx.agtechfarmer.data.models.functions.appointments.AllExpertsResponse;
import com.github.tenx.agtechfarmer.data.models.functions.appointments.ExpertProfileBody;
import com.github.tenx.agtechfarmer.data.models.functions.appointments.FarmerAppointmentsResponse;
import com.github.tenx.agtechfarmer.data.models.functions.equipments.AllEquipmentsResponse;
import com.github.tenx.agtechfarmer.data.models.products.GetAllProductsResponse;

public interface FunctionViewModelHelper {

    LiveData<FarmerAppointmentsResponse> getAppointmentsForFarmer();

    LiveData<Boolean> getResponsePostAppointment();

    LiveData<AllExpertsResponse> getAllExperts();

    LiveData<ExpertProfileBody> getSingleExpert();

    LiveData<Boolean> statusCreateEquipment();

    LiveData<AllEquipmentsResponse> getEquipmentsForFarmer();

    LiveData<GetAllProductsResponse> getAllProducts();

    LiveData<Boolean> patchMyProfile( );
}
