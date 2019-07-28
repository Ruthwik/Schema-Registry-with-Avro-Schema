package com.admission.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admission.manager.kafka.AvroProducer;
import com.admission.manager.model.Student;
import com.admission.manager.service.AdmissionManagerService;


@RestController
public class AdmissionManagerController {

    @Autowired
    private AdmissionManagerService admissionManagerService;
    
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student) {
        return admissionManagerService.addStudent(student);
    }
    
    
}
