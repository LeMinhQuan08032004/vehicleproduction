package com.example.vehicle_production.Controller;

import ch.qos.logback.core.model.Model;
import com.example.vehicle_production.Entity.Vehicle;
import com.example.vehicle_production.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private Repository.VehicleRepository vehicleRepository;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @GetMapping("/vehicles")
    public String listVehicles(Model model) {
        model.addAttribute("vehicles", vehicleRepository.findAll());
        return "admin/vehicles";
    }

    @GetMapping("/vehicle/add")
    public String addVehicleForm(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        return "admin/addVehicle";
    }

    @PostMapping("/vehicle/add")
    public String addVehicle(@ModelAttribute Vehicle vehicle, BindingResult result) {
        if (result.hasErrors()) {
            return "admin/addVehicle";
        }
        vehicleRepository.save(vehicle);
        return "redirect:/admin/vehicles";
    }


}