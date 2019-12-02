package s.s.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import s.s.test.model.Device;
import s.s.test.model.User;
import s.s.test.repository.DeviceRepo;
import s.s.test.services.DeviceService;

import java.util.Map;

@Controller
@RequestMapping(value = "/registry/devices")
public class DeviceController {

    @Autowired
    private DeviceRepo deviceRepo;

    @Autowired
    private DeviceService deviceService;

    @GetMapping("/")
    public String devices(@AuthenticationPrincipal User user, Map<String, Object> model) {
        Iterable<Device> devices = deviceService.getAllDevicesForCurrentUser(user);
        model.put("devices", devices);
        return "devices";
    }

    @GetMapping("/add")
    public String addDevice() {
        return "addDevice";
    }

    @PostMapping("/add")
    public String addDevice(
            @AuthenticationPrincipal User user,
            @RequestParam String serialNo,
            @RequestParam String type,
            @RequestParam String description) {
        Device device = new Device(serialNo, type, description, user);
        deviceRepo.save(device);
        return "addDevice";
    }

}
