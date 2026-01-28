package com.example.demonew.Controller;

import com.example.demonew.Model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cloudvendors")
public class CloudVendorApiService {
     CloudVendor cloudvendor;
    @GetMapping("{id}")
    public CloudVendor getCloudVendors(String id) {
        return cloudvendor;
    }
    @PostMapping
    public String addCloudVendor(@RequestBody CloudVendor cloudvendor) {
        this.cloudvendor = cloudvendor;
        return "Cloud Vendor added successfully";
    }
}
