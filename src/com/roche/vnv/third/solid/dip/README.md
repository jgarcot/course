#**Example**

```
    1. Create a class DeploymentTracker to track deployment status of a build number
    2. Depending on deployment status, perform email or phone notifications
```

The main point for DIP is **reusability.** High-level modules or interfaces of the application should describe the "flow" of behavior and shouldn't be tight to implementation details.

To remember: **Abstractions should not depend on details. Details should depend on abstractions.**