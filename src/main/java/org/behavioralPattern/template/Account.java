package org.behavioralPattern.template;

public abstract class Account {
    //基本方法 —— 具体方法
    private boolean validate(String account,String password){
        System.out.println("账号："+account);
        System.out.println("密码："+password);
        if(account.equals("willow") && password.equals("lyh701721")){
            return true;
        }
        return false;
    }
    //基本方法 —— 模板方法
    protected abstract void calculateInterest();

    private void display(){
        System.out.println("显示利息");
    }

    public void handle(String account,String password){
        if(!validate(account,password)){
            System.out.println("账号密码错误");
            return;
        }
        calculateInterest();
        if(isSaving())
            display();
    }

    protected boolean isSaving(){ // 钩子方法
        return false;
    }
}
