所谓的MVCC（Multi-Version Concurrency Control ，多版本并发控制）指的就是在使用读已提交（READ COMMITTD）、可重复读（REPEATABLE READ）这两种隔离级别的事务在执行普通的SELECT操作时访问记录的版本链的过程，这样子可以使不同事务的读-写、写-读操作并发执行，从而提升系统性能。

这两个隔离级别的一个很大不同就是：生成ReadView的时机不同，READ COMMITTD在每一次进行普通SELECT操作前都会生成一个ReadView，而REPEATABLE READ只在第一次进行普通SELECT操作前生成一个ReadView，数据的可重复读其实就是ReadView的重复使用。


## 行锁  record lock

## 间隙锁 gap lock
