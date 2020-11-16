
Chinese Tutorials: https://www.jianshu.com/p/5261a62e4d29  
Good chinese article on JVM memory leak problem : https://mp.weixin.qq.com/s/yutHXOi6Xl3-Qn91Pvg9wA  

## In my Project
* Problem descreibe : JVMOutofMenmoryError while run the programm.
* Task of Programm : stamp all document(every page), every document has page ∈ [92,400] and file Size ∈ [8MB,56MB]
* Solution : use the Garbage Collection : System.gc() and let the temporary class become null(for Garbage Collection).



