package s.s.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import s.s.test.model.Device;
import s.s.test.model.User;
import s.s.test.services.DeviceService;

import java.util.List;

@RestController
@RequestMapping(value = "/registry/api/devices")
public class DeviceJsonController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping
    public List<Device> deviceListAsJson(@AuthenticationPrincipal User user) {
        List<Device> deviceList = deviceService.getAllDevicesForCurrentUser(user);
        return deviceList;
    }
}
