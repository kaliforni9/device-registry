package s.s.test.services;

import s.s.test.model.Device;
import s.s.test.model.User;

import java.util.List;
import java.util.Map;

public interface DeviceService {

    List<Device> getAllDevices();

    List<Device> getAllDevicesForCurrentUser(User user);

    public List<Device> get5LastCreatedDevices();

    public List<Map<String,Object>> get5UsersWhoCreatedManyDevices();

}
