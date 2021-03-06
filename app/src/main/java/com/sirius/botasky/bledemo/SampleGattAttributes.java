/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sirius.botasky.bledemo;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String UUID_MEASUREMENT = "00001801-0000-1000-8000-00805F9B34FB";
    public static String UUID_NOTIFY ="6E400003-B5A3-F393-E0A9-E50E24DCCA9E";
    public static String UUID_WRITE = "6E400002-B5A3-F393-E0A9-E50E24DCCA9E";


    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put("6E400001-B5A3-F393-E0A9-E50E24DCCA9E", "SomeDevice Service");//某个设备服务
        attributes.put("000026b4-0000-1000-8000-00805f9b34fb", "Megear Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put(UUID_MEASUREMENT, "SOME FIND");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put(UUID_WRITE, "SOME WRITE");//某个可写设备的写特征
        attributes.put(UUID_NOTIFY, "SOME Notify");//某个设备的Notify特征
        attributes.put("6E4026B5-B5A3-F393-E0A9-E50E24DCCA9E", "Megear write");//Megear读
        attributes.put("6E4026B6-B5A3-F393-E0A9-E50E24DCCA9E", "Megear notify");//megearnotfiy
    }

    public static String lookup(String uuid, String defaultName) {
        String low = attributes.get(uuid.toLowerCase());
        String up = attributes.get(uuid.toUpperCase());

        String name = low == null ? (up == null ? defaultName : up) : low;
        return name;
    }
}
