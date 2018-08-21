//package com.yuan.springboot.controller;
//
//import com.yuan.springboot.dao.JpaAccountDao;
//import com.yuan.springboot.domain.JpaAccount;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/account")
//public class JpaAccountController {
//
//    @Autowired
//    JpaAccountDao accountDao;
//
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public List<JpaAccount> getAccounts() {
//        return accountDao.findAll();
//    }
//
////    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
////    public JpaAccount getAccountById(@PathVariable("id") int id) {
////        return accountDao.findOne(id);
////    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
//                                @RequestParam(value = "money", required = true) double money) {
//        JpaAccount account = new JpaAccount();
//        account.setMoney(money);
//        account.setName(name);
//        account.setId(id);
//        JpaAccount account1 = accountDao.saveAndFlush(account);
//
//        return account1.toString();
//
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.POST)
//    public String postAccount(@RequestParam(value = "name") String name,
//                              @RequestParam(value = "money") double money) {
//        JpaAccount account = new JpaAccount();
//        account.setMoney(money);
//        account.setName(name);
//        JpaAccount account1 = accountDao.save(account);
//        return account1.toString();
//
//    }
//
//
//}
