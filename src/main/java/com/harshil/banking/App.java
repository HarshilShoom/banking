package com.harshil.banking;

import com.harshil.banking.controller.*;
import com.harshil.banking.model.*;

public class App 
{
    public static void main( String[] args )
    {
        AccountController accountController = new CurrentAccountController();
        
        Address address = new Address();
        address.setLine1("123 xyz");
        address.setLine2("abc");
        address.setCity("Mississauga");
        address.setProvince("Ontario");
        address.setPostalCode("A1B2C3");
        
        Account account = new CurrentAccount();
        account.setHolderName("holder1");
        account.setHolderAddress(address);
        account.setNumber("SV1234");
        account.setPin("1234");
        account.setBalance(100);
        ((CurrentAccount) account).setOverDraft(100);
        
        accountController.createAccount(account);
        System.out.println(accountController.getBalance());
        accountController.withdraw(10);
        System.out.println(accountController.getBalance());
        accountController.withdraw(200);
        System.out.println(accountController.getBalance());
    }
}
