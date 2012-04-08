// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.request;

import org.rooinaction.coursemanager.request.CourseRequest;
import org.rooinaction.coursemanager.request.InstructorRequest;
import org.rooinaction.coursemanager.request.OfferingRequest;
import org.rooinaction.coursemanager.request.RegistrationRequest;
import org.rooinaction.coursemanager.request.StudentRequest;
import org.rooinaction.coursemanager.request.TagRequest;
import org.rooinaction.coursemanager.request.TrainingProgramRequest;
import org.rooinaction.coursemanager.shared.scaffold.ScaffoldRequestFactory;

public interface ApplicationRequestFactory extends ScaffoldRequestFactory {

    CourseRequest courseRequest();

    InstructorRequest instructorRequest();

    OfferingRequest offeringRequest();

    RegistrationRequest registrationRequest();

    StudentRequest studentRequest();

    TagRequest tagRequest();

    TrainingProgramRequest trainingProgramRequest();
}
