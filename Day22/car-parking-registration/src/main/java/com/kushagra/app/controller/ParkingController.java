package com.kushagra.app.controller;

import com.kushagra.app.module.Car;
import com.kushagra.app.module.ParkingStart;
import com.kushagra.app.module.ParkingEnd;
import com.kushagra.app.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @PostMapping("/start")
    public ParkingStart startParking(@RequestBody Car car, @RequestParam String parkingNo) {
        return parkingService.startParking(car, parkingNo);
    }

    @GetMapping("/end")
    public ParkingEnd endParking(@RequestParam String regNo) {
        return parkingService.endParking(regNo);
    }
}
