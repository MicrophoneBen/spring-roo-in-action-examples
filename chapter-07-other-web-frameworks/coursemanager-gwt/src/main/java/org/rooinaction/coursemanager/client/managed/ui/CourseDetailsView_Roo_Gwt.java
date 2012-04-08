// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyDetailsView;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyListView;
import org.rooinaction.coursemanager.proxy.CourseProxy;
import org.rooinaction.coursemanager.shared.CourseTypeEnum;

public abstract class CourseDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<CourseProxy> {

    @UiField
    SpanElement id;

    @UiField
    SpanElement name;

    @UiField
    SpanElement description;

    @UiField
    SpanElement cost;

    @UiField
    SpanElement maximumCapacity;

    @UiField
    SpanElement courseType;

    @UiField
    SpanElement version;

    CourseProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(CourseProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        name.setInnerText(proxy.getName() == null ? "" : String.valueOf(proxy.getName()));
        description.setInnerText(proxy.getDescription() == null ? "" : String.valueOf(proxy.getDescription()));
        cost.setInnerText(proxy.getCost() == null ? "" : String.valueOf(proxy.getCost()));
        maximumCapacity.setInnerText(proxy.getMaximumCapacity() == null ? "" : String.valueOf(proxy.getMaximumCapacity()));
        courseType.setInnerText(proxy.getCourseType() == null ? "" : String.valueOf(proxy.getCourseType()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(CourseProxyRenderer.instance().render(proxy));
    }
}
