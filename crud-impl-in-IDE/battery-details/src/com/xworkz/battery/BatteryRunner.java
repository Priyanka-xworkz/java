package com.xworkz.battery;

import com.xworkz.battery.dao.BatteryDao;
import com.xworkz.battery.dto.BatteryDto;

public class BatteryRunner {
    public static void main(String[] args) {
        BatteryDto dto = new BatteryDto();
        dto.id=1;
        dto.name="Exide";
        dto.weight="20kW";

        BatteryDao batteryDao = new BatteryDao();
        boolean ref = batteryDao.createBatteryDetails(dto);
        batteryDao.getBatteryDetails();
    }
}
