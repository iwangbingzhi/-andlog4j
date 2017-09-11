package cn.wbz;

import javax.annotation.Resource;

/**
 * Created by 王炳智 on 2017/8/22.
 */
public class BookService {
    @Resource(name = "bookDao")
    private BookDao bookDao;

    @Resource(name = "orderDao")
    private OrderDao orderDao;
    public void bookservice(){
        System.out.println("bookservice.....");
        bookDao.book();
        orderDao.orderdao();
    }
}
