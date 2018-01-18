package com.iqicool.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iqicool.model.Device;
import com.iqicool.service.DeviceService;

@RestController
@RequestMapping("device")
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	
	@GetMapping("device/{sn}")
	//@Secured("ROLE_USER")
	Device deviceInfo(@PathVariable String sn){
		
		return deviceService.findBySn(sn);
	}
}
