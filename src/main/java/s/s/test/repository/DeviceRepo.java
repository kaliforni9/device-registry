package s.s.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import s.s.test.model.Device;
import s.s.test.model.User;

import java.util.List;
import java.util.Map;

public interface DeviceRepo extends JpaRepository<Device, Long> {

    List<Device> findAllByOwner(User user);

    @Query(value = "SELECT id, serial_no, type, description, created_at, owner_id FROM device d ORDER BY d.created_at DESC LIMIT 5", nativeQuery = true)
    List<Device> find5LastCreatedDevices();

    @Query(value = "SELECT u.username, COUNT(d.owner_id) FROM usr u INNER JOIN device d ON d.owner_id = u.id GROUP BY u.username ORDER BY count DESC LIMIT 5", nativeQuery = true)
    List<Map<String,Object>> find5UsersWhoCreatedManyDevices();
}
