package com.zafin.primarycore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rd_c_entity_attribute",schema="zrpe")
public class RdCEntityAttribute {

	@Id
	@Column(name="entitytype_")
	private String entityType;
	@Column(name="fieldname_")
	private String FieldName;
	@Column(name="attributename_")
	private String attributeName;
	
	
	public RdCEntityAttribute() {}
	public RdCEntityAttribute(String entityType, String fieldName, String attributeName) {
		super();
		this.entityType = entityType;
		FieldName = fieldName;
		this.attributeName = attributeName;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public String getFieldName() {
		return FieldName;
	}
	public void setFieldName(String fieldName) {
		FieldName = fieldName;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
}
