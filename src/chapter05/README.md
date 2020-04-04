# Chapter 05: Safe termination

Some threads are dealing with sensitive data or communicating to I/O devices.  
If we terminate a thread suddenly without handler, then that would cause some damages such as lost data,...  
Therefore, we need to stop a thread safely.
