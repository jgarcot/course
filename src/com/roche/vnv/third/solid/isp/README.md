#**Example**

```
    1. Generate a VehicleActions interface with the following actions each type of vehicle should implement:
       startEngine()
       shutdownEngine()
       turnRadioOn()  --> Should this method apply to a drone?
       turnRadioOff()
       turnCameraOn()
       turnCameraOff()

    2. Generate a class Vehicle which cannot be instantiated
    3. Generate 2 classes Drone and Car extending Vehicle which implements the above interface
```

In the bad example, a class is forced to implement methods which don't need. 

**Clients should not be forced to depend on interfaces they do not use.**