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

package com.lftechnology.admindemo.service.impl;

import java.util.List;

import com.lftechnology.admindemo.service.base.THAdminLocalServiceBaseImpl;
import com.lftechnology.bijaydemo.NoSuchTHAdminException;
import com.lftechnology.bijaydemo.model.THAdmin;
import com.lftechnology.bijaydemo.service.THAdminLocalServiceUtil;
import com.lftechnology.bijaydemo.service.persistence.THAdminPersistence;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the t h admin local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.bijaydemo.service.THAdminLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bijay
 * @see com.lftechnology.admindemo.service.base.THAdminLocalServiceBaseImpl
 * @see com.lftechnology.bijaydemo.service.THAdminLocalServiceUtil
 */
public class THAdminLocalServiceImpl extends THAdminLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.lftechnology.bijaydemo.service.THAdminLocalServiceUtil} to access the t h admin local service.
	 */
	public THAdmin add(THAdmin THAdmin){
		THAdmin newTHAdmin = null;
		try {
			// Create new THAdmin with unique primary key
			newTHAdmin=thAdminPersistence.create(counterLocalService
					.increment(THAdmin.class.getName()));
		
			newTHAdmin.setId(THAdmin.getId());
			newTHAdmin.setName(THAdmin.getName());
			newTHAdmin.setPassword(THAdmin.getPassword());
			
			newTHAdmin.setGroupId(THAdmin.getGroupId());
			newTHAdmin.setCompanyId(THAdmin.getCompanyId());
			thAdminPersistence.update(newTHAdmin, false);

		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newTHAdmin;
	}

	public THAdmin get(long id) {

		THAdmin THAdmin = null;
		try {
			THAdmin = thAdminPersistence.fetchByPrimaryKey(id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return THAdmin;
	}

	public THAdmin update(THAdmin THAdmin) {
		THAdmin newTHAdmin = null;
		try {
			newTHAdmin = THAdminLocalServiceUtil
					.getTHAdmin(THAdmin.getId());

		
			newTHAdmin.setName(THAdmin.getName());
		
			newTHAdmin.setGroupId(THAdmin.getGroupId());
			newTHAdmin.setCompanyId(THAdmin.getCompanyId());
			thAdminPersistence.update(newTHAdmin, true);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newTHAdmin;
	}

	public THAdmin delete(long id) {

		THAdmin THAdmin = null;
		try {
			THAdmin = thAdminPersistence.remove(id);
		} catch (NoSuchTHAdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return THAdmin;
	}

	public List<THAdmin> fetchAll() throws SystemException {

		return thAdminPersistence.findAll();
	}
}