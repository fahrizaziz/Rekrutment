package com.source.code.rekrutment.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/jobs")
@PreAuthorize("isAuthenticated()")
public class JobController {
    @GetMapping("/position")
    public ResponseEntity<?> getJobs() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions.json";
        String jobsData = restTemplate.getForObject(url, String.class);
        return ResponseEntity.ok(jobsData);
    }

    @GetMapping("/position/{id}")
    public ResponseEntity<?> getJobDetail(@PathVariable String id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions/" + id;
        String jobData = restTemplate.getForObject(url, String.class);
        return ResponseEntity.ok(jobData);
    }
}
