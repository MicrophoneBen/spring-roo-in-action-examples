package org.rooinaction.coursemanager.client.managed.ui;

import com.google.web.bindery.requestfactory.gwt.ui.client.ProxyRenderer;
import org.rooinaction.coursemanager.proxy.OfferingProxy;

public class OfferingProxyRenderer extends ProxyRenderer<OfferingProxy> {

    private static org.rooinaction.coursemanager.client.managed.ui.OfferingProxyRenderer INSTANCE;

    protected OfferingProxyRenderer() {
        super(new String[] { "id" });
    }

    public static org.rooinaction.coursemanager.client.managed.ui.OfferingProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new OfferingProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(OfferingProxy object) {
        if (object == null) {
            return "";
        }
        return object.getId() + " (" + object.getId() + ")";
    }
}
