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

package com.lftechnology.admindemo.model.impl;

import com.lftechnology.bijaydemo.model.THAdmin;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing THAdmin in entity cache.
 *
 * @author bijay
 * @see THAdmin
 * @generated
 */
public class THAdminCacheModel implements CacheModel<THAdmin>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", password=");
		sb.append(password);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append("}");

		return sb.toString();
	}

	public THAdmin toEntityModel() {
		THAdminImpl thAdminImpl = new THAdminImpl();

		thAdminImpl.setId(id);
		thAdminImpl.setCompanyId(companyId);

		if (name == null) {
			thAdminImpl.setName(StringPool.BLANK);
		}
		else {
			thAdminImpl.setName(name);
		}

		if (password == null) {
			thAdminImpl.setPassword(StringPool.BLANK);
		}
		else {
			thAdminImpl.setPassword(password);
		}

		thAdminImpl.setGroupId(groupId);

		thAdminImpl.resetOriginalValues();

		return thAdminImpl;
	}

	public long id;
	public long companyId;
	public String name;
	public String password;
	public long groupId;
}