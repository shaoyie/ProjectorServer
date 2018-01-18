package com.iqicool.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqicool.model.Device;
import com.iqicool.repository.DeviceRepository;

@Service
@Transactional
public class DeviceService {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	public Device findBySn(String sn){
		//Find device by sn
		Device device=deviceRepository.findBySn(sn);
		if(device==null){
			//If there's not, which means a new device, need to be initialized
			device=new Device();
			device.setSn(sn);
			device.setCreatedAt(new Date());
			device = deviceRepository.save(device);
		}
		return device;
	}
}
