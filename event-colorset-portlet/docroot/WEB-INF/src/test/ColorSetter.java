package test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class ColorSetter extends GenericPortlet {

	@Override
	public void processAction(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {

		String payLoad = request.getParameter("colorselector");

		response.setEvent("colorsetevent", payLoad);
	}

	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		PortletRequestDispatcher prd = getPortletContext()
				.getRequestDispatcher("/view.jsp");
		prd.include(request, response);
	}

}
