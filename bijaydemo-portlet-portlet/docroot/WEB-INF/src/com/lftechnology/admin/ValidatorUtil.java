package com.lftechnology.admin;

/**
 * 
 */

import javax.portlet.ActionRequest;

import com.lftechnology.bijaydemo.model.THAdmin;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.Validator;


public class ValidatorUtil {
	
	public static boolean validateTHAdmin (THAdmin THAdmin, ActionRequest request) {
		boolean isValidateSuccess = true;

		if (Validator.isNull(THAdmin.getName())) {
			SessionErrors.add(request, "NameIsRequired");
			isValidateSuccess = false;
		}
		if (Validator.isNull(THAdmin.getPassword())) {
			SessionErrors.add(request, "PasswordIsRequired");
			isValidateSuccess = false;
		}
		
	
		
		return isValidateSuccess;
	}

	

}