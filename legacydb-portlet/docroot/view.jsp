<%
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<%@ page import="test.sb.model.Legacydb"%>
<%@ page import="java.util.List"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page import="com.liferay.portal.kernel.util.GetterUtil" %>

<portlet:defineObjects />

<%

	List<Legacydb> entities = (List<Legacydb>)renderRequest.getAttribute("entities");
	Integer delta = (Integer)renderRequest.getAttribute("delta");
	Integer curPage = (Integer)renderRequest.getAttribute("cur");

%>
This is the <b>legacydb</b> portlet.
<p>

<portlet:actionURL var="actionURL">
	<portlet:param name="delta" value='<%= "" + delta %>'/>
	<portlet:param name="cur" value='<%= "" + curPage %>'/>

</portlet:actionURL>
Add new <a href="<%= actionURL %>">random entity</a>
</p>

<liferay-ui:search-container delta="<%= delta %>" emptyResultsMessage="no-data-found">
	<liferay-ui:search-container-results
		results="<%= ListUtil.subList(
				entities, delta * (curPage -1), delta * curPage - 1)
		%>"
		total="<%= entities.size() %>"
	/>

	<liferay-ui:search-container-row
		className="test.sb.model.Legacydb"
		keyProperty="legacydbid"
		modelVar="entity"
	>
		<liferay-ui:search-container-column-text
			name="Id"
			property="legacydbid"
		/>

		<liferay-ui:search-container-column-text
			name="Name"
			property="name"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>