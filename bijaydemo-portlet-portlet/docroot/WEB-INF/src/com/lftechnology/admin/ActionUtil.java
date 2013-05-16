package com.lftechnology.admin;
import javax.portlet.ActionRequest;

import com.lftechnology.admindemo.model.impl.THAdminImpl;
import com.lftechnology.bijaydemo.model.THAdmin;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

/**
 * @author bj
 *
 */
public class ActionUtil {
	
	/**
	 * Create student record from form post.
	 * 
	 * @param request
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static THAdmin getTHAdmin (ActionRequest request) throws PortalException, SystemException {
		
		THAdmin THAdmin = new THAdminImpl ();
		
		//	Fill in primary key
		THAdmin.setId(ParamUtil.getLong(request, "id"));
		
		//	Fill in student detail from form
		THAdmin.setName(ParamUtil.getString(request, "name"));
		THAdmin.setPassword(ParamUtil.getString(request, "password"));

		
		
		//	Add companyId and groupId
		User user = UserLocalServiceUtil.getUser(PortalUtil.getUserId(request));
		THAdmin.setGroupId(user.getGroupId());
		THAdmin.setCompanyId(PortalUtil.getCompanyId(request));
		
		return THAdmin;
	}

}