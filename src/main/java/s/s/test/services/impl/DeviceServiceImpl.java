package s.s.test.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import s.s.test.model.Device;
import s.s.test.model.User;
import s.s.test.repository.DeviceRepo;
import s.s.test.services.DeviceService;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class DeviceServiceImpl implements DeviceService {

    private final DeviceRepo deviceRepo;

    @Override
    public List<Device> getAllDevices() {
        return deviceRepo.findAll();
    }

    @Override
    public List<Device> getAllDevicesForCurrentUser(User user) {
        return deviceRepo.findAllByOwner(user);
    }

    @Override
    public List<Device> get5LastCreatedDevices() {
        return deviceRepo.find5LastCreatedDevices();
    }

    @Override
    public List<Map<String,Object>> get5UsersWhoCreatedManyDevices() {
        return deviceRepo.find5UsersWhoCreatedManyDevices();
    }
}
