# Chapter 07: Synchronization using Lock

1. To synchronize threads, we can use another technique. It is called *Lock*.
2. When you use *Lock*, Remember to *unlock()*.
3. The differences between *Lock* interface and *synchronized* keyword is that we can *lock()* in a method and then *unlock()* in another method.
And *Lock* interface will lock the whole block of code below *lock()*, does not lock based on variables and just *unlock()* when it is called.
4. With fair locking (fair: true), threads can acquire locks only in the order in which they were requested. First Come First Serve.