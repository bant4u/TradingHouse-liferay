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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    bijay
 * @generated
 */
public class THAdminSoap implements Serializable {
	public static THAdminSoap toSoapModel(THAdmin model) {
		THAdminSoap soapModel = new THAdminSoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setName(model.getName());
		soapModel.setPassword(model.getPassword());
		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static THAdminSoap[] toSoapModels(THAdmin[] models) {
		THAdminSoap[] soapModels = new THAdminSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static THAdminSoap[][] toSoapModels(THAdmin[][] models) {
		THAdminSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new THAdminSoap[models.length][models[0].length];
		}
		else {
			soapModels = new THAdminSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static THAdminSoap[] toSoapModels(List<THAdmin> models) {
		List<THAdminSoap> soapModels = new ArrayList<THAdminSoap>(models.size());

		for (THAdmin model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new THAdminSoap[soapModels.size()]);
	}

	public THAdminSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	private long _id;
	private long _companyId;
	private String _name;
	private String _password;
	private long _groupId;
}