# Chapter 09: Daemon Thread

Java offer 2 types of thread: __user thread__ and __daemon thread__.  
All of the threads we used in the previous chapters are *user threads*.  
*User threads* are high-priority threads. The JVM will wait for any user thread to complete its task before terminating it.
 

So what is __daemon thread__?  
Daemon threads are __low-priority threads__ that __does not prevent the JVM from exiting__ when the program finishes but the daemon thread 
is still running. In other words, The JVM exits when the only threads running are all daemon threads.
For example: a daemon thread is the garbage collection.

* Note:
    1. Daemon threads are not recommended for I/O tasks
    2. Do not call *join()* method for daemon threads
    