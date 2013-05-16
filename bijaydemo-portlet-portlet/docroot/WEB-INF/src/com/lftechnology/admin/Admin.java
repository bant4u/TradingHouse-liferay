package com.lftechnology.admin;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.lftechnology.bijaydemo.model.THAdmin;
import com.lftechnology.bijaydemo.service.THAdminLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class Admin extends MVCPortlet {
	@Override
	public void doEdit(RenderRequest request, RenderResponse response)
			throws IOException, PortletException {
		super.doEdit(request, response);
	}

	public void commitTHAdmin(ActionRequest request, ActionResponse response)
			throws com.liferay.portal.kernel.exception.SystemException {
		System.out.println("Adding a new THAdmin");
		try {
			THAdmin THAdmin = ActionUtil.getTHAdmin(request);
			if (ValidatorUtil.validateTHAdmin(THAdmin, request)) {
				if (THAdmin.getId() == 0)
					THAdminLocalServiceUtil.add(THAdmin);
				else
					THAdminLocalServiceUtil.update(THAdmin);
				SessionMessages.add(request, "THAdminAddSuccessfully");
			}
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}

	public void editMode(ActionRequest request, ActionResponse response) {
		long id = ParamUtil.getLong(request, "id", 0L);
		System.out.println(id);
		if (id != 0) {
			THAdmin THAdmin = THAdminLocalServiceUtil.get(id);
			System.out.println(THAdmin);
			request.setAttribute("THAdmin", THAdmin);
			System.out.println("teat");
		}

		response.setRenderParameter("jspPage", "/html/admin/adminedit.jsp");
	}

	public void delete(ActionRequest request, ActionResponse response) {
		long id = ParamUtil.getLong(request, "id", 0L);

		if (id != 0)
			THAdminLocalServiceUtil.delete(id);
		response.setRenderParameter("jspPage", "/html/admin/adminview.jsp");

	}

}
