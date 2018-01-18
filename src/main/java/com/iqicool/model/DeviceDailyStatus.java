package com.iqicool.model;

import java.util.Date;

import javax.persistence.Entity;

import org.hibernate.annotations.Index;

//Log the daily working status for a device. If the date cross two days, logged on the first day.
//E.g. May 1st 13:00 - May 2nd 10:00, it belongs to May 1st
@Entity
public class DeviceDailyStatus extends BaseObject {

	//Only record the date part of the date 
	@Index(name="idx_logDate")
	private Date logDate;
}
