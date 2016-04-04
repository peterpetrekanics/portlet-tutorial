<%
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>friendlyurl</b> portlet - VIEW.JSP.

<portlet:renderURL var="page1URL">
	<portlet:param name="mvcPath" value="/page1.jsp"/>
</portlet:renderURL>

<p>
<a href="<%= page1URL.toString() %>">go to page1</a>
</p>