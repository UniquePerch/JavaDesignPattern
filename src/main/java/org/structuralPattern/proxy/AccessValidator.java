package org.structuralPattern.proxy;

public class AccessValidator {
    public boolean validate(String userId){
        System.out.println("验证用户信息");
        if(userId.equals("willow")){
            System.out.println("验证信息通过");
            return true;
        }
        return false;
    }
}
