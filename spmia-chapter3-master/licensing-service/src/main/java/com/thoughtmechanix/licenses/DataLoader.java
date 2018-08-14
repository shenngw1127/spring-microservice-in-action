package com.thoughtmechanix.licenses;

import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private LicenseRepository licenseRepository;

    @Autowired
    public DataLoader(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    public void run(ApplicationArguments args) {
        licenseRepository.save(new License()
                .withId("f3831f8c-c338-4ebe-a82a-e2fc1d1ff78a")
                .withOrganizationId("e254f8c-c442-4ebe-a82a-e2fc1d1ff78a")
                .withLicenseType("user")
                .withProductName("customer-crm-co")
                .withLicenseMax(100)
                .withLicenseAllocated(5)
        );
        licenseRepository.save(new License()
                .withId("t9876f8c-c338-4abc-zf6a-ttt1")
                .withOrganizationId("e254f8c-c442-4ebe-a82a-e2fc1d1ff78a")
                .withLicenseType("user")
                .withProductName("suitability-plus")
                .withLicenseMax(200)
                .withLicenseAllocated(189)
        );
        licenseRepository.save(new License()
                .withId("38777179-7094-4200-9d61-edb101c6ea84")
                .withOrganizationId("442adb6e-fa58-47f3-9ca2-ed1fecdfe86c")
                .withLicenseType("user")
                .withProductName("HR-PowerSuite")
                .withLicenseMax(100)
                .withLicenseAllocated(4)
        );
        licenseRepository.save(new License()
                .withId("08dbe05-606e-4dad-9d33-90ef10e334f9")
                .withOrganizationId("442adb6e-fa58-47f3-9ca2-ed1fecdfe86c")
                .withLicenseType("core-prod")
                .withProductName("WildCat Application Gateway")
                .withLicenseMax(16)
                .withLicenseAllocated(16)
        );
    }
}