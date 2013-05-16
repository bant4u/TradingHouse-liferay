<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/security"
	prefix="liferay-security"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>

<%@ page import="java.util.List"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ page import="com.lftechnology.bijaydemo.model.THAdmin" %>
<%@ page import="com.lftechnology.bijaydemo.service.*" %>
<portlet:defineObjects />
<portlet:renderURL portletMode="edit" var="editURL"></portlet:renderURL>
<liferay-theme:defineObjects />
<portlet:defineObjects />

<portlet:renderURL portletMode="edit" var="createUrl" />


This is the
<b>Student </b>
portlet in View mode.

<a href="<%=createUrl%>">click here to create.</a>


<liferay-ui:search-container emptyResultsMessage="THAdmin-empty-list"
	delta="5">
	<liferay-ui:search-container-results>

		<%
			List<THAdmin> list= THAdminLocalServiceUtil.fetchAll();
					results = ListUtil.subList(list,
							searchContainer.getStart(),
							searchContainer.getEnd());
				
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="THAdmin" keyProperty="id"
		modelVar="THAdmin">
		<liferay-ui:search-container-column-text orderable="true"
			name="firstname" property="firstName" />
		<liferay-ui:search-container-column-text orderable="true"
			name="lastname" property="lastName" />

		<liferay-ui:search-container-column-text>
			<%
				Long primKey = ((THAdmin)row.getObject()).getId();
			%>
			<portlet:actionURL name="editMode" var="editUrl">
				<portlet:param name="id" value="<%=primKey.toString()%>" />
			</portlet:actionURL>
			<a href="<%= editUrl %>">Edit</a>
			<portlet:actionURL name="delete" var="deleteUrl">
				<portlet:param name="id" value="<%=primKey.toString()%>" />
			</portlet:actionURL>
			<a href="<%= deleteUrl %>">Edit</a>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>