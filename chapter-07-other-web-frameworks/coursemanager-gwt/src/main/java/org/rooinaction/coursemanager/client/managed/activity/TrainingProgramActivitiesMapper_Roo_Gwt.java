// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import org.rooinaction.coursemanager.client.managed.request.ApplicationRequestFactory;
import org.rooinaction.coursemanager.client.managed.ui.TrainingProgramDetailsView;
import org.rooinaction.coursemanager.client.managed.ui.TrainingProgramEditView;
import org.rooinaction.coursemanager.client.managed.ui.TrainingProgramListView;
import org.rooinaction.coursemanager.client.managed.ui.TrainingProgramMobileDetailsView;
import org.rooinaction.coursemanager.client.managed.ui.TrainingProgramMobileEditView;
import org.rooinaction.coursemanager.client.scaffold.ScaffoldApp;
import org.rooinaction.coursemanager.client.scaffold.place.CreateAndEditProxy;
import org.rooinaction.coursemanager.client.scaffold.place.FindAndEditProxy;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyPlace;
import org.rooinaction.coursemanager.proxy.TrainingProgramProxy;
import org.rooinaction.coursemanager.request.TrainingProgramRequest;

public abstract class TrainingProgramActivitiesMapper_Roo_Gwt {

    protected ApplicationRequestFactory requests;

    protected PlaceController placeController;

    protected Activity makeCreateActivity() {
        TrainingProgramEditView.instance().setCreating(true);
        final TrainingProgramRequest request = requests.trainingProgramRequest();
        Activity activity = new CreateAndEditProxy<TrainingProgramProxy>(TrainingProgramProxy.class, request, ScaffoldApp.isMobile() ? TrainingProgramMobileEditView.instance() : TrainingProgramEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(TrainingProgramProxy proxy) {
                request.persist().using(proxy);
                return request;
            }
        };
        return new TrainingProgramEditActivityWrapper(requests, ScaffoldApp.isMobile() ? TrainingProgramMobileEditView.instance() : TrainingProgramEditView.instance(), activity, null);
    }

    @SuppressWarnings("unchecked")
    protected EntityProxyId<org.rooinaction.coursemanager.proxy.TrainingProgramProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<TrainingProgramProxy>) place.getProxyId();
    }

    protected Activity makeEditActivity(ProxyPlace place) {
        TrainingProgramEditView.instance().setCreating(false);
        EntityProxyId<TrainingProgramProxy> proxyId = coerceId(place);
        Activity activity = new FindAndEditProxy<TrainingProgramProxy>(proxyId, requests, ScaffoldApp.isMobile() ? TrainingProgramMobileEditView.instance() : TrainingProgramEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(TrainingProgramProxy proxy) {
                TrainingProgramRequest request = requests.trainingProgramRequest();
                request.persist().using(proxy);
                return request;
            }
        };
        return new TrainingProgramEditActivityWrapper(requests, ScaffoldApp.isMobile() ? TrainingProgramMobileEditView.instance() : TrainingProgramEditView.instance(), activity, proxyId);
    }
}
