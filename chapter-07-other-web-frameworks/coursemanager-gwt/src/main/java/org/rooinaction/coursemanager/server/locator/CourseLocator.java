package org.rooinaction.coursemanager.server.locator;

import com.google.web.bindery.requestfactory.shared.Locator;
import org.rooinaction.coursemanager.shared.model.Course;
import org.springframework.roo.addon.gwt.RooGwtLocator;
import org.springframework.stereotype.Component;

@RooGwtLocator("org.rooinaction.coursemanager.shared.model.Course")
@Component
public class CourseLocator extends Locator<Course, Long> {

    public Course create(Class<? extends org.rooinaction.coursemanager.shared.model.Course> clazz) {
        return new Course();
    }

    public Course find(Class<? extends org.rooinaction.coursemanager.shared.model.Course> clazz, Long id) {
        return Course.findCourse(id);
    }

    public Class<org.rooinaction.coursemanager.shared.model.Course> getDomainType() {
        return Course.class;
    }

    public Long getId(Course course) {
        return course.getId();
    }

    public Class<java.lang.Long> getIdType() {
        return Long.class;
    }

    public Object getVersion(Course course) {
        return course.getVersion();
    }
}
