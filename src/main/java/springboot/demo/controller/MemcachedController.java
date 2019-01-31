package springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.rubyeye.xmemcached.MemcachedClient;

@RestController
@RequestMapping("/memcached")
public class MemcachedController {
    
    @Autowired
    private MemcachedClient memcachedClient;
    
    
    @RequestMapping("/set")
    public Boolean set(String key,Integer time,String value){
        try {
            memcachedClient.set(key, time, value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    @RequestMapping("/get")
    public String get(String key){
        try {
            return memcachedClient.get(key);
        } catch (Exception e) {
            return null;
        }
    }
    
    @RequestMapping("/delete")
    public Boolean delete(String key){
        try {
            memcachedClient.delete(key);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
