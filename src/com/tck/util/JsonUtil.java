package com.tck.util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonUtil {

    /**
     * 从一个JSON 对象字符格式中得到一个java对象
     * 
     * @param jsonString
     *            json字符串
     * 
     * @param pojoCalss
     *            java对象的class
     * 
     * @return
     */

    @SuppressWarnings("rawtypes")
	public static Object jsonString2Object(String jsonString, Class pojoCalss) {

        Object pojo;

        JSONObject jsonObject = JSONObject.fromObject(jsonString);

        pojo = JSONObject.toBean(jsonObject, pojoCalss);

        return pojo;

    }

    /**
     * 
     * 将java对象转换成json字符串<br>
     * 支持复杂类型：Java bean 中既有属性又有list
     * 
     * @param javaObj
     * 
     * @return
     */

    public static String object2JsonString(Object javaObj) {

        JSONObject json;

        json = JSONObject.fromObject(javaObj);

        return json.toString();

    }



    /**
     * 
     * 从json对象集合表达式中得到一个java对象列表
     * 
     * @param jsonString
     * 
     * @param pojoClass
     * 
     * @return
     */

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static List jsonList2JavaList(String jsonString, Class pojoClass) {

        JSONArray jsonArray = JSONArray.fromObject(jsonString);

        JSONObject jsonObject;

        Object pojoValue;

        List list = new ArrayList();

        for (int i = 0; i < jsonArray.size(); i++) {

            jsonObject = jsonArray.getJSONObject(i);

            pojoValue = JSONObject.toBean(jsonObject, pojoClass);

            list.add(pojoValue);

        }

        return list;

    }

    /**
     * 
     * 从json对象集合表达式中得到一个java对象列表
     * 
     * @param jsonString
     * 
     * @param pojoClass
     * 
     * @return
     */

    @SuppressWarnings("rawtypes")
	public static String javaList2JsonList(List list) {

        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @SuppressWarnings("unchecked")
	public static Map<String, Object> parseJSON2Map(String jsonStr){ 
        Map<String, Object> map = new HashMap<String, Object>(); 
        //最外层解析 
        JSONObject json = JSONObject.fromObject(jsonStr); 
        for(Object k : json.keySet()){ 
            Object v = json.get(k);  
            //如果内层还是数组的话，继续解析 
            if(v instanceof JSONArray){ 
                List<Map<String, Object>> list = new ArrayList<Map<String,Object>>(); 
                Iterator<JSONObject> it = ((JSONArray)v).iterator(); 
                while(it.hasNext()){ 
                    JSONObject json2 = it.next(); 
                    list.add(parseJSON2Map(json2.toString())); 
                } 
                map.put(k.toString(), list); 
            } else { 
                map.put(k.toString(), v); 
            } 
        } 
        return map; 
    }
}
