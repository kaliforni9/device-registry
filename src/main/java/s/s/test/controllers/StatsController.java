package s.s.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import s.s.test.model.Device;
import s.s.test.services.DeviceService;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "registry/stats")
public class StatsController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping
    public String devices(Map<String, Object> model, Map<String, Object> model1) {
        Iterable<Device> devices = deviceService.get5LastCreatedDevices();
        model.put("devices", devices);
        List<Map<String, Object>> users = deviceService.get5UsersWhoCreatedManyDevices();
        model1.put("users", users);
        return "stats";
    }

}
