package org.creationalPattern.singleton;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private static LoadBalancer instance = null;

    private List<String> serverList = null;

    private LoadBalancer(){
        serverList = new LinkedList<>();
    }

    public static LoadBalancer getLoadBalancer(){
        if(instance == null){
            instance = new LoadBalancer();
        }
        return instance;
    }

    public void addServer(String server){
        this.serverList.add(server);
    }

    public void removeServer(String server){
        this.serverList.remove(server);
    }

    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return serverList.get(i);
    }
}
