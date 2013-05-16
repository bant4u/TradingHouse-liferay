<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/security"
	prefix="liferay-security"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ page import="com.lftechnology.bijaydemo.model.THAdmin" %>
<%@ page import="com.lftechnology.admindemo.model.impl.THAdminImpl" %>



<liferay-theme:defineObjects />

<portlet:defineObjects />

<portlet:actionURL name="commitTHAdmin" var="commitUrl" />


<%
	THAdmin THAdmin = (THAdmin) request.getAttribute("THAdmin");
	if (THAdmin == null)
		THAdmin = new THAdminImpl();
%>

<liferay-ui:error key="firstNameIsRequired"
	message="first-name-is-required" />
<liferay-ui:error key="lastNameIsRequired"
	message="last-name-is-required" />
<liferay-ui:error key="gradeMustBeBetween1And10"
	message="grade-1-and-10" />

<liferay-ui:success key="consumerAddSuccessfully"
	message="consumer-add-success" />

<aui:form action="<%=commitUrl%>">

	<aui:fieldset>

		<aui:input name="name" id="name" label="First Name*"
			value="<%=THAdmin.getName()%>" />
		<aui:input name="password" id="password" label="Last Name*" value="<%=THAdmin.getPassword()%>"/>
		
		

		<aui:button-row>
			<aui:button name="submit" type="submit"></aui:button>
			<aui:button onClick="" value="Clear"></aui:button>
		</aui:button-row>

	</aui:fieldset>

</aui:form>

