// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.List;
import org.rooinaction.coursemanager.client.managed.request.ApplicationRequestFactory;
import org.rooinaction.coursemanager.client.scaffold.ScaffoldMobileApp;
import org.rooinaction.coursemanager.client.scaffold.activity.IsScaffoldMobileActivity;
import org.rooinaction.coursemanager.client.scaffold.place.AbstractProxyListActivity;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyListView;
import org.rooinaction.coursemanager.proxy.StudentProxy;

public abstract class StudentListActivity_Roo_Gwt extends AbstractProxyListActivity<StudentProxy> implements IsScaffoldMobileActivity {

    protected ApplicationRequestFactory requests;

    public StudentListActivity_Roo_Gwt(PlaceController placeController, ProxyListView<org.rooinaction.coursemanager.proxy.StudentProxy> view, Class<org.rooinaction.coursemanager.proxy.StudentProxy> proxyType) {
        super(placeController, view, proxyType);
    }

    protected void fireCountRequest(Receiver<java.lang.Long> callback) {
        requests.studentRequest().countStudents().fire(callback);
    }
}
