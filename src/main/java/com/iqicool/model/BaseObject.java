package com.iqicool.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Index;


@MappedSuperclass
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//The standard index creation method is to define the annotation as below on each sub class:
//@Table(indexes = { @Index(name = "IDX_MYIDX1", columnList = "id,name,surname"),
//@Index(name="IDX_MYIDX2", columnList = {"col1", "col2"}) })
//With the javax.persistence namespace. But in such case for the columns in the BaseObject I have to copy&paste
//So use the hibernate way first untill it doesn't work 
public class BaseObject  extends SimpleBaseObject{
	private Date updatedAt;
	private Long updatedBy;
	private boolean deleted;
	
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Long getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}
}
