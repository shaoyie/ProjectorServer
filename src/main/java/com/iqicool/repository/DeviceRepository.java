package com.iqicool.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.iqicool.model.Device;

public interface DeviceRepository extends PagingAndSortingRepository<Device, Long> {

	Device findBySn(String sn); 
}
