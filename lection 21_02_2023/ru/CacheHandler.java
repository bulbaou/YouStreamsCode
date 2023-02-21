package ru;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheHandler implements InvocationHandler{
    Object obj;
    Map<Method,Object> cache= new HashMap<>();;
    Map<Field,Object> fields= new HashMap<>();
    
    public CacheHandler(Object obj) {
        this.obj = obj;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(fields.isEmpty()){
            Field[]fields=obj.getClass().getDeclaredFields();
            for(Field f:fields){
                this.fields.put(f, f.get(obj));
            }
        }
        for(Field f:fields.keySet()){
            if(f.get(obj).equals(fields.get(f))){                
                continue;
            }
            Field[]fields=obj.getClass().getDeclaredFields();
            for(Field ff:fields){
                this.fields.put(ff, ff.get(obj));
            }
            cache.clear();
            cache.put(method,method.invoke(obj, args));
            break;
        }
        if(!cache.containsKey(method)){
            cache.put(method,method.invoke(obj, args));
        }
        return cache.get(method);
    }  
}
