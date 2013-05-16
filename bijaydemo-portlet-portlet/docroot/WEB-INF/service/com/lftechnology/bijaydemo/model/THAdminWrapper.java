/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.lftechnology.bijaydemo.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link THAdmin}.
 * </p>
 *
 * @author    bijay
 * @see       THAdmin
 * @generated
 */
public class THAdminWrapper implements THAdmin, ModelWrapper<THAdmin> {
	public THAdminWrapper(THAdmin thAdmin) {
		_thAdmin = thAdmin;
	}

	public Class<?> getModelClass() {
		return THAdmin.class;
	}

	public String getModelClassName() {
		return THAdmin.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("name", getName());
		attributes.put("password", getPassword());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	/**
	* Returns the primary key of this t h admin.
	*
	* @return the primary key of this t h admin
	*/
	public long getPrimaryKey() {
		return _thAdmin.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t h admin.
	*
	* @param primaryKey the primary key of this t h admin
	*/
	public void setPrimaryKey(long primaryKey) {
		_thAdmin.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this t h admin.
	*
	* @return the ID of this t h admin
	*/
	public long getId() {
		return _thAdmin.getId();
	}

	/**
	* Sets the ID of this t h admin.
	*
	* @param id the ID of this t h admin
	*/
	public void setId(long id) {
		_thAdmin.setId(id);
	}

	/**
	* Returns the company ID of this t h admin.
	*
	* @return the company ID of this t h admin
	*/
	public long getCompanyId() {
		return _thAdmin.getCompanyId();
	}

	/**
	* Sets the company ID of this t h admin.
	*
	* @param companyId the company ID of this t h admin
	*/
	public void setCompanyId(long companyId) {
		_thAdmin.setCompanyId(companyId);
	}

	/**
	* Returns the name of this t h admin.
	*
	* @return the name of this t h admin
	*/
	public java.lang.String getName() {
		return _thAdmin.getName();
	}

	/**
	* Sets the name of this t h admin.
	*
	* @param name the name of this t h admin
	*/
	public void setName(java.lang.String name) {
		_thAdmin.setName(name);
	}

	/**
	* Returns the password of this t h admin.
	*
	* @return the password of this t h admin
	*/
	public java.lang.String getPassword() {
		return _thAdmin.getPassword();
	}

	/**
	* Sets the password of this t h admin.
	*
	* @param password the password of this t h admin
	*/
	public void setPassword(java.lang.String password) {
		_thAdmin.setPassword(password);
	}

	/**
	* Returns the group ID of this t h admin.
	*
	* @return the group ID of this t h admin
	*/
	public long getGroupId() {
		return _thAdmin.getGroupId();
	}

	/**
	* Sets the group ID of this t h admin.
	*
	* @param groupId the group ID of this t h admin
	*/
	public void setGroupId(long groupId) {
		_thAdmin.setGroupId(groupId);
	}

	public boolean isNew() {
		return _thAdmin.isNew();
	}

	public void setNew(boolean n) {
		_thAdmin.setNew(n);
	}

	public boolean isCachedModel() {
		return _thAdmin.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_thAdmin.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _thAdmin.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _thAdmin.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thAdmin.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thAdmin.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thAdmin.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new THAdminWrapper((THAdmin)_thAdmin.clone());
	}

	public int compareTo(com.lftechnology.bijaydemo.model.THAdmin thAdmin) {
		return _thAdmin.compareTo(thAdmin);
	}

	@Override
	public int hashCode() {
		return _thAdmin.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.lftechnology.bijaydemo.model.THAdmin> toCacheModel() {
		return _thAdmin.toCacheModel();
	}

	public com.lftechnology.bijaydemo.model.THAdmin toEscapedModel() {
		return new THAdminWrapper(_thAdmin.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thAdmin.toString();
	}

	public java.lang.String toXmlString() {
		return _thAdmin.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thAdmin.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public THAdmin getWrappedTHAdmin() {
		return _thAdmin;
	}

	public THAdmin getWrappedModel() {
		return _thAdmin;
	}

	public void resetOriginalValues() {
		_thAdmin.resetOriginalValues();
	}

	private THAdmin _thAdmin;
}